package tvb11;

import java.util.ArrayList;

public class Node {
	String name = null; // N4
	String text = null; // Is de rand glad of gaaf?
	ArrayList<String> nexttexts = new ArrayList<String>(); // Ja, Nee
	ArrayList<String> nextnodes = new ArrayList<String>(); // N5, N8
	
	public Node (String newname) {
		name = newname;
	}
	
	public void setText (String newtext) {
		text = newtext;
	}
	
	public void addNext (String newnxt) {
		nextnodes.add(newnxt);
	}
	
	public void addNextText (String newnexttext) {
		nexttexts.add(newnexttext);
	}
	
}