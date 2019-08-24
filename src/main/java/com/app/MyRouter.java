package com.app;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
@Component
public class MyRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("file://D:/CamelSender")
		.to("file://E:/CamelReceiver");
		
	}

}
