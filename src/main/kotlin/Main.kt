fun main() {
    val itemEntryList: List<ItemEntry> = listOf(
        ItemEntry(Item("Кроссовки", 10.0F), 10), ItemEntry(Item("Майка", 5.5F), 10)
    )
    val order1 = Order(itemEntryList, DeliveryMethod.SelfPickup, 10.0F)
    val order2 = Order(itemEntryList, DeliveryMethod.CourierDelivery("ул. Проффесора Попова 5", 1.5F), 10.0F)
    println(order1.getTotalPrice())
    println(order2.getTotalPrice())
}