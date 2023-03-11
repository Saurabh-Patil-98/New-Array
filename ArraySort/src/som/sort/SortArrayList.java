package som.sort;

import java.util.ArrayList;

import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(3, "Jaital"));
		al.add(new Emp(2, "Patil"));
		al.add(new Emp(1, "Saurabh"));
		al.add(new Emp(5, "Maharashtra"));
		al.add(new Emp(4, "Kolhapur"));
		System.out.println("Sorting by Id ");

		Collections.sort(al, new EmpId());
		for (Emp e : al) {
			System.out.println(e.empId + "-" + e.empNm);
		}
		System.out.println("--------------");
		System.out.println("Sorting by name ");

		Collections.sort(al, new EmpNm());
		for (Emp e : al) {
			System.out.println(e.empId + "-" + e.empNm);
		}
	}
}
