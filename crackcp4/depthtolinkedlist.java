import java.util.LinkedList;
import java.util.ArrayList;

public class depthtolinkedlist{
	public static void main(String[] args){
		ArrayList<LinkedList<Integer>> listoflist = new ArrayList<LinkedList<Integer>>();
		//LinkedList<Integer> list = new LinkedList<Integer>();

		BSTree tree = new BSTree();
		tree.insert(5);
		tree.insert(2);
		tree.insert(7);
		tree.insert(3);
		tree.insert(1);
		tree.insert(9);

		int height = tree.getHeight();

		int i = 0;
		while(i < height) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			listoflist.add(list);
			i++;
		}
		
		tree.createList(listoflist,0);

		
		for(int a = 0; a < height; a++){
			System.out.print("The ");
			System.out.print(a);
			System.out.print("th list is: ");
			for(int j = 0; j < listoflist.get(a).size();j++){
				System.out.print(listoflist.get(a).get(j));
				System.out.print(" ");}
			System.out.println();
		}
	}
}