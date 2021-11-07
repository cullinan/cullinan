package com.cullinan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.cullinan")
@Slf4j
public class WangApplication {

	public static void main(String[] args) {
		SpringApplication.run(WangApplication.class, args);
		log.info("start succeful33ss3");
	}

}
