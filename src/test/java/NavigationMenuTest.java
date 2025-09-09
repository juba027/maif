import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

import com.logwire.pages.AccueilPage;

public class NavigationMenuTest {

     AccueilPage accueilPage;
    WebDriver driver;
    String baseUrl = "https://www.maif.fr/";
    String expectedUrl;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        accueilPage = new AccueilPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement cookieButton = driver.findElement(By.id("popin_tc_privacy_button_3"));
        cookieButton.click();

    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

    @Test
    public void testNavigationParticuliers() {
        accueilPage.clickOnParticuliersMenuButton();
        expectedUrl = "https://www.maif.fr/particuliers.html";
        assert driver.getCurrentUrl().equals("https://www.maif.fr/");
    }

    @Test
    public void testNavigationProfessionnels() {
        accueilPage.clickOnProfessionnelsMenuButton();
        expectedUrl = "https://www.maif.fr/professionnels";
        assert driver.getCurrentUrl().equals(expectedUrl);
    }

    @Test
    public void testNavigationEnseignants() {
        accueilPage.clickOnEnseignantsMenuButton();
        expectedUrl = "https://www.maif.fr/enseignants";
        assert driver.getCurrentUrl().equals(expectedUrl);
    }

    @Test
    public void testNavigationAssociationsEtCollectivites() {
        accueilPage.clickOnAssociationsEtcollictivitesMenuButton();
        expectedUrl = "https://www.maif.fr/associationsetcollectivites";
        assert driver.getCurrentUrl().equals(expectedUrl);
    }
    }
    

