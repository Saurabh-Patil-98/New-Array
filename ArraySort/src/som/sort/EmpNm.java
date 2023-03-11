package som.sort;

import java.util.Comparator;
// Normal
/*public class EmpNm implements Comparator {
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;
		
		return e1.empNm.compareTo(e2.empNm);
	}
}*/


// Generic

public class EmpNm implements Comparator<Emp> {
	public int compare(Emp e1, Emp e2) {
		return e1.empNm.compareTo(e2.empNm);
	}
}
 
 