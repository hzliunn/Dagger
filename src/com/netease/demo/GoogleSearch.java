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
>>>>>>> 7173c5a... Add demo
=======
>>>>>>> 47c1094... Add License in source code files
package com.netease.demo;

import com.netease.dagger.BrowserEmulator;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 7f30a6f... Modify codes according to CheckStyle's result
/**
 * The demo to show Dagger's basic usage
 * @author ChenKan
 */
<<<<<<< HEAD
=======
>>>>>>> 7173c5a... Add demo
=======
>>>>>>> 7f30a6f... Modify codes according to CheckStyle's result
public class GoogleSearch {

	public static void main(String[] args) {

		String googleUrl = "http://www.google.com";
		String searchBox = "//input[@name='q']";
		String searchBtn = "//input[@name='btnK']";
		BrowserEmulator be = new BrowserEmulator();

		be.open(googleUrl);
		be.type(searchBox, "github");
		be.click(searchBtn);
		be.expectTextExistOrNot(true, "https://github.com/", 5000);
		be.quit();
	}
}
