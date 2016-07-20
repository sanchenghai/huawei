package huawei;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
		public static void judge(String[] s, int n) {
			Node head = null;
			Node pre = null;
		 	for (int k = 0; k < s[0].length(); k++) {
		 		Node node = new Node(s[0].charAt(k) - '0');
		 		if (head == null) {
		 			head = node;
		 		} else {
		 			pre = head;
		 			while (true) {
		 				if (node.data < pre.data) {
		 					if (pre.l == null) {
		 						pre.l = node;
		 						break;
		 					} else {
		 						pre = pre.l;
		 					}
		 				} else if (node.data == pre.data) {
		 					break;
		 				} else {
		 					if (pre.r == null) {
		 						pre.r = node;
		 						break;
		 					} else {
		 						pre = pre.r;
		 					}
		 				}
		 			}
		 		}
		 	}
		 	for (int i = 1; i <= n; i++) {
		 		int cl = 0, cr = 0;// 记录左右 大于或者小于head的次数，就为左右查找比较的次数
		 		int cll = 0, crr = 0;
		 		int data = 0;
		 		int flag=0;
		 		if ( (s[i].charAt(0) - '0')!= head.data) {
		 			System.out.println("NO");
		 			continue;
		 		}
		 		for (int k = 0; k < s[i].length(); k++) {
		 			data = s[i].charAt(k) - '0';
		 			pre = head;
		 			if (data == head.data) {
		 				continue;
		 			} else if (data < head.data) {
		 				cl++;
		 			} else {
		 				cr++;
		 			}
		 			cll = cl;
		 			crr = cr;
		 			while (true) {
		 				if (data < head.data) {
		 					while (cll >= 0) {
		 						if (data == pre.data) {
		 							break;
		 						} else if (data < pre.data) {
		 							pre = pre.l;
		 						} else {
		 							pre = pre.r;
		 						}
		 						cll--;
		 					}
		 					if (cll < 0) {// NO
		 						flag=1;
		 					} 
		 					break;
		 				}
		 				if (data > head.data) {
		 					while (crr >= 0) {
		 						if (data == pre.data) {
		 							break;
		 						} else if (data > pre.data) {
		 							pre = pre.r;
		 						} else {
		 							pre = pre.l;
		 						}
		 						crr--;
		 					}
		 					if (crr < 0) {// NO
		 						flag=1;
		 					} 
		 					break;
		 				}
		 			}
		 		}//每一个串比较结束
		 		if(flag==0){
		 			System.out.println("YES");
		 		}else{
		 			System.out.println("NO");
		 		}
		 	}
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String s[] = new String[n + 1];
			int i = 0;
			while (i <= n) {
				s[i++] = sc.next();
			}
			judge(s, n);
		}
}
		
class Node {
	int data;
	Node l = null;
	Node r = null;
	Node(int data) {
		this.data = data;
	}
}
