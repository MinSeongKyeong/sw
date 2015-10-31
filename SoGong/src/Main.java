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
			System.out.println("�ݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢ�");
			System.out.println("�ݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢ�");
			System.out.println("�ݢ�                                                  �ݢ�");
			System.out.println("�ݢ�        �л�  ���� ���α׷�                       �ݢ�");
			System.out.println("�ݢ�                                                  �ݢ�");
			System.out.println("�ݢ�        1)  �л� ���                             �ݢ�");
			System.out.println("�ݢ�        2)  �л� �˻�                             �ݢ�");
			System.out.println("�ݢ�        3)  �л� ����                             �ݢ�");
			System.out.println("�ݢ�        4)  �л� ��� ����                        �ݢ�");
			System.out.println("�ݢ�        5)  ���α׷� ����                         �ݢ�");
			System.out.println("�ݢ�                                                  �ݢ�");
			System.out.println("�ݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢ�");
			System.out.println("�ݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢݢ�");
			System.out.println();
			System.out.print("�޴��� �����ϼ���.(1~5) ");

		}
		try{
			switch(Integer.parseInt(in.readLine())){
				case 1 : // 학생 등록


				case 2 : // 학생 검색
				
					ViewStudent view= new ViewStudent(); 
					view.viewStudent();

					break;

				case 3 : // 학생 삭제

				case 4 : // 학생 정보 수정

				case 5: // 종료

					System.out.print("시스템이 종료 됩니다.  ");
					break wh;

				default : // 1~5 이외의 것이 입력될 때

					System.out.println();
					System.out.println("메뉴를 다시 선택하세요");
					Thread.sleep(1000);
					continue;
			} 
		}
	}
	


