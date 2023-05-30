package quiz;

import java.util.HashMap;
import java.util.Scanner;

class test4{
	public HashMap<String, String> op(HashMap<String, String> m) {
		int n1 = Integer.parseInt(m.get("n1"));
		int n2 = Integer.parseInt(m.get("n2"));
		
		m.put("sum", n1+n2+"");
		return m;
	}
	public void pr(HashMap<String, String>m) {
		System.out.println(m.get("n1") + "+" + m.get("n2") + "= " + m.get("sum"));
		
	}
	public HashMap<String, String> in() {
		Scanner sc= new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		System.out.println("수입력: ");
		int num =sc.nextInt();
		int num1 = sc.nextInt();
		map.put("n1", num + "");
		map.put("n2", num1 + "");
		//map.put("n2", sc.next());
		return map;
		
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		test4 t = new test4();
		
		HashMap<String, String> m = t.in();
		m = t.op(m);
		t.pr(m);
	}
}
