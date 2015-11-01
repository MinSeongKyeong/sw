import java.io.*;

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
	    {
	       data+=(char)i;
	    }
	    FileWriter fw = new FileWriter(ofile);
	    
	    String[] studentData=data.split("\n");
	    Student[] std = new Student[studentData.length];
	
	    InputStreamReader sr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(sr);
		System.out.println("학번을 입력해주세요");
		String inputnum = br.readLine();
	
		for(i=0; i<std.length; i++){
	         std[i]=new Student();
	         String[] ss=studentData[i].split(" ");
	         std[i].studentnum=ss[0];
	         std[i].name=ss[1];
	         std[i].department=ss[2];
	         std[i].phonenum=ss[3];
	         
	         if(std[i].studentnum.equals(inputnum)){
	 			System.out.println("전화번호를 입력해주세요");
	 			String inputpnum = br.readLine();
	             std[i].phonenum=inputpnum; 
	 			System.out.println("Update 완료");
	          }
	 		 else{
	 			 System.out.println("입력하신 학번이 없습니다");
	 		 }
	         String st = std[i].studentnum+" "+std[i].name+" "+std[i].department+" "+std[i].phonenum;
	         fw.write(st+"\n");               
	      }
	      fw.close();
	      fr.close();
	     
		 }
}
