package com.netease.demo;
import java.io.*;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

<<<<<<< HEAD
<<<<<<< HEAD
import com.netease.dagger.BrowserEmulator;
import com.netease.datadriver.ExcelDataProvider;
/**
 * 
 * @author chenDoInG
 *
 */
=======
import com.chendoing.datadriver.ExcelDataProvider;
import com.netease.dagger.BrowserEmulator;

>>>>>>> 75b2612... 增加Excel数据驱动方法ExcelDataProvider.java
=======
import com.netease.dagger.BrowserEmulator;
import com.netease.datadriver.ExcelDataProvider;
/**
 * 
 * @author Chenkan
 *
 */
>>>>>>> c527e4b... add self-test and build automated testing process
public class GoogleSearchWithDataDriver {
    
    BrowserEmulator browserEmulator;

    @BeforeClass
<<<<<<< HEAD
<<<<<<< HEAD
    public void setUp() throws Exception {
=======
    public void setUp() throws Exception{
>>>>>>> 75b2612... 增加Excel数据驱动方法ExcelDataProvider.java
=======
    public void setUp() throws Exception {
>>>>>>> c527e4b... add self-test and build automated testing process
        browserEmulator = new BrowserEmulator();
    }
    @Test(dataProvider = "dp" )
    public void search(Map<String,String> data) {
        browserEmulator.open(data.get("url").trim());
        browserEmulator.type(data.get("input1").trim(), data.get("name1").trim());
        browserEmulator.click(data.get("button").trim());
        browserEmulator.isTextPresent(data.get("expect").trim(), 3000);
    }
   
    @AfterClass(alwaysRun = true)
<<<<<<< HEAD
<<<<<<< HEAD
    public void tearDown() {
        browserEmulator.quit();
    }
    @DataProvider(name = "dp")
    public Iterator<Object[]> dataFortestMethod(Method method) throws IOException {
=======
    public void tearDown(){
        browserEmulator.quit();
    }
    @DataProvider(name = "dp")
    public Iterator<Object[]> dataFortestMethod(Method method) throws IOException{
>>>>>>> 75b2612... 增加Excel数据驱动方法ExcelDataProvider.java
=======
    public void tearDown() {
        browserEmulator.quit();
    }
    @DataProvider(name = "dp")
    public Iterator<Object[]> dataFortestMethod(Method method) throws IOException {
>>>>>>> c527e4b... add self-test and build automated testing process
        return new ExcelDataProvider(this.getClass().getName(),method.getName());
    }
   
}