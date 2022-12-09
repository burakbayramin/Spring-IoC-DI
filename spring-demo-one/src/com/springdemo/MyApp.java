package com.springdemo;

public class MyApp {

	public static void main(String[] args) {

		Coach bCoach = new BaseballCoach();
		Coach tCoach = new TrackCoach();

		System.out.println(bCoach.getDailyWorkout());
		System.out.println(tCoach.getDailyWorkout());

	}

}
