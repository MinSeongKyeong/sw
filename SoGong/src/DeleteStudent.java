 import java.io.*; 

 public class DeleteStudent { 
	 
      public void deleteStudent() {

             String strLine = "0"; 
             String dummy = ""; 
			 String delete;

			 BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
			 

             try { 
                     
                    BufferedReader fileReader = new BufferedReader(new FileReader(new File("studentlist.txt"))); 

                    int studentCount = 0;

					System.out.print("Delete할 학생의 인적사항을 입력하세요 : ");
					delete = input.readLine();
					

                    while ((strLine = fileReader.readLine()) != null) { 

                           if(!strLine.contains(delete)) { 

                              dummy += strLine + "\r\n"; 

                           } 

						   studentCount++; 

                    }                      

					//System.out.println("\n"+dummy);
                    FileWriter filewriter = new FileWriter(new File("studentlist.txt")); 
                    
					filewriter.write(dummy); 
				    System.out.println("\n Delete 완료");

                    filewriter.flush(); 

                    filewriter.close(); 
					fileReader.close();

                } catch (IOException ioe) { 

                    ioe.printStackTrace(); 

				 } 

               
				
      } 

 } 

