package com.example.demo.setting.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.setting.pojo.ServerVo;

@RestController
@RequestMapping("/setting")
public class SettingController {
	
	@Resource(name="serverVo")
	private ServerVo serverVo;
	
	
	@RequestMapping(value="/server",method=RequestMethod.PUT)
	public String serverSetting(@RequestBody ServerVo server) {
		System.out.println(server);
		return "callback(data)";
	}
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public ServerVo hello(){
		System.out.println(serverVo);
		return serverVo;
	}
}
