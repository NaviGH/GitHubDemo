import org.openqa.selenium.chrome.ChromeDriver;

public class mergebb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\BrowserDriver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("new line 1");
		System.out.println("new line 2");
		System.out.println("new line 1");
		System.out.println("new line 2");
		System.out.println("new line 1");
		System.out.println("new line 2");
		System.out.println("new line 1");
		System.out.println("new line 2");
		
	}

}
