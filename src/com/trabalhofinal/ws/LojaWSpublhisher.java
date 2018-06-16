package com.trabalhofinal.ws;

import javax.xml.ws.Endpoint;

public class LojaWSpublhisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9090/loja", new LojaWSImpl());
	}

}
