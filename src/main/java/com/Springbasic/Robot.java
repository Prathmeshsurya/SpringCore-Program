package com.Springbasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("My-Robo")
@Data
@PropertySource("classpath:com/Springbasic/application.properties")
public class Robot {
    @Autowired
	 private Chip chip;
	@Value("${roboManuFactureName}")
	 private String roboManuFactureName;
	@Value("${robotPower}")
	 private String robotPower;
	 private boolean isActivated;
	 
	 public void makeActivate() {
		 String chipType = chip.getTypeOfChip();
		 if(chipType.equals("green")) {
			 this.setActivated(true);
			 System.out.println("Activated..!!!");
			 
		 }else {
			 System.out.println("Activate On Your Own Risk...");
		 }
	 }
}
