package oop.University;

public class Staff extends Academic{
    private double stipend;
//    private Title title;
//    private int id;
//    private String name;
    private int hours;

    public Staff(Title title, int id, String name){

        super(title, id, name);

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
    public void setHours(int hours){
        this.hours = hours;
    }

    public double getWeeklyPay(){
        if (super.getTitle() == Title.LECTURER){
            double pay = (double)75000 / 52;
            return pay;
        }else if (super.getTitle() == Title.TUTOR){
            return hours * 35;
        }
        else return 0;

    }

    public String toString(){
        return String.format("%s %d works as a %s",this.getClass().getSimpleName(), super.getID(), super.getTitle());
    }




}