package project01;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class exercise1 {

	public static void main(String[] args) {

		BookDTO dto = new BookDTO("자바",21000,"에이콘",670);
		Gson g = new Gson();
		String json = g.toJson(dto);
		System.out.println(json);
		
		
		BookDTO dto1 = g.fromJson(json, BookDTO.class);
		System.out.println(dto1);
		
		//Object(List<BookDTO>) -> JSON(String):[{},{} ...]
		List<BookDTO> list = new ArrayList<>();
		list.add(new BookDTO("자바1",20000, "에이콘1",570));
		list.add(new BookDTO("자바2",40000, "에이콘2",770));
		list.add(new BookDTO("자바3",60000, "에이콘3",970));
		
		String listJson = g.toJson(list);
		System.out.println(listJson);
		
		//JSON ->  Object(List<BookDTO>)
		List<BookDTO> list1 = g.fromJson(listJson, new TypeToken<List<BookDTO>>(){}.getType());
		for(BookDTO vo:list1) {
			System.out.println(vo);
		}
	}

}
