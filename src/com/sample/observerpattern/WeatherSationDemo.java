/**
 * @autor pathmasri
 * Mar 2, 2015 11:55:06 PM
 */
package com.sample.observerpattern;

public class WeatherSationDemo {
	
	public static void main(String[] args){
		
		//Subject is created
		WetherData wetherdata = new WetherData();		
		
	    // Registering with the subject
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wetherdata);
		
		wetherdata.setMessuerments(10, 20, 30);
		
		
	}

}
