# Java Packages Assignment

This folder contains Java programs that demonstrate how to create and use packages, subpackages, and how to access packaged classes from external programs.

The assignment demonstrates:

- Creating custom packages and subpackages
- Defining classes inside a nested package structure
- Compiling packages using the command javac -d . filename.java
- Importing and accessing packaged classes from outside the package
- Organizing code using proper directory structures

## Programs
- **PackageDemo.java** - Located inside the subpackage exercises.java. Contains the display() method, which prints: "PackageDemo executed"
- **PackageDemoDriver.java** - Also inside the exercises.java package. Calls the display() method of the PackageDemo class from within the same package.
- **PackageDemoMain.java** - A program outside the defined package. Imports the exercises.java.PackageDemo class and calls its display() method to demonstrate external package usage.
