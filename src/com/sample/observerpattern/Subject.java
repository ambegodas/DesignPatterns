/**
 * @autor pathmasri
 * Mar 2, 2015 11:12:53 PM
 */
package com.sample.observerpattern;

public interface Subject {
	
	public void regiterObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();

}
