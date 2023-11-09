package ru.moonshine1l;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class FirstPageTest {

    public static void main(String[] args) {
        //Проверяем переход с начальной страницы на страницу регистрации (см. Testcases.md, id 1)
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://userinyerface.com/");


        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[4]/p/a")).click();

        driver.quit();
    }

}
