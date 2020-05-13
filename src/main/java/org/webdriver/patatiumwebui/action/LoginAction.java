package org.webdriver.patatiumwebui.action;

import org.webdriver.patatiumwebui.pageObject.LoginPage;
import org.webdriver.patatiumwebui.utils.ElementAction;
import org.webdriver.patatiumwebui.utils.TestBaseCase;

import java.io.IOException;

/**
 * Created by zhengshuheng on 2016/8/29 0029.
 */
public class LoginAction extends TestBaseCase{
    public LoginAction(String Url,String UserName,String PassWord) throws Exception
    {
        //此driver变量继承自TestBase变量
        LoginPage loginPage=new LoginPage();
        loginPage.open(Url+"/login");
        System.out.println(driver.getCurrentUrl());
        ElementAction action=new ElementAction();
        action.click(loginPage.点击高级());
        action.click(loginPage.点击继续前往());
        action.clear(loginPage.密码输入框());
        action.type(loginPage.用户名输入框(),UserName);
        action.clear(loginPage.密码输入框());
        action.type(loginPage.密码输入框(),PassWord);
        action.click(loginPage.登录按钮());
        action.click(loginPage.点击确认());
        action.click(loginPage.二次验证登陆());
//        loginPage.open(Url+"/trade/EOS3L_USDT");
//        action.click(loginPage.同意提醒());


    }
}
