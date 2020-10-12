package org.webdriver.patatiumwebui.action;

import org.webdriver.patatiumwebui.pageObject.LoginPage;
import org.webdriver.patatiumwebui.utils.ElementAction;
import org.webdriver.patatiumwebui.utils.TestBaseCase;

import java.io.IOException;

/**
 * Created by zhengshuheng on 2016/8/29 0029.
 */
public class LoginAction extends TestBaseCase {
    public LoginAction(String Url, String UserName, String PassWord) throws Exception {
        //此driver变量继承自TestBase变量
        LoginPage loginPage = new LoginPage();
        loginPage.open(Url);
        System.out.println(driver.getCurrentUrl());
        ElementAction action = new ElementAction();

        action.click(loginPage.登录系统());
        action.type(loginPage.用户名输入框(), UserName);
        action.type(loginPage.密码输入框(), PassWord);
        action.click(loginPage.登录按钮());
        action.click(loginPage.在线学习系统());
        action.click(loginPage.进入学习中心());
        action.click(loginPage.点击开始学习1());


        //loginPage.open("chrome://settings/content/flash?search=flash");

        //action.alertConfirm();
        loginPage.open("chrome://settings/content/flash?search=flash");
        action.click(loginPage.点击开启flash());
        loginPage.back();
        action.click(loginPage.点击立即学习());
    }
}