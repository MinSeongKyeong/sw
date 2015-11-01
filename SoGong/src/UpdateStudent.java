import java.io.*;
import javax.swing.*;

class Student
{
   String studentnum;
   String name;
   String department;
   String phonenum;
}

public class UpdateStudent{
	
	public void updateStudent() throws Exception {

		File ofile = new File("studentlist.txt");
	    FileReader fr = new FileReader(ofile);
	    	    
	    String data="";
	    int i=0;
	    
	    while((i=fr.read())!=-1)
	    {// ������ EOF ���� �б�
	       data+=(char)i;
	    }
	   
	    String[] studentData=data.split("\n");
	    Student[] std = new Student[studentData.length];
	    
	    for(i=0; i<std.length; i++){
	        std[i]=new Student();
	        String[] ss=studentData[i].split(" ");
	        std[i].studentnum=ss[0];
	        std[i].name=ss[1];
	        std[i].department=ss[2];
	        std[i].phonenum=ss[3];
	        String st = std[i].studentnum+" "+std[i].name+" "+std[i].department+" "+std[i].phonenum;
			System.out.println(st);                 
	     }
	    fr.close();
	}
}
