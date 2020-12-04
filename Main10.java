package datastructure;

import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Main10 {
	public static void main(String[] args) {
		
		
		Queue4 qu4 = new Queue4();
		qu4.print();
		qu4.peek();
		qu4.enqueue(5);
		qu4.enqueue(15);
		qu4.enqueue(500);
		qu4.enqueue(13);
		qu4.enqueue(5000);
		System.out.println("Top element is: " + qu4.peek());
		qu4.dequeue();
		qu4.dequeue();
		System.out.println("Nodes in queue: ");
		qu4.print();

		String str = "cbghjklerpoaqw";

		// str iin urt iig n gevel
		// time complexity?
		// O(n * n)
		// O(n * k)

		int n = str.length();
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					System.out.println(str.charAt(i));
					flag = true;
					break;
				}
			}
			// ?
			if (flag)
				break;
		}

		// ?

		// importante
		System.out.println("importante~");

		// Hurdan?
		// a~z
		// time complexity?
		// String iin urt iig n gey. O(n) ~ O(tmp.length)
		// Insertion time complexity O(1) - togtmol shuud index r handaj bga uchiraas

		String tmp = "abcdba";
		int[] alphabetHash = new int[26];

//		for (int i = 0; i < tmp.length(); i++) {
//			if (alphabetHash[str.charAt(i) - 'a'] == 0) {
//				alphabetHash[str.charAt(i) - 'a'] = 1;
//			}
//			else {
//				System.out.println("first repeated character found: " + tmp.charAt(i));
//				break;
//			}
//		}

		// yg if condition ni deed taliinh tai barag adilhan
		// Java hashmap complexity ni O logn

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < tmp.length(); i++) {
			if (!map.containsKey(tmp.charAt(i))) {
				map.put(tmp.charAt(i), 1);
			} else {
				System.out.println("first repeated character found: " + tmp.charAt(i));
				break;
			}

		}

	}

	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) return false;
		HashMap<Character, Character> mapp = new HashMap<Character, Character>();
		
		for (int i = 0; i < s.length(); i++) {
			if (!mapp.containsKey(s.charAt(i))) {
				mapp.put(s.charAt(i), t.charAt(i));
			}
		}
		
		String tmp = "";
		for (int i = 0; i < s.length(); i++) {
            if (mapp.containsKey(s.charAt(i)))
			tmp += mapp.get(s.charAt(i));
			
		}
        System.out.println(tmp);
		if (tmp.equals(t)) return true;
		
		
		return false;
	}

}
