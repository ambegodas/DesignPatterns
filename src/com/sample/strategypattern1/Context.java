/**
 * @autor pathmasri
 * Feb 28, 2015 1:00:42 PM
 */
package com.sample.strategypattern1;

public class Context {
	
 private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void executeStrategy(int a, int b){	
		System.out.println(this.strategy.doOperation(a, b));
		
	}

	/**
	 * @param strategy the strategy to set
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
