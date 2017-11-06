package com.example.demo.setting.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("scoket.properties")
public class DtulogVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5269430168462348262L;
	@Value("${server.dtulog.recv}")
	private String recv ;
	
	@Value("server.dtulog.send")
	private String send ;
	
	public DtulogVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DtulogVo [recv=" + recv + ", send=" + send + "]";
	}
	public String getRecv() {
		return recv;
	}
	public void setRecv(String recv) {
		this.recv = recv;
	}
	public String getSend() {
		return send;
	}
	public void setSend(String send) {
		this.send = send;
	}
	
}
