package io.github.yexiaoxiaogo.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @RequestMapping("/hello111")
    @ResponseBody
    public String hello111() {
        return "Hello World";
    }
    
	@RequestMapping("/")
	public String index(ModelMap map){
		map.addAttribute("host","http://localhost:8080/weather/list/city?city=杭州");
		return "index";
	}
}
