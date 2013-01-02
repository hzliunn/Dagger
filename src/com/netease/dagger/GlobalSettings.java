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
package com.netease.dagger;

import java.io.File;
<<<<<<< HEAD
=======
package com.netease.dagger;

>>>>>>> 8618a47... Init dagger project on github
=======
>>>>>>> 71e4dde... Show image in TestNG emailable report
import java.io.FileInputStream;
import java.util.Properties;

<<<<<<< HEAD
<<<<<<< HEAD
/**
<<<<<<< HEAD
 * Global Settings
=======
 * 全局变量设置
>>>>>>> 8618a47... Init dagger project on github
 * @author ChenKan
 */
public class GlobalSettings {

<<<<<<< HEAD
	public static Properties prop = getProperties();

	public static int browserCoreType = Integer.parseInt(prop.getProperty("BrowserCoreType", "2"));

<<<<<<< HEAD
<<<<<<< HEAD
	public static String chromeDriverPath = prop.getProperty("ChromeDriverPath", "res/chromedriver_for_win.exe");
//	public static String chromeDriverPath = "/Users/chenDoInG/Downloads/chromedriver_for_mac_64";
	public static String ieDriverPath = prop.getProperty("IEDriverPath", "res/iedriver_32.exe");

	public static String stepInterval = prop.getProperty("StepInterval", "500");

	public static String timeout = prop.getProperty("Timeout", "30000");
=======
	public static String ChromeDriverPath = System.getProperties().getProperty("os.name").toLowerCase().contains("win") ? 
			prop.getProperty("ChromeDriverPath", "res/chromedriver_for_win.exe") : prop.getProperty("ChromeDriverPath", "res/chromedriver_for_mac");
>>>>>>> 847e7ea... Add Mac/Linux support for chromedriver.
=======
	public static String ChromeDriverPath = prop.getProperty("ChromeDriverPath", "res/chromedriver_for_win.exe");
>>>>>>> a2b7c7b... Revert "Add Mac/Linux support for chromedriver."
	
	public static String baseStorageUrl = prop.getProperty("baseStorageUrl", (new File("screenshot")).getParent());

	public static String getProperty(String property) {
		return prop.getProperty(property);
	}
	
	public static Properties getProperties() {
		Properties prop = new Properties();
		try {
			FileInputStream file = new FileInputStream("prop.properties");
			prop.load(file);
			file.close();
=======
	public static Properties prop = getProp();
=======
=======
/**
 * Global Settings
 * @author ChenKan
 */
>>>>>>> 7f30a6f... Modify codes according to CheckStyle's result
public class GlobalSettings {

<<<<<<< HEAD
	public static Properties prop = getProperties();
>>>>>>> 697b473... Clean up GlobalSettings

	public static int browserCoreType = Integer.parseInt(prop.getProperty("BrowserCoreType", "2"));
=======
	public static String Timeout = prop.getProperty("Timeout", "30000");
	
	public static String baseStorageUrl = prop.getProperty("baseStorageUrl", (new File("screenshot")).getParent());
>>>>>>> 71e4dde... Show image in TestNG emailable report

<<<<<<< HEAD
	public static String ChromeDriverPath = prop.getProperty("ChromeDriverPath", "res/chromedriver.exe");
=======
	public static String chromeDriverPath = prop.getProperty("ChromeDriverPath", "res/chromedriver_for_win.exe");
<<<<<<< HEAD
>>>>>>> 7f30a6f... Modify codes according to CheckStyle's result
	
=======
//	public static String chromeDriverPath = "/Users/chenDoInG/Downloads/chromedriver_for_mac_64";
>>>>>>> a1200b0... upload webdriver for MacOS 64bit
	public static String ieDriverPath = prop.getProperty("IEDriverPath", "res/iedriver_32.exe");

	public static String stepInterval = prop.getProperty("StepInterval", "500");

	public static String timeout = prop.getProperty("Timeout", "30000");

	public static String getProperty(String property) {
		return prop.getProperty(property);
	}
	
	public static Properties getProperties() {
		Properties prop = new Properties();
		try {
<<<<<<< HEAD
			fis = new FileInputStream("prop.properties");
			prop.load(fis);
			fis.close();
>>>>>>> 8618a47... Init dagger project on github
=======
			FileInputStream file = new FileInputStream("prop.properties");
			prop.load(file);
			file.close();
>>>>>>> 697b473... Clean up GlobalSettings
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}
<<<<<<< HEAD
<<<<<<< HEAD
=======

	public static void main(String[] args) {
		System.out.println(BrowserCoreType);
		System.out.println(StepInterval);
		System.out.println(Timeout);
		System.out.println(MaxPng);
	}
>>>>>>> 8618a47... Init dagger project on github
=======
>>>>>>> 697b473... Clean up GlobalSettings
}