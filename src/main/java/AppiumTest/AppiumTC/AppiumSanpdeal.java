package AppiumTest.AppiumTC;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class AppiumSanpdeal {

	public static AndroidDriver<WebElement> driver;
	public static void main(String[] args) {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("device", "Android");
		cap.setCapability("deviceName", "Redmi 5A ");
		cap.setCapability("platformName", "Android");
		cap.setCapability("Androidversion", "8.1.0");
		cap.setCapability("udid", "792cd29d7cf5");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.snapdeal.main");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
				"com.snapdeal.ui.material.activity.MaterialMainActivityDefault");
		try {
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("android.widget.ImageButton")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.snapdeal.main:id/sdCash")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("com.snapdeal.main:id/fb_text")).click();
		driver.findElement(By.className("android.widget.ImageView")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.snapdeal.main:id/cross")).click();
		WebElement searchbox = driver.findElement(By.id("com.snapdeal.main:id/search_text_view"));
		searchbox.clear();
		searchbox.sendKeys("Redmi note 5 pro");
		// driver.pressKeyCode(84); // 66
		driver.findElement(By.id("com.snapdeal.main:id/account_tab")).click();
		/*
		 * Alert alt=driver.switchTo().alert(); alt.accept();
		 */
		driver.findElement(By.id("com.snapdeal.main:id/positiveBtnView")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		WebElement text = driver.findElement(By.id("android:id/text1"));
		System.out.println(text.getText());

	}

}
