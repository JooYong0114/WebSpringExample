package com.qlarslrs.spring.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")
@Controller
public class Ex01Controller {
	
	@RequestMapping("/1")
	@ResponseBody
	public String printString() {
		// text/plain 으로 기본 설정 되어있음
		return "예제 1번 response body로 String 보내기";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Object> printMap() {
		Map<String, Object> map = new HashMap<>();
		map.put("banana", 5000);
		map.put("orange", 1000);
		map.put("apple", 3000);
		map.put("grape", 7000);
		return map;
	}
}