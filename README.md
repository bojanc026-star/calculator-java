# Calculator Java – Assignment 1

## Software Metrics

### LOC (Lines of Code)

| File | LOC |
|--------|------:|
| Calculator.java | 134 |
| Start.java | 19 |
| Total | 153 |

---

## Informal Code Review and Static Analysis

Format:
File – Line Number – Observation

### Calculator.java

- Calculator.java – 7 – Variable `finalResult` is declared as static, introducing global state and making testing more difficult.
- Calculator.java – 18 – Method `ToString()` does not follow Java naming conventions. A name such as `toString()` or `getOperationSymbols()` would be more appropriate.
- Calculator.java – 18 – Method name may be confused with the standard `Object.toString()` method.
- Calculator.java – 27 – Missing validation for `null` input before calling `charAt(0)`.
- Calculator.java – 27 – Missing validation for empty string input, which may cause `StringIndexOutOfBoundsException`.
- Calculator.java – 56 – Generic `Exception` is caught instead of a specific exception such as `NumberFormatException`.
- Calculator.java – 65 – Method `Calculate()` modifies the collections passed as parameters, creating side effects.
- Calculator.java – 73-171 – Significant code duplication exists when processing arithmetic operations.
- Calculator.java – 73-171 – Method `Calculate()` has high cyclomatic complexity due to many conditional branches.
- Calculator.java – 81 – Recursive implementation may cause `StackOverflowError` when evaluating very long expressions.
- Calculator.java – 91 – Division by zero is not explicitly handled.
- Calculator.java – 67-171 – Method `Calculate()` violates the Single Responsibility Principle because it both determines operator precedence and performs calculations.
- Calculator.java – 22 – Method `Run()` only forwards execution to another method and provides no additional functionality.

### Start.java

- Start.java – 11 – `Scanner` object is created during each loop iteration, causing unnecessary resource allocation.
- Start.java – 12 – Variable name `Expression` does not follow Java naming conventions.
- Start.java – 15 – String comparison could be written as `"exit".equals(Expression)` for safer null handling.
- Start.java – 5-23 – Class and `main()` method are missing documentation comments.
- Start.java – 8 – Boolean variable `active` could be replaced with a simpler loop structure using `break`.

---

## Conclusion

The project is functional and relatively easy to understand, but several maintainability issues were identified:

- Global mutable state
- High cyclomatic complexity
- Code duplication
- Missing input validation
- Lack of documentation
- Non-standard naming conventions

Refactoring the calculation logic and improving input validation would significantly improve code quality.
