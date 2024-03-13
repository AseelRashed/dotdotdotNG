package SDA.tests.Hws;

import SDA.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class H1502 extends TestBase {
    /*
        Test Case2: Negative Username Test
        Open page https://practicetestautomation.com/practice-test-login/
        Type username incorrectUser into Username field.
        Type password Password123 into Password field.
        Click Submit button.
        Verify error message is displayed.
        Verify error message text is Your username is invalid!

     */

@Test
        public void test() {


    driver.get("https://practicetestautomation.com/practice-test-login/");

    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("studentttt");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Passwwwword123");
    driver.findElement(By.xpath("//*[@id='submit']")).click();



    SoftAssert sa = new SoftAssert();

    sa.assertTrue(driver.getPageSource().contains("//*[@class='show']"));
    sa.assertTrue(driver.getPageSource().contains("Your username is invalid!"));

    sa.assertAll();

}
}
