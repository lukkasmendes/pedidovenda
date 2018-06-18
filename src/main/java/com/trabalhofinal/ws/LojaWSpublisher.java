package com.trabalhofinal.ws;

import javax.xml.ws.Endpoint;

public class LojaWSpublisher {

	public static void main(String[] args) {
		
		 String port = System.getenv("PORT");
	        String host = "http://0.0.0.0:";
	        String uri = "/loja";
	        LojaWSImpl service = new LojaWSImpl();
		
		Endpoint.publish(host+port+uri, service);
	}

}
