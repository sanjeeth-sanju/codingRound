public class BasePage {
public WebDriver driver=null;
public BasePage(driver,class){
PageFactory.initElements(this.driver, object.getClass());
}
