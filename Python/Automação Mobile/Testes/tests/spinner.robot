***Settings***

Resource        ../resources/base.robot

Test Setup      Open Session
Test Teardown   Close Session

***Variables***
${SPINNER}=         id=io.qaninja.android.twp:id/spinnerJob
${LIST_VIEW}=       class=android.widget.ListView

***Keywords***
Job Choice
    [Arguments]     ${target}

    Click Element                       ${SPINNER}

    Wait Until Element Is Visible       ${LIST_VIEW}
    Click Text                          ${target}

***Test Cases***
Deve selecionar um perfil QA
    Go To SingUp Form

    Job Choice  QA

Deve selecionar o perfil Desenvolvedor
    Go To SingUp Form

    Job Choice  Desenvolvedor

Deve selecionar o perfil DevOps
    Go To SingUp Form

    Job Choice  DevOps

Deve selecionar o perfil Ux
    [Tags]      UX

    Go To SingUp Form

    Job Choice  UX