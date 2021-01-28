***Settings***

Library     AppiumLibrary


***Test Cases***
Deve abrir a tela principal
    Set Appium Timeout  5
    open Application    http://localhost:4723/wd/hub
    ...                 automationName=UiAutomator2
    ...                 platformName=Android
    ...                 deviceName=Emulator
    ...                 app=${EXECDIR}/app/twp.apk
    
    Wait Until Page Contains    Training Wheels Protocol
    Wait Until Page Contains    Mobile Version
    Close Application

 
***Keywords***  
Open Session 
   Set Appium Timeout  5
    open Application    http://localhost:4723/wd/hub
    ...                 automationName=UiAutomator2
    ...                 platformName=Android
    ...                 deviceName=Emulator
    ...                 app=${EXECDIR}/app/twp.apk
Close Session
    Close Application