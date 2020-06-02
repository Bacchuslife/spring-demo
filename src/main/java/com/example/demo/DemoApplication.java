package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@Component
class Foo {
	int e;
	
	public Foo() {
		this.e = 88;
		System.out.println("Foo.Foo()");
	}
	
	public Foo(int e) {
		this.e = e;
	}
}
