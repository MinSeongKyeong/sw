import java.io.*; 

public class Main
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
		
		while(true){
			
			System.out.println();
			System.out.println("\n");
			System.out.println("\n");
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
			System.out.println();
			System.out.print("�޴��� �����ϼ���.(1~5) ");

			try{
				switch(Integer.parseInt(in.readLine())){
					case 1 : // �л� ���


					case 2 : // �л� �˻�
					
						ViewStudent view= new ViewStudent(); 
						view.viewStudent();

						break;

					case 3 : // �л� ����

					case 4 : // �л� ���� ����

					case 5: // ����

					default : // 1~5 �̿��� ���� �Էµ� ��

						System.out.println();
						System.out.println("�޴��� �ٽ� �����ϼ���");
						Thread.sleep(1000);
						continue;
				} 

			} catch (IOException ioe) { 

                    ioe.printStackTrace(); 
				

			} 
		}
	

	}
}
