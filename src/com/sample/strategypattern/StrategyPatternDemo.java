/**
 * @autor pathmasri
 * Feb 28, 2015 3:13:55 PM
 */
package com.sample.strategypattern;

public class StrategyPatternDemo {
	
	public static void main(String[] args){
		
		Duck d = new RedHeadDuck();
		d.setFlyingBehaviour(new FlyNoway());
		d.performFly();
		
	}
	
	

}
