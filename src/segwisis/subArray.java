package segwisis;

public class subArray {
	int sum(int[] arr) 
	{
		
		for (int i = 0; i <=0; i++) {
			int[] arr1=new int[1];
			int[] arr2=new int[arr.length];
			for (int j = 0; j < arr.length; j++) {
				arr1[0]=arr[j];
				arr2[j]=arr1[0];
			}
//			for (int j : arr2) {
//				System.out.println(j);
//			}
			System.out.println(arr2[3 ]);
		}
		return 0;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
//		System.out.println(arr.length);
		subArray s= new subArray();
		s.sum(arr);
	}

}
