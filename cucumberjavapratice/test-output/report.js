$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/seleniumproject/cucumberjavapratice/src/main/java/featurefiles/Deals.feature");
formatter.feature({
  "line": 1,
  "name": "Deals page Feature",
  "description": "",
  "id": "deals-page-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Deals page Scenario",
  "description": "",
  "id": "deals-page-feature;deals-page-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is already in deals login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters emailid and password",
  "rows": [
    {
      "cells": [
        "talk2sree@gmail.com",
        "citcat1$"
      ],
      "line": 5
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user clicks deals login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks new deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enter deal",
  "rows": [
    {
      "cells": [
        "hello",
        "yyy"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Deals.user_is_already_in_deals_login_page()"
});
formatter.result({
  "duration": 73049264894,
  "error_message": "org.openqa.selenium.WebDriverException: connection refused\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-L0TDH83\u0027, ip: \u002710.137.238.244\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: driver.version: FirefoxDriver\nremote stacktrace: \r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:147)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:125)\r\n\tat Stepdefinitionfiles.Deals.user_is_already_in_deals_login_page(Deals.java:20)\r\n\tat ✽.Given user is already in deals login page(/seleniumproject/cucumberjavapratice/src/main/java/featurefiles/Deals.feature:3)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Deals.user_enters_emailid_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Deals.user_clicks_deals_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Deals.user_clicks_new_deals_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Deals.user_enter_deal(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});