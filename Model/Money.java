/**
 * 
 */
package model;

/**
 * This class represents one reward(Money) that will be given to customer in the case that
 * there is enough money in the RCM.
 * 
 * @author  Woon Jeen Tang, Yuanyuan Xie
 * @studentID W0987907, W0984770	
 * @Section: Tuesday and Thursday 
 * @CourseNumber: COEN 275
 * @AssignmentNumber: Final Project
 * @DateOfSubmission: 3/2014
 *
 */
public class Money extends Reward{

	//constructor
	public Money(double totalValue) {
		super.totalValue = totalValue;
	}
	
}
