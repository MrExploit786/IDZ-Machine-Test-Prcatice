package pactice;

abstract class Animal_Abstraction {
	
	abstract void animalSound();
	
	abstract void sleep();


}

 class Lion extends Animal_Abstraction{

	@Override
	void animalSound() {
		// TODO Auto-generated method stub
		System.out.println(" Thre Lion says : HAWWWWWWWWW");
		
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println(" Lion sleep like : Zzzzzzzz");
	}

	

	
}
