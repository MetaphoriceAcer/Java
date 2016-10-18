class Cwrite {
	public static void main (String args[]){
	int i, j, n = 0;
	int adjust = 32;
	char c; 
		for (i = 0; i<20000; i++){
			for(j = 0; j<80; j++){
			c = (char) (n+adjust);
			n++;
			System.out.print(c);
			}
			n = 0;
			System.out.println();
		}
	}
}