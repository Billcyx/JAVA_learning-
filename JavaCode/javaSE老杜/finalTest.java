public class finalTest {
	public static void main(String[] args) {
		student a = new student(10);
		System.out.println(a.getNumber());
		student b = new student(20);
		System.out.println(b.getNumber());
	}
}

class student {
	final int number;
	public student(int number) {
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}
}