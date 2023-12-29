fun menu(): Int {
    println("\nMenu:")
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("3. Statistics")
    println("0. Exit")
    return readln().toInt()
}

fun main() {

    println("Enter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seatsInRow = readln().toInt()

    val cinema = MutableList(rows) { MutableList(seatsInRow) { "S" } }

    var purchasedTicket = 0
    var currentIncome = 0
    val totalSeats = rows * seatsInRow
    val frontHalfRows = rows / 2
    val backHalfRows = rows - frontHalfRows

    val totalIncome =
        if (totalSeats <= 60) 10 * totalSeats else (8 * backHalfRows * seatsInRow) + (10 * frontHalfRows * seatsInRow)

    fun printCinema() {
        println("\nCinema:")
        print("  ")
        for (seat in 1..seatsInRow) {
            print("$seat ")
        }
        println()
        for (i in 0 until rows) {
            print("${i + 1} ")
            println(cinema[i].joinToString(" "))
        }
    }

    while (true) {
        val choice = menu()
        when (choice) {
            1 -> printCinema()
            2 -> {
                var seatChosen = false

                while (!seatChosen) {
                    println("Enter a row number:")
                    val choiceRow = readln().toInt()
                    println("Enter a seat number in that row:")
                    val choiceSeat = readln().toInt()

                    if (choiceRow !in 1..rows || choiceSeat !in 1..seatsInRow) {
                        println("Wrong input!")
                    } else if (cinema[choiceRow - 1][choiceSeat - 1] == "B") {
                        println("That ticket has already been purchased!")
                    } else {
                        cinema[choiceRow - 1][choiceSeat - 1] = "B"
                        val ticketPrice = if (totalSeats <= 60) 10
                        else if (choiceRow <= frontHalfRows) 10
                        else 8
                        purchasedTicket += 1
                        currentIncome += ticketPrice
                        println("Ticket Price: $$ticketPrice")
                        seatChosen = true
                    }
                }
            }

            3 -> {
                val percentage = (purchasedTicket.toDouble() / totalSeats) * 100
                println("Number of purchased tickets: $purchasedTicket")
                println("Percentage: ${"%.2f".format(percentage)}%")
                println("Current Income: \$$currentIncome")
                println("Total Income: \$$totalIncome")
            }

            0 -> {
                println("Exiting...")
                break
            }

            else -> println("Invalid choice. Please try again.")
        }
    }
}
