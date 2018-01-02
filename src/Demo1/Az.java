package Demo1;
import java.util.Scanner;
    public class Az {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner	sc=new Scanner(System.in);
	System.out.println("请输入一个数");
	int b=sc.nextInt();
	shuChu(b);
	}
	public static void shuChu(int a){
	for (int i = 0; i <= a; i++) {
	System.out.println(i);	
	}
	}

    }
