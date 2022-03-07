package com.challenge.automation.pratice.core;

import java.util.Random;

public class Utils {
	
	private String address;

	public String enderecos() {

		Random random = new Random();

		String[] addresses = { "Alameda Araguaia", "Alameda Tambore", "Street de Jesus", "Rua Juscelino Kubitschek",
				"Alameda Paulista" };

		for (int i = 0; i < 1; i++) {
			address = addresses [random.nextInt(addresses.length)];
		}

		return address;
	}

	private String zipCode;

	public String zipCodes() {

		Random random = new Random();

		String[] zipCodes = { "02557", "02730", "02002", "01534" };

		for (int i = 0; i < 1; i++) {
			zipCode = zipCodes[random.nextInt(zipCodes.length)];
		}
		
		return zipCode;
	}

}
