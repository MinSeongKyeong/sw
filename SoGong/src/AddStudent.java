import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddStudent {
	 public void addStudent()throws IOException{ 

	 Scanner scan = new Scanner(System.in);
     String fpath = "C:" + "studentlist.txt";
         
     try {
         PrintWriter out = new PrintWriter(new FileWriter(fpath, true));
	 System.out.println("�л������� ����մϴ�.");
     System.out.println("�й� �̸� �а� ��ȭ��ȣ ������ �����ּ���. ");
     System.out.println("�й�	�̸�	 �а�	 ��ȭ��ȣ ");
     String str = scan.nextLine();
	   out.println(str);

	   scan.close();
	   out.close();

     } catch (Exception e) {

    	 if(e instanceof IOException) System.out.println("Input & Out Error ");
    	 else System.out.println("Etc Error " + e.toString());
     } 	

	 } 
}