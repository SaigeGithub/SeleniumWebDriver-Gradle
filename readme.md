To Use this selenium tool, you will need to do the following setups
1. Install Java correctly, make sure that java/javac works on your command line
2. Setup the enviroment for Gradle. I recommond Use IntelliJ IDEA to import project -> select Gradle project -> Let IntelliJ set up the enviroment
3. Make sure the chromedriver is installed. Find your driver in this link https://sites.google.com/a/chromium.org/chromedriver/downloads. Download and if you are MacOS, put it under webapp-autotest folder, if you are windows, put under C://Windows, if you are Linux, put it under /usr/bin/chromedriver
4. Go to the testng.xml file, change the parameter OS to one of the following "MacOS" "Windows" "Linux", if the testing URL changed, change the value of appURL.
5. In the commond line, if you install gradle you do "gradle build" and if you want to run it again, do "gradle clean build"
   If the commond below does not work, try "./gradlew build" "gradlew build"


