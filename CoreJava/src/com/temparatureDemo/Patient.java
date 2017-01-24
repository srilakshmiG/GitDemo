package com.temparatureDemo;

import java.util.ArrayList;
import java.util.List;

import com.temparatureDemo.Temperature.Metric;

public class Patient {
	
	String name;
	Temperature temp;
	List<Temperature> temperatures;
	
	public boolean detect()
	{
		double temp1= 0;
		for(Temperature t : temperatures){
			temp1 += t.degree;
		}
		if(temp1 >98 && temp.metric == Metric.FAHRENHEIT)
		
			return true;
		
		else if(temp1 >36 && temp.metric == Metric.CELSIUS)
			return true;
		
		else return false;
		
	}
	
	public boolean hasFever()
	{
		if(temp.degree >98 && temp.metric == Metric.FAHRENHEIT)
		{
			return true;
		}
		else if(temp.degree >36 && temp.metric == Metric.CELSIUS){
			return true;
		}
		else return false;
	}
	
	

}
