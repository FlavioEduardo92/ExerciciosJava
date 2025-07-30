# Java Food, Dinner & Person Challenge (desafioComidaEPeso) 🍎🍽️🚶‍♂️

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

## 📄 About the Project

This is a simple Java console project designed to simulate a basic interaction between a `Person` and various `Food` items. It demonstrates fundamental **Object-Oriented Programming (OOP)** concepts by modeling real-world entities and their behaviors in a straightforward scenario. The `Jantar` (Dinner) class orchestrates the interaction, showing how a person's weight changes after consuming different foods.

## ✨ Features

The system models and demonstrates the following core functionalities:

-   🍔 **Define Food Items:** Creates objects representing food, each with a name and a specific weight.
-   🧍 **Define a Person:** Creates a person object with a name and an initial weight.
-   🍽️ **Person Eats Food:** Implements a method that allows a person to "eat" a food item, causing their weight to increase by the weight of the consumed food.
-   📈 **Display Weight Change:** Outputs the person's updated weight after each meal.

## ⚙️ Implemented Concepts

This project serves as an excellent illustration of foundational Java programming and Object-Oriented Programming principles:

#### **Object-Oriented Programming (OOP)**

-   **Classes and Objects:**
    -   `Comida` (Food) class: Represents food items with `nome` (name) and `peso` (weight) attributes.
    -   `Pessoa` (Person) class: Represents a person with `nome` (name) and `peso` (weight) attributes. It also contains the `comer` (eat) method.
    -   `Jantar` (Dinner) class: Acts as the main application class, orchestrating the creation of `Comida` and `Pessoa` objects and simulating the eating process.
-   **Attributes:** Use of instance variables (`nome`, `peso`) to define the characteristics of objects.
-   **Constructors:** Custom constructors (`Comida(String, double)`, `Pessoa(String, double)`) are used to initialize objects with specific values upon creation.
-   **Methods:** The `comer(Comida comida)` method in the `Pessoa` class demonstrates how objects can interact with each other (a `Pessoa` object consuming a `Comida` object).

#### **Core Programming Logic**

-   **Method Calls:** Demonstrates how to invoke methods on objects (e.g., `p1.comer(c1);`).
-   **Basic Arithmetic Operations:** Uses addition (`+=`) to update a person's weight after consuming food.
-   **Conditional Statements (`if`):** Includes a basic null check (`if (comida != null)`) to prevent errors if a null food object is passed to the `comer` method.
-   **Console Output:** Utilizes `System.out.println()` for clear and informative output, displaying the eating action and the updated weight.

#### **Data Handling**

-   **Data Types:** Appropriate use of `String` for names and `double` for weights, ensuring precision for numerical values.

## 🚀 How to Run the Project

To run this project, you will need to have the **JDK (Java Development Kit)** installed on your machine.

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/FlavioEduardo92/ExerciciosJava.git](https://github.com/FlavioEduardo92/ExerciciosJava.git)
    ```
2.  **Navigate to the project folder:**
    ```bash
    cd ExerciciosJava
    ```
3.  **Navigate to the source folder:**
    ```bash
    cd src
    ```
4.  **Navigate to the specific exercise folder:**
    ```bash
    cd Exercicios/desafioComidaEPeso
    ```
5.  **Compile the Java files:**
    (It's important to compile all files together as they depend on each other)
    ```bash
    javac *.java
    ```
    *This command compiles `Comida.java`, `Jantar.java`, and `Pessoa.java`.*
6.  **Run the main program:**
    ```bash
    java Jantar
    ```
    *The `Jantar` class contains the `main` method to start the simulation.*

### Example Interaction:

Flávio comeu Arroz e agora pesa 86.1 kg.  
Flávio comeu Feijão e agora pesa 86.3 kg.

## 👨‍💻 Author

Made with ❤️ by **Flávio Eduardo**.

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/FlavioEduardo92)