import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.time.Duration;

import static org.junit.Assert.*;

public class EasySeleniumTest {
    public WebDriver driver = new ChromeDriver();
    private boolean isChecked;
    private WebElement e;
    @Test
    public void firstNameFillTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("Kontautas");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[1]")).getText(), "");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[2]")).getText(), "");
    }
    @Test
    public void  LastNameFillTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("Kontautaitis");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[1]")).getText(), "");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[2]")).getText(), "");
    }
    @Test
    public void emailFillTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys("kontautas@pastas.com");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/small[1]")).getText(),"");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/small[2]")).getText(),"");
    }
    @Test
    public void phoneFillTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("868899487");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[1]")).getText(),"");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[2]")).getText(),"");
    }
    @Test
    public void addressFillTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("kontautu g.12");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[1]")).getText(),"");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[2]")).getText(),"");
    }
    @Test
    public void cityFillTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys("Havana");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/small[1]")).getText(),"");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/small[2]")).getText(),"");
    }
    @Test
    public void stateChooseTest(){
        Select drpState = new Select(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select")));
        drpState.selectByVisibleText("Kansas");
    }
    @Test
    public void zipCodeFillTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys("4894");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/small[1]")).getText(),"");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/small[2]")).getText(),"");
    }
    @Test
    public void projectDescriptionFillTest(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")).sendKeys("pamparampam");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/small[1]")).getText(),"");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/small[2]")).getText(),"");
    }
    @Test
    public void tickmarkFirstNameTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("Kontautas");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void tickmarkLastNameTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("Kontautaitis");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void emailTickmarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys("kontautas@pastas.com");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void phoneTickmarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("869488741");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void addressTickmarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("kontautu g.12");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void cityTickMarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys("Havana");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void stateTickMarkTest() {
        Select drpState = new Select(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select")));
        drpState.selectByVisibleText("Kansas");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void zipCodeTickMarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys("4897");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void projectDescriptionTickMarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")).sendKeys("pamparampamapam");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-ok"));
    }
    @Test
    public void failTickmarkFirstNameTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys(" ");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-remove"));
    }
    @Test
    public void failTickmarkLastNameTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys(" ");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-remove"));
    }
    @Test
    public void failEmailTickmarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys(" ");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-remove"));
    }
    @Test
    public void failPhoneTickmarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys(" ");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-remove"));
    }
    @Test
    public void failAddressTickmarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys(" ");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-remove"));
    }
    @Test
    public void failCityTickMarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys(" ");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-remove"));
    }
    @Test
    public void failZipCodeTickMarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys(" ");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-remove"));
    }
    @Test
    public void failProjectDescriptionTickMarkTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")).sendKeys(" ");
        String tick = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/i")).getAttribute("class");
        assertTrue(tick.contains("glyphicon-remove"));
    }
    @Test
    public void emptyFirstNameErrorTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[2]")).getText(), "Please supply your first name");
    }
    @Test
    public void emptyLastNameErrorTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/small[2]")).getText(), "Please supply your last name");
    }
    @Test
    public void emptyEmailErrorTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/small[1]")).getText(), "Please supply your email address");
    }
    @Test
    public void emptyPhoneErrorTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[1]")).getText(), "Please supply your phone number");
    }
    @Test
    public void emptyAddressErrorTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[2]")).getText(), "Please supply your street address");
    }
    @Test
    public void emptyCityErrorTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/small[2]")).getText(), "Please supply your city");
    }
    @Test
    public void emptyZipCodeErrorTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/small[1]")).getText(), "Please supply your zip code");
    }
    @Test
    public void emptyProjectDescriptionErrorTest() {
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")).sendKeys(" ");
        assertEquals(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/small[2]")).getText(), "Please supply a description of your project");
    }
    @Test
    public void tooShortErrorFirstName(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("aaa");
        String style = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[1]")).getAttribute("data-bv-result");
        assertTrue(style.contains("INVALID"));
    }
    @Test
    public void tooShortErrorLastName(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("a");
        String style = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/small[1]")).getAttribute("data-bv-result");
        assertTrue(style.contains("INVALID"));
    }
    @Test
    public void enterValidEmailError(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys("awdawwa");
        String style = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/small[2]")).getAttribute("data-bv-result");
        assertTrue(style.contains("INVALID"));
    }
    @Test
    public void enterValidPhoneError(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("18648");
        String style = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/small[2]")).getAttribute("data-bv-result");
        assertTrue(style.contains("INVALID"));
    }
    @Test
    public void tooShortValidAddressError(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("aaaaa");
        String style = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/small[1]")).getAttribute("data-bv-result");
        assertTrue(style.contains("INVALID"));
    }
    @Test
    public void enterValidCityError(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys("aaa");
        String style = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/small[1]")).getAttribute("data-bv-result");
        assertTrue(style.contains("INVALID"));
    }
    @Test
    public void enterValidZipCodeError(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys("22");
        String style = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/small[2]")).getAttribute("data-bv-result");
        assertTrue(style.contains("INVALID"));
    }
    @Test
    public void enterValidDescriptionError(){
        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")).sendKeys("22");
        String style = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/small[1]")).getAttribute("data-bv-result");
        assertTrue(style.contains("INVALID"));
    }
//    @Test
//    public void tickMarksTest(){
//        driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[1]/label/input")).click();
//        isChecked = e.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[1]/label/input")).isSelected());
//
//    }
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
