# Java Bank Account Project ☕

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

## 📄 About the Project

This is a Java console project that simulates the basic operations of a bank account. It was developed as a practical exercise to apply programming logic and business rule concepts in an interactive environment.

The system is controlled by a terminal-based menu, allowing the user to choose the desired actions in a simple and direct way.

## ✨ Features

The system offers an interactive menu with the following operations:

-   💰 **Check Available Balance:** Displays the current account balance.
-   💳 **Check Overdraft Limit:** Shows the total limit and the amount already used.
-   📥 **Make Deposits:** Adds funds to the account balance.
-   💸 **Perform Withdrawals:** Withdraws funds from the account, using the overdraft limit if necessary.
-   📄 **Pay Bills:** Works similarly to a withdrawal to debit the amount.
-   🚨 **Check Overdraft Usage:** Informs if the account is currently using the overdraft limit.
-   🚪 **Exit:** Terminates the program's execution.

## ⚙️ Implemented Business Rules

The bank account logic follows a specific set of rules, mainly related to the overdraft feature:

#### **Overdraft Limit**

-   The limit is defined at the time of **account creation**, based on the initial deposit amount:
    -   If the initial deposit is **≤ $500.00**, the overdraft limit will be **$50.00**.
    -   If the initial deposit is **> $500.00**, the overdraft limit will be **50% of the deposited amount**.

#### **Usage Fee**

-   When any amount of the overdraft is used, a **fee of 20%** on the *used* amount will be charged.
-   This fee is automatically charged as soon as the account receives a deposit that covers the amount due (the used overdraft balance + the fee).

## 🚀 How to Run the Project

To run this project, you will need to have the **JDK (Java Development Kit)** installed on your machine.

```bash
# 1. Clone the repository
git clone [https://github.com/FlavioEduardo92/ExerciciosJava.git](https://github.com/FlavioEduardo92/ExerciciosJava.git)

# 2. Navigate to the project folder
cd ExerciciosJava

# 3. Navigate to the source folder
cd src

# 4. Compile the Java files
# (It's important to compile both files together)
javac ./Exercicios/ContaBancaria.java ./Exercicios/Main.java

<<<<<<< HEAD
# 5. Execute o programa principal
java Exercicios.conta.ContaBancaria.Main
=======
# 5. Run the main program
java Exercicios.Main
>>>>>>> 70f39c0eb39dfce48bcb9831b419c7e888fe7061

# 6. Follow the instructions in the interactive menu!
```

## 👨‍💻 Author

Made with ❤️ by **Flávio Eduardo**.

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/FlavioEduardo92)
