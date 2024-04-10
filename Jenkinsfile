pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Clone the Git repository
                git 'https://github.com/nverma993566/SeleniumGitRepo'
            }
        }
        stage('Test') {
            steps {
                // Set up the Selenium test environment
                script {
                    def driver = new initialisedriver().initializeDriver()
                    driver.manage().timeouts().implicitlyWait(new ReadConfigFile().getGlobalWaitTime(), TimeUnit.SECONDS)
                    def searchpageobj = new AmazonSearchPageObjects(driver)
                    driver.get(new ReadConfigFile().getUrl())

                    // Run the Selenium tests
                    AmazonSearchTest(searchpageobj)
                }
            }
        }
    }
}

def AmazonSearchTest(searchpageobj) {
    ReadConfigFile ConfigFile = new ReadConfigFile()
    searchpageobj.setTextInsearchbox(ConfigFile.SearchItem())
    searchpageobj.clicksearchButton()
    searchpageobj.addToCart("https://www.amazon.in/dp/B0CHX7STQQ")
    searchpageobj.selectMiniTV("Amazon miniTV")
    searchpageobj.goToSettings()
    searchpageobj.goToDeleteDataPage()
    searchpageobj.clickYesButton()
    searchpageobj.clickHmIcon()
    searchpageobj.clickSignInButton()
    searchpageobj.enterEmail("abc@gmail.com")
}
