package com.mycompany.calculating;
public class MeanComputation extends MeasureCalculator
{

	public MeanComputation(double[] numbers)
	{
            super(numbers.length);
		for(int i = 0; i < numbers.length; i++)
			this.numbers[i] = numbers[i];
	}

	private double computeTotal()
	{
		return super.GetSum(numbers);
	}

	public double computeMean() 
	{
		return (computeTotal() / this.numbers.length);
	}

	public double[] GetNumbers()
	{
		return super.getNumbers();
	}
}
