# Lombok Task for Volunteers

This project is based on **Lab 4, Task 2** and demonstrates the use of the **Lombok** library in Java to reduce boilerplate code in model classes.

## Description

The task involves modifying the previous `Car` class by:

* Adding the **Lombok** library to the project in IntelliJ IDEA.
* Removing all constructors, getters, setters, and other methods from the `Car` class.
* Using Lombok annotations such as `@Data`, `@AllArgsConstructor`, and `@NoArgsConstructor` to automatically generate them.
* Creating two `Car` objects in the main class and using the `equals()` and `hashCode()` methods to compare them.

The program should compile successfully and show that `equals()` returns **true**, and `hashCode()` returns the **same value**, even though the two objects are separate instances.

## How to Run

1. Make sure **Lombok** is installed and enabled in IntelliJ IDEA.
2. Clone this repository:

   ```bash
   git clone https://github.com/demikael/Lombok-Task-For-Volunteers.git
   cd Lombok-Task-For-Volunteers
   ```
3. Build and run the project from IntelliJ IDEA or the terminal.

## Reference

Learn more about Lombok here: [https://projectlombok.org/](https://projectlombok.org/)

Would you like me to include example code or console output (showing the `equals()` and `hashCode()` results) in the README?
