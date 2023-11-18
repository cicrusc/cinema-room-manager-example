fun main () {
    println("Enter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seatsInRow = readln().toInt()

    val totalSeats =  rows * seatsInRow
    val ticketPrice = if(totalSeats <= 60) 10 else 8
    val totalProfit = if(totalSeats <= 60) {
        totalSeats * 10
    } else {
        val frontRows = rows / 2
        val backRows = rows - frontRows
        (frontRows * seatsInRow * 10) + (backRows * seatsInRow * 8)
    }
   println("Total Income: $totalProfit")
}