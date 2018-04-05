package org.ataro.tasks;

public class StartPoint {

	public static void main(String[] args) {
		
		int[] array = {5, 8, 11, 2, 3};
		boobleSort(array);
	}
	
	public static void boobleSort(int[] m){
		
		int repeat = 0;
		boolean zamina = true;
		while(zamina){
			zamina = false;
			for(int i = 0; i < m.length-1-repeat; i++)
			{
				if(m[i] > m[i+1])
				{
					int tmp = m[i];
					m[i] = m[i+1];
					m[i+1] = tmp;
					zamina = true;
					
				}
			} 
			repeat++;
		}
		for(int i: m)
			System.out.print(i + " ");
	}

}
