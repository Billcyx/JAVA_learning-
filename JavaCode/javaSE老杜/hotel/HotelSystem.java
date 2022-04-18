public class HotelSystem {
	private Room[][] rooms = new Room[3][10];

	private void initialization() {
		for(int floor=0;floor<rooms.length;floor++) {
			for(int num=0; num<rooms[floor].length;num++) {
				rooms[floor][num] =  new Room((floor+1)*100+ num, (floor==2)?"豪华":"普通", true);
			}
		}
	}

	public HotelSystem() {
		initialization();
	}

	public Room[][] getRoom() {
		return this.rooms;
	}

	public void getRoom(Room[][] rooms) {
		this.rooms = rooms;
	}

	public void order(int number) {
		int floor = (int) number/100;
		int index = floor -1;
		int num = number%100;

		if(rooms[index][num].getStatus()==false) {
			System.out.println("sorry, this room is not available, pls try again");
		}
		else {
			System.out.println("Congrats, your room is booked successfully.");
			rooms[index][num].setStatus(false); 
		}
		System.out.println();
	}

	public void cancel(int number) {
		int floor = (int) number/100;
		int index = floor - 1;
		int num = number%100;

		System.out.println("Congrats, your room is cancelled successfully.");
		System.out.println();
		rooms[index][num].setStatus(true); 
	}

	public void print() {

		String[][] info = new String[3][10];

		for(int floor=0;floor<rooms.length;floor++) {
			for(int num=0; num<rooms[floor].length;num++) {
				System.out.print(rooms[floor][num].getNumber() + " (" + rooms[floor][num].getType() 
					+ ", " + (rooms[floor][num].getStatus()==true?"空闲":"不空") + ")  ");
			}
		System.out.println('\n');
		}
	}

}