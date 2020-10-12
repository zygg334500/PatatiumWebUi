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
* 登录系统
* @return
* @throws IOException
*/
public Locator 登录系统() throws IOException
 {
   Locator locator=getLocator("登录系统");
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
* 在线学习系统
* @return
* @throws IOException
*/
public Locator 在线学习系统() throws IOException
 {
   Locator locator=getLocator("在线学习系统");
   return locator;
 }

/***
* 进入学习中心
* @return
* @throws IOException
*/
public Locator 进入学习中心() throws IOException
 {
   Locator locator=getLocator("进入学习中心");
   return locator;
 }

/***
* 开始学习
* @return
* @throws IOException
*/
public Locator 点击开始学习1() throws IOException
 {
   Locator locator=getLocator("点击开始学习1");
   return locator;
 }

/***
* 开始学习
* @return
* @throws IOException
*/
public Locator 点击开始学习2() throws IOException
 {
   Locator locator=getLocator("点击开始学习2");
   return locator;
 }

/***
* 开始学习
* @return
* @throws IOException
*/
public Locator 点击开始学习3() throws IOException
 {
   Locator locator=getLocator("点击开始学习3");
   return locator;
 }

/***
* 开始学习
* @return
* @throws IOException
*/
public Locator 点击开始学习4() throws IOException
 {
   Locator locator=getLocator("点击开始学习4");
   return locator;
 }

/***
* 开始学习
* @return
* @throws IOException
*/
public Locator 点击开始学习5() throws IOException
 {
   Locator locator=getLocator("点击开始学习5");
   return locator;
 }

/***
* 开始学习
* @return
* @throws IOException
*/
public Locator 点击开始学习6() throws IOException
 {
   Locator locator=getLocator("点击开始学习6");
   return locator;
 }

/***
* 开始学习
* @return
* @throws IOException
*/
public Locator 点击开始学习7() throws IOException
 {
   Locator locator=getLocator("点击开始学习7");
   return locator;
 }

/***
* 开始学习
* @return
* @throws IOException
*/
public Locator 点击开始学习8() throws IOException
 {
   Locator locator=getLocator("点击开始学习8");
   return locator;
 }

/***
* 开始学习
* @return
* @throws IOException
*/
public Locator 点击开始学习9() throws IOException
 {
   Locator locator=getLocator("点击开始学习9");
   return locator;
 }

/***
* 立即学习
* @return
* @throws IOException
*/
public Locator 点击立即学习() throws IOException
 {
   Locator locator=getLocator("点击立即学习");
   return locator;
 }

/***
* 开启flash
* @return
* @throws IOException
*/
public Locator 点击开启flash() throws IOException
 {
   Locator locator=getLocator("点击开启flash");
   return locator;
 }
}