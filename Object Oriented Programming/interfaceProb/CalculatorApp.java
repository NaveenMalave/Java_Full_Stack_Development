package com.interfaceProb;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calci cal = new Calci();
		cal.acceptCalculator(new EpsonCalculator());
		cal.acceptCalculator(new CasoCalculator());
		cal.acceptCalculator(new CibenCalculator());

	}

}
