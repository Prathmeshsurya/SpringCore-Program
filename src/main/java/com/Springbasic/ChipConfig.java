package com.Springbasic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/Springbasic/application.properties")
@ComponentScan(basePackages = "com.Springbasic")
public class ChipConfig {
	
	@Autowired
	Environment environment;
	@Bean
	public Chip chip () {
		Chip chip = new Chip();
		chip.setChipCompany(environment.getProperty("chipCompany"));
		chip.setTypeOfChip(environment.getProperty("typeOfChip"));
		chip.setManufactureDate(environment.getProperty("manufactureDate"));
		return chip;
	}

}
