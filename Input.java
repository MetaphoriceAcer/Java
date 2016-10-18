class Input{
	public static void main(String a[]){
		String input1, input2, input3, input4, input5;
		int ai, bi, ci, di, ei;
		int sum, diff, pro, div;
		ai = Integer.parseInt (a[0]);
		bi = Integer.parseInt (a[1]);
		ci = Integer.parseInt (a[2]);
		di = Integer.parseInt (a[3]);
		ei = Integer.parseInt (a[4]);
		
		System.out.print(ai+" ");
		System.out.print(bi+" ");
		System.out.print(ci+" ");
		System.out.print(di+" ");
		System.out.print(ei+"/n");
		sum = ai + bi + ci + di + ei;
		diff = -(ai) - bi - ci - di - ei;
		pro = ai * bi * ci * di * ei;
		div = ai /bi / ci / di / ei;
		
		System.out.println("sum= "+sum);
		System.out.println("diff= "+diff);
		System.out.println("pro="+pro);
		System.out.println("div= "+div);
		System.out.println("/n");
		}

}