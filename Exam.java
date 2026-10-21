
package com.mycompany.tutorial2x4;

public class Exam {
    //instance variables
    private int day,month,year;
    private int hour,minute;
    private double maxMarks;
    private final String examtype;
    private final int examOrder;
    //constant
    public static final String LabExam="LabExam";
    public static final String MidtermExam="MidtermExam";
    public static final String FinalExam="FinalExam";
    //counters
    private static int countLabExam=0;
    private static int countMidTermExam=0;
    //con1
    public Exam(String examtype){
        this(examtype, 0);
    }
    //con2
    public Exam(String examtype,double maxMarks){
        this(examtype, maxMarks , 11, 7, 2004);
    }
    //con3
    public Exam(String examtype,double maxMarks,int day, int month, int year){
        this( examtype,  maxMarks, day,  month, year,  0,  0);
    }
    //con4
    public Exam(String examtype, double maxMarks,int day, int month,int year, int hour, int minute){
    this.examtype=examtype;
    if(this.examtype.equals(LabExam)){
        examOrder=++countLabExam;
    }
    else if(this.examtype.equals(MidtermExam)){
    examOrder=++countMidTermExam;}
    else{
    this.examOrder=0;}
    validateSetmaxMarks(maxMarks);
    validateSetDate(day, month, year);
    validateSetTime(hour, minute);
    }
    //con5
    public Exam(Exam exam){
    this.examtype=exam.examtype;
    this.examOrder=exam.examOrder;
    validateSetmaxMarks(exam.maxMarks);
    validateSetDate(exam.day, exam.month, exam.year);
    validateSetTime(exam.hour, exam.minute);
    }
    
    //set valide maxMarks
    private void validateSetmaxMarks(double max){
     if(examtype.equals(LabExam)){
     this.maxMarks= (max>=5 && max<=10)?max:10;}
     else if(examtype.equals(MidtermExam)){
     this.maxMarks=(max>=15 && max<=20)?max:20;}
     else if(examtype.equals(FinalExam)){
     this.maxMarks=(max>=30 && max<=40?max:40);}
     else{
     this.maxMarks=max;}}
    
    //set valide date
    private void validateSetDate(int day, int month,int year){
    this.day=(day>=1 && day<=31)?day:1;
    this.month=(month>=1 && month<=12)?month:1;
    this.year=(year>0)?year:2020;}
    
    //set valide time
    private void validateSetTime(int hour, int minute){
    this.hour=(hour>=0 && hour<=23)?hour:0;
    this.minute=(minute>=0 && minute<=59)?minute:0;}
    
    //set date
    public void SetDate(int day,int month, int year){
    validateSetDate(day, month, year);}
    
    //set time
    public void SetTime(int hour, int minute){
    validateSetTime(hour, minute);}
    
    //Day
    public int getDay(int day){
    return day;}
    
    public void setDay(int day){
    this.day=day;}
    
    //month
    public int getMonth(int month){
    return month;}
    
    public void setMonth(int month){
    this.month=month;}
    
    //year
    public int getYear(int year){
    return year;}
    
    public void setYear(int year){
    this.year=year;}
    
    //minute
    public int getMinute(int minute){
    return minute;}
    
    public void setMinute(int minute){
    this.minute=minute;}
    
    //hour
    public int getHour(int hour){
    return hour;}
    
    public void setHour(int hour){
    this.hour=hour;}
    
    //MaxMarks
    public double getMaxMarks(double maxMarks){
        return maxMarks;}
    
    public void setMaxMarks(double maxMarks){
    validateSetmaxMarks(maxMarks);}
  
    public String toString(){
    String displayType=(this.examOrder>0)?this.examtype+"#"+this.examOrder:this.examtype;
    return String.format("Exam: %s (%.2f marks) \nDate: %d/%d/%d \nTime: %02d:%02d",
            displayType,this.maxMarks,day,month,year,hour,minute);}
    
}
