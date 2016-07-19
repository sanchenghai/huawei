package huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	/**
	 * 不对,排序的就不对：private static void trainOut
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] ss = new String[n];
            for (int i = 0; i < n; i++) {
                ss[i] = sc.next();
            }
            System.out.println(trainOut(ss));
        }
		sc.close();
	}
	
	private static String trainOut(String[] ss) {
      List<List<String>> result = new ArrayList<List<String>>();
      List<String> out = new ArrayList<String>(ss.length);
      List<String> unout = new ArrayList<String>(ss.length);
      trainOut(0, ss, out, unout, result);

      Collections.sort(result, new Comparator<List<String>>() {

          @Override
          public int compare(List<String> a, List<String> b) {

              int min = a.size() < b.size() ? a.size() : b.size();


              for (int i = 0; i < min; i++) {
                  String as = a.get(i);
                  String bs = b.get(i);
                  if (as.compareTo(bs) != 0) {
                      return as.compareTo(bs);
                  }
              }
              return a.size() - b.size();
          }
      });

      StringBuilder builder = new StringBuilder(256);
      System.out.println(result.size());
      System.out.println(result.toString());
      for (List<String> list : result) {
          StringBuilder b = new StringBuilder(64);
          for (String s : list) {
              b.append(s).append(' ');
          }
          b.setCharAt(b.length() - 1, '\n');

          builder.append(b);
      }
      System.out.println(builder.length());
      return builder.toString();
  }
	
	private static void trainOut(int i, String[] ss, List<String> out, List<String> unout, List<List<String>> result) {

        // 所有的火车已经进站
        if (i >= ss.length) {
            List<String> list = new ArrayList<String>();
            for (String s : out) {
                list.add(s);
            }

            // 先进后出
            for (int j = unout.size() - 1; j >= 0; j--) {
                list.add(unout.get(j));
            }

            result.add(list);

            return;
        }

        // 第i辆车进来就出去了
        out.add(ss[i]);
        trainOut(i + 1, ss, out, unout, result);
        // 还原
        out.remove(out.size() - 1);

        // 第i辆车进来没有出去
        unout.add(ss[i]);
        trainOut(i + 1, ss, out, unout, result);
        // 还原
        unout.remove(unout.size() - 1);
    }

}
