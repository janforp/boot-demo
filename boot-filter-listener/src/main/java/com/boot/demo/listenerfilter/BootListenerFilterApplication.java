package com.boot.demo.listenerfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author janita
 * @since 2018/9/9 - 上午10:36
 * 类说明：
 */
@SpringBootApplication
@ServletComponentScan
public class BootListenerFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootListenerFilterApplication.class, args);
	}
}
