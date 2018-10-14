package model;

public class Metronome 
{
	
	double bpm;  // beats per minute
	int measure; // number of beats in a measure 
	int counter;
	
	public Metronome(double bpm, int measure)
	{
		this.bpm = bpm;
		this.measure = measure;
	}
	
	//*****************GETTERS*****************
	
	public double getBpm()
	{
		return bpm;
	}
	
	public int getMeasure()
	{
		return measure;
	}
	
	public int getCounter()
	{
		return counter;
	}
	
	
	//*****************SETTERS*****************
	
	public void setBpm(double newBpm)
	{
		bpm = newBpm;
	}
	
	public void setCounter(int newCounter)
	{
		counter = newCounter;
	}
	
	
}
