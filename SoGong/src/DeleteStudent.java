 import java.io.*; 

 public class DeleteStudent { 
    
      public void deleteStudent() {

             String stringLine = "0"; 
             String remain = ""; 
          String delete;

          BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
          

             try { 
                     
                    BufferedReader fileReader = new BufferedReader(new FileReader(new File("studentlist.txt"))); 

               System.out.print("Delete할 학생의 학번을 입력하세요 : ");
               delete = input.readLine();
               

                    while ((stringLine = fileReader.readLine()) != null) { 

                           if(!stringLine.contains(delete)) { 

                              remain += stringLine + "\r\n"; 

                           } 

                    }                      

               FileWriter filewriter = new FileWriter(new File("studentlist.txt")); 
                    
               filewriter.write(remain); 

               System.out.println("Delete 완료.");

                    filewriter.flush(); 

                    filewriter.close(); 

                    fileReader.close(); 


                } catch (IOException ioe) { 

                    ioe.printStackTrace(); 

             } 

               
            
      } 

 } 
