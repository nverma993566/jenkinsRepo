#Selenium WebDriver Test Automation Project

##Overview
This project demonstrates automated testing of the Amazon India website using Selenium WebDriver. It includes test cases for searching for a product, adding it to the cart, and performing various other actions on the website.

##Project Structure
- pages: Contains page object classes for different pages of the website.
- test: Contains test classes for executing the test cases.
- config: Contains configuration files for setting up the test environment.

##Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Apache Log4j

##Features
- 10 test scenarios to test various functionalities of the Amazon  website.
- Implementation of the Page Factory method.
- Follows the Page Object Model for better code organization and maintenance.

##Setup Instructions
* Clone the repository to your local machine.
* Import the project into Eclipse.
* Set up the required browser drivers (Chrome, Firefox, Internet Explorer).
* Update the config.properties file with the correct URL, search item, 
* browser name, and global wait time.
* Run the AmazonSearchPagetest class as a TestNG test to execute the test cases.

##Usage
* AmazonSearchPageObjects: Contains methods for interacting with the * Amazon search page.
* initialisedriver: Initializes the WebDriver instance and manages global wait time.
* AmazonSearchPagetest: Executes the test cases using the page object methods and configuration from config.properties.
* ReadConfigFile: Reads configuration settings from the config.properties file.