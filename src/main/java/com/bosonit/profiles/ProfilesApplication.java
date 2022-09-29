package com.bosonit.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication
public class ProfilesApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProfilesApplication.class, args);
	}
}
@Component
class MyRunner implements CommandLineRunner {
	@Autowired
	private Environment environment;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Active profiles: " + Arrays.toString(environment.getActiveProfiles()));
	}
}
