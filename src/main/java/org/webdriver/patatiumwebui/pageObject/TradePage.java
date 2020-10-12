package org.webdriver.patatiumwebui.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.webdriver.patatiumwebui.utils.BaseAction;
import org.webdriver.patatiumwebui.utils.Locator;
import org.webdriver.patatiumwebui.pageObjectConfig.PageObjectAutoCode;//交易页面_对象库类
public class TradePage extends BaseAction {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/java/org/webdriver/patatiumwebui/pageObjectConfig/UILibrary.xml";
 public   TradePage() {
//工程内读取对象库文件
	setXmlObjectPath(path);
getLocatorMap();
}
/***
* 点击同意提醒
* @return
* @throws IOException
*/
public Locator 同意提醒() throws IOException
 {
   Locator locator=getLocator("同意提醒");
   return locator;
 }

/***
* 买入
* @return
* @throws IOException
*/
public Locator 输入买入价() throws IOException
 {
   Locator locator=getLocator("输入买入价");
   return locator;
 }

/***
* 买入数量
* @return
* @throws IOException
*/
public Locator 输入买入数量() throws IOException
 {
   Locator locator=getLocator("输入买入数量");
   return locator;
 }

/***
* 买入提交
* @return
* @throws IOException
*/
public Locator 点击买入() throws IOException
 {
   Locator locator=getLocator("点击买入");
   return locator;
 }

/***
* 确定下单
* @return
* @throws IOException
*/
public Locator 点击确定下单() throws IOException
 {
   Locator locator=getLocator("点击确定下单");
   return locator;
 }

/***
* 取消下单
* @return
* @throws IOException
*/
public Locator 点击取消下单() throws IOException
 {
   Locator locator=getLocator("点击取消下单");
   return locator;
 }

/***
* 输入资金密码
* @return
* @throws IOException
*/
public Locator 输入金额() throws IOException
 {
   Locator locator=getLocator("输入金额");
   return locator;
 }

/***
* 确认金额提交
* @return
* @throws IOException
*/
public Locator 点击确定金额提交() throws IOException
 {
   Locator locator=getLocator("点击确定金额提交");
   return locator;
 }

/***
* 确认金额提交
* @return
* @throws IOException
*/
public Locator 点击取消金额提交() throws IOException
 {
   Locator locator=getLocator("点击取消金额提交");
   return locator;
 }

/***
* 卖出
* @return
* @throws IOException
*/
public Locator 输入卖出价() throws IOException
 {
   Locator locator=getLocator("输入卖出价");
   return locator;
 }

/***
* 卖出数量
* @return
* @throws IOException
*/
public Locator 输入卖出数量() throws IOException
 {
   Locator locator=getLocator("输入卖出数量");
   return locator;
 }

/***
* 卖出提交
* @return
* @throws IOException
*/
public Locator 点击卖出() throws IOException
 {
   Locator locator=getLocator("点击卖出");
   return locator;
 }


}