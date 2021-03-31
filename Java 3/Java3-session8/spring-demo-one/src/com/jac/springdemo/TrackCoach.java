package com.jac.springdemo;

public class TrackCoach implements ICoach {

	// define a private field for dependency
	private IFortuneService fortuneService;

	public TrackCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

}
