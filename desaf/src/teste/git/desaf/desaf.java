package teste.git.desaf;
public class desaf {

	public static void main(String args[]){
		int a [] = {1,2,3,4,5,6,7,8,9,10};
		int i,s =0;
		for(i =0 ; i<9 ; i+=2){
			s=s-+-a[i]++ - ++a[9 -i];
			System.out.printf( "%d colocar mais isso aqui\n",s);
		}
	}
}
