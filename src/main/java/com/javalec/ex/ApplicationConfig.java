package com.javalec.ex;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configurable
public class ApplicationConfig {

	@Value("${shs.id}")
	private String shs_id;
	@Value("${shs.pw}")
	private String shs_pw;
	@Value("${nhs.id}")
	private String nhs_id;
	@Value("${nhs.pw}")
	private String nhs_pw;

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();

		Resource[] location = new Resource[2];
		location[0] = new ClassPathResource("shs_connection.properties");
		location[1] = new ClassPathResource("nhs_connection.properties");
		configurer.setLocations(location);

		return configurer;
	}

	@Bean
	public Connection shs_connection() {
		Connection connection = new Connection();
		connection.setId(shs_id);
		connection.setPassword(shs_pw);

		return connection;
	}

	@Bean
	public Connection nhs_connection() {
		Connection connection = new Connection();
		connection.setId(nhs_id);
		connection.setPassword(nhs_pw);

		return connection;
	}

}
