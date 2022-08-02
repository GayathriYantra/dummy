import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		Select select = new Select(driver.findElement(By.xpath("//select[@name='industry']")));
		List<WebElement> options = select.getOptions();
		for(WebElement webElement:options)
		{
			String text =webElement.getText();
			System.out.println(text);
		}
	}

}
