
public class TestHouse {

	public TestHouse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House H = new House();
		H.setDoor("door");
		H.setFloor("floor");
		H.setRoof("roof");
		H.setWalls("walls");
		H.setWindows("windows");
		System.out.println("The house is made with "+H.getWalls()+", "+H.getRoof()+", "+H.getDoor()+", "+H.getFloor()+" and "+H.getWindows());
	}

}
