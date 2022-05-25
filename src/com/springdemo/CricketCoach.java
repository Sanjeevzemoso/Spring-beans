package com.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    //new fields
    private String emailAddress;
    private String team;

    //create a no arg contructor cause spring calls it
    public CricketCoach(){
        System.out.println("inside no ard cric");
    }

    //our setter method injection
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter cric");
        this.fortuneService = fortuneService;
    }

    // setter for literal injection
    public void setEmailAddress(String theemailAddress)
    {
        this.emailAddress= theemailAddress;
    }

    //setter for literal injection 2
    public void setTeam(String team){
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {

        return "Practice fast bowling for 15min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public String getTeam(){
        return team;
    }
}
