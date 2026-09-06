# Lab Task 3 — String Utility (Palindrome Checker)

## Objective

The objective of this lab is to use JUnit to test string-processing logic and case sensitivity.

The lab focuses on testing whether a string is a palindrome while handling different cases, non-letter characters, null values, and empty strings.

## Implementation and Tasks Completed

The `StringUtil.java` class was implemented with an `isPalindrome()` method.

The method:

- Checks for `null` input.
- Removes non-letter characters.
- Converts the string to lowercase.
- Reverses the cleaned string.
- Compares the reversed string with the original cleaned string.

The following tasks were completed:

- Tested a lowercase palindrome using `"madam"`.
- Tested a case-insensitive palindrome using `"RaceCar"`.
- Tested a non-palindrome using `"hello"`.
- Tested `null` input.
- Tested an empty string.
- Used JUnit to verify the expected results.

## How to Run

### Run the Code

1. Open the project in NetBeans IDE.
2. Open `StringUtil.java`.
3. Run the Java project or class.

### Run the Tests

1. Open `StringUtilTest.java`.
2. Right-click the test file.
3. Select **Test File** to run the JUnit tests.

If the project is configured with Maven, tests can also be run using:

```bash
mvn test
