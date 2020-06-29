package com.vikrantkumar158.si_and_ci;

public class SimpleInterest extends Interest
{
    public SimpleInterest(int principle, int rate, int time) 
    {
        super(principle, rate, time);
    }

    public double calculateSI()
    {
        return ((principle*rate*time)/100.0);
    }
}