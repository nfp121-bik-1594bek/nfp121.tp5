package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

	protected java.util.Vector<T> table = new java.util.Vector<T>();

	public int size() {
		return table.size();
	}

	public Iterator<T> iterator() {
		return table.iterator();
	}

	public boolean add(T t) {
		if (table == null){
			System.out.println("Table is null");
			return false;
		}else{
			if (table.contains(t)){
				System.out.println("Already exists");
				return false;
			}else {
				table.add(t);
				return true;
			}
			return false;
		}
	}

	public Ensemble<T> union(Ensemble<? extends T> e) {
		if (table ==  null || e == null){
			return null;
		}else{
			Ensemble ensemble = new Ensemble();
			ensemble.addAll(table);
			ensemble.addAll(e.table);
			return ensemble;
		}

	}

	public Ensemble<T> inter(Ensemble<? extends T> e) {
		if (table ==  null || e == null){
			return null;
		}else{
			Ensemble ensemble = new Ensemble();
			ensemble.addAll(table);
			ensemble.retainAll(e.table);
			return ensemble;
		}

	}

	public Ensemble<T> diff(Ensemble<? extends T> e) {
		if (table ==  null || e == null){
			return null;
		}else{
			Ensemble ensemble = new Ensemble();
			ensemble.addAll(table);
			ensemble.removeAll(e.table);
			return ensemble;
		}
	}

	Ensemble<T> diffSym(Ensemble<? extends T> e) {
		if (table ==  null || e == null){
			return null;
		}else{
			Ensemble unionEnsemble = this.union(e);
			Ensemble intersectionEnsemble = this.inter(e);

			return unionEnsemble.diff(intersectionEnsemble);

		}
	}
	
}
