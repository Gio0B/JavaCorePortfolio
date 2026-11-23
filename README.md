# Java Core Portfolio

A collection of Java exercises and practical projects developed to strengthen programming skills, apply Object-Oriented Programming principles, and build a solid foundation in Java development.

The repository covers fundamental programming concepts, data structures, object-oriented design, input validation, exception handling, and automated testing.

This is an ongoing project that documents my progress in Java development.

## Technologies

- **Java 21** – Main programming language
- **Maven** – Project and dependency management
- **JUnit 5** – Automated unit testing
- **Git & GitHub** – Version control and source code management

## Project Overview

The repository contains independent exercises and small applications, each focusing on specific Java concepts and programming techniques.

| Project | Description | Concepts |
|---|---|---|
| **FizzBuzz** | Prints numbers with the classic FizzBuzz rules. | Loops, conditionals, modular arithmetic |
| **NumberAnalyzer** | Analyzes integers by checking parity, counting digits, and calculating digit sums. | Methods, arithmetic operations, edge cases |
| **PalindromeChecker** | Checks whether a word is a palindrome, ignoring uppercase and lowercase differences. | Strings, loops, character comparison |
| **ArrayAnalyzer** | Finds minimum and maximum values, calculates averages, and counts occurrences in integer arrays. | Arrays, loops, algorithms |
| **BankAccount** | Simulates a bank account with balance management, deposits, withdrawals, and validation. | Encapsulation, constructors, exceptions |
| **StudentManager** | Manages a collection of students, supporting insertion, removal, searching, and listing. | ArrayList, collections, defensive copying |
| **ContactManager** | Manages contacts with search, update, removal, validation, and immutable contact data. | OOP, encapsulation, object management |
| **InventoryManager** | Manages products, including creation, searching, updates, removal, and inventory value calculation. | Object relationships, collections, data validation |

## Concepts and Skills

The exercises provide practical experience with:

- Java fundamentals and control flow
- Object-Oriented Programming (OOP)
- Classes, objects, constructors, and methods
- Encapsulation and access modifiers
- Static methods
- Arrays and Java Collections Framework
- `ArrayList` and collection operations
- String manipulation
- Input validation and exception handling
- Immutable objects and defensive copying
- Basic algorithms and problem solving
- Automated testing with JUnit 5
- Maven project configuration and build lifecycle

## Project Structure

The project follows the standard Maven directory layout.

```text
JavaCorePortfolio/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── it/
│   │           └── giovanni/
│   │               └── javacore/
│   │                   ├── Main.java
│   │                   ├── FizzBuzz.java
│   │                   ├── NumberAnalyzer.java
│   │                   ├── PalindromeChecker.java
│   │                   ├── ArrayAnalyzer.java
│   │                   ├── BankAccount.java
│   │                   ├── StudentManager.java
│   │                   ├── Contact.java
│   │                   ├── ContactManager.java
│   │                   ├── Product.java
│   │                   └── InventoryManager.java
│   │
│   └── test/
│       └── java/
│           └── it/
│               └── giovanni/
│                   └── javacore/
│                       ├── FizzBuzzTest.java
│                       ├── NumberAnalyzerTest.java
│                       └── PalindromeCheckerTest.java
│
├── pom.xml
├── .gitignore
└── README.md
```

## Getting Started

### Prerequisites

Make sure you have installed:

- **JDK 21** or a compatible Java version
- **Apache Maven 3.9+**
- Git

An IDE such as Spring Tool Suite, Eclipse, or IntelliJ IDEA is recommended but not required.

### Clone the repository

```bash
git clone https://github.com/Gio0B/JavaCorePortfolio.git
cd JavaCorePortfolio
```

### Build the project

Compile the source code using Maven:

```bash
mvn clean compile
```

### Run the application

Open the project in your preferred Java IDE and run:

```text
it.giovanni.javacore.Main
```

The `Main` class contains manual demonstrations of the implemented exercises and their functionality.

## Automated Testing

The project uses **JUnit 5** to verify the behavior of individual classes through automated unit tests.

Tests are located in:

```text
src/test/java/it/giovanni/javacore/
```

### Run the tests

Execute the following command from the project root:

```bash
mvn clean test
```

Maven automatically compiles the application, compiles the test classes, and executes the test suite.

### Current test coverage

Automated tests are currently implemented for:

| Test class | Main functionality tested |
|---|---|
| `FizzBuzzTest` | Output and divisibility rules |
| `NumberAnalyzerTest` | Even numbers, digit sums, and digit counting |
| `PalindromeCheckerTest` | Palindrome detection, case handling, and invalid input |

Additional test classes will be introduced as the project evolves.

## Development Goals

This repository is continuously evolving as I expand my knowledge of Java and software development.

Planned improvements include:

- Extending JUnit 5 test coverage to all existing classes.
- Improving code quality, readability, and maintainability.
- Exploring Java Streams and Lambda Expressions.
- Practicing more advanced data structures and algorithms.
- Developing projects using JDBC and relational databases.
- Progressing towards backend development with Spring Boot.

## Author

**Giovanni Barone**

GitHub: [Gio0B](https://github.com/Gio0B)

---

*Built as part of my ongoing journey in Java development and software engineering.*