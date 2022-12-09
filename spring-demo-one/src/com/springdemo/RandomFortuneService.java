package com.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

	private String[] fortunes = {"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"};
	
	private Random r = new Random();
	
	@Override
	public String getFortune() {
		int index = r.nextInt(fortunes.length);
		String fortune = fortunes[index];
		return fortune;
	}

}
