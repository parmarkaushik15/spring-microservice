package com.touch.touch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class TouchApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouchApplication.class, args);
	}
}
