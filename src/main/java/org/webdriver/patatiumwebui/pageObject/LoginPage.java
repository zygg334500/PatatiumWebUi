package org.webdriver.patatiumwebui.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.webdriver.patatiumwebui.utils.BaseAction;
import org.webdriver.patatiumwebui.utils.Locator;
import org.webdriver.patatiumwebui.pageObjectConfig.PageObjectAutoCode;//登录页面_对象库类
public class LoginPage extends BaseAction {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/java/org/webdriver/patatiumwebui/pageObjectConfig/UILibrary.xml";
 public   LoginPage() {
//工程内读取对象库文件
	setXmlObjectPath(path);
getLocatorMap();
}
/***
* 高级
* @return
* @throws IOException
*/
public Locator 点击高级() throws IOException
 {
   Locator locator=getLocator("点击高级");
   return locator;
 }

/***
* 点击继续前往
* @return
* @throws IOException
*/
public Locator 点击继续前往() throws IOException
 {
   Locator locator=getLocator("点击继续前往");
   return locator;
 }

/***
* 用户名
* @return
* @throws IOException
*/
public Locator 用户名输入框() throws IOException
 {
   Locator locator=getLocator("用户名输入框");
   return locator;
 }

/***
* 密码
* @return
* @throws IOException
*/
public Locator 密码输入框() throws IOException
 {
   Locator locator=getLocator("密码输入框");
   return locator;
 }

/***
* 登录
* @return
* @throws IOException
*/
public Locator 登录按钮() throws IOException
 {
   Locator locator=getLocator("登录按钮");
   return locator;
 }

/***
* 点击确认
* @return
* @throws IOException
*/
public Locator 点击确认() throws IOException
 {
   Locator locator=getLocator("点击确认");
   return locator;
 }

/***
* 二次验证登陆
* @return
* @throws IOException
*/
public Locator 二次验证登陆() throws IOException
 {
   Locator locator=getLocator("二次验证登陆");
   return locator;
 }
}