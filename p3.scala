import scala.util.Random

object Practical3 {

  def main(args: Array[String]): Unit = {

    val numbers = List.fill(10)(Random.nextInt(100) + 1)

    println("Random Dataset:")
    println(numbers)

    val mean = numbers.sum.toDouble / numbers.size

    val squaredDifferences = numbers.map(x => math.pow(x - mean, 2))

    val variance = squaredDifferences.sum / numbers.size

    val standardDeviation = math.sqrt(variance)

    println(f"Mean: $mean%.2f")
    println(f"Variance: $variance%.2f")
    println(f"Standard Deviation: $standardDeviation%.2f")
  }
}