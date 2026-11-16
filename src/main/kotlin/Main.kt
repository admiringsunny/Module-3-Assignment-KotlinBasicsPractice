package com.capstone

//Module 3 Assignment: Kotlin Basics Practice
//This assignment is designed to strengthen your understanding of Kotlin fundamentals including conditionals, functions, arrays, and lists. Write all programs in Kotlin using any editor or IDE of your choice .
fun main() {
    println(isEvenOrOdd(5))
//    println(getLargestOf(10, 2, 3))
//    printMultiplicationTableOf(15)
//    println(countNoOfVowelsIn("Hello World!"))
//    println(reverseOfString("hello"))
//    println(getGrade(58))
//    println(calculate(6.0, 3.0, "add"))
//    println(calculate(6.0, 3.0, "subtract"))
//    println(calculate(6.0, 3.0, "multiply"))
//    println(calculate(6.0, 3.0, "divide"))
//    println(isPalindrome(1))
//    println(performMathOperation(6.0, 3.0, "/"))
//    println(factorial(5))
//    println(sumArrayElements(intArrayOf(1, 2, 3, 4)))
//    println(maxInList(listOf(2, 3, 4)))
//    println(removeDuplicates(listOf(1, 2, 3, 3, 4, 1)))
//    println(countListElements(listOf(1, 2, 3, 3, 4, 1)))
//    println(getSecondLargest(listOf(1, 2, 3, 3, 4, 1, 6, 5)))
}

//Section A: Basic Practice
//1. Write a Kotlin program to check whether a number is even or odd.
fun isEvenOrOdd(num: Int): String {
    return if (num % 2 == 0) "$num is an Even number" else "$num is an Odd number"
}

//2. Write a function to find the largest of three numbers.
fun getLargestOf(num1: Int, num2: Int, num3: Int): String {
    var maxNo = num1
    maxNo = if (num2 > maxNo) num2 else maxNo
    maxNo = if (num3 > maxNo) num3 else maxNo
    return "The largest among $num1, $num2, and $num3 is $maxNo"
}

//3. Print the multiplication table of a given number.
fun printMultiplicationTableOf(num: Int) {
    println("----------------------------")
    println("Multiplication table of a given number $num:")
    for (lineNo in 1..10)
        println("$num * $lineNo = ${num * lineNo}")
    println("----------------------------")
}

//4. Write a program to count the number of vowels in a string.
fun countNoOfVowelsIn(string: String): String {
    var count = 0;
    for (i in string) {
        if (i in "aeiouAEIOU") count++
    }
    return "No of vowels in $string are $count"
}

//5. Reverse a given string using a function.
fun reverseOfString(string: String): String {
    return "The reverse of $string is: ${StringBuilder(string).reversed().toString()}"
}


//Section B: Conditionals and Functions
//6. Create a grade calculator using 'when'. Input marks and output grade.
fun getGrade(marks: Int): Char {
    return when (marks) {
        in 90..100 -> 'A'
        in 60..89 -> 'B'
        in 50..59 -> 'C'
        in 40..49 -> 'D'
        else -> 'F'
    }
}

//7. Create a simple calculator using functions: add, subtract, multiply, divide.
fun add(a: Double, b: Double): Double = a + b
fun subtract(a: Double, b: Double): Double = a - b
fun multiply(a: Double, b: Double): Double = a * b
fun divide(a: Double, b: Double): Double = if (b != 0.0) a / b else 0.0
fun calculate(a: Double, b: Double, operator: String): Double = when (operator.lowercase()) {
    "+", "add" -> add(a, b)
    "-", "subtract" -> subtract(a, b)
    "*", "multiply" -> multiply(a, b)
    "/", "divide" -> divide(a, b)
    else -> throw IllegalArgumentException("Unsupported operator: $operator")
}

//8. Write a function to check if a number is a palindrome.
fun isPalindrome(num: Long): Boolean {
    val str = num.toString()
    return str == str.reversed()
}

//9. Create a menu-driven program using 'when' to perform different math operations.
fun performMathOperation(a: Double, b: Double, operator: String): Double {
    return when (operator) {
        "+", "add" -> add(a, b)
        "-", "subtract" -> subtract(a, b)
        "*", "multiply" -> multiply(a, b)
        "/", "divide" -> divide(a, b)
        else -> throw IllegalArgumentException("Unknown operator: $operator")
    }
}

//10. Write a function that returns the factorial of a number.
fun factorial(num: Int): Long {
    if (num < 2) return 1
    return num * factorial(num - 1)
}

//Section C: Arrays and Lists
//11. Find the sum of elements in an array.
fun sumArrayElements(arr: IntArray): Int = arr.sum()

//12. Find the maximum element in a list.
fun maxInList(list: List<Int>): Int? = list.maxOrNull()

//13. Remove duplicates from a list.
fun removeDuplicates(list: List<Int>): List<Int> = list.distinct()

//14. Count frequency of each element in a list.
fun countListElements(list: List<Int>): Map<Int, Int> = list.groupingBy { it }.eachCount()

//15. Find the second largest element in a list.
fun getSecondLargest(list: List<Int>): Int {
    var largest = list[0]
    var secLargest = list[0]
    for (i in 0..<list.size) {
        if (list[i] > largest) {
            secLargest = largest
            largest = list[i]
        }
        if (list[i] < largest && list[i] > secLargest) {
            secLargest = list[i]
        }
    }
    return secLargest;
}

//Submission Guidelines
//• Create a folder/Github repo  containing all your Kotlin program files.
//• Run each program and take screenshots of the output.
//• Ensure your code is clearly visible in the screenshots or include the code files in the folder.
//• Upload the folder to Google Drive/Github repo url.
//• Submit the Drive/Repository link as your assignment submission.
//• Make sure the Drive/Repository link has viewing access enabled.
