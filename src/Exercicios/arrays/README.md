# Java Array Notes Challenge (DesafioArraysNotas) 📚

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

## 📄 About the Project

This is a straightforward Java console project designed to calculate the average of a student's grades. It serves as a practical exercise focused on core **programming logic**, **array manipulation**, and basic **user input handling**.

The program interactively prompts the user to specify the number of grades to be entered, and then collects each grade individually before computing and displaying the final average.

## ✨ Features

The system offers the following core functionalities:

-   📏 **Define Number of Grades:** Allows the user to specify how many grades they wish to input.
-   📝 **Input Grades:** Prompts the user to enter each grade individually.
-   📊 **Calculate Average:** Computes the arithmetic mean of all entered grades.
-   ✅ **Display Result:** Presents the calculated average grade to the user.

## ⚙️ Implemented Concepts

This project demonstrates the application of several fundamental Java programming concepts:

#### **Core Programming Logic**

-   **User Input (`Scanner`):** Utilizes the `java.util.Scanner` class to read integer input for the quantity of grades and double input for the actual grade values.
-   **Locale Configuration:** Employs `Scanner.useLocale(Locale.US)` to ensure that decimal numbers are correctly interpreted using a dot (`.`) as the decimal separator, providing consistent behavior regardless of the system's regional settings.
-   **Variables and Data Types:** Appropriate use of `int` for counting grades and `double` for handling numerical grades and their average, ensuring precision.
-   **Basic Arithmetic Operations:** Performs addition (`+=`) and division (`/`) for calculating the total sum and the average.

#### **Arrays**

-   **Array Declaration and Initialization:** Demonstrates how to declare a `double` array (`double[] notas;`) and initialize it with a dynamic size based on user input (`new double[quantidadeNotas];`).
-   **Array Traversal (for loop):** Uses a `for` loop to iterate through the array, allowing for the sequential input of grades and their storage at specific indices (`notas[i]`).
-   **Array Iteration (for-each loop):** Employs a `for-each` loop to conveniently sum all elements (grades) within the `notas` array.
-   **Array Length (`.length`):** Utilizes the `notas.length` property to dynamically get the total number of grades for accurate average calculation.

#### **Control Flow**

-   **`for` Loop:** Used for controlled iteration to collect a predefined number of grades from the user.
-   **Output (`System.out.println`, `System.out.printf`):** Provides clear prompts and displays the final result to the console.

## 🚀 How to Run the Project

To run this project, you will need to have the **JDK (Java Development Kit)** installed on your machine.

```bash
# 1. Clone the repository
git clone [https://github.com/FlavioEduardo92/ExerciciosJava.git](https://github.com/FlavioEduardo92/ExerciciosJava.git)

# 2. Navigate to the project folder
cd ExerciciosJava

# 3. Navigate to the source folder
cd src

# 4. Navigate to the specific exercise folder
cd Exercicios/arrays/DesafioArraysNotas

# 5. Compile the Java file
javac DesafioArraysNotas.java

# 6. Run the main program
java DesafioArraysNotas

# 7. Follow the instructions to input the number of grades and each grade!

```

## 👨‍💻 Author

Made with ❤️ by **Flávio Eduardo**.

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/FlavioEduardo92)