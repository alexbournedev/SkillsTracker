package org.launchcode.skillstracker;

public class Form {
    public String name;
    public String firstChoice;
    public String secondChoice;
    public String thirdChoice;

    public Form(String name, String firstChoice, String secondChoice, String thirdChoice) {
        this.name = name;
        this.firstChoice = firstChoice;
        this.secondChoice = secondChoice;
        this.thirdChoice = thirdChoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstChoice() {
        return firstChoice;
    }

    public void setFirstChoice(String firstChoice) {
        this.firstChoice = firstChoice;
    }

    public String getSecondChoice() {
        return secondChoice;
    }

    public void setSecondChoice(String secondChoice) {
        this.secondChoice = secondChoice;
    }

    public String getThirdChoice() {
        return thirdChoice;
    }

    public void setThirdChoice(String thirdChoice) {
        this.thirdChoice = thirdChoice;
    }
}