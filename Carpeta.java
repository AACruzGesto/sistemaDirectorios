package fileSystem;

import java.util.*;

import prettyPrint.TreeNode;

public class Carpeta extends Elemento implements TreeNode {
	private List<Elemento> elementos = new ArrayList<>();

	public Folder(String name) {
		super(name);
	}
	@Override
	public int size() {
		int acum = 0;
		for (Elemento e : this.elementos ) 
			acum += e.size();
		return acum;
	}
	
	@Override public String toString() {
		return super.toString()+" with elements: "+this.elementos;
	}
	
	public Folder add(Elemento e) {
		if (this.canAdd(e))
			this.elementos.add(e);
		return this;
	}
	
	private boolean canAdd(Elemento e) {
		return !this.contains(e) && !e.contains(this);
	}
	
	public boolean contains(Elemento e) {
		if (this==e) return true;
		for (Elemento elem: this.elementos)
			if (elem.contains(e)) return true;
		return false;
	}
	
	@Override
	public List<TreeNode> getChildren() {
		return new ArrayList<TreeNode>(this.elementos);
	}

}
