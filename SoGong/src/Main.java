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
			System.out.println("♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬");
			System.out.println("♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬");
			System.out.println("♬♬                                                  ♬♬");
			System.out.println("♬♬        학생  관리 프로그램                       ♬♬");
			System.out.println("♬♬                                                  ♬♬");
			System.out.println("♬♬        1)  학생 등록                             ♬♬");
			System.out.println("♬♬        2)  학생 검색                             ♬♬");
			System.out.println("♬♬        3)  학생 삭제                             ♬♬");
			System.out.println("♬♬        4)  학생 기록 수정                        ♬♬");
			System.out.println("♬♬        5)  프로그램 종료                         ♬♬");
			System.out.println("♬♬                                                  ♬♬");
			System.out.println("♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬");
			System.out.println("♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬♬");
			System.out.println();
			System.out.print("메뉴를 선택하세요.(1~5) ");

			try{
				switch(Integer.parseInt(in.readLine())){
					case 1 : // 학생 등록
						
						AddStudent add = new AddStudent();
						add.addStudent();

						break;

					case 2 : // 학생 검색
					
						ViewStudent view= new ViewStudent(); 
						view.viewStudent();

						break;

					case 3 : // 학생 삭제

					case 4 : // 학생 정보 수정

					case 5: // 종료

					default : // 1~5 이외의 것이 입력될 때

						System.out.println();
						System.out.println("메뉴를 다시 선택하세요");
						Thread.sleep(1000);
						continue;
				} 

			} catch (IOException ioe) { 

                    ioe.printStackTrace(); 
				

			} 
		}
	

	}
}
