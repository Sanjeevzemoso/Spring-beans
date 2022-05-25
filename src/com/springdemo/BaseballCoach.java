package com.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;



    public BaseballCoach(FortuneService thefortuneservice ) {
        fortuneService = thefortuneservice;
    }

    public String getDailyWorkout(){
        return "Spend 30min on batting practise";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();

    }
}
