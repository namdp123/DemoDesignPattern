package creationalpattern;

public class Adapter implements CheckPhone {
CheckNumberAdaptee check = new CheckNumberAdaptee();
	@Override
	public boolean checkPhoneInput(String input) {
		// TODO Auto-generated method stub
		if(!check.checkNumber(input)) {
			return false;
		}
		else if (input.length() > 11 || input.length() < 9)
			return false;
		return true;
	}
}
