package com.trabalhofinal.faults;

import javax.xml.ws.WebFault;

@WebFault(name="FalhaDeCampoInexistente")
public class WithoutFieldFault extends Exception{
	public WithoutFieldFault(String msg){
		super(msg);
	}
}
