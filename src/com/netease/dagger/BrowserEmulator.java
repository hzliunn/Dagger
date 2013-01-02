<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 47c1094... Add License in source code files
/*
 * Copyright (c) 2012-2013 NetEase, Inc. and other contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
<<<<<<< HEAD
=======
>>>>>>> 8618a47... Init dagger project on github
=======
>>>>>>> 47c1094... Add License in source code files
package com.netease.dagger;

import java.awt.AWTException;
import java.awt.Robot;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import java.awt.event.KeyEvent;
>>>>>>> 8618a47... Init dagger project on github
=======
>>>>>>> 8b176dc... Clean up BrowserEmulator
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;
<<<<<<< HEAD
<<<<<<< HEAD
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
=======
import org.openqa.selenium.Alert;
=======
>>>>>>> 8b176dc... Clean up BrowserEmulator
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
<<<<<<< HEAD
import org.openqa.selenium.Point;
>>>>>>> 8618a47... Init dagger project on github
=======
>>>>>>> 8b176dc... Clean up BrowserEmulator
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
<<<<<<< HEAD
<<<<<<< HEAD
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
<<<<<<< HEAD
import org.openqa.selenium.safari.SafariDriver;
=======
>>>>>>> 71e4dde... Show image in TestNG emailable report
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.thoughtworks.selenium.Wait;

/**
 * BrowserEmulator is based on Selenium2 and adds some enhancements
=======
import org.openqa.selenium.internal.seleniumemulation.ElementFinder;
import org.openqa.selenium.internal.seleniumemulation.JavascriptLibrary;
=======
>>>>>>> 609d7eb... Clean up BrowserEmulator
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import com.thoughtworks.selenium.Wait;

/**
<<<<<<< HEAD
 * BrowserEmulator is based on Selenium2(Webdriver) and adds some enhancements
>>>>>>> 8618a47... Init dagger project on github
 * @author ChenKan
=======
 * BrowserEmulator is based on Selenium2 and adds some enhancements
<<<<<<< HEAD
>>>>>>> 609d7eb... Clean up BrowserEmulator
=======
 * @author ChenKan
>>>>>>> c527e4b... add self-test and build automated testing process
 */
public class BrowserEmulator {

	RemoteWebDriver browserCore;
	WebDriverBackedSelenium browser;
	ChromeDriverService chromeServer;
<<<<<<< HEAD
<<<<<<< HEAD
	JavascriptExecutor javaScriptExecutor;
	
	int stepInterval = Integer.parseInt(GlobalSettings.stepInterval);
	int timeout = Integer.parseInt(GlobalSettings.timeout);
=======
>>>>>>> 8618a47... Init dagger project on github
=======
	JavascriptExecutor javaScriptExecutor;
>>>>>>> 8b176dc... Clean up BrowserEmulator
	
	int stepInterval = Integer.parseInt(GlobalSettings.stepInterval);
	int timeout = Integer.parseInt(GlobalSettings.timeout);
	
	private static Logger logger = Logger.getLogger(BrowserEmulator.class.getName());

	public BrowserEmulator() {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7f30a6f... Modify codes according to CheckStyle's result
		setupBrowserCoreType(GlobalSettings.browserCoreType);
		browser = new WebDriverBackedSelenium(browserCore, "http://www.163.com/");
		javaScriptExecutor = (JavascriptExecutor) browserCore;
		logger.info("Started BrowserEmulator");
	}

	private void setupBrowserCoreType(int type) {
=======
		chooseBrowserCoreType(GlobalSettings.BrowserCoreType);
=======
		setupBrowserCoreType(GlobalSettings.BrowserCoreType);
>>>>>>> 609d7eb... Clean up BrowserEmulator
		browser = new WebDriverBackedSelenium(browserCore, "www.163.com");
		javaScriptExecutor = (JavascriptExecutor) browserCore;
		logger.info("Started BrowserEmulator");
	}

	@SuppressWarnings("deprecation")
<<<<<<< HEAD
	private void chooseBrowserCoreType(int type) {

>>>>>>> 8618a47... Init dagger project on github
=======
	private void setupBrowserCoreType(int type) {
>>>>>>> 609d7eb... Clean up BrowserEmulator
		if (type == 1) {
			browserCore = new FirefoxDriver();
			logger.info("Using Firefox");
			return;
		}
<<<<<<< HEAD
<<<<<<< HEAD
		if (type == 2) {
			chromeServer = new ChromeDriverService.Builder().usingDriverExecutable(new File(GlobalSettings.chromeDriverPath)).usingAnyFreePort().build();
=======

=======
>>>>>>> 609d7eb... Clean up BrowserEmulator
		if (type == 2) {
<<<<<<< HEAD
			chromeServer = new ChromeDriverService.Builder().usingChromeDriverExecutable(new File(GlobalSettings.ChromeDriverPath)).usingAnyFreePort().build();
>>>>>>> 8618a47... Init dagger project on github
=======
			chromeServer = new ChromeDriverService.Builder().usingDriverExecutable(new File(GlobalSettings.chromeDriverPath)).usingAnyFreePort().build();
>>>>>>> 7f30a6f... Modify codes according to CheckStyle's result
			try {
				chromeServer.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
			browserCore = new RemoteWebDriver(chromeServer.getUrl(), capabilities);
			logger.info("Using Chrome");
			return;
		}
<<<<<<< HEAD
<<<<<<< HEAD
		if (type == 3) {
<<<<<<< HEAD
<<<<<<< HEAD
			System.setProperty("webdriver.ie.driver", GlobalSettings.ieDriverPath);
=======

=======
>>>>>>> 609d7eb... Clean up BrowserEmulator
		if (type == 3) {
<<<<<<< HEAD
			String ieDriverExe = "res/IEDriverServer_Win32_2.25.3.exe";	//TODO Read from prop.properties
			System.setProperty("webdriver.ie.driver", ieDriverExe);
>>>>>>> 8618a47... Init dagger project on github
=======
			System.setProperty("webdriver.ie.driver", GlobalSettings.IEDriverPath);
>>>>>>> 0007053... Setup drivers's path
=======
			System.setProperty("webdriver.ie.driver", GlobalSettings.iEDriverPath);
>>>>>>> 7f30a6f... Modify codes according to CheckStyle's result
=======
			System.setProperty("webdriver.ie.driver", GlobalSettings.ieDriverPath);
>>>>>>> 353a623... Modify codes according to CheckStyle's result
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			browserCore = new InternetExplorerDriver(capabilities);
			logger.info("Using IE");
			return;
		}
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> c058029... src/com/netease/dagger/BrowserEmulator.java
		if (type == 4) {
			browserCore = new SafariDriver();
			logger.info("Using Safari");
			return;
		}
<<<<<<< HEAD

		Assert.fail("Incorrect browser type");
	}
	
	/**
	 * Get the WebDriver instance embedded in BrowserEmulator
	 * @return a WebDriver instance
	 */
	public RemoteWebDriver getBrowserCore() {
		return browserCore;
	}

	/**
	 * Get the WebDriverBackedSelenium instance embedded in BrowserEmulator
	 * @return a WebDriverBackedSelenium instance
	 */
	public WebDriverBackedSelenium getBrowser() {
		return browser;
	}
	
	/**
	 * Get the JavascriptExecutor instance embedded in BrowserEmulator
	 * @return a JavascriptExecutor instance
	 */
	public JavascriptExecutor getJavaScriptExecutor() {
		return javaScriptExecutor;
	}

	/**
	 * Open the URL
	 * @param url
	 *            the target URL
	 */
	public void open(String url) {
		pause(stepInterval);
=======
=======
>>>>>>> c058029... src/com/netease/dagger/BrowserEmulator.java

		Assert.fail("Incorrect browser type");
	}
	
	/**
	 * Get the WebDriver instance embedded in BrowserEmulator
	 * @return a WebDriver instance
	 */
	public RemoteWebDriver getBrowserCore() {
		return browserCore;
	}

	/**
	 * Get the WebDriverBackedSelenium instance embedded in BrowserEmulator
	 * @return a WebDriverBackedSelenium instance
	 */
	public WebDriverBackedSelenium getBrowser() {
		return browser;
	}
	
	/**
	 * Get the JavascriptExecutor instance embedded in BrowserEmulator
	 * @return a JavascriptExecutor instance
	 */
	public JavascriptExecutor getJavaScriptExecutor() {
		return javaScriptExecutor;
	}

	/**
	 * Open the URL
	 * @param url
	 *            the target URL
	 */
	public void open(String url) {
<<<<<<< HEAD
		pause();
>>>>>>> 8618a47... Init dagger project on github
=======
		pause(stepInterval);
>>>>>>> 85488be... Refactor BrowserEmulator
		try {
			browser.open(url);
		} catch (Exception e) {
			e.printStackTrace();
<<<<<<< HEAD
<<<<<<< HEAD
			handleFailure("Failed to open url " + url);
		}
		logger.info("Opened url " + url);
	}

	/**
	 * Quit the browser
	 */
<<<<<<< HEAD
	public void quit() {
		pause(stepInterval);
		browserCore.quit();
		if (GlobalSettings.browserCoreType == 2) {
			chromeServer.stop();
		}
		logger.info("Quitted BrowserEmulator");
	}

	/**
	 * Click the page element
	 * @param xpath
	 *            the element's xpath
	 */
	public void click(String xpath) {
		pause(stepInterval);
		expectElementExistOrNot(true, xpath, timeout);
=======
			handleFailIssue("Open url " + url + " failed :(");
=======
			handleFailure("Failed to open url " + url);
>>>>>>> 609d7eb... Clean up BrowserEmulator
		}
		logger.info("Opened url " + url);
	}

=======
>>>>>>> 0023b75... Add Javadoc
	public void quit() {
		pause(stepInterval);
		browserCore.quit();
		if (GlobalSettings.browserCoreType == 2) {
			chromeServer.stop();
		}
		logger.info("Quitted BrowserEmulator");
	}

	/**
	 * Click the page element
	 * @param xpath
	 *            the element's xpath
	 */
	public void click(String xpath) {
<<<<<<< HEAD
		pause();
		waitForElementPresent(xpath);
>>>>>>> 8618a47... Init dagger project on github
=======
		pause(stepInterval);
		expectElementExistOrNot(true, xpath, timeout);
>>>>>>> 85488be... Refactor BrowserEmulator
		try {
			clickTheClickable(xpath, System.currentTimeMillis(), 2500);
		} catch (Exception e) {
			e.printStackTrace();
<<<<<<< HEAD
<<<<<<< HEAD
			handleFailure("Failed to click " + xpath);
		}
		logger.info("Clicked " + xpath);
	}

	/**
	 * Click an element until it's clickable or timeout
	 * @param xpath
	 * @param startTime
	 * @param timeout in millisecond
=======
			handleFailIssue("Click " + xpath + " failed :(");
=======
			handleFailure("Failed to click " + xpath);
>>>>>>> 609d7eb... Clean up BrowserEmulator
		}
		logger.info("Clicked " + xpath);
	}

	/**
	 * Click an element until it's clickable or timeout
	 * @param xpath
	 * @param startTime
<<<<<<< HEAD
	 * @param timeout
>>>>>>> 8618a47... Init dagger project on github
=======
	 * @param timeout in millisecond
>>>>>>> 609d7eb... Clean up BrowserEmulator
	 * @throws Exception
	 */
	private void clickTheClickable(String xpath, long startTime, int timeout) throws Exception {
		try {
			browserCore.findElementByXPath(xpath).click();
		} catch (Exception e) {
			if (System.currentTimeMillis() - startTime > timeout) {
<<<<<<< HEAD
<<<<<<< HEAD
				logger.info("Element " + xpath + " is unclickable");
=======
				logger.error("Element " + xpath + " is unclickable :(");
>>>>>>> 8618a47... Init dagger project on github
=======
				logger.info("Element " + xpath + " is unclickable");
>>>>>>> 609d7eb... Clean up BrowserEmulator
				throw new Exception(e);
			} else {
				Thread.sleep(500);
				logger.info("Element " + xpath + " is unclickable, try again");
				clickTheClickable(xpath, startTime, timeout);
			}
		}
	}

	/**
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	 * Type text at the page element<br>
	 * Before typing, try to clear existed text
	 * @param xpath
	 *            the element's xpath
	 * @param text
	 *            the input text
	 */
	public void type(String xpath, String text) {
		pause(stepInterval);
		expectElementExistOrNot(true, xpath, timeout);
=======
	 * Input text
=======
	 * Type text<br>
=======
	 * Type text at the page element<br>
>>>>>>> 0023b75... Add Javadoc
	 * Before typing, try to clear existed text
>>>>>>> 609d7eb... Clean up BrowserEmulator
	 * @param xpath
	 *            the element's xpath
	 * @param text
	 *            the input text
	 */
	public void type(String xpath, String text) {
<<<<<<< HEAD
		pause();
		waitForElementPresent(xpath);
>>>>>>> 8618a47... Init dagger project on github
=======
		pause(stepInterval);
		expectElementExistOrNot(true, xpath, timeout);
>>>>>>> 85488be... Refactor BrowserEmulator

		WebElement we = browserCore.findElement(By.xpath(xpath));
		try {
			we.clear();
		} catch (Exception e) {
<<<<<<< HEAD
<<<<<<< HEAD
			logger.warn("Failed to clear text at " + xpath);
=======
			logger.warn("Failed to clear this textarea :(");
>>>>>>> 8618a47... Init dagger project on github
=======
			logger.warn("Failed to clear text at " + xpath);
>>>>>>> 609d7eb... Clean up BrowserEmulator
		}
		try {
			we.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
<<<<<<< HEAD
<<<<<<< HEAD
			handleFailure("Failed to type " + text + " at " + xpath);
		}

		logger.info("Type " + text + " at " + xpath);
	}

	/**
	 * Hover on the page element
<<<<<<< HEAD
	 * 
	 * @param xpath
	 *            the element's xpath
	 */
	public void mouseOver(String xpath) {
		pause(stepInterval);
		expectElementExistOrNot(true, xpath, timeout);
		// First make mouse out of browser
=======
			handleFailIssue("Input " + text + " at " + xpath + " failed :(");
=======
			handleFailure("Failed to type " + text + " at " + xpath);
>>>>>>> 609d7eb... Clean up BrowserEmulator
		}

		logger.info("Type " + text + " at " + xpath);
	}

	/**
<<<<<<< HEAD
	 * Mimic system-level keyboard event
	 * @param keyCode
	 */
	public void pressKeyboard(int keyCode) {
		pause();
>>>>>>> 8618a47... Init dagger project on github
		Robot rb = null;
		try {
			rb = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
<<<<<<< HEAD
		rb.mouseMove(0, 0);

		// Then hover
		WebElement we = browserCore.findElement(By.xpath(xpath));

		if (GlobalSettings.browserCoreType == 2) {
=======
		rb.keyPress(keyCode);	// press key
		rb.delay(100); 			// delay 100ms
		rb.keyRelease(keyCode);	// release key
		logger.info("press keyboard " + keyCode);
	}

	//TODO Mimic system-level mouse event
	
	/**
	 * Hover
=======
	 * Hover/Mouseover
>>>>>>> 609d7eb... Clean up BrowserEmulator
=======
>>>>>>> 0023b75... Add Javadoc
	 * @param xpath
	 *            the element's xpath
	 */
	public void mouseOver(String xpath) {
		pause(stepInterval);
		expectElementExistOrNot(true, xpath, timeout);

		if (GlobalSettings.browserCoreType == 1) {
			Assert.fail("Mouseover is not supported for Firefox now");
		}
		if (GlobalSettings.browserCoreType == 2) {
			// First make mouse out of browser
			Robot rb = null;
			try {
				rb = new Robot();
			} catch (AWTException e) {
				e.printStackTrace();
			}
			rb.mouseMove(0, 0);
			
			// Then hover
			WebElement we = browserCore.findElement(By.xpath(xpath));
>>>>>>> 8618a47... Init dagger project on github
			try {
				Actions builder = new Actions(browserCore);
				builder.moveToElement(we).build().perform();
			} catch (Exception e) {
				e.printStackTrace();
<<<<<<< HEAD
<<<<<<< HEAD
				handleFailure("Failed to mouseover " + xpath);
=======
				handleFailIssue("Mouseover " + xpath + " failed :(");
>>>>>>> 8618a47... Init dagger project on github
=======
				handleFailure("Failed to mouseover " + xpath);
>>>>>>> 609d7eb... Clean up BrowserEmulator
			}

			logger.info("Mouseover " + xpath);
			return;
<<<<<<< HEAD
		}

		// Firefox and IE require multiple cycles, more than twice, to cause a
		// hovering effect
		if (GlobalSettings.browserCoreType == 1
				|| GlobalSettings.browserCoreType == 3) {
			for (int i = 0; i < 5; i++) {
				Actions builder = new Actions(browserCore);
				builder.moveToElement(we).build().perform();
			}
			logger.info("Mouseover " + xpath);
			return;
		}

		// Selenium doesn't support the Safari browser
		if (GlobalSettings.browserCoreType == 4) {
			Assert.fail("Mouseover is not supported for Safari now");
		}
		Assert.fail("Incorrect browser type");
	}

	/**
	 * Switch window/tab
	 * @param windowTitle
	 *            the window/tab's title
	 */
	public void selectWindow(String windowTitle) {
		pause(stepInterval);
		browser.selectWindow(windowTitle);
		logger.info("Switched to window " + windowTitle);
	}

	/**
	 * Enter the iframe
	 * @param xpath
	 *            the iframe's xpath
	 */
	public void enterFrame(String xpath) {
		pause(stepInterval);
		browserCore.switchTo().frame(browserCore.findElementByXPath(xpath));
		logger.info("Entered iframe " + xpath);
	}

	/**
	 * Leave the iframe
	 */
	public void leaveFrame() {
		pause(stepInterval);
		browserCore.switchTo().defaultContent();
		logger.info("Left the iframe");
	}
	
	/**
	 * Refresh the browser
	 */
	public void refresh() {
		pause(stepInterval);
		browserCore.navigate().refresh();
		logger.info("Refreshed");
	}
	
	/**
	 * Mimic system-level keyboard event
	 * @param keyCode
	 *            such as KeyEvent.VK_TAB, KeyEvent.VK_F11
	 */
	public void pressKeyboard(int keyCode) {
		pause(stepInterval);
		Robot rb = null;
		try {
			rb = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		rb.keyPress(keyCode);	// press key
		rb.delay(100); 			// delay 100ms
		rb.keyRelease(keyCode);	// release key
		logger.info("Pressed key with code " + keyCode);
	}
	
	// TODO unavailable for space 
	/**
     * Mimic system-level keyboard event with String
     * @param text
     *           
     */
    public void inputKeyboard(String text) {
        String cmd = System.getProperty("user.dir")
                + "\\res\\SeleniumCommand.exe" + " sendKeys " + text;

        Process p = null;
        try {
            p = Runtime.getRuntime().exec(cmd);
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            p.destroy();
        }
        logger.info("Pressed key with string " + text);
    }

	//TODO Mimic system-level mouse event

	/**
	 * Expect some text exist or not on the page<br>
	 * Expect text exist, but not found after timeout => Assert fail<br>
	 * Expect text not exist, but found after timeout => Assert fail
	 * @param expectExist
	 *            true or false
	 * @param text
	 *            the expected text
	 * @param timeout
	 *            timeout in millisecond
	 */
	public void expectTextExistOrNot(boolean expectExist, final String text, int timeout) {
=======
		} 
		if (GlobalSettings.browserCoreType == 3) {
			Assert.fail("Mouseover is not supported for IE now");
		}
		
		Assert.fail("Incorrect browser type");
	}

	/**
	 * Switch window/tab
	 * @param windowTitle
	 *            the window/tab's title
	 */
	public void selectWindow(String windowTitle) {
		pause(stepInterval);
		browser.selectWindow(windowTitle);
		logger.info("Switched to window " + windowTitle);
	}

	/**
	 * Enter the iframe
	 * @param xpath
	 *            the iframe's xpath
	 */
	public void enterFrame(String xpath) {
		pause(stepInterval);
		browserCore.switchTo().frame(browserCore.findElementByXPath(xpath));
		logger.info("Entered iframe " + xpath);
	}

	/**
	 * Leave the iframe
	 */
	public void leaveFrame() {
		pause(stepInterval);
		browserCore.switchTo().defaultContent();
		logger.info("Left the iframe");
	}
	
	/**
	 * Refresh the browser
	 */
	public void refresh() {
		pause(stepInterval);
		browserCore.navigate().refresh();
		logger.info("Refreshed");
	}
	
	/**
	 * Mimic system-level keyboard event
	 * @param keyCode
	 *            such as KeyEvent.VK_TAB, KeyEvent.VK_F11
	 */
	public void pressKeyboard(int keyCode) {
		pause(stepInterval);
		Robot rb = null;
		try {
			rb = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		rb.keyPress(keyCode);	// press key
		rb.delay(100); 			// delay 100ms
		rb.keyRelease(keyCode);	// release key
		logger.info("Pressed key with code " + keyCode);
	}

	//TODO Mimic system-level mouse event

	/**
	 * Expect some text exist or not on the page<br>
	 * Expect text exist, but not found after timeout => Assert fail<br>
	 * Expect text not exist, but found after timeout => Assert fail
	 * @param expectExist
	 *            true or false
	 * @param text
	 *            the expected text
	 * @param timeout
	 *            timeout in millisecond
	 */
	public void expectTextExistOrNot(boolean expectExist, final String text, int timeout) {
<<<<<<< HEAD

		// 期望文本存在
>>>>>>> 8618a47... Init dagger project on github
=======
>>>>>>> 8b176dc... Clean up BrowserEmulator
		if (expectExist) {
			try {
				new Wait() {
					public boolean until() {
<<<<<<< HEAD
<<<<<<< HEAD
						return isTextPresent(text, -1);
					}
				}.wait("Failed to find text " + text, timeout);
			} catch (Exception e) {
				e.printStackTrace();
				handleFailure("Failed to find text " + text);
			}
			logger.info("Found desired text " + text);
		} else {
			if (isTextPresent(text, timeout)) {
				handleFailure("Found undesired text " + text);
			} else {
				logger.info("Not found undesired text " + text);
			}
		}
	}

	/**
	 * Expect an element exist or not on the page<br>
	 * Expect element exist, but not found after timeout => Assert fail<br>
	 * Expect element not exist, but found after timeout => Assert fail<br>
	 * Here <b>exist</b> means <b>visible</b>
	 * @param expectExist
	 *            true or false
	 * @param xpath
	 *            the expected element's xpath
	 * @param timeout
	 *            timeout in millisecond
	 */
	public void expectElementExistOrNot(boolean expectExist, final String xpath, int timeout) {
		if (expectExist) {
			try {
				new Wait() {
					public boolean until() {
<<<<<<< HEAD
<<<<<<< HEAD
						return isElementPresent(xpath, -1);
					}
				}.wait("Failed to find element " + xpath, timeout);
			} catch (Exception e) {
				e.printStackTrace();
				handleFailure("Failed to find element " + xpath);
			}
			logger.info("Found desired element " + xpath);
		} else {
			if (isElementPresent(xpath, timeout)) {
				handleFailure("Found undesired element " + xpath);
			} else {
				logger.info("Not found undesired element " + xpath);
			}
=======
						return isTextPresent(browserCore, text);
=======
						return browser.isTextPresent(text);
>>>>>>> 609d7eb... Clean up BrowserEmulator
=======
						return isTextPresent(text);
>>>>>>> 3d02cab... Refactor BrowserEmulator
=======
						return isTextPresent(text, -1);
>>>>>>> 8b63147... add Pause() for isTextPresent() & isElementPresent()
					}
				}.wait("Failed to find text " + text, timeout);
			} catch (Exception e) {
				e.printStackTrace();
				handleFailure("Failed to find text " + text);
			}
			logger.info("Found desired text " + text);
		} else {
			if (isTextPresent(text, timeout)) {
				handleFailure("Found undesired text " + text);
			} else {
				logger.info("Not found undesired text " + text);
			}
		}
	}

	/**
	 * Expect an element exist or not on the page<br>
	 * Expect element exist, but not found after timeout => Assert fail<br>
	 * Expect element not exist, but found after timeout => Assert fail<br>
	 * Here <b>exist</b> means <b>visible</b>
	 * @param expectExist
	 *            true or false
	 * @param xpath
	 *            the expected element's xpath
	 * @param timeout
	 *            timeout in millisecond
	 */
	public void expectElementExistOrNot(boolean expectExist, final String xpath, int timeout) {
		if (expectExist) {
			try {
				new Wait() {
					public boolean until() {
						return isElementPresent(xpath, -1);
					}
				}.wait("Failed to find element " + xpath, timeout);
			} catch (Exception e) {
				e.printStackTrace();
				handleFailure("Failed to find element " + xpath);
			}
			logger.info("Found desired element " + xpath);
		} else {
			if (isElementPresent(xpath, timeout)) {
				handleFailure("Found undesired element " + xpath);
			} else {
				logger.info("Not found undesired element " + xpath);
			}
<<<<<<< HEAD

>>>>>>> 8618a47... Init dagger project on github
		}
	}

	/**
<<<<<<< HEAD
<<<<<<< HEAD
	 * Is the text present on the page
	 * @param text
	 *            the expected text
	 * @param time           
<<<<<<< HEAD
<<<<<<< HEAD
	 *            wait a moment (in millisecond) before search text on page;<br>
	 *            minus time means search text at once
=======
	 *            wait a moment (in millisecond) before search text on page
>>>>>>> 8b63147... add Pause() for isTextPresent() & isElementPresent()
=======
	 *            wait a moment (in millisecond) before search text on page;<br>
	 *            minus time means search text at once
>>>>>>> 968e729... More JavaDoc for isTextPresent() & isElementPresent
	 * @return
	 */
	public boolean isTextPresent(String text, int time) {
		pause(time);
<<<<<<< HEAD
		boolean isPresent = browser.isTextPresent(text);
		if (isPresent) {
			logger.info("Found text " + text);
			return true;
		} else {
			logger.info("Not found text " + text);
=======
	 * 判断是否存在指定文本（不管文本是否可见）
	 * 
	 * @param text
	 * @return
	 */
=======
		}
	}

>>>>>>> 8b176dc... Clean up BrowserEmulator
=======
	 * Is the text present on the page
	 * @param text
	 *            the expected text
	 * @return
	 */
>>>>>>> 0023b75... Add Javadoc
	public boolean isTextPresent(String text) {
=======
>>>>>>> 8b63147... add Pause() for isTextPresent() & isElementPresent()
		boolean isPresent = browser.isTextPresent(text);
		if (isPresent) {
			logger.info("Found text " + text);
			return true;
		} else {
			logger.info("Not found text " + text);
			return false;
		}
	}

	/**
	 * Is the element present on the page<br>
	 * Here <b>present</b> means <b>visible</b>
	 * @param xpath
	 *            the expected element's xpath
	 * @param time           
	 *            wait a moment (in millisecond) before search element on page;<br>
	 *            minus time means search element at once
	 * @return
	 */
	public boolean isElementPresent(String xpath, int time) {
		pause(time);
		boolean isPresent = browser.isElementPresent(xpath) && browserCore.findElementByXPath(xpath).isDisplayed();
		if (isPresent) {
			logger.info("Found element " + xpath);
			return true;
		} else {
<<<<<<< HEAD
<<<<<<< HEAD
			logger.info("页面上不存在元素 " + xPath);
>>>>>>> 8618a47... Init dagger project on github
			return false;
		}
	}

	/**
<<<<<<< HEAD
	 * Is the element present on the page<br>
	 * Here <b>present</b> means <b>visible</b>
	 * @param xpath
	 *            the expected element's xpath
	 * @param time           
	 *            wait a moment (in millisecond) before search element on page;<br>
	 *            minus time means search element at once
	 * @return
	 */
	public boolean isElementPresent(String xpath, int time) {
		pause(time);
		boolean isPresent = browser.isElementPresent(xpath) && browserCore.findElementByXPath(xpath).isDisplayed();
		if (isPresent) {
			logger.info("Found element " + xpath);
			return true;
		} else {
			logger.info("Not found element" + xpath);
			return false;
		}
	}
	
	/**
	 * Pause
	 * @param time in millisecond
	 */
	public void pause(int time) {
		if (time <= 0) {
			return;
		}
		try {
			Thread.sleep(time);
			logger.info("Pause " + time + " ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void handleFailure(String notice) {
		String png = LogTools.screenShot(this);
		String log = notice + " >> capture screenshot at " + png;
		logger.error(log);
		if (GlobalSettings.baseStorageUrl.lastIndexOf("/") == GlobalSettings.baseStorageUrl.length()) {
			GlobalSettings.baseStorageUrl = GlobalSettings.baseStorageUrl.substring(0, GlobalSettings.baseStorageUrl.length() - 1);
		}
		Reporter.log(log + "<br/><img src=\"" + GlobalSettings.baseStorageUrl + "/" + png + "\" />");
		Assert.fail(log);
	}
	
	/**
	 * Return text from specified web element.
	 * @param xpath
	 * @return
	 */
	public String getText(String xpath) {
		WebElement element = this.getBrowserCore().findElement(By.xpath(xpath)); 
		return element.getText();
	}
	
	/**
	 * Select an option by visible text from &lt;select&gt; web element.
	 * @param xpath
	 * @param option
	 */
	public void select(String xpath, String option) {
		WebElement element = this.browserCore.findElement(By.xpath(xpath));
		Select select = new Select(element);
		select.selectByVisibleText(option);
	}
=======
	 * 在iframe中输入文本
	 * 
	 * @param nFrame
	 *            iframe在页面中的次序
	 * @param text
	 *            输入的文本
	 */
	public void typeInFrame(int nFrame, String text) {
		typeInFrameConsiderFocus(nFrame, text, true);
	}

	private void typeInFrameConsiderFocus(int nFrame, String text, Boolean needFocus) {

		pause();
		// TODO 须等待页面加载iframe节点

		// 进入指定iframe
		if (needFocus) {
			browser.windowFocus(); // TODO it only works for chrome
=======
			logger.info("Can't find element" + xpath);
>>>>>>> 8b176dc... Clean up BrowserEmulator
=======
			logger.info("Not found element" + xpath);
<<<<<<< HEAD
>>>>>>> 609d7eb... Clean up BrowserEmulator
=======
			return false;
>>>>>>> 3d02cab... Refactor BrowserEmulator
		}
	}
	
	/**
	 * Pause
	 * @param time in millisecond
	 */
	public void pause(int time) {
		if (time <= 0) {
			return;
		}
		try {
			Thread.sleep(time);
			logger.info("Pause " + time + " ms");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void handleFailure(String notice) {
		String png = LogTools.screenShot(this);
		String log = notice + " >> capture screenshot at " + png;
		logger.error(log);
		if (GlobalSettings.baseStorageUrl.lastIndexOf("/") == GlobalSettings.baseStorageUrl.length()) {
			GlobalSettings.baseStorageUrl = GlobalSettings.baseStorageUrl.substring(0, GlobalSettings.baseStorageUrl.length() - 1);
		}
		Reporter.log(log + "<br/><img src=\"" + GlobalSettings.baseStorageUrl + "/" + png + "\" />");
		Assert.fail(log);
	}
<<<<<<< HEAD
>>>>>>> 8618a47... Init dagger project on github
=======
	
	/**
	 * Return text from specified web element.
	 * @param xpath
	 * @return
	 */
	public String getText(String xpath) {
		WebElement element = this.getBrowserCore().findElement(By.xpath(xpath)); 
		return element.getText();
	}
	
	/**
	 * Select an option by visible text from &lt;select&gt; web element.
	 * @param xpath
	 * @param option
	 */
	public void select(String xpath, String option) {
		WebElement element = this.browserCore.findElement(By.xpath(xpath));
		Select select = new Select(element);
		select.selectByVisibleText(option);
	}
>>>>>>> 71e4dde... Show image in TestNG emailable report
}
