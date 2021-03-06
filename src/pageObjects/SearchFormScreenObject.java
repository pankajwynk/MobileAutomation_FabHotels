package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SearchFormScreenObject {

  @AndroidFindBy(xpath = "//*[@class='android.view.View' and @index=3]]")
  @iOSFindBy(accessibility = "")
  public static MobileElement endOfScroll;


  @AndroidFindBy(id = "com.fabhotels.guests:id/tv_property_name")
  @iOSFindBy(accessibility = "")
  public static MobileElement propertyName;

  @AndroidFindBy(id = "com.fabhotels.guests:id/tv_whereTo")
  @iOSFindBy(accessibility = "")
  public static MobileElement homeSearchToolbar;

  @AndroidFindBy(id = "com.fabhotels.guests:id/tvSearchItemCity")
  @iOSFindBy(accessibility = "")
  public static MobileElement searchCity;

  public SearchFormScreenObject(AndroidDriver<MobileElement> drivers) {
    PageFactory.initElements(new AppiumFieldDecorator(drivers), this);
  }
}
