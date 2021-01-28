***Settings***

Library     AppiumLibrary
Resource    helpers.robot

***Keywords***
Open Session
    Set Appium Timeout  7
    Open Application    http://localhost:4723/wd/hub
    ...                 automationName=UiAutomator2
    ...                 platformName=Android
    ...                 deviceName=Emulator
    ...                 app=${EXECDIR}/app/booksy.apk

Close Session 
    Close Application
