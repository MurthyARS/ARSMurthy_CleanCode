package Interest.SimpleCompund;

public class CalcInterest extends Inp{
	public double calSimInterest(){
		
		return (getPrinciple()*getTime()*getRate())/100;
	}
	
	public double calcCompInterest(){
		return getPrinciple() * Math.pow(1.0+getRate()/100.0,getTime()) - getPrinciple();
	}
	
}

