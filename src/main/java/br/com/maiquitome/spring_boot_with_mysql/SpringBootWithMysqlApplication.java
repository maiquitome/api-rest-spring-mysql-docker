package br.com.maiquitome.spring_boot_with_mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.maiquitome.spring_boot_with_mysql")
@EntityScan(basePackages = "br.com.maiquitome.spring_boot_with_mysql.model")
public class SpringBootWithMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithMysqlApplication.class, args);
	}

}
