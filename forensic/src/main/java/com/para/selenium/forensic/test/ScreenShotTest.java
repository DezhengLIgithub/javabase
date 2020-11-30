package com.para.selenium.forensic.test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotTest {


    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.baidu.com");//获取当前系统时间
            Date date = new Date();
            //定义系统时间输出格式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
            String strTime = sdf.format(date);
            File img =null;
            if(driver instanceof ChromeDriver) {
                //将driver向下转型chromeDriver
                ChromeDriver chromeDriver = (ChromeDriver)driver;
                //调用chromeDriver.getScreenshotAs()方法得到截图文件
                img= chromeDriver.getScreenshotAs(OutputType.FILE);
            }else if(driver instanceof FirefoxDriver){
                FirefoxDriver firefoxDriver = (FirefoxDriver)driver;
                img = firefoxDriver.getScreenshotAs(OutputType.FILE);
            }else if(driver instanceof InternetExplorerDriver) {
                InternetExplorerDriver ieDriver = (InternetExplorerDriver)driver;
                img = ieDriver.getScreenshotAs(OutputType.FILE);
            }
            //使用commons.io包提供的FileUtils工具类,直接copy一份保存到指定路径下
            //copyFile方法传入的都是File类型
            FileUtils.copyFile( img, new File("src/resources/"+strTime+"_img.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
