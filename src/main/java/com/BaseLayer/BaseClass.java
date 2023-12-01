package com.BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	final String path = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\ConfigurationLayer\\config.properties";

	private static ThreadLocal<WebDriver> threadlocal = new ThreadLocal<WebDriver>();

	protected static Properties prop;

	public static WebDriver getDriver() {
		return threadlocal.get();
	}

	public BaseClass() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void initialization(String browsername) {
		WebDriver driver = null;

		if (browsername.equalsIgnoreCase("chrome")) {
			// System.setProperty("webdriver.chrome.driver", "path of driver");
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			// System.setProperty("webdriver.edge.driver", "path of driver");
			driver = new EdgeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			// System.setProperty("webdriver.firefox.driver", "path of driver");
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("incognito")) {
			// System.setProperty("webdriver.chrome.driver", "path of driver");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			driver = new ChromeDriver(opt);
		} else if (browsername.equalsIgnoreCase("headless")) {
			// System.setProperty("webdriver.chrome.driver", "path of driver");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--headless");
			driver = new ChromeDriver(opt);
		} else {
			System.err.println("Please mention Proper Browser name");
		}

		threadlocal.set(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("siturl"));

	}

}
