package com.optionals;

import java.util.Optional;

public class _Optionals {

	
	public static void main(String[] args)
	{
		Optional.ofNullable("")
		.orElseThrow(() -> new IllegalStateException("Null Pointer Exception User Defined!"));

		Optional.ofNullable("ep@gamil.com").
		ifPresent(email -> System.out.println("Sending Email to : " + email));
		
		Optional.ofNullable(null)
		.ifPresentOrElse(
				email -> System.out.println("Sending Email to : "+ email), 
				() -> System.out.println("Not Sending Email")
				);
		
		Optional.ofNullable(null)
		.ifPresentOrElse(
				email -> System.out.println("Sending Email to : "+ email), 
				() -> {
					System.out.println("Hello world");
					System.out.println("Method declared");
				}
				);
	}
}
