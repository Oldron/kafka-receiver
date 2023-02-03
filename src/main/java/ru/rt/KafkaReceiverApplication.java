package ru.rt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableFeignClients
public class KafkaReceiverApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaReceiverApplication.class, args);
	}
}