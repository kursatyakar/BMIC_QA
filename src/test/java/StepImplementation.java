import com.google.common.collect.ClassToInstanceMap;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class StepImplementation {
WebDriverWait   wait;
    private CharSequence key;
    private ClassToInstanceMap<Object> ElementHelper;

    public StepImplementation (){
        wait = new WebDriverWait(Driver.driver, Duration.ofSeconds(100));
    }
    @Step("Open browser")
    public void sendText() throws InterruptedException {
        Driver.driver.get("http://localhost:3000");
    }

    @Step("weight <key> change")
    public void UpdateWeight(String key) {
        //WebElement weightInput = Driver.driver.findElement(By.id("weight"));
        WebElement weightInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='weight']")));
        weightInput.sendKeys(key);
        Assert.assertEquals(weightInput.getAttribute("value"), key);

    }

    @Step("height <key> change")
    public void UpdateHeight(String key) {
        //WebElement weightInput = Driver.driver.findElement(By.id("height"));
        WebElement heightInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='height']")));
        heightInput.sendKeys(key);
        Assert.assertEquals(heightInput.getAttribute("value"), key);
    }

    @Step("click button")
    public void CallChange() {
        WebElement button = Driver.driver.findElement(By.tagName("button"));
        button.click();
    }

    @Step("click undo button")
    public void UndoButton() {
        WebElement button = Driver.driver.findElement(By.xpath("//button[.='Undo']"));
        button.click();
    }

    @Step("click delete button")
    public void DeleteButton() {
        WebElement button = Driver.driver.findElement(By.xpath("//div[@class='data-container row']/div[1]//button[@class='delete-btn']"));
        button.click();
    }

    @Step({"Calculate BMI with weight <weight> and height <height>",
            "Ağırlık <weight> ve boy <height> ile BMI hesapla"})
    public void calculateAndCompareBMI(String key, String key2) {


            WebElement bmiResultElement = Driver.driver.findElement(By.xpath("//span[@class='card-title']"));
            String siteBmiValue = bmiResultElement.getText().trim(); // Trim kullanarak başında ve sonunda boşlukları temizle

            siteBmiValue = siteBmiValue.replace(".", ",");
            double weightValue = Double.parseDouble(key);
            double heightValue = Double.parseDouble(key2) / 100; // Boyu metre cinsine çevir
            double calculatedBmi = weightValue / (heightValue * heightValue);
            String calculatedBmiString = String.format("BMI: %.2f", calculatedBmi); // Virgülden sonra iki basamak

            Assert.assertEquals("BMI ERROR!!", calculatedBmiString, siteBmiValue);
        }

    @Step("Değer okuma")
    public void DegerOKu() {
        WebElement button = Driver.driver.findElement(By.xpath("//div[@class='data-container row']/div[1]//button[@class='delete-btn']"));
        button.click();
    }

}



