package io.springboot.springcloudconfigstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigStoreApplication.class, args);
	}

}
