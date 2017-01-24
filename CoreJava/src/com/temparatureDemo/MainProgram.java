package com.temparatureDemo;

import java.util.List;
import java.util.ArrayList;
import com.temparatureDemo.Temperature.Metric;



public class MainProgram {
	
	public static void main(String[] args) {
		
		Patient p = new Patient();
		p.name= "Joe";
		Temperature t = new Temperature();
		t.degree = 37;
		t.metric = Metric.FAHRENHEIT;
		
		Temperature t1 = new Temperature();
		t1.degree = 60;
		t1.metric = Metric.FAHRENHEIT;
		
		List<Temperature> temps = new ArrayList<>();
       temps.add(t);
       temps.add(t1);
        
        p.temperatures = temps;
        
        if(p.detect())
		{
			System.out.println(p.name+ "  "+ "has fever");
		}
		
		else
		{
			System.out.println(p.name+"  "+"has no fever");
		}
        
		//p.temp = t;
		/*if(p.hasFever())
		{
			System.out.println(p.name+ "  "+ "has fever");
		}
		
		else
		{
			System.out.println(p.name+"  "+"has no fever");
		}*/
	}

}
