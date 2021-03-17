import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class M2_Nivell1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// FASE 1 ------------------------------------------------
		
		char [] nom = {'E','D','U','A','R','D'};	
		int i = 0;
		
		for (i=0;i<nom.length;i++) {
			
			System.out.print(nom[i]);			
		}
		
		System.out.println("");		
		System.out.println("");
		
// FASE 2 ------------------------------------------------		
		
		List<Character> nomlletres = new ArrayList<Character>();
		nomlletres.add('3');
		nomlletres.add('D');
		nomlletres.add('U');
		nomlletres.add('A');
		nomlletres.add('R');
		nomlletres.add('D');
		
		for (Character c: nomlletres) {	
			if (c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
				System.out.println(c + " És una vocal");
				
			} else {   
			if (c=='B' || c=='C' || c=='D' || c=='F' || c=='G' || c=='H' || c=='J' || c=='K' || c=='L' || c=='M' || c=='N' || c=='P' || c=='Q' || c=='R' || c=='S' || c=='T' || c=='V' || c=='W' || c=='X' || c=='Y' || c=='Z') {
				System.out.println(c + " És una consonant");			
			
			} else {   
			  	System.out.println(c + " Els noms de les persones no contenen números"); 		
			}
			}
		}	
		System.out.println("");

// FASE 3 -------------------------------------------------
		
		 Map<String, String> map = new HashMap<>();

	        map.put("1", "E");
	        map.put("2", "D");
	        map.put("3", "U");
	        map.put("4", "A");
	        map.put("5", "R");
	        map.put("6", "D");


	        HashMap<String, List<String>> lletra = new HashMap<>();

	        for (Map.Entry<String, String> entry : map.entrySet()) {
	            if (lletra.containsKey(entry.getValue())) {
	                lletra.get(entry.getValue()).add(entry.getKey());
	            } else {
	                List<String> keys = new ArrayList<>();
	                keys.add(entry.getKey());
	                lletra.put(entry.getValue(), keys);
	            }
	        }
	        for (Map.Entry<String, List<String>> counterEntry : lletra.entrySet()) {
	            if (counterEntry.getValue().size() > 1) {
	                System.out.println("Valor duplicat: " + counterEntry.getKey() + "  - Posició:" + counterEntry.getValue());
	            } else {
	            	 System.out.println("Valor NO duplicat: " + counterEntry.getKey() + " - Posició:" + counterEntry.getValue());
	            }
	        }
			System.out.println("");

// FASE 4 -------------------------------------------------	        
	    	List<Character> cognomlletres = new ArrayList<Character>();
			cognomlletres.add('S');
			cognomlletres.add('A');
			cognomlletres.add('M');
			cognomlletres.add('P');
			cognomlletres.add('I');
			cognomlletres.add('E');
			cognomlletres.add('T');	        
			cognomlletres.add('R');
			cognomlletres.add('O');
			
			List<Character> espai = new ArrayList<Character>();
			espai.add(' ');		
			
			
			List <Character> Fullname = new ArrayList<Character>();
			
			Fullname.addAll(nomlletres);
			Fullname.addAll(espai);
			Fullname.addAll(cognomlletres);
		
			System.out.print('[');
				for (Character d: Fullname) {	
					System.out.print("'"+ d +"'"+ ", "); 			
				}
			System.out.print(']');
			
	}

}
