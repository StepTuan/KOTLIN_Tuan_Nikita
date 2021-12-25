data class Order(val ItemEntryList: List<ItemEntry>, val deliveryMethod: DeliveryMethod, val Discount: Float) {
    fun getTotalPrice(): Float {
        var deliveryCost = 0.0F
        if (deliveryMethod is DeliveryMethod.CourierDelivery) deliveryCost = deliveryMethod.cost
        var totalCost = 0.0F
        ItemEntryList.forEach {
            totalCost += it.item.cost * it.amount
        }
        totalCost += deliveryCost
        totalCost -= totalCost * Discount / 100
        return totalCost // calculate full price here
    }
}