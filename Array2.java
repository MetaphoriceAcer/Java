import java.util.Arrays;
class Array2 {
	public static void main (String a[]){
		int i; 
		int [] ia; ia = new int[21];
		
			ia[1] = 5;
			ia[2] = 3;
			ia[3] = -1;
			ia[4] = 1;
			ia[5] = -8;
			ia[6] = 9;
			ia[7] = 4;
			ia[8] = -7;
			ia[9] = -2;
			ia[10] = 7;
			ia[11] = 6;
			ia[12] = -3;
			ia[13] = 9;
			ia[14] = -9;
			ia[15] = -6;
			ia[16] = 0;
			ia[17] = 8;
			ia[18] = -5;
			ia[19] = 10;
			
			
			System.out.println("array unsorted\n");
			for (i = 0; i <=19; i++){
				System.out.print(ia[i]+" ");
			}
			System.out.print("\nArray sorted\n");
			Arrays.sort(ia);
			for (i = 0; i <=19;i++){
				System.out.print(ia[i]+" ");
			}
			System.out.println();
	}
}
