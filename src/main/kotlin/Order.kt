data class Order(val itemEntryList: List<ItemEntry>, val deliveryMethod: DeliveryMethod, val discount: Float) {
    fun getTotalPrice(): Float {
        var deliveryCost = 0.0F
        if (deliveryMethod is DeliveryMethod.CourierDelivery) deliveryCost = deliveryMethod.cost
        var totalCost = 0.0F
        itemEntryList.forEach {
            totalCost += it.item.cost * it.amount
        }
        totalCost += deliveryCost
        totalCost -= totalCost * discount / 100
        return totalCost // calculate full price here
    }
}