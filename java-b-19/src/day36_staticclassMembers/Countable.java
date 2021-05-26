package day36_staticclassMembers;

public class Countable {

	int instanceCount;//instance variable
	int instanceCount2;
	

	public Countable(int instanceCount) {

		this.instanceCount = instanceCount;
		instanceCount++;
	}
	
	public int getInstanceCount() {
		
		return instanceCount;
	}
}
