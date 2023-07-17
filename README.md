# PROBLEM-1
# Calculator

This is a simple command-line calculator program written in Java.

## Description

The Calculator program allows you to perform basic mathematical operations such as addition, subtraction, multiplication, and division. It takes user input for the type of operation and the values of the operands, and then calculates and displays the result.

## Usage

To use the Calculator program, follow these steps:

1. Run the program using the `main` method in the `Calculator` class.
2. Enter the type of operation you want to perform (e.g., "addition", "subtraction", "multiplication", "division").
3. Enter the values of the operands (`a` and `b`) as prompted.
4. The program will perform the specified operation and display the result.

Please note that for the division operation, the program checks if the divisor (`b`) is zero and throws an `IllegalArgumentException` in such cases.


# PROBLEM-2
# Number Generator

This is a simple Java program that generates a series of numbers based on user input.

## Description

The Number Generator program takes an integer input `a` and generates a series of numbers based on the following pattern: 1, 3, 5, 7, ...

The program uses Java's `IntStream.rangeClosed()` method to generate a stream of integers from 1 to `a`. Each number in the stream is then transformed using the formula `2 * i - 1` to generate the series of odd numbers.

The generated series is displayed as the output in the format: "Input a = {a}, then output: {series}".

## Usage

To use the Number Generator program, follow these steps:

1. Run the program using the `main` method in the `NumberGenerator` class.
2. Enter the value of `a` when prompted.
3. The program will generate the series of numbers and display the output.



# Problem-3
# Series Generator

This is a simple Java program that generates a series of numbers based on user input.

## Description

The Series Generator program takes an integer input `a` and generates a series of numbers based on the following pattern: 1, 3, 5, 7, ...

The program uses Java's `IntStream.range()` method to generate a stream of integers from 1 to `a-1`. Each number in the stream is then transformed using the formula `2 * i - 1` to generate the series of odd numbers.

The generated series is displayed as the output in the format: "Output: {series}".

## Usage

To use the Series Generator program, follow these steps:

1. Run the program using the `main` method in the `SeriesGenerator` class.
2. Enter the value of `a` when prompted.
3. The program will generate the series of numbers and display the output.

# PROBLEM-4

# Number Counter

This is a simple Java program that counts the occurrence of numbers in a list based on their divisibility by [1, 2, 3, 4, 5, 6, 7, 8, 9].

## Description

The Number Counter program takes a list of numbers as input and counts the occurrences of numbers that are divisible by each factor from 1 to 9.

The program prompts the user to enter the numbers as a comma-separated list. Each number is then parsed, and a count is maintained for each factor based on their divisibility.

The counts of numbers that are divisible by each factor are stored in a `Map<Integer, Integer>` called `countMap`, where the keys represent the factors and the values represent the counts.

The program outputs the `countMap` as the result.

## Usage

To use the Number Counter program, follow these steps:

1. Run the program using the `main` method in the `NumberCounter` class.
2. Enter the numbers as prompted, separated by commas.
3. The program will calculate the counts of numbers that are divisible by each factor from 1 to 9 and display the output.
