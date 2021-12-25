sealed class DeliveryMethod {
    object SelfPickup : DeliveryMethod()
    data class CourierDelivery(val address: String, val cost: Float) : DeliveryMethod()
}