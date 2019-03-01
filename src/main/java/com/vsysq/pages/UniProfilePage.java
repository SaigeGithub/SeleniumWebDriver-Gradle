package com.vsysq.pages;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;

public class UniProfilePage {
    private WebDriver driver;
    private By edit = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div/button/span[1]/span");
    private By firstname = By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div[1]/div/div/input");
    private By lastname = By.xpath("/html/body/div/div/div[2]/div/form/div[2]/div[2]/div[1]/div[2]/div/div/input");
    private By female= By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[2]/div/label[1]/span[1]/span[1]/input");
    private By male = By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[2]/div/label[2]/span[1]/span[1]/input");
    private By dateofbirth =By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[3]/div/div/input");

    private By university=By.xpath("//*[@id=\"react-select-2-input\"]");

    private By selectUniversity=By.xpath("//div[@id='react-select-2-option-0']");
    private By fieldofstudy=By.xpath("//*[@id=\"react-select-3-input\"]");

    private By selectfieldofstudy=By.xpath("//div[@id='react-select-3-option-0']");
    private By iamfrom=By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[6]/div/div/input");
    private By yearofadmittance=By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[7]/div/div/div/div");
    private By selectyear=By.xpath("//*[@id=\"menu-yearOfAdmittance\"]/div[2]/ul/li[12]");
    private By aboutme=By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[8]/div/div/div/textarea[3]");
    private By StudentId=By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[2]/div[2]/div[9]/div/div/img");

    public UniProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickOnEdit(){
        WebElement element = driver.findElement(edit);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }
    public void SendFirstName(String temp){
        WebElement element = driver.findElement(firstname);
        if (element.isDisplayed()&& element.isEnabled())
            element.sendKeys(temp);
    }
    public void SendLastName(String temp){
        WebElement element = driver.findElement(lastname);
        if (element.isDisplayed()&& element.isEnabled())
            element.sendKeys(temp);
    }
    public void ClickOnFemale(){
        WebElement element = driver.findElement(female);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }
    public void ClickOnMale(){
        WebElement element = driver.findElement(male);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }
    public void SendBirth(String temp){
        WebElement element = driver.findElement(dateofbirth);
        if (element.isDisplayed()&& element.isEnabled())
            element.sendKeys(temp);
    }
    public void ClickOnUniversity(){
        WebElement element = driver.findElement(university);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }

    public void SendUniversity(String temp){
        WebElement element = driver.findElement(university);
        if (element.isDisplayed())
            element.sendKeys(temp);
    }
    public void SelectUniversity(){
        WebElement element = driver.findElement(selectUniversity);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }

    public void SendStudy(String temp){
        WebElement element = driver.findElement(fieldofstudy);
        if (element.isDisplayed())
            element.sendKeys(temp);
    }
    public void ClickOnStudy(){
        WebElement element = driver.findElement(fieldofstudy);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }
    public void SelectStudy(){
        WebElement element = driver.findElement(selectfieldofstudy);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }
    public void SendIamFrom(String temp){
        WebElement element = driver.findElement(iamfrom);
        if (element.isDisplayed()&& element.isEnabled()){
            clean(element);
            element.sendKeys(temp);
        }

    }
    public void ClickOnYear(){
        WebElement element = driver.findElement(yearofadmittance);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }

    public void SelectYear(){
        WebElement element=driver.findElement(selectyear);
        if(element.isDisplayed()&& element.isEnabled())
            element.click();
    }
    public void SendAboutMe(String temp){
        WebElement element = driver.findElement(aboutme);
        if (element.isDisplayed()&& element.isEnabled())
            element.sendKeys(temp);
    }
    public void ClickOnStudentID(){
        WebElement element = driver.findElement(StudentId);
        if (element.isDisplayed()&& element.isEnabled())
            element.click();
    }

    public void clean(WebElement temp){
        temp.clear();
    }
}
