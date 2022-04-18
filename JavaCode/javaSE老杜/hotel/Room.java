public class Room {
	private int number;
	private String type;
	private boolean status;

	public Room() { 

	}

	public Room(int number, String type, boolean status){
		this.number = number;
		this.type = type;
		this.status= status;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}