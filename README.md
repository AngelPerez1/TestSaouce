
# Test Automation #
Proyecto de pruebas de automation

## Resumen de la herramienta ##
* Infraestructura para QA Automation Cucumber para Java
* Versión: 0.1.0



#### Required: JDK 1.8 - MAVEN - Eclipse ####
* Download, Install and add environment variables for JDK 1.8.0_192
* Download and Install Maven
* Download and make available in directory with permissions, latest Eclipse version
* Download and install GIT (you can also use a GUI like Sourcetree)


### Clone repository ###
* Clone the repository in local directory with write permissions
* Open Eclipse
* Select Workspace directory
* Then Import -> Maven Project
* If it does not update or download the dependencies, right-click on the project and select Maven -> Update


# File structure for test execution #

## / test / java / runners ##

Contains the executor class. In it the "tags" option is used
 as a filter for the tests that are run,
 for example "tags = {@ Regresion}".
To run it, it runs as "JUnit Test".


## / test / resources / features ##

Here are placed the .features files, written in Gherkin.
 These contain the steps and variables that the tests will use.

## / test / java / stepsDefinitions ##

Here are the definitions of the steps of the .feature.
 These contain the functions invoked in each step of each feature.

## / main / java / pageObjects ##

Here you put the locators of the elements with their key: value, using PageFactory.
 These contain the functions and selectors used to interact with the browser.
