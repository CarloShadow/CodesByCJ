package Podium.Pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage1 {

    /*************************************** PRODUCTS SETTINGS ***************************************/

    public String getProductsButtonText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'Products')]"));
    }

    public void setMouseOverOnProductsButton() {
        page_.mouseOver("//span[contains(text(),'Products')]");
    }

    /*************************************** REVIEWS SETTINGS ***************************************/

    public String getReviewsButtonText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'Reviews')]"));
    }

    public void setClickOnReviews() {
        page_.buttonClick(By.xpath("//span[contains(text(),'Reviews')]"));
    }

    public String getReviewsPageText() {
        return page_.getTexts(By.xpath("//p[contains(text(),'Reviews')]"));
    }

    /*************************************** FEEDBACK SETTINGS ***************************************/

    public String getFeedbackButtonText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'Feedback')]"));
    }

    public void setClickFeedbackButton() {
        page_.buttonClick(By.xpath("//span[contains(text(),'Feedback')]"));
    }

    public String getFeedbackPageText() {
        return page_.getTexts(By.xpath("//body/div[@id='page']/div[@id='content']/div[@id='primary']/main[@id='main']" +
                "/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]"));
    }

    /*************************************** PAYMENTS SETTINGS ***************************************/

    public String getPaymentsButtonText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'Payments')]"));
    }

    public void setClickPaymentsButton() {
        page_.buttonClick(By.xpath("//span[contains(text(),'Payments')]"));
    }

    public String getPaymentsPageText() {
        return page_.getTexts(By.xpath("//p[contains(text(),'Payments')]"));
    }

    /*************************************** TEAMCHAT SETTINGS ***************************************/

    public String getTeamchatButtonText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'Teamchat')]"));
    }

    public void setClickTeamchatButton() {
        page_.buttonClick(By.xpath("//span[contains(text(),'Teamchat')]"));
    }

    public String getTeamchatPageText() {
        return page_.getTexts(By.xpath("//p[contains(text(),'Teamchat')]"));
    }

    /*************************************** VIDEOCHAT SETTINGS ***************************************/

    public String getVideochatButtonText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'Videochat')]"));
    }

    public void setClickVideochatButton() {
        page_.buttonClick(By.xpath("//span[contains(text(),'Videochat')]"));
    }

    public String getVideochatPageText() {
        return page_.getTexts(By.xpath(" //body/div[@id='page']/div[@id='content']/div[@id='primary']/main[@id='main']" +
                "/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]"));
    }

    /*************************************** WEBCHAT SETTINGS ***************************************/

    public String getWebchatButtonText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'Webchat')]"));
    }

    public void setClickWebchatButton() {
        page_.buttonClick(By.xpath("//span[contains(text(),'Webchat')]"));
    }

    public String getWebchatPageText() {
        return page_.getTexts(By.xpath("//body/div[@id='page']/div[@id='content']/div[@id='primary']/main[@id='main']" +
                "/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]"));
    }

    /*************************************** INBOX SETTINGS ***************************************/

    public String getInboxButtonText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'Inbox')]"));
    }

    public void setClickInboxButton() {
        page_.buttonClick(By.xpath("//span[contains(text(),'Inbox')]"));
    }

    public String getLeadInteractionPageText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'LEAD INTERACTION™')]"));
    }

    /*************************************** CAMPAIGNS SETTINGS ***************************************/

    public String getCampaignsButtonText() {
        return page_.getTexts(By.xpath("//span[contains(text(),'Campaigns')]"));
    }

    public void setClickCampaignsButton() {
        page_.buttonClick(By.xpath("//span[contains(text(),'Campaigns')]"));
    }

    public String getCampaignsPageText() {
        return page_.getTexts(By.xpath("//p[contains(text(),'Campaigns (NEW)')]"));
    }

    /*************************************** FREE VERSION SETTINGS ***************************************/

    public String getFreeVersionButtonText() {
        return page_.getTexts(By.id("submenu-starter-button"));
    }

    public void setClickFreeVersionButton() {
        page_.buttonClick(By.id("submenu-starter-button"));
    }

    public String getPodiumStarterPageText() {
        return page_.getTexts(By.xpath("//h3[contains(text(),'Podium Starter')]"));
    }

}
