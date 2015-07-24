import java.util.ArrayList;

public class arraytobst{

	static void create(BSTree tree, ArrayList<Integer> array, int begin, int end){
			if(end<begin) return;
			tree.insert(array.get((begin+end)/2));
		
			create(tree,array,begin,(end+begin)/2-1);
			create(tree,array,(end+begin)/2+1,end);
	}


	public static void main(String[] args){

		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);		

		System.out.println(array.size());



		BSTree tree = new BSTree();
		create(tree,array,0,array.size()-1);
		tree.print();
	}
}