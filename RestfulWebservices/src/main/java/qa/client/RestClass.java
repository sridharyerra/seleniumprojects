package qa.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClass {

	
	//Get Method
	
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException{
		CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpGet httpget=new HttpGet(url); //http get request
		CloseableHttpResponse httpresponse=httpclient.execute(httpget); //hit the get url and store in response object variable
		
		return httpresponse;
	}
	
	//get Method with header
	public CloseableHttpResponse get(String url,HashMap<String,String> headerMap) throws ClientProtocolException, IOException{
		CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpGet httpget=new HttpGet(url); //http get request
		
		for(Map.Entry<String,String> entry : headerMap.entrySet()){
			httpget.addHeader(entry.getKey(),entry.getValue());
			}
		CloseableHttpResponse httpresponse=httpclient.execute(httpget); //hit the get url and store in response object variable
		
		return httpresponse;
	}
	
	//Post Method with header
		public CloseableHttpResponse post(String url,String stringentity,HashMap<String,String> headerMap) throws ClientProtocolException, IOException{
			CloseableHttpClient httpclient=HttpClients.createDefault();
			HttpPost httppost=new HttpPost(url); //http get request
			httppost.setEntity(new StringEntity(stringentity)); //for payload
			for(Map.Entry<String,String> entry : headerMap.entrySet()){
				httppost.addHeader(entry.getKey(),entry.getValue());
				}
			CloseableHttpResponse httpresponse=httpclient.execute(httppost); //hit the get url and store in response object variable
			
			return httpresponse;
		}
}
