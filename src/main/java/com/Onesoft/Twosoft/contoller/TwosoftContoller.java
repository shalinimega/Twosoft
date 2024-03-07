package com.Onesoft.Twosoft.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwosoftContoller {
	@GetMapping("msg")
	public String msg()
	{
		return "good night";
	}

}
