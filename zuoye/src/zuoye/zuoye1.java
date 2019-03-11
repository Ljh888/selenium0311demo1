package zuoye;

import java.util.Scanner;

public class zuoye1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<10;i++){
			System.out.println("请输入第"+(i+1)+"个数：");
		array[i]=input.nextInt();
		}	
		sort(array);
		for(int n=0;n<10;n++){
			System.out.println("第"+(n+1)+"个数="+array[n]);
		}
	}
		public static void sort(int [] arr)
		{
			int temp=0;
			for (int i=0;i<10;i++){
				for (int j=0;j<10;j++){
					if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				}
			}
				
		}
}
