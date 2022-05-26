package com.example;

public class NbaPlayer {

    private String team;
    private Conference conference;
    private Division division;
    private Position position;
    private String height;
    private int age;
    private int jerseyNumber;

    public NbaPlayer(String team, Conference conference, Division division,
                     Position position, String height, int age, int jerseyNumber) {

        this.team = team;
        this.conference = conference;
        this.division = division;
        this.position = position;
        this.height = height;
        this.age = age;
        this.jerseyNumber = jerseyNumber;
    }

    public String getTeam() {
        return team;
    }

    public Conference getConference() {
        return conference;
    }

    public Division getDivision() {
        return division;
    }

    public Position getPosition() {
        return position;
    }

    public String getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }
}
