package com.accesso;

import org.w3c.dom.Document;

public class Main
{
	public static void main(String[] args)
	{
		String xml = "<SERVICE request_type='GetAllProducts' merchant_id='904' auth_id='7' auth_timestamp='2023-04-26T13:05:56Z' />";

		Document request = ExampleHMAC.buildHMACRequest(xml);

		System.out.println(ExampleHMAC.toString(request));
	}
}
