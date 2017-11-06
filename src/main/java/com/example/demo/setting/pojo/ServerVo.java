package com.example.demo.setting.pojo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource("scoket.properties")
public class ServerVo {
	@Override
	public String toString() {
		return "ServerVo [dtulog=" + dtulog + ", response=" + response + "]";
	}
	@Resource(name="dtulogVo")
	private DtulogVo dtulog ;
	
	@Value("server.reponse")
	private String response;
	public DtulogVo getDtulog() {
		return dtulog;
	}
	public void setDtulog(DtulogVo dtulog) {
		this.dtulog = dtulog;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
	
}
