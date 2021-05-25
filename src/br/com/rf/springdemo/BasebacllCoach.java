package br.com.rf.springdemo;

public class BasebacllCoach implements Coach {

	private FortuneService fortuneService;
	
	public BasebacllCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
