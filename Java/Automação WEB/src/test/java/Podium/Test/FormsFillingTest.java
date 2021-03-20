package Podium.Test;

import Podium.Pages.FormsFillingPage;
import Podium.Suport.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class FormsFillingTest extends BaseTest {

    FormsFillingPage page = new FormsFillingPage();

    @Test
    public void test() {

        // Verifying if "Enterprise" button is present and clicking on it
        Assert.assertEquals("Enterprise", page.getEnterpriseText());
        page.setClickEnterprise();

        // Filling form, BUT NOT SENDING
        page.setTypeFirstName();
        page.setTypeLastName();
        page.setTypeEmail();
        page.setTypeLocationsNumber();
        page.setTypeCompany();
        page.setTypeMobilePhone();

        // Verifying filled fields from form
        Assert.assertEquals("Peter", page.getFirstNameText());
        Assert.assertEquals("Parker", page.getLastNameText());
        Assert.assertEquals("peter@parker.com", page.getEmailText());
        Assert.assertEquals("10", page.getLocationsNumberText());
        Assert.assertEquals("Stark Industries", page.getCompanyText());
        Assert.assertEquals("12345678", page.getMobilePhoneText());

        
    }
}
