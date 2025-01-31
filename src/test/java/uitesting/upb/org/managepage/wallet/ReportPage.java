package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class ReportPage extends BasePage {

    @FindBy(xpath = "//select[@id='reportType']//option[@value='date']")
    private WebElement optionDate;

    @FindBy(xpath = "//select[@id='reportType']//option[@value='category']")
    private WebElement optionCategory;

    @FindBy(xpath = "//input[@id='startDate']")
    private WebElement fieldStartDate;

    @FindBy(xpath = "//input[@id='endDate']")
    private WebElement fieldEndDate;

    @FindBy(id = "showReport")
    private WebElement showReportButton;

    @FindBy(id = "reportType")
    private WebElement reportTypeComboBox;

    @FindBy(id = "reportType")
    private WebElement typeSelector;




    @FindBy(xpath = "//*[@value=\"category\"]")
    private  WebElement categorySelector;


    public void clickCategoryType(){
        Events.click(categorySelector);
    }

    public ReportPage() {
        super();
    }
    public void selectDateReport(){
        Events.click(optionDate);
    }
    public void selectCategoryReport(){
        Events.click(optionCategory);
    }
    public void fillStartDateReport(String startDate){
        Events.fillField(fieldStartDate,startDate);
    }
    public void fillEndDateReport(String endDate){
        Events.fillField(fieldEndDate,endDate);
    }
    public ReportTable clickShowReportButton(){
        Events.click(showReportButton);
        return new ReportTable();
    }
    public boolean reportButtonIsVisible(){
        return Events.isVisibleWebElement(fieldStartDate);
    }
    public boolean startDateFieldIsVisible(){
        return Events.isVisibleWebElement(fieldStartDate);
    }
    public boolean endDateFieldIsVisible(){
        return Events.isVisibleWebElement(fieldEndDate);
    }
    public boolean reportTypeComboBoxIsVisible(){
        return Events.isVisibleWebElement(reportTypeComboBox);
    }


    public void clickTypeSelector(){
        Events.click(typeSelector);
    }
}