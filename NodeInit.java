package tvb11;

import java.io.IOException;


public class NodeInit {
	public static void main(String [] args) throws IOException {
		
		Readio rio = new Readio();
		
		Nodearray dectree = new Nodearray();
		
		System.out.println("\n[ NODE DECISIONTREE ]\n");
		
		dectree.IndexNodes();
		Node currNode = dectree.FirstQuestion();
		Node nextNode = null;
		boolean answered = false;
		
		for(int ii=0;answered==false;ii++) {
			
			System.out.println(currNode.name + " - " + currNode.text);
			System.out.println("Mogelijke antwoorden: " + currNode.nexttexts);
			String answer = rio.scan();
			
			if(currNode.nexttexts.contains(answer)) {
				int currindex = currNode.nexttexts.indexOf(answer);
				String nextNodeString = currNode.nextnodes.get(currindex);
				
				
				
				for(int i=0;i<dectree.nodes.size();i++) {
					if(dectree.nodes.get(i).name.equals(nextNodeString)) {
						nextNode = dectree.nodes.get(i);
						break;
					}
				}
			} else {
				System.out.println("Dat is geen geldig antwoord. Probeer het nog eens.");
				continue;
			}
			currNode = nextNode;
			
			if(nextNode.nextnodes.size()==0) {
				answered = true;
				System.out.println("Het blad is een " + nextNode.text);
			}
			
		}
		
		
		
		//System.out.println(nextNode.name);
	}
	
	
	
}
