***Settings***

Library     AppiumLibrary
Library     libs/extend.py
Resource    helpers.robot

***Keywords***  
Open Session 
    Set Appium Timeout  5
    open Application    http://localhost:4723/wd/hub
    ...                 automationName=UiAutomator2
    ...                 platformName=Android
    ...                 deviceName=Emulator
    ...                 app=${EXECDIR}/app/twp.apk
    Get Started
Close Session
    Close Application
