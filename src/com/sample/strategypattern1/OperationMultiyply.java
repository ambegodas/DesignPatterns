/**
 * @autor pathmasri
 * Feb 28, 2015 12:58:53 PM
 */
package com.sample.strategypattern1;

public class OperationMultiyply implements Strategy {

	/* (non-Javadoc)
	 * @see com.sample.strategypattern.Strategy#doOperation(int, int)
	 */
	@Override
	public int doOperation(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}
