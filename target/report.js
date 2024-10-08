$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/adactinHotel.feature");
formatter.feature({
  "name": "To Validate the Login Functionality of adactin page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@HotelAdactin"
    }
  ]
});
formatter.scenario({
  "name": "To Validate username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HotelAdactin"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "To launch Chorome Browser \u0026 hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelDefin.to_launch_Chorome_Browser_hit_the_url()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d129.0.6668.70)\nBuild info: version: \u00274.24.0\u0027, revision: \u0027748ffc9bc3\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [2f0666aaa3e6097cb616063a5a8d87b3, get {url\u003dhttps://adactinhotelapp.com/}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 129.0.6668.70, chrome: {chromedriverVersion: 129.0.6668.70 (df87d5cf12b1..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:50041}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:50041/devtoo..., se:cdpVersion: 129.0.6668.70, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 2f0666aaa3e6097cb616063a5a8d87b3\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)\r\n\tat org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:313)\r\n\tat org.helper.Helper.browserLaunch(Helper.java:34)\r\n\tat org.stepDefinition.HotelDefin.to_launch_Chorome_Browser_hit_the_url(HotelDefin.java:31)\r\n\tat ✽.To launch Chorome Browser \u0026 hit the url(src/test/resources/Feature/adactinHotel.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To Enter the username in username field",
  "keyword": "When "
});
formatter.match({
  "location": "HotelDefin.to_Enter_the_username_in_username_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To enter the Password in pswd field",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_enter_the_Password_in_pswd_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To Click The Login button in this page",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_Click_The_Login_button_in_this_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To validate Search hotel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HotelAdactin"
    },
    {
      "name": "@SearchHotel"
    }
  ]
});
formatter.step({
  "name": "To Select the location",
  "keyword": "When "
});
formatter.match({
  "location": "HotelDefin.to_Select_the_location()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d129.0.6668.70)\nBuild info: version: \u00274.24.0\u0027, revision: \u0027748ffc9bc3\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [2f0666aaa3e6097cb616063a5a8d87b3, findElement {value\u003dlocation, using\u003did}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 129.0.6668.70, chrome: {chromedriverVersion: 129.0.6668.70 (df87d5cf12b1..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:50041}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:50041/devtoo..., se:cdpVersion: 129.0.6668.70, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 2f0666aaa3e6097cb616063a5a8d87b3\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)\r\n\tat org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:66)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:68)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.click(Unknown Source)\r\n\tat org.helper.Helper.btnClick(Helper.java:61)\r\n\tat org.stepDefinition.HotelDefin.to_Select_the_location(HotelDefin.java:56)\r\n\tat ✽.To Select the location(src/test/resources/Feature/adactinHotel.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To select the hotels",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_select_the_hotels()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To select the room type",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_select_the_room_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To select the number of rooms",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_select_the_number_of_rooms()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To select checkin Date",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_select_checkin_Date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To select the checkout date",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_select_the_checkout_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To select the adult per room",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_select_the_adult_per_room()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click the Search button",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_click_the_Search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To select the valid hotel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HotelAdactin"
    },
    {
      "name": "@SelectHotel"
    }
  ]
});
formatter.step({
  "name": "To select the radio button for select",
  "keyword": "When "
});
formatter.match({
  "location": "HotelDefin.to_select_the_radio_button_for_select()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d129.0.6668.70)\nBuild info: version: \u00274.24.0\u0027, revision: \u0027748ffc9bc3\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [2f0666aaa3e6097cb616063a5a8d87b3, findElement {value\u003d//input[@type\u003d\u0027radio\u0027], using\u003dxpath}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 129.0.6668.70, chrome: {chromedriverVersion: 129.0.6668.70 (df87d5cf12b1..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:50041}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:50041/devtoo..., se:cdpVersion: 129.0.6668.70, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 2f0666aaa3e6097cb616063a5a8d87b3\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)\r\n\tat org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:68)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.click(Unknown Source)\r\n\tat org.helper.Helper.btnClick(Helper.java:61)\r\n\tat org.stepDefinition.HotelDefin.to_select_the_radio_button_for_select(HotelDefin.java:121)\r\n\tat ✽.To select the radio button for select(src/test/resources/Feature/adactinHotel.feature:37)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To click the Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_click_the_Continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To book a valid hotel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HotelAdactin"
    },
    {
      "name": "@BookHotel"
    }
  ]
});
formatter.step({
  "name": "To enter the first name",
  "keyword": "When "
});
formatter.match({
  "location": "HotelDefin.to_enter_the_first_name()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d129.0.6668.70)\nBuild info: version: \u00274.24.0\u0027, revision: \u0027748ffc9bc3\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [2f0666aaa3e6097cb616063a5a8d87b3, findElement {value\u003dfirst_name, using\u003did}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 129.0.6668.70, chrome: {chromedriverVersion: 129.0.6668.70 (df87d5cf12b1..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:50041}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:50041/devtoo..., se:cdpVersion: 129.0.6668.70, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 2f0666aaa3e6097cb616063a5a8d87b3\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)\r\n\tat org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:66)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:68)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.sendKeys(Unknown Source)\r\n\tat org.helper.Helper.fillText(Helper.java:57)\r\n\tat org.stepDefinition.HotelDefin.to_enter_the_first_name(HotelDefin.java:133)\r\n\tat ✽.To enter the first name(src/test/resources/Feature/adactinHotel.feature:44)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To enter the last name",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_enter_the_last_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To enter the biling address",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_enter_the_iling_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To enter credit card number",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_enter_credit_card_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To select Credit card type",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_select_Credit_card_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To select expiry date month and year",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_select_expiry_date_month_and_year()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To enter ccv number",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_enter_ccv_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click the book now button",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_click_the_book_now_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "To confirm the booking",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HotelAdactin"
    },
    {
      "name": "@Bookingconfirm"
    }
  ]
});
formatter.step({
  "name": "To click the my iteranary button",
  "keyword": "When "
});
formatter.match({
  "location": "HotelDefin.to_click_the_my_iteranary_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d129.0.6668.70)\nBuild info: version: \u00274.24.0\u0027, revision: \u0027748ffc9bc3\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [2f0666aaa3e6097cb616063a5a8d87b3, findElement {value\u003d//input[@value\u003d\u0027My Itinerary\u0027], using\u003dxpath}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 129.0.6668.70, chrome: {chromedriverVersion: 129.0.6668.70 (df87d5cf12b1..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:50041}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:50041/devtoo..., se:cdpVersion: 129.0.6668.70, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 2f0666aaa3e6097cb616063a5a8d87b3\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)\r\n\tat org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:68)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.click(Unknown Source)\r\n\tat org.helper.Helper.btnClick(Helper.java:61)\r\n\tat org.stepDefinition.HotelDefin.to_click_the_my_iteranary_button(HotelDefin.java:200)\r\n\tat ✽.To click the my iteranary button(src/test/resources/Feature/adactinHotel.feature:64)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "To select one ordered hotel cancel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HotelAdactin"
    },
    {
      "name": "@BookedIternary"
    }
  ]
});
formatter.step({
  "name": "To select the one cancelled oreder",
  "keyword": "When "
});
formatter.match({
  "location": "HotelDefin.to_select_the_one_cancelled_oreder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the cancel",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_click_the_cancel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click Logout button",
  "keyword": "And "
});
formatter.match({
  "location": "HotelDefin.to_click_Logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close The Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelDefin.to_close_The_Browser()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: disconnected: not connected to DevTools\n  (failed to check if window was closed: disconnected: not connected to DevTools)\n  (Session info: chrome\u003d129.0.6668.70)\nBuild info: version: \u00274.24.0\u0027, revision: \u0027748ffc9bc3\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.3\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [2f0666aaa3e6097cb616063a5a8d87b3, close {}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 129.0.6668.70, chrome: {chromedriverVersion: 129.0.6668.70 (df87d5cf12b1..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:50041}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:50041/devtoo..., se:cdpVersion: 129.0.6668.70, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 2f0666aaa3e6097cb616063a5a8d87b3\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)\r\n\tat org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:618)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:622)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:418)\r\n\tat org.helper.Helper.browserClose(Helper.java:43)\r\n\tat org.stepDefinition.HotelDefin.to_close_The_Browser(HotelDefin.java:220)\r\n\tat ✽.To close The Browser(src/test/resources/Feature/adactinHotel.feature:75)\r\n",
  "status": "failed"
});
});