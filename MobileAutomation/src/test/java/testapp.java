import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class testapp {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.atigo");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".ui.splash.ActivitySplash");
        dc.setCapability(MobileCapabilityType.NO_RESET, true);
        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @SuppressWarnings("deprecation")
	@Test
    public void testUntitled() {
        driver.pressKeyCode(AndroidKeyCode.HOME);
        driver.startActivity(new Activity("com.android.atigo",".ui.splash.ActivitySplash"));
        driver.findElement(By.xpath("//*[@text=' Phone Number']")).click();
        // driver.findElement(By.xpath("//*[@text=' Phone Number']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='8']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='8']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='6']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='0']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='0']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='1']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='6']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='0']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='3']")).click();
        driver.findElement(By.xpath("//*[@contentDescription='1']")).click();
        driver.findElement(By.xpath("//*[@text='Get OTP']")).click();
        new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Get OTP']")));
        // driver.findElement(By.xpath("//*[@text='Get OTP']")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}