import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Project01_D {

	public static void main(String[] args) {

		String apiUrl = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=";
				
		String client_id = "mzvtqg5q27";
		String client_secret = "pYB6Kw7p7vunoQoqyNcAifqOsUaosrPka9r0DRjo";
		
		BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
				
		try {
			System.out.println("주소를 입력하세요 : ");
			String address = io.readLine();
			String addr = URLEncoder.encode(address, "UTF-8");
			String reqUrl = apiUrl+addr;
			
			URL url = new URL(reqUrl);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", client_id);
			con.setRequestProperty("X-NCP-APIGW-API-KEY", client_secret);
			
			BufferedReader br;
			int responseCode = con.getResponseCode();
			if(responseCode==200) {
				br= new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
			}else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line;
			StringBuffer response = new StringBuffer();
			while((line=br.readLine()) != null) {
				response.append(line);
			}
			br.close();
			
			JSONTokener tokener = new JSONTokener(response.toString());
			JSONObject object = new JSONObject(tokener);
			System.out.println(object.toString(2));
			
			JSONArray arr = object.getJSONArray("addresses");
			for(int i = 0; i< arr.length();i++) {
				JSONObject temp =  (JSONObject)arr.get(i);
				System.out.print("address : " + temp.get("roadAddress"));
				System.out.print("jibunAddress : " + temp.get("jibunAddress"));
				System.out.print("경도 : " + temp.get("x"));
				System.out.println("위도 : " + temp.get("y"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
