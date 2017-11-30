package gui;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
public class Tree {
	
	//Integer[] nums={2,4,1,6,3,7,9,5};
    public SortedSet<Integer> tree;
    
	public Tree(Integer [] Courses) {
		this.tree = new TreeSet<>(Arrays.asList(Courses));
	}

	public Integer first() {
		return this.tree.first();
	}
	
	public Boolean Find(Integer Course) {
		return this.tree.contains(Course);
	}
	
	
}
