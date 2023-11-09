package ru.moonshine1l;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {
    //проверяем успешную регистрацию и переход на следующую страницу (см. Testcases.md, id 6)

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://userinyerface.com/game.html");

        //стираем данные из строки пароля и вводим свой валидный пароль
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[2]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[2]/input")).sendKeys("negryRkd1`");

        //то же самое с электронной почтой и доменом
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[1]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[1]/input")).sendKeys("example");

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[3]/input")).clear();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[3]/input")).sendKeys("o");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[4]/div/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[4]/div/div[2]/div[9]")).click();
        //Соглашаемся с правиласми и условиями
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div[1]/div/div[3]/form/div[2]/span/label/span")).click();

        //Нажимаем на кнопку next, чтобы перейти на следующую страницу
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[4]/div/div[1]/div/div[3]/form/div[3]/div[1]/a")).click();

        //закрываем
        //driver.quit();

        //после регистрации проверим кнопку выбора всех позиций (см. Testcases.md, id 9)
        //для начала нажимаем на unselect all, чтобы все чекбоксы были пустыми
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/div/div[21]/div/span[1]/label/span/span")).click();
        //теперь проверяем работу select all
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/div/div[18]/div/span[1]/label/span/span")).click();

    }
}
