/**
 * @autor pathmasri
 * Feb 28, 2015 1:06:52 PM
 */
package com.sample.strategypattern1;

public class StrategyPatterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Context c = new Context(new OperationAdd());
		c.executeStrategy(2, 3);
		
		c.setStrategy(new OperationMultiyply());
		c.executeStrategy(6, 8);		
		
		c.setStrategy(new Operationsubstract());
		c.executeStrategy(10, 3);
		  

	}

}
