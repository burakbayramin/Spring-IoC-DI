package com.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "30 min batting practice";
	}

	@Override
	public String greet() {
		return "Hello";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public BaseballCoach() {
		//no args constr for myapp
	}
}
