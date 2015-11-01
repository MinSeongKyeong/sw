import java.io.*; 

public class Main
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		
		wh:while(true){
			
			System.out.println();
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("占쌥♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬�占�");
			System.out.println("占쌥♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬�占�");
			System.out.println("占쌥�占�                                                  占쌥�占�");
			System.out.println("占쌥�占�        占싻삼옙  占쏙옙占쏙옙 占쏙옙占싸그뤄옙                       占쌥�占�");
			System.out.println("占쌥�占�                                                  占쌥�占�");
			System.out.println("占쌥�占�        1)  占싻삼옙 占쏙옙占�                             占쌥�占�");
			System.out.println("占쌥�占�        2)  占싻삼옙 占싯삼옙                             占쌥�占�");
			System.out.println("占쌥�占�        3)  占싻삼옙 占쏙옙占쏙옙                             占쌥�占�");
			System.out.println("占쌥�占�        4)  占싻삼옙 占쏙옙占� 占쏙옙占쏙옙                        占쌥�占�");
			System.out.println("占쌥�占�        5)  占쏙옙占싸그뤄옙 占쏙옙占쏙옙                         占쌥�占�");
			System.out.println("占쌥�占�                                                  占쌥�占�");
			System.out.println("占쌥♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬�占�");
			System.out.println("占쌥♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬�占�");
			System.out.println();
			System.out.print("占쌨댐옙占쏙옙 占쏙옙占쏙옙占싹쇽옙占쏙옙.(1~5) ");

			try{
				switch(Integer.parseInt(in.readLine())){
					case 1 : // 占싻삼옙 占쏙옙占�
						
						AddStudent add = new AddStudent();
						add.addStudent();

						break;

					case 2 : // 占싻삼옙 占싯삼옙
					
						ViewStudent view= new ViewStudent(); 
						view.viewStudent();

						break;

					case 3 : // 占싻삼옙 占쏙옙占쏙옙

					case 4 : // 占싻삼옙 占쏙옙占쏙옙 占쏙옙占쏙옙
						
						UpdateStudent update = new UpdateStudent();
						update.updateStudent();
						
						break;

					case 5: // 占쏙옙占쏙옙

					default : // 1~5 占싱울옙占쏙옙 占쏙옙占쏙옙 占쌉력듸옙 占쏙옙

						System.out.println();
						System.out.println("占쌨댐옙占쏙옙 占쌕쏙옙 占쏙옙占쏙옙占싹쇽옙占쏙옙");
						Thread.sleep(1000);
						continue;
				} 

			} catch (IOException ioe) { 

                    ioe.printStackTrace(); 
				

			} 
		}
	

	}
}
