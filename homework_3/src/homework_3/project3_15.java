package homework_3;
import java.util.Scanner;

public class project3_15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int lottery = (int)(Math.random()*1000);//����һ����λ���������
		System.out.println("��²�һ����λ����������");
		int guessNumber = input.nextInt();
		if(lottery==guessNumber) {
			System.out.println("�н�10000Ԫ��");//������ͬ��˳����ͬ
		}
		else if(lottery!=guessNumber){
			int flag = 0;
			
			int num_1 = lottery % 10;
			int num_2 = lottery / 10 % 10;
			int num_3 = lottery / 10 / 10 % 10;
			
			int numA = guessNumber % 10;
			int numB = guessNumber / 10 % 10;
			int numC= guessNumber / 10 / 10 % 10;
		
			if((num_1==numA && num_2==numB && num_3==numC) || 
			   (num_1==numA && num_2==numC && num_3==numB) ||
			   (num_1==numB && num_2==numC && num_3==numA) ||
			   (num_1==numB && num_2==numA && num_3==numC) ||
			   (num_1==numC && num_2==numA && num_3==numB) ||
			   (num_1==numC && num_2==numB && num_3==numA)) {
				System.out.println("�н�1000Ԫ��");
				flag = 1;
			}
			else if(flag==0){
				int [] lst_1= {num_1, num_2, num_3};
				int [] lst_A = {numA, numB, numC};
				for(int i=0; i<3; i++) {
					for(int j=0; j<3; j++) {
						if(lst_1[i]==lst_A[j]) {
							System.out.println("�н�3000Ԫ��");//������һλ��ͬ����
							break;
							}
					}
				}
			}
			
		}
		else
			System.out.println("û���н���");
	}
}
//Ϊʲô�����Ҳ����		
		
	
				

			
//			else {
//				for(int i_1=0; i_1<3; i_1++) {
//					for(int j_1=0; j_1<3; j_1++) {
//						if(lst_1[i_1]==lst_A[j_1]) {
//							int a ,b;
//							a=lst_1[0]; lst_1[0]=lst_1[i_1];lst_1[i_1]=a;
//							b=lst_A[0]; lst_A[0]=lst_A[j_1];lst_A[j_1]=b;
//							break;
//								}
//							}
//						}
//						if((lst_1[1]==lst_A[1] && lst_1[2]==lst_A[2]) ||
//								(lst_1[2]==lst_A[1] && lst_1[1]==lst_A[2]));	
//								{//��������һ��
////								break;
//							}
//						System.out.println("�н�1000Ԫ��");
//						break;
//				}
//			}
//		}
//	}
