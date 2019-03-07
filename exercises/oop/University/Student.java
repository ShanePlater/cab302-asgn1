package oop.University;

public class Student extends Academic{

    private double stipend;
//    private Title title;
//    private int id;
//    private String name;

    public Student(Title title, int id, String name, double stipend){

        super(title, id, name);
        this.stipend = stipend;
    }

    public String getName(){
       return super.getName();
    }

    public int getId(){
        return super.getID();
    }

    public Title getTitle(){
        return super.getTitle();
    }

    public double getWeeklyPay(){
        return stipend;
    }

    public String toString(){

        return String.format("%s %d studies a %s",this.getClass().getSimpleName(), super.getID(), super.getTitle());
    }


}