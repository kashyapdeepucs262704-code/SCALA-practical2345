package DenseVectorOperations

import  breeze.linalg._
import scala.util.Random

object RandomMatrixOperations {

  def main(args: Array[String]): Unit = {

    val random = new Random()

    val matrix = DenseMatrix.tabulate[Double](3, 3) {
      (i, j) => random.nextInt(10) + 1.0
    }

    println("Original Random Matrix:")
    println(matrix)

    val transposedMatrix = matrix.t

    println("\nTranspose of Matrix:")
    println(transposedMatrix)

    val determinantValue = det(matrix)

    println("\nDeterminant of Matrix:")
    println(determinantValue)
  }
}
