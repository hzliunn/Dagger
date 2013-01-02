package com.netease.test;

<<<<<<< HEAD
import org.testng.SkipException;
=======
>>>>>>> c527e4b... add self-test and build automated testing process
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.netease.dagger.BrowserEmulator;
<<<<<<< HEAD
import com.netease.dagger.GlobalSettings;
=======
>>>>>>> c527e4b... add self-test and build automated testing process

/**
 * mouseOver的一系列操作
 * @author WeiYating
 */
public class MouseOverOperations {

	BrowserEmulator be;

	@BeforeClass
	public void doBeforeClass() {
		be = new BrowserEmulator();
<<<<<<< HEAD
		CommonFunction.openCaptain(be);
		
		// When the browser is Safari, skipped this test case
		if (GlobalSettings.browserCoreType == 4) {
			throw new SkipException("Selenium不支持Safari");
		}
=======
		CommonFunction.openCaptain(be);
>>>>>>> c527e4b... add self-test and build automated testing process
	}

	@Test
	public void mouseOverOperation() {
		CommonFunction.mouseOverOperations(be);
	}

	@Test(dependsOnMethods = "mouseOverOperation")
	public void mouseOverCSS() {
		CommonFunction.mouseOverCSS(be);
	}

	@Test(dependsOnMethods = "mouseOverCSS")
	public void mouseOverJS() {
		CommonFunction.mouseOverJS(be);
	}

	@AfterClass(alwaysRun = true)
	public void doAfterClass() {
		be.quit();
	}
}
