package Podium.Pages;

import org.openqa.selenium.By;

public class FormsFillingPage extends BasePage1{

    /*************************************** GOING TO ENTERPISE PAGE  ***************************************/

    public String getEnterpriseText() {
        return page_.getTexts(By.linkText("Enterprise"));
    }

    public void setClickEnterprise() {
        page_.buttonClick(By.linkText("Enterprise"));
    }

    /*************************************** FILLING FORM FIELD AND NOT SENDING ****************************/

    public void setTypeFirstName() {
        page_.type("FirstName", "Peter");
    }

    public void setTypeLastName() {
        page_.type("LastName", "Parker");
    }

    public void setTypeEmail() {
        page_.type("Email", "peter@parker.com");
    }

    public void setTypeLocationsNumber() {
        page_.type("No_of_Locations__c", "10");
    }

    public void setTypeCompany() {
        page_.type("Company", "Stark Industries");
    }

    public void setTypeMobilePhone() {
        page_.type("MobilePhone", "12345678");
    }

    /*************************************** VERIFYING FILLED FIELD ***************************************/

    public String getFirstNameText() {
        return page_.getFieldValue("FirstName");
    }

    public String getLastNameText() {
        return page_.getFieldValue("LastName");
    }

    public String getEmailText() {
        return page_.getFieldValue("Email");
    }

    public String getLocationsNumberText() {
        return page_.getFieldValue("No_of_Locations__c");
    }

    public String getCompanyText() {
        return page_.getFieldValue("Company");
    }

    public String getMobilePhoneText() {
        return page_.getFieldValue("MobilePhone");
    }


}
