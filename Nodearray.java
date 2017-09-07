package tvb11;

import java.io.IOException;
import java.util.ArrayList;

public class Nodearray {
	ArrayList<Node> nodes = new ArrayList<Node>();
	public Nodearray () {
	}
	
	public void IndexNodes () throws IOException {
		nodes = Reader.Read("\\decision-tree-data.txt");
	}
	
	public Node FirstQuestion () {

		ArrayList<String> firstquestion = new ArrayList<String>();
		for(Node currnode : nodes) {
			firstquestion.add(currnode.name);
		}

		for(int i=0;i<nodes.size();i++) {
			for(int j=0;j<nodes.get(i).nextnodes.size();j++) {
				String remove = nodes.get(i).nextnodes.get(j);
				if(firstquestion.contains(remove)){
					firstquestion.remove(remove);
				}
			}
		}
				
		int firstnodeindex = 0;
		for(firstnodeindex=0;firstnodeindex<nodes.size();firstnodeindex++) {
			if(nodes.get(firstnodeindex).name.equals(firstquestion.get(0))){
				break;
			}
		}
		
		Node FirstNode = nodes.get(firstnodeindex);
		
		return FirstNode;
	}
}
