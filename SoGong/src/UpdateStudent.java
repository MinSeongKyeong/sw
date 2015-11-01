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
	public void UpdateStudent() throws Exception {

	File ofile = new File("studentlist.txt");
    FileReader fr = new FileReader(ofile);
    
    
    String data="";
    int i=0;
    
    while((i=fr.read())!=-1){// 파일을 EOF 까지 읽기
       data+=(char)i;
    }
    String[] studentData=data.split("\n");
    Student[] std = new Student[studentData.length];
	}
}
