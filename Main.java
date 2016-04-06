import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(9);
		lista.add(179);
		lista.add(139);
		lista.add(38);
		lista.add(10);
		lista.add(5);
		lista.add(36);
		
		lista.add(46);
		lista.add(56);
		lista.add(76);
		lista.add(86);
		lista.add(33);
		lista.add(39);
		lista.add(46);
		lista.add(69);
		lista.add(11);
		sorteaza(lista);

	}

	private static void sorteaza(ArrayList<Integer> lista) {
		Integer[] vector = new Integer[256];
		
		for (int i=0; i<256; i++){
			vector[i]= 0;
		}
		
		for (int i = 0; i< lista.size(); i++){
			vector[lista.get(i)] +=1;
		}
		
		for (int i= 0; i< 256; i++){
			for (int j=0; j<vector[i]; j++){
				System.out.print(i + " ");
			}
		}
		
		
	}

}
