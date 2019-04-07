package qa.tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.client.RestClass;

public class RestApiTest extends TestBase {
 TestBase testbase;
 CloseableHttpResponse httpresponse;
 String Apiurl;
 String url;
 String serviceurl;
 
 @BeforeTest
 public void setup() throws ClientProtocolException, IOException{
	 
	 testbase=new TestBase();
	  serviceurl=prop.getProperty("URL");
	  Apiurl=prop.getProperty("serviceURL");
	  url=serviceurl+Apiurl;
   }
 @Test
 public void restapitest() throws ClientProtocolException, IOException{
	 RestClass restclass=new RestClass();
	 httpresponse=restclass.get(url);
	 
	 
	 int statuscode=httpresponse.getStatusLine().getStatusCode();  //get reposne of status code after url hit
		System.out.println("Get Response Stataus Code--->"+statuscode);
		Assert.assertEquals(200, statuscode,"wrong statuc code");
		//B. JSON String
		 String responseString=EntityUtils.toString(httpresponse.getEntity(), "UTF-8");
		 JSONObject responseJSON=new JSONObject(responseString);
		System.out.println("Http reponse JSON is ---->"+responseJSON);
		
		//C.All Headers
		Header[] headerarray=httpresponse.getAllHeaders();
		HashMap<String,String> allheaders=new HashMap<String,String>();
		for(Header header:headerarray){
			allheaders.put(header.getName(),header.getValue());
		}
		System.out.println("All headers ----->"+allheaders);
 }
}
