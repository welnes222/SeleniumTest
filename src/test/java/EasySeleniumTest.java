import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

public class EasySeleniumTest {
    public WebDriver driver = new ChromeDriver();
    String firstName = "Kontautas";
    String lastName = "Kontautaitis";
    String email = "saimis@pastas.com";
    String phoneNumber = "86494812";
    String address = "Makvyno gatve 12";
    String city = "Rumsiskes";
    String state = "Alaska";
    String zipCode = "4462";
    String projectDescription = "tratatattata";
    @Test
    public void firstNameFillTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys(firstName);
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[1]")).getText(), "");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[2]")).getText(), "");
    }
    @Test
    public void tickmarkFirstNameTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys(firstName);
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void  LastNameFillTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys(lastName);
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[1]")).getText(), "");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[2]")).getText(), "");
    }
    @Test
    public void tickmarkLastNameTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys(lastName);
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void emailFillTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys(email);
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/small[1]")).getText(),"");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/small[2]")).getText(),"");
    }
    @Test
    public void emailTickmarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys(email);
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void phoneFillTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys(phoneNumber);
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[1]")).getText(),"");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[2]")).getText(),"");
    }
    @Test
    public void phoneTickmarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys(phoneNumber);
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void addressFillTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys(address);
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[1]")).getText(),"");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[2]")).getText(),"");
    }
    @Test
    public void addressTickmarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys(address);
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void cityFillTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys(city);
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/small[1]")).getText(),"");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/small[2]")).getText(),"");
    }
    @Test
    public void cityTickMarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys(city);
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void stateChooseTest(){
        Select drpState = new Select(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select")));
        drpState.selectByVisibleText(state);
    }
    @Test
    public void stateTickMarkTest() {
        Select drpState = new Select(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select")));
        drpState.selectByVisibleText(state);
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void zipCodeFillTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys(zipCode);
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/small[1]")).getText(),"");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/small[2]")).getText(),"");
    }
    @Test
    public void zipCodeTickMarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys(zipCode);
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void projectDescriptionFillTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")).sendKeys(projectDescription);
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/small[1]")).getText(),"");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/small[2]")).getText(),"");
    }
    @Test
    public void projectDescriptionTickMarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")).sendKeys(projectDescription);
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @BeforeClass
    public void beforeClass() {
       // System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver111.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @BeforeMethod
    public void beforeMethod() {
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        driver.manage().window().maximize();
    }
}