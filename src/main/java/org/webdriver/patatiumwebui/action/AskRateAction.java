package org.webdriver.patatiumwebui.action;

import org.webdriver.patatiumwebui.pageObject.LoginPage;
import org.webdriver.patatiumwebui.utils.ElementAction;
import org.webdriver.patatiumwebui.utils.TestBaseCase;

/**
 * Created by zhengshuheng on 2016/8/29 0029.
 */
public class AskRateAction extends TestBaseCase{
    public AskRateAction(String Url) throws Exception
    {
        //此driver变量继承自TestBase变量
        LoginPage loginPage=new LoginPage();
        System.out.println(driver.getCurrentUrl());
        ElementAction action=new ElementAction();
        loginPage.open(Url+"/trade/EOS3L_USDT");
        action.click(loginPage.同意提醒());


    }
}
