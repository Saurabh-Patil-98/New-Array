package som.sort;

import java.util.Comparator;
// Normal
public class EmpId implements Comparator {
	public int compare(Object o1, Object o2) {
		int flag = 0;
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;
		if (e1.empId == e2.empId) {
			flag = 0;
		}
		else if (e1.empId < e2.empId) {
			flag = -1;
		}
		else if (e1.empId > e2.empId) {
			flag = 1;
		}
		return flag;
	}
}

// Generic
/*public class EmpId implements Comparator<Emp> {
	public int compare(Object o1, Object o2) {
		int flag = 0;
		if (e1.empId == e2.empId) {
			flag = 0;
		}
		else if (e1.empId < e2.empId) {
			flag = -1;
		}
		else if (e1.empId > e2.empId) {
			flag = 1;
		}
		return flag;
	}
}
 */
