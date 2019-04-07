package qa.tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import qa.base.TestBase;
import qa.client.RestClass;
import qa.data.Users;

public class RestAPIpostTest extends TestBase {
	TestBase testbase;
	 CloseableHttpResponse httpresponse;
	 String Apiurl;
	 String url;
	 String serviceurl;
	 RestClass restclass;
	 @BeforeTest
	 public void setup() throws ClientProtocolException, IOException{
		 
		 testbase=new TestBase();
		  serviceurl=prop.getProperty("URL");
		  Apiurl=prop.getProperty("serviceURL");
		  url=serviceurl+Apiurl;
	   }
 @Test
 public void setAPITest() throws JsonGenerationException, JsonMappingException, IOException{
	 RestClass restclass=new RestClass();
	 HashMap<String,String> headerMap=new HashMap<String,String>();
	 headerMap.put("Content-Type", "application/json");
	 
	 //Jackson Api
	 ObjectMapper mapper=new ObjectMapper();
	 Users users=new Users("morpheous","leader");
	 mapper.writeValue(new File("/seleniumproject/RestfulWebservices/src/main/java/qa/data/users.json"), users);
	 String usersjsonstring=mapper.writeValueAsString(users);
	 System.out.println(usersjsonstring);
	 httpresponse= restclass.post(url,usersjsonstring, headerMap);
	 
	 //1. status code
	    int statuscode=httpresponse.getStatusLine().getStatusCode();  //get reposne of status code after url hit
		System.out.println("Get Response Stataus Code--->"+statuscode);
		//Assert.assertEquals(statuscode, 201);
	//2.Java String
		String stringreponse=EntityUtils.toString(httpresponse.getEntity(), "UTF-8");
		JSONObject jsonobject=new JSONObject(stringreponse);
		System.out.println("Response from API--->"+jsonobject);
	//3. JSON to java oBJECT
		Users usersob=mapper.readValue(stringreponse, Users.class);
		System.out.println(usersob);
		Assert.assertTrue(users.getName().equals(usersob.getName()));
		Assert.assertTrue(users.getJob().equals(usersob.getJob()));
		//System.out.println();
 }
}
