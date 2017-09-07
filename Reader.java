package tvb11;

import java.io.*;
import java.util.ArrayList;

public class Reader {
	
	public static ArrayList<Node> Read(String filelocation) throws IOException {
		ArrayList<Node> dectree = new ArrayList<Node>();
		ArrayList<String> nodearr = new ArrayList<String>();
		
		try {
			System.out.println("Reading nodefile.\n");
			File myFile = new File(filelocation);
			FileInputStream fileReader = new FileInputStream(myFile);
			InputStreamReader blurt =  new InputStreamReader(fileReader, "UTF-8");
			BufferedReader reader = new BufferedReader(blurt);
			String line = null;
			
			while ((line = reader.readLine()) != null) {
							
				int indX = line.indexOf(',');
				String name = line.substring(0,indX);
				boolean ended = false;
				String next = null;
				String text = null;
				
				int nodeindex = 0;
				if(!nodearr.contains(name)) { 
					nodearr.add(name);
					Node newNode = new Node(name);
					dectree.add(newNode);
				} 
				nodeindex = nodearr.indexOf(name); 
				
				for(int i=0;ended==false;i++) {
					try {
					int indY = line.indexOf(',', indX+1);
					next = line.substring(indX+2, indY);
					indX = indY;
					} catch (StringIndexOutOfBoundsException e) {
						text = line.substring(indX+2, line.length());
						ended = true;
					}
				}
				if((next==null)){
					dectree.get(nodeindex).setText(text);
					
				} else {
					dectree.get(nodeindex).addNext(next);
					dectree.get(nodeindex).addNextText(text);
				}
			}
			reader.close();
		} catch (Exception ex){
			ex.printStackTrace();
		}
		return dectree;
	}
}
