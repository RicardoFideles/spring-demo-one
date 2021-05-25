package br.com.rf.springdemo;

public class CriketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CriketCoach() {
		super();
		System.out.println("CriketCoach: inside no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CriketCoach: inside setter method - setFortuneService");

		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
