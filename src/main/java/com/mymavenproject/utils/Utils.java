package com.mymavenproject.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mymavenproject.testbase.BaseTest;



public class Utils extends BaseTest {

	public static void failedTestScreenShot(String testMethodName) {
  
  String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new
  Date());
  
  File screenShotFfile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
  
  try { FileUtils.copyFile(screenShotFfile, new
  File("./FailedTestCasesScreenShot\\" + "_" + testMethodName + "  _" + timeStamp + ".jpg")); } catch (IOException e) {
  
  System.out.
  println("................................The IO Exception is ...... " + e);
  e.printStackTrace(); }
  
  }

}

