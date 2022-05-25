package com.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;



    //define a constructor for injection
    public TrackCoach( FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Run a Hard 5k";
    }

    @Override
    public String getDailyFortune() {

        //use your fortuneservice to get a fortune
        return  "Just do it " +fortuneService.getFortune();
    }

    //add an init method
    public void doMyStartupStuff(){
        System.out.println("Trackcoach : inside domystartupstuff");
    }

    public void doMyCleanupStuff(){
        System.out.println("Trackcoach : inside domycleanupstuff");
    }
}
