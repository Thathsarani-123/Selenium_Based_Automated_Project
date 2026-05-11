package com.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        WebDriver driverf =new FirefoxDriver();
        WebDriver driveredge =new EdgeDriver();

//        driver.get("https://rahulshettyacademy.com/");
//        System.out.println(driver.getTitle());
//
//        driverf.get("https://rahulshettyacademy.com/");
//        System.out.println(driverf.getTitle());

        driverf.get("https://rahulshettyacademy.com/");
        System.out.println(driverf.getTitle());
    }
}