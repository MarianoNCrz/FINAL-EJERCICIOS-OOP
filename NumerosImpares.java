
public class NumerosImpares {
		public static long numim(int x){
		if(x>=0)
			return (x+(x+1));
			return (1);
		}
			public static void main(String[] args) {
				int k;
				for(k=0;k<10;k++)
				System.out.println("Los numeros impares menores que 20 son: "+numim(k));
			}
}
