
package com.mycompany.tutorial2x4;

public class Tutorial2x4 {

    public static void main(String[] args) {
       Exam ex1=new Exam(Exam.MidtermExam);
       Exam ex2=new Exam(Exam.LabExam,65.0);
       Exam ex3=new Exam(Exam.FinalExam, 45.0 , 6 , 8 , 2025);
       Exam ex4=new Exam(Exam.MidtermExam, 80.0 , 9 , 5 , 2045 , 5 , 43);
       Exam ex5=new Exam(Exam.LabExam, 70.0 , 33 , 23 , -44 , 25 , 67);
       Exam ex6=new Exam(ex5);
       
        System.out.println("\nExam 1");
        System.out.println(ex1);
        System.out.println("\nExam 2");
        System.out.println(ex2);
        System.out.println("\nExam 3");
        System.out.println(ex3);
        System.out.println("\nExam 4");
        System.out.println(ex4);
        System.out.println("\nExam 5");
        System.out.println(ex5);
        System.out.println("\nExam 6");
        System.out.println(ex6);
    }
}
