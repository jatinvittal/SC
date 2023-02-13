package com.slokam.sc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//uhhih
@Component
public class TL {

	@Autowired
	private Developer dev;
	//this is TL
	public void dowork() {
		System.out.println("Started TL work");
		//dev.dowork();
		
		
		System.out.println("End TL work");
	}
}
