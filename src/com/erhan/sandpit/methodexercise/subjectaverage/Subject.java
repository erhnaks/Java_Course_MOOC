package com.erhan.sandpit.methodexercise.subjectaverage;

public class Subject {

    private int math;
    private int english;
    private int music;
    private int re;
    private int science;


    public Subject(int math, int english, int music, int re, int science) {

        this.math = math;
        this.english = english;
        this.music = music;
        this.re = re;
        this.science = science;
    }

    public double averageOfAll() {
        int sum = this.math + this.english + this.re + this.music + this.science;
        return 1.0 * sum / 5;
    }

    public String toString() {
        return "Your have scored: \n" + "Math: " + this.math + "\nEnglish: " + this.english + "\nMusic: " + this.music
                + "\nReligious: " + this.re + "\nScience: " + this.science + "\nYour average pass rate is: " + averageOfAll();
    }









}
