
package com.mycompany.calculating;

public class MeasureCalculator {
   protected double[] numbers;

   
   public MeasureCalculator(int length){
   this.numbers=new double[length];
   }
   
   protected double GetSum(double[] numbers){
       double sum=0;
   for(double A:this.numbers)
      sum+=A;
   
   return sum;}
   
  public double[] getNumbers(){
  return this.numbers;
  }
}
