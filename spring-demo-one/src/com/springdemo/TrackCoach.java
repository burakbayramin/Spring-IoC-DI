package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5k";
	}

	@Override
	public String greet() {
		return "Heyyo";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do IT " + fortuneService.getFortune();
	}

	public TrackCoach() {
		// no args cons for myapp
	}
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
		
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}

}
