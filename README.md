# SQA Challenge - Small World - Sauce Lab Demo Automation Project

This directory contains a Java Selenium test automation project based on the Cucumber BDD framework. Each test case is organized in a separate feature file, [Link](https://github.com/Tooba-Munir/SQAChallengeSmallWorld/tree/main/CucumberJava/src/test/resources/Features).

## Dependencies

The project relies on the following dependencies:

- [Cucumber Java](https://mvnrepository.com/artifact/io.cucumber/cucumber-java) - Version 7.15.0
- [JUnit](https://mvnrepository.com/artifact/junit/junit) - Version 4.13.2 (used for testing)
- [Cucumber JUnit](https://mvnrepository.com/artifact/io.cucumber/cucumber-junit) - Version 7.15.0 (for Cucumber integration with JUnit)
- [Webdriver Manager](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager) - Version 5.6.2
- [Selenium Chrome Driver](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver) - Version 4.16.1
- [Selenium DevTools](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-devtools-v120) - Version 4.16.1
- [Maven Cucumber Reporting](https://mvnrepository.com/artifact/net.masterthought/maven-cucumber-reporting) - Version 5.7.7 (utilized for generating HTML reports)
- [Log4j API](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api) - Version 2.14.1 (for logging informational messages)
- [Log4j Core](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core) - Version 2.14.1

## Build and Test

To build and run the project using Maven, execute the following commands:

```bash
mvn clean install
mvn clean test
mvn verify -DskipTests
```

The Runner file is located within the Runner package and can be executed either as JUnit tests or through Maven build. Alternatively, feature files can be executed as a Cucumber feature.

## Following is the demo video for running this project:
[Link](https://drive.google.com/file/d/1hRgkUdjScugQMJL3jgZDCU2RspOBLPMY/view?usp=drive_link)

## SnapShots of Report After Test Execution:
[Screenshot 1](https://drive.google.com/file/d/1iyJzd8CUv_DXicMrd34e3PJNfG1M04Z2/view?usp=sharing)
[Screenshot 2](https://drive.google.com/file/d/198NuLluk4Y3Ha5FC37C45jIc-RsTO6Ow/view?usp=sharing)
[Screenshot 3](https://drive.google.com/file/d/1nNYMOX55z8iQnLRyWUzGF9sPx0Bk8CSS/view?usp=sharing)
