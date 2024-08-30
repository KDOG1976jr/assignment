fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    when(numberOfMessages) {
        in 0..99 -> println("You have $numberOfMessages notifications.")
        else -> println("You popular af. You have  99+ notifications. ")
    }
}