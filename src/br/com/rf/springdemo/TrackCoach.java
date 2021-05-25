package br.com.rf.springdemo;

public class TrackCoach implements Coach {
	
private FortuneService fortuneService;


	
	public TrackCoach() {
	super();
	// TODO Auto-generated constructor stub
}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It :  " + fortuneService.getFortune();
	}

}
