package com.raidencentral.knights.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.raidencentral.knights.BraveKnight;
import com.raidencentral.knights.Knight;
import com.raidencentral.knights.Quest;
import com.raidencentral.knights.SlayDragonQuest;

@Configuration
public class KnightConfig {
	
	@Bean
	public Knight knight(){
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest(){
		return new SlayDragonQuest(System.out);
	}
}
