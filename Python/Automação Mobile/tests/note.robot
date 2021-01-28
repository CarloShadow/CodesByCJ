***Settings***

Library     AppiumLibrary

Test Setup      Open Session
Test Teardown   Close Session


***Keywords***
Open Session
    Set Appium Timeout  5
    Open Application    http://localhost:4723/wd/hub
    ...                 automationName=UiAutomator2
    ...                 platformName=Android
    ...                 deviceName=Emulator
    ...                 app=${EXECDIR}/app/notes.apk
    Get Started
Close Session
    Close Application

Get Started
    Wait Page Until Contains        id=com.socialnmobile.dictapps.notepad.color.note:id/img_add        

***Test Cases***
Deve abrir uma nota de texto
    Get Started

    Wait Until Page Contains        id=com.socialnmobile.dictapps.notepad.color.note:id/alertTitle
    Click Element                   xpath=/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1
    