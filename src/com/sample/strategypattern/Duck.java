/**
 * @autor pathmasri
 * Feb 28, 2015 2:54:18 PM
 */
package com.sample.strategypattern;

public abstract class Duck {
	
	private FlyingBehaviour flyingBehaviour;
	
	
	public abstract void display();
	public abstract void swim();
	

	public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
		this.flyingBehaviour = flyingBehaviour;
	}
	
	public void performFly(){
		this.flyingBehaviour.fly();
	}

}
