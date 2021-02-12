/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.model.OperationModel;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;

/**
 *
 * @author WILL
 */
public class CalculateSimpleNGTest {
    
    private WebDriver driver;
    public CalculateSimpleNGTest() {
    }
    
    //CalculateSimple calc=new CalculateSimple();
    @BeforeMethod
    public void setUpMethod() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://localhost:8080/calculadora");
        segundosPausa(2);
    }

    //CALCULADORA SIMPLE
    
    
    @Test
    public void test0Sumar() {
        driver.findElement(By.xpath("/html/body/form/input[1]")).clear();
        driver.findElement(By.xpath("/html/body/form/input[2]")).clear();
        segundosPausa(1);
        driver.findElement(By.id("a")).click();
        segundosPausa(1);
        driver.findElement(By.name("a")).sendKeys("4");
        driver.findElement(By.name("b")).sendKeys("3");
        driver.findElement(By.name("add")).click();
        segundosPausa(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 7"));
    }
    
    @Test
    public void test1Restar() {
        driver.findElement(By.xpath("/html/body/form/input[1]")).clear();
        driver.findElement(By.xpath("/html/body/form/input[2]")).clear();
        segundosPausa(1);
        driver.findElement(By.id("a")).click();
        segundosPausa(1);
        driver.findElement(By.name("a")).sendKeys("4");
        driver.findElement(By.name("b")).sendKeys("3");
        driver.findElement(By.name("subtract")).click();
        segundosPausa(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 1"));
    }
    
    @Test
    public void test2Multiplicar() {
        driver.findElement(By.xpath("/html/body/form/input[1]")).clear();
        driver.findElement(By.xpath("/html/body/form/input[2]")).clear();
        segundosPausa(1);
        driver.findElement(By.id("a")).click();
        segundosPausa(1);
        driver.findElement(By.name("a")).sendKeys("4");
        driver.findElement(By.name("b")).sendKeys("3");
        driver.findElement(By.name("multiply")).click();
        segundosPausa(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 12"));
    }
    
    @Test
    public void test3Dividir() {
        driver.findElement(By.xpath("/html/body/form/input[1]")).clear();
        driver.findElement(By.xpath("/html/body/form/input[2]")).clear();
        segundosPausa(1);
        driver.findElement(By.id("a")).click();
        segundosPausa(1);
        driver.findElement(By.name("a")).sendKeys("10");
        driver.findElement(By.name("b")).sendKeys("2");
        driver.findElement(By.name("divide")).click();
        segundosPausa(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 5"));
    }
    
    @Test
    public void test4LimpiarCalculadoraSimple() {
        driver.findElement(By.xpath("/html/body/form/input[1]")).clear();
        driver.findElement(By.xpath("/html/body/form/input[2]")).clear();
        segundosPausa(1);
        driver.findElement(By.id("a")).click();
        segundosPausa(1);
        driver.findElement(By.name("a")).sendKeys("10");
        driver.findElement(By.name("b")).sendKeys("2");
        driver.findElement(By.name("clearSimple")).click();
        segundosPausa(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 0"));
    }
    
    //CALCULADORA AVANZADA
    
    @Test
    public void test5Fibonaci() {
        driver.findElement(By.xpath("/html/body/form/input[3]")).clear();
        segundosPausa(1);
        driver.findElement(By.id("c")).click();
        segundosPausa(1);
        driver.findElement(By.name("c")).sendKeys("5");
        driver.findElement(By.name("fibonacci")).click();
        segundosPausa(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 5"));
    }
    
    @Test
    public void test6Factorial() {
        driver.findElement(By.xpath("/html/body/form/input[3]")).clear();
        segundosPausa(1);
        driver.findElement(By.id("c")).click();
        segundosPausa(1);
        driver.findElement(By.name("c")).sendKeys("5");
        driver.findElement(By.name("factorial")).click();
        segundosPausa(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 120"));
    }
    
    @Test
    public void test7RaizCuadrada() {
        driver.findElement(By.xpath("/html/body/form/input[3]")).clear();
        segundosPausa(1);
        driver.findElement(By.id("c")).click();
        segundosPausa(1);
        driver.findElement(By.name("c")).sendKeys("9");
        driver.findElement(By.name("sqrt")).click();
        segundosPausa(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 3.0"));
    }
    
    @Test
    public void test8Potencia() {
        driver.findElement(By.xpath("/html/body/form/input[3]")).clear();
        segundosPausa(1);
        driver.findElement(By.id("c")).click();
        segundosPausa(1);
        driver.findElement(By.name("c")).sendKeys("9");
        driver.findElement(By.name("power")).click();
        segundosPausa(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 81"));
    }
    
    @Test
    public void test9LimpiarCalculadoraAvanzada() {
        driver.findElement(By.xpath("/html/body/form/input[3]")).clear();
        segundosPausa(1);
        driver.findElement(By.id("c")).click();
        segundosPausa(1);
        driver.findElement(By.name("c")).sendKeys("9");
        driver.findElement(By.name("clearAdvanced")).click();
        segundosPausa(2);
        assertTrue(driver.findElement(By.xpath("/html/body/form/h1[2]/p")).getText().contains("Resultado: 0"));
    }
    
    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
        driver.quit();
    }
    public static void segundosPausa(long sleeptime){
        try {
            Thread.sleep(sleeptime * 1000);
        } catch (InterruptedException ex) {
        }
    }
    
}
