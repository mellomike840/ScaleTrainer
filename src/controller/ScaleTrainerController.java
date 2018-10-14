package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Metronome;
import java.util.Random;

public class ScaleTrainerController 
{
	public void start()
	{
		ArrayList<String> usedMaterial= new ArrayList<String>();
		ArrayList<String> displayMaterial = new ArrayList<String>();
		ArrayList<String> Ionian = new ArrayList<String>();
		
		double bpm = 120;
		int counter = 3; //beats per measure
		
		String userInput = JOptionPane.showInputDialog("Enter Something To Display: ");
		displayMaterial.add(userInput);
		userInput = JOptionPane.showInputDialog("Enter Another Thing to Display: ");
		displayMaterial.add(userInput);
		userInput = JOptionPane.showInputDialog("Another One: ");
		displayMaterial.add(userInput);
		
		/* add validDouble method
		userInput = JOptionPane.showInputDialog("Enter BPM: ");
		bpm = 120;
		*/
		
		Metronome metronome1 = new Metronome(bpm, counter);
		//The Metronome is a never ending loop.
		while(true)
		{
			try 
			{
				Thread.sleep((long)(1000*(60/metronome1.getBpm())));
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			
			
			/*  Random display feature stub 
			Random rand = new Random();
			int randDisplay = rand.nextInt(displayMaterial.size() - 1);
			usedMaterial.add(displayMaterial.get(randDisplay));
			*/
			
			
			/*  Metronome with counter/measure feature stub */
			metronome1.setCounter((metronome1.getCounter()) + (1));
			if(metronome1.getCounter()%metronome1.getMeasure()==0)
			{
				System.out.println(displayMaterial.get(0));
			}
			else if(metronome1.getCounter()%metronome1.getMeasure()==1)
			{
				System.out.println(displayMaterial.get(1));
			}
			else 
			{
				System.out.println(displayMaterial.get(2));
			}
			/**/
			
		}
		
		
	}
	
	//*******PRIVATE*METHODS********* 
	
	
	//method stub
	private boolean validDouble(String possDouble)
	{
		
		return false;
	}
	
	
	
}
