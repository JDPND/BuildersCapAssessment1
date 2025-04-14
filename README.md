# BuildersCap Automation Assessment

![Java](https://img.shields.io/badge/Java-17-blue)
![Selenium](https://img.shields.io/badge/Selenium-4.0-green)
![Maven](https://img.shields.io/badge/Maven-3.8.6-red)
![TestNG](https://img.shields.io/badge/TestNG-7.6.0-orange)

## Project Overview
This project is a basic Selenium-based automation framework created as part of **Assessment 1**.
A Selenium WebDriver automation framework for testing web applications, implementing:
- Page Object Model (POM) design pattern
- Page Factory pattern
- Positive/Negative test scenarios
- Maven build management

## Framework Structure
assessment/
├── src/
│ ├── main/
│ │ └── java/
│ │ └── selenium/
│ │ ├── pages/
│ │ │ ├── AccountPage.java
│ │ │ └── LoginPage.java
│ │ └── utilities/
│ └── test/
│ ├── java/
│ │ └── selenium/
│ │ └── tests/
│ │ └── BasicTestScript.java
│ └── resources/
│ └── config.properties
├── pom.xml
└── testng.xml
---

## ✅ Features

- **Login Automation**: Automates login functionality with valid credentials.
- **Account Page Test**:
  - Positive test: Valid email update flow.
  - Negative test: Invalid email format validation.
- **Page Object Model**: All page locators and methods are abstracted into separate classes for reusability.
- **TestNG Framework**: Manages test execution and assertions.
- **Maven Build**: Handles project dependencies and test execution lifecycle.

---

## 🧰 Technologies Used

| Tool        | Purpose                         |
|-------------|----------------------------------|
| Selenium    | Browser automation              |
| Java        | Core language                   |
| Maven       | Build automation & dependency management |
| TestNG      | Testing framework               |
| Page Factory | Page Object Model enhancement  |

---

## 🔮 Future Enhancements:

📸 Capture screenshots on test failures for easier debugging.

📊 Integrate TestNG Reports or ExtentReports for enhanced reporting.

🔄 Use DataProviders for running tests with multiple sets of data.

🔐 Implement password encryption/decryption to avoid hardcoding sensitive credentials.

🧱 Create abstract utility methods (e.g., wait conditions, reusable clicks/inputs) for better code reuse.

♻️ Simplify and refactor code to reduce duplication and improve readability.

🔁 Enable automatic re-running of failed tests using TestNG retry analyzer.

🚀 Support parallel execution of multiple test cases via TestNG XML.

🧪 Add validations for more flows like registration, logout, and form validations.

## 🙌 Author

Jaideep Naidu

GitHub: @JDPND

