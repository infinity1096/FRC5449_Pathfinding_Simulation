package pathfinding;

public class Test2 {
	public static void main(String[] args){
		//How to use it
		
		double[] start = {2.3,1.31};
		double[] end = {4,5.74};
		double[] testpos = {4,1};
		Simulator simulator = new Simulator(start,end,1);
		simulator.Simulate();

		
	}
}
