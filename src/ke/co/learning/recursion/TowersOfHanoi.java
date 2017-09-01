package ke.co.learning.recursion;

public class TowersOfHanoi {

	// recursively move disk between towers
	public static void solveTowers(int disks, int sourcePeg, int destinationPeg, int tempPeg) {

		//bace case --only one disk to move
		if(disks == 1){
			System.out.printf("\n%d --> %d", sourcePeg,destinationPeg);
			return;
		}
		
		//recursion step -- move (disk -1 disk) from sourcePeg
		//to tempPeg using destinationPeg
		solveTowers(disks-1,sourcePeg,tempPeg,destinationPeg);
		
		//move last disk from sourcePeg to destinationPeg
		System.out.printf("\n%d --> %d", sourcePeg,destinationPeg);
		
		//move (disks-1) from tempPeg to destinationpeg
		solveTowers(disks-1,tempPeg,destinationPeg,sourcePeg);
	}
	
	public static void main(String[] args){
		int startPeg = 1; //value 1 used to indicate startPeg in output
		int endPeg =3; // value 3 used to indicate endPeg in output
		int tempPeg=2; //value 2 use to indicate tempPeg int output
		
		int totalDisks =3; //number of disks
		
		//initial nonrecursive call: move all disks
		TowersOfHanoi.solveTowers(totalDisks, startPeg, endPeg, tempPeg);
	}
}
