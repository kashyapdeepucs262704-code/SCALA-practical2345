package DenseVectorOperations

import breeze.linalg.DenseVector
import breeze.linalg.sum
import breeze.stats.mean

object DenseVectorOperations {

  def main(args: Array[String]): Unit = {

    val v1 = DenseVector(10.0, 20.0, 30.0, 40.0, 50.0)
    val v2 = DenseVector(1.0, 2.0, 3.0, 4.0, 5.0)

    println("First Vector: " + v1)
    println("Second Vector: " + v2)

    val vectorSum = sum(v1)
    println("Sum of First Vector: " + vectorSum)

    val vectorMean = mean(v1)
    println("Mean of First Vector: " + vectorMean)

    val dotProduct = v1 dot v2
    println("Dot Product: " + dotProduct)
  }
}
