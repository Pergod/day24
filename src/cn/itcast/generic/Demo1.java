package cn.itcast.generic;

public class Demo1 {

	
	//��дһ�����η���������һ���������飬���ߵ������е�����Ԫ�ء�
	public <T> void reverse(T arr[]){
		
		int startindex = 0;
		int endindex = arr.length-1;
		
		while(true){
		
			if(startindex>=endindex){
				break;
			}
			
			T temp = arr[startindex];
			arr[startindex] = arr[endindex];
			arr[endindex] = temp;
			startindex++;
			endindex--;
		}
		
	}
}
