object Practical2 {

  def main(args: Array[String]): Unit = {

    val numbers = List(10, 20, 20, 30, 40, 20, 50)

    println("Numbers: " + numbers)

    // Mean
    val mean = numbers.sum.toDouble / numbers.size
    println("Mean: " + mean)

    // Median
    val sortedNumbers = numbers.sorted
    val n = sortedNumbers.size

    val median =
      if (n % 2 == 0)
        (sortedNumbers(n / 2 - 1) + sortedNumbers(n / 2)).toDouble / 2
      else
        sortedNumbers(n / 2).toDouble

    println("Median: " + median)

    // Mode
    val mode = numbers.groupBy(identity)
      .map { case (num, values) => (num, values.size) }
      .maxBy(_._2)._1

    println("Mode: " + mode)
  }
}