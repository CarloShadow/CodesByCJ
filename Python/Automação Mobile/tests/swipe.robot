***Settings***

Resource        ../resources/base.robot

Test Setup      Open Session
Test Teardown   Close Session

***Variables***
${BTN_REMOVE}=      	io.qaninja.android.twp:id/btnRemove

***Test Cases***
Deve remover o capitão américa
    Go To Avengers List

#                                   começo x    começo y    fim x       fim y     
    Swipe By Percent                88.88       18.22       47.22       18.22
    
    Wait Until Element Is Visible   ${BTN_REMOVE}
    Click Element                   ${BTN_REMOVE}
    Sleep                           5

Deve remover o Thor
    [Tags]      Thor

    Go To Avengers List

#                                   começo x    começo y    fim x       fim y     
    Swipe By Percent                91.85       33.85       53.70       33.85
    
    Wait Until Element Is Visible   ${BTN_REMOVE}
    Click Element                   ${BTN_REMOVE}
    Sleep                           5

