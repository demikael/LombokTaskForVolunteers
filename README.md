# LombokTaskForVolunteers

This project demonstrates how to use **Project Lombok** to simplify Java class creation by automatically generating common methods like constructors, getters, setters, `equals()`, `hashCode()`, and `toString()`.

---

## Description

The program defines a **`CarWithLombok`** class using Lombok annotations such as:

* `@Getter` and `@Setter` – automatically generate getter and setter methods
* `@AllArgsConstructor` – generates a constructor with all class fields as parameters
* `@EqualsAndHashCode` – creates `equals()` and `hashCode()` methods
* `@ToString` – creates a readable `toString()` method

The **`Main`** class demonstrates:

* Creating two `CarWithLombok` objects
* Printing their details
* Comparing them using `equals()`
* Displaying their hash codes

---

## Example Output

```
CarWithLombok(model=GLE, brand=Mercedes, color=white, year=2020, price=350000, stock=5)
CarWithLombok(model=GLC, brand=Mercedes, color=black, year=2023, price=200000, stock=3)
white
Equals: false
HashCode car1: 207122457
HashCode car2: 211024245
```

---

## Why Lombok Is Needed

Without Lombok, you would have to manually write:

* Constructors
* Getter and setter methods
* `equals()`, `hashCode()`, and `toString()` methods

Lombok automatically generates these during compilation, **reducing boilerplate code** and improving readability.

---

## How to Set Up Lombok

1. **Download Lombok:**
   Visit [https://projectlombok.org/download](https://projectlombok.org/download) and download the latest `lombok.jar`.

2. **Install Lombok in IntelliJ IDEA:**

   * Run the downloaded `lombok.jar` file.
   * Select your IntelliJ installation path and click **Install**.
   * Restart IntelliJ after installation.

3. **Add Lombok to Your Project:**

   * Go to **File → Project Structure → Modules → Dependencies → + → JARs or directories**
   * Add the downloaded `lombok.jar` file.

4. **Enable Annotation Processing:**

   * Go to **File → Settings → Build, Execution, Deployment → Compiler → Annotation Processors**
   * Check **“Enable annotation processing”**.

After this setup, Lombok annotations will work automatically during compilation.
