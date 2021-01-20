package utility;

import model.User;

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface {

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		if ((18 <= user.getAge() && user.getAge() <= 35) && 
				(155 <= user.getHeight() && user.getHeight() <=170 ) && 
				(55<= user.getWeight() && user.getWeight() <= 90) && 
				user.getCountry().equals("ProGrad")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		int marks = Integer.parseInt(points);
		if (marks > 80) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean basicEligibilityCheck(User user) {
		
		// TODO Auto-generated method stub
		return checkUser(user);
	}
	
}






