package checking;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class libGlobal {
	
	protected static WebDriver driver;
	static Select s;
	static Actions acc;
	static Alert al;
	static Robot r;
	static JavascriptExecutor js;
	
	
	public static void launchchromebrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zero\\eclipse-workspace\\checking\\driver\\chromedriver.exe");
	     driver = new ChromeDriver();

	}
  public static void loadurl(String url) {
	  driver.get(url);
	
}
  public static void getTitle() {
	  String title = driver.getTitle();
	  System.out.println(title);
	  }
  
  public static void getCurrentUrl() {
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
	  }
  public static void getText(WebElement e) {
	  String text = e.getText();
	  System.out.println(text);	
}
  public static void fill(WebElement e,String value) {
	  e.sendKeys(value);
	  }
  public static void btnClick(WebElement e) {
	  e.click();
	  }
public static void SBI(WebElement e,int index) {
	s = new Select(e);
	s.selectByIndex(index);
}
public static void Drag(WebElement e,WebElement e1) {
acc = new Actions(driver);
acc.dragAndDrop(e, e1);
}
public static void quitBrowser() {
driver.quit();
}
public static void closeBrowser() {
driver.close();
}
public static void clear(WebElement e) {
e.clear();
}
public static void getAttribute(WebElement e,String value) {
String attribute = e.getAttribute(value);
System.out.println(attribute);
}
public static void thread(int milliseconds) throws Throwable {
Thread.sleep(milliseconds);
}
public static void moveToElement(WebElement e) {
acc.moveToElement(e).perform();
}
public static void contextClick(WebElement e) {
acc.contextClick(e).perform();
}
public static void doubleClick(WebElement e) {
acc.doubleClick(e).perform();
}
public static void accept() {
al = driver.switchTo().alert();
al.accept();
}
public static void dismiss() {
al=driver.switchTo().alert();
al.dismiss();
}
public  static void fillAlert(String value) {
al = driver.switchTo().alert();
al.sendKeys(value);
}
public static void isDisplayed(WebElement e) {
boolean displayed = e.isDisplayed();
System.out.println(displayed);
}
public static void isEnabled(WebElement e) {
boolean enabled = e.isEnabled();
System.out.println(enabled);
}
public static void isSelected(WebElement e) {
boolean selected = e.isSelected();
System.out.println(selected);
}
public static void navigateBack() {
driver.navigate().back();
}
public static void navigateToUrl(String url) {
driver.navigate().to(url);
}
public static void navigateForward() {
driver.navigate().forward();
}
public static void navigateRFefresh() {
driver.navigate().refresh();
}
public static void maximizeWindow() {
driver.manage().window().maximize();
}
public static void SwitchToFrameByInt(int index) {
driver.switchTo().frame(index);
}
public static void SwitchToFrameByString(String id) {
driver.switchTo().frame(id);
}
public static void SwitchToFrameByWebElement(WebElement e) {
driver.switchTo().frame(e);
}
public static void DefaultFrame() {
driver.switchTo().defaultContent();
}
public static void pressAndReleaseEnterKey() throws Throwable {
r = new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
}
public static void pressAndReleaseDown() throws Throwable {
r = new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
}
public static void toSelectAll() throws Throwable {
r = new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_A);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_A);
}
public static void toCopy() throws Throwable {
r = new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_C);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_C);
}
public static void toCutSelectText() throws Throwable {
r = new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_X);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_X);
}
public static void toPasteSelectedText() throws Throwable {
r = new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);
}

public static void toTakeScreenshot(String path) throws Throwable {
	TakesScreenshot tk = (TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File d = new File(path);
	FileUtils.copyFile(src, d);
}
public static void selectByValue(WebElement e,String value) {

s = new Select(e);
s.selectByValue(value);
}
public static void toInsertUsingJavaScript(WebElement e,String input) {
	js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0[.setAttribute('value', input)",e); 
}
public static void clickUsingJavaScript(WebElement button) {
js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click()",button);
}
public static void scrollDown(WebElement e) {
js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true)",e);
}
public static void scrollUp(WebElement e) {
js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(false)",e);
}
	
	
}

