/**
 * @autor pathmasri
 * Mar 2, 2015 11:38:00 PM
 */
package com.sample.observerpattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temp;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.regiterObserver(this);
	}
	
	public void display() {
		System.out.println("Current conditions:" + temp + " degrees and " + humidity +" % humidity");		
	}


	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();		
	}

}
