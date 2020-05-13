import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.dom4j.DocumentException;
import org.testng.annotations.DataProvider;
import org.webdriver.patatiumwebui.action.AskRateAction;
import org.webdriver.patatiumwebui.action.CommonAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.webdriver.patatiumwebui.action.LoginAction;
import org.webdriver.patatiumwebui.pageObject.HomePage;
import org.webdriver.patatiumwebui.pageObject.LoginPage;
import org.webdriver.patatiumwebui.utils.*;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.Click;
public class Ask_Rate extends TestBaseCase  {
    ElementAction action=new ElementAction();

    @Test(description="登录成功测试")
    @Parameters({"BaseUrl"})//读取testng.xml参数
    public void ask(String BaseUrl) throws Exception{
        AskRateAction askRateAction = new AskRateAction(BaseUrl);

    }


}
