package DZ_Laba_5

class GeometryCalculator {
    fun rectangleInfo(width: Int, height: Int) {
        val perimeter = 2 * (width + height)
        val area = width * height

        println("Прямоугольник $width x $height:")
        println("Периметр: $perimeter")
        println("Площадь: $area")

        if (perimeter == area) {
            println("Удивительно! Периметр равен площади!")
        }
        println()
    }
    fun triangleInfo(side1: Int, side2: Int, side3: Int) {
        val perimeter = side1 + side2 + side3
        val sides = listOf(side1, side2, side3).sorted()
        val isRightTriangle = (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2])
        println("Треугольник со сторонами: $side1, $side2, $side3")
        if (isRightTriangle) {
            println("Это прямоугольный треугольник!")
        } else {
            println("Это не прямоугольный треугольник")
        }
        println("Периметр: $perimeter")
        println()
    }
    fun circleInfo(radius: Double) {
        val circumference = 2 * Math.PI * radius
        val area = Math.PI * radius * radius
        println("Окружность с радиусом $radius:")
        println("Длина окружности: $circumference")
        println("Площадь круга: $area")
        println()
    }
}