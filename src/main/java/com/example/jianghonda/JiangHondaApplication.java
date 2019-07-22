package com.example.jianghonda;

import com.example.jianghonda.storage.StorageProperties;
import com.example.jianghonda.storage.StorageService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class JiangHondaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JiangHondaApplication.class, args);
	}
	@Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
            //storageService.deleteAll();
            storageService.init();
        };
    }
}