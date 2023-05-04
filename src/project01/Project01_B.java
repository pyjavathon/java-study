package project01;

import org.json.JSONArray;
import org.json.JSONObject;

public class Project01_B {

	
	public static void main(String[]args) {
		
		JSONArray students = new JSONArray();
		
		JSONObject student = new JSONObject();
		student.put("name", "홍길동");
		student.put("phone", "010-0230-3949");
		student.put("address", "서울");
		
		students.put(student);
		
		student = new JSONObject();
		student.put("name", "나길동");
		student.put("phone", "010-2232-2222");
		student.put("address", "서울");
		
		students.put(student);
		
		JSONObject object = new JSONObject();
		
		object.put("students", students);
		
		System.out.println(object.toString(2));
	}
}
