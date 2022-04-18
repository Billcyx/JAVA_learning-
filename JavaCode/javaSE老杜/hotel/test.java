/*
1. static是和类有关的，也就是说，不同的对象的共同特点设置为static
2. 方法后面一定要加括号
3. 创造array of objects的方法：  Object[i][j] = new Object(里面放构造参数);
4. int[][] a = new int[3][5] 指的是创造一个有三行，五列的array，不是代表index最大是3

*/
import java.util.Scanner; 

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HotelSystem system = new HotelSystem();


		System.out.println("欢迎来到玉溪酒店，请输入指令：[1]：看房间清单 [2]：预定房间 [3]：退房间 ");

		while(true) {
			int instruction = scanner.nextInt();
			if (instruction == 1) {
				system.print();
				System.out.println("请再次输入指令：[1]：看房间清单 [2]：预定房间 [3]：退房间 "); 
			}
			else if(instruction == 2) {
					System.out.println("请输入想要预定的房间号");
					int num = scanner.nextInt();
					system.order(num);
					System.out.println("请再次输入指令：[1]：看房间清单 [2]：预定房间 [3]：退房间 ");
				}
			else {
				System.out.println("请输入想要取消的房间号");
				int num = scanner.nextInt();
				system.cancel(num);
				System.out.println("请再次输入指令：[1]：看房间清单 [2]：预定房间 [3]：退房间 ");
			}
		}
	}
}	
