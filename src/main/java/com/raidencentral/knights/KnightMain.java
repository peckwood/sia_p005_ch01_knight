package com.raidencentral.knights;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class KnightMain {
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knight.xml");
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/minstrel.xml");
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/lonelythinker/git/spring-in-action-ch01_knight/ch01_knight/src/main/resources/META-INF/spring/minstrel.xml");
		
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}
}
