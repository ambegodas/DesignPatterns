/**
 * @autor pathmasri
 * Mar 2, 2015 11:20:43 PM
 */
package com.sample.observerpattern;

import java.util.ArrayList;

public class WetherData implements Subject {
	
	private ArrayList<Observer> observers;
	private float temp;
	private float pressure;
	private float humidity;
	
	public WetherData(){
		observers = new ArrayList<Observer>();
	}


	public void regiterObserver(Observer o) {
		observers.add(o);		
	}


	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i>=0){
			observers.remove(i);
		}		
	}


	public void notifyObservers() {
		for (Observer o: observers){
			o.update(temp, humidity, pressure);
		}		
	}
	
	public void setMessuerments(float temp, float humidity, float pressure){		
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();		
	}
	
	public void measurementChanged(){
		notifyObservers();
	}

}
