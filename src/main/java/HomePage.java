import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private static final By USERNAME_INPUT = By.id ("mailbox__login");
    private static final By PASSWORD_INPUT = By.id ("mailbox__password");
    private static final By LOGIN_BUTTON = By.id ("mailbox__auth__button");

    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    public void populateLogin (String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();

    }
    
}
