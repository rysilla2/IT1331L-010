package com.it311l.uap.simplespringbootapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorld {

	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello World";
	}
	
	@GetMapping("/sort")
	public int[] sort() {
		int[] arr = new int[]{3, 10, 8, 9, 2, 2, 8, 10, 2, 3};
		int n = arr.length;
		
		for (int i = 0; i < (arr.length + 1); i++) {
	
			boolean flipped = false;
			

			//checks if it should stop
			for (int j = 0; j < (arr.length + 1); j++) {
				
				if (j == 9) {
					break;
				}
				
				if (arr[j] < arr[j + 1]) {
					int a = arr[j];
					int b = arr[j + 1];
					arr[j] = b;
					arr[j + 1] = a;
					flipped = true;
				}
			}
			
			if (!flipped) {
				break;
			}
		}
		
		
		System.out.println("After sorting");
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		
		return arr;
		
	}
	
	@GetMapping("/test")
	public int[] test() {
		int[] t = new int[]{1,2};
		return t;
	}
	
	
}
