package com.example.demo;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
public class App {

	public static void main(String[] args) {
		// SpringApplication.run(App.class, args);
		Thread1 x = new Thread1();
		System.out.println(x.fakeData.birthdayFormatted);
	}
}
