package demojava;

class Plane{
	
	void takeOff(){
		System.out.println("Plane is taking-off");
	}
	
	void fly(){
		System.out.println("Plane flies");
	}

	void land(){
		System.out.println("Plane is landing");
}
}
	
class CargoPlane extends Plane{
	
	//super();--takeOff method is inherited.
	
	@Override
	void fly() {
		System.out.println("CargoPlane flies at lower heights");
	}
	//--land() method is inherited.
	void carryCargo() {
		System.out.println("CargoPlane carries goods");
	}
}

class PassengerPlane extends Plane{
	
	@Override
	void fly() {
		System.out.println("PassengerPlane flies at medium heights");
	}
	
	void carryPassenger() {
		System.out.println("PassengerPlane carries passengers");
	}
}

class FighterPlane extends Plane{
	
	@Override
	void fly() {
		System.out.println("FighterPlane flies at any heights");
	}
	
	void carryWeapons() {
		System.out.println("FighterPlane carries weapons");
	}
}



public class MethodsInheritance {

	public static void main(String[] args) {
		
		CargoPlane cp=new CargoPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
		System.out.println("------------------------");
		
		PassengerPlane pp=new PassengerPlane();
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryPassenger();
		System.out.println("------------------------");
		
		FighterPlane fp=new FighterPlane();
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
	}

}
