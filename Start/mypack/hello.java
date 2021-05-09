package mypack;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.URL;

class hello
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ia = InetAddress.getLocalHost();
		System.out.println(ia.getHostAddress());
		System.out.println(ia.getHostName());
		
		InetAddress is = InetAddress.getByName("www.google.com");
		System.out.println(is.getHostAddress());
		System.out.println(is.getHostName());
		
		
}
}