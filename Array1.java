import java.util.Arrays;
class Array1 {
	public static void main (String a[]){
		int i; 
		int [] ia; ia = new int[21];
		
			ia[0] = -1;
			ia[1] = 0;
			ia[2] = -1;
			ia[3] = 1;
			ia[4] = 0;
			ia[5] = 1;
			ia[6] = -1;
			ia[7] = 1;
			ia[8] = -1;
			ia[9] = 0;
			
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
