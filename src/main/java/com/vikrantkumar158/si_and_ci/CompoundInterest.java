package com.vikrantkumar158.si_and_ci;

public class CompoundInterest extends Interest
{
    public CompoundInterest(int principle, int rate, int time) 
    {
        super(principle, rate, time);
    }

    public double calculate()
    {
        return principle*Math.pow((1+rate/100.0),time);
    }
}