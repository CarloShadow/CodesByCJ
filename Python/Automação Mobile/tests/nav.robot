***Settings***

Resource    ../resources/base.robot

Test Setup      Open Session 
Test Teardown   Close Session

***Variables***
${TOOLBAR_TITLE}        id=io.qaninja.android.twp:id/toolbarTitle
 

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

Get started
    Wait Until Page Contains        COMEÇAR     
    Click Text                      COMEÇAR

Open Nav
    Wait Until Element Is Visible   xpath=//android.widget.ImageButton[@content-desc="Open navigation drawer"]      

    Click Element                   xpath=//android.widget.ImageButton[@content-desc="Open navigation drawer"]
    Wait Until Element Is Visible   id=io.qaninja.android.twp:id/navView      


***Test Cases***
Deve abrir a tela de dialogs
    Get Started
    Open Nav

    Click Text                      DIALOGS
    Wait Until Element Is Visible   ${TOOLBAR_TITLE}       
    Element Text Should Be          ${TOOLBAR_TITLE}       DIALOGS  
    
Deve acessar a tela dos formulários
    Get Started
    Open Nav

    Click Text                      FORMS
    Wait Until Element Is Visible   ${TOOLBAR_TITLE}       
    Element Text Should Be          ${TOOLBAR_TITLE}       FORMS  

Deve acessar a tela do avengers

    Get Started
    Open Nav

    Click Text                      AVENGERS
    Wait Until Element Is Visible   ${TOOLBAR_TITLE}       
    Element Text Should Be          ${TOOLBAR_TITLE}       AVENGERS  


