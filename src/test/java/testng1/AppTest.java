package testng1;

import io.qameta.allure.Link;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class AppTest {

	@DataProvider(name="DP1")
	public Object[][] myDp() {
		return new Object[][] {
			{new Integer(1), new Integer(3)},
			{new Integer(2), new Integer(4)},
		};	
	}

	@Test(dataProvider="DP1")
	@Link(name = "ya", url ="https://yandex.ru")
	public void firstTest(Integer a, Integer b) {
	     System.out.println("First Test: (a, b) = " + a + " " + b);
	}
}
