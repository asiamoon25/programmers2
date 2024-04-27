package sail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Choice {
    public static String solution(int a3 , String[][] a4) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            Deque<int[]> q = new LinkedList<>();
            Deque<int[]> q2 = new LinkedList<>();
            String nStr = br.readLine();
            int n = Integer.parseInt(nStr);
            for(int i = 0; i < n; i++){
                String[] a = br.readLine().split(" ");
                int quality = Integer.parseInt(a[0]);
                int price = Integer.parseInt(a[1]);
                q.add(new int[]{quality,price});
                q2.add(new int[]{quality, price});
            }


            List<Integer> result = new ArrayList<>();
            List<Integer> result2 = new ArrayList<>();
            for(int k = 0; k < 2; k++){
                int[] a = q.poll();
                int[] a2 = q2.poll();
                if(!q.isEmpty()) {
                    for(int i = 0; i < q.size(); i++){
                        int[] b = q.poll();

                        if(a[0] == b[0]) {
                            if(a[1] < b[1]) {
                                q.addLast(b);
                            }else if(a[1] > b[1]) {
                                q.addLast(a);
                                a = b;
                            }
                        }

                        if(a[0] < b[0]) {
                            q.addLast(a);
                            a = b;
                        }else if(a[0] > b[0]) {
                            q.addLast(b);
                        }
                    }
                }
                result.add(a[0]);
                result.add(a[1]);

                if(!q2.isEmpty()){
                    for(int i = 0; i < q2.size(); i++){
                        int[] b = q2.poll();

                        if(a2[1] == b[1]) {
                            if(a2[0] < b[0]) {
                                q2.addLast(a2);
                                a2 = b;
                            }else if(a2[0] > b[0]) {
                                q2.addLast(b);
                            }
                        }

                        if(a2[1] < b[1]) {
                            q2.addLast(b);
                        }else if(a2[1] > b[1]) {
                            q2.addLast(a2);
                            a2 = b;
                        }
                    }
                }
                result2.add(a2[0]);
                result2.add(a2[1]);

            }

            String resultStr = "";
            for(int i = 0; i < result.size(); i++){
                resultStr += result.get(i)+" ";
            }
            resultStr += "\n";
            for(int i = 0; i < result2.size(); i++){
                resultStr += result2.get(i)+" ";
            }
            System.out.println(resultStr);
        }catch(Exception e){
            e.printStackTrace();
        }


        return "";
    }

    public static void main(String[] args) {
        int n = 4;
        String[][] arr = new String[][]{{"3","1"},{"2","2"},{"2","3"},{"1","1"}};
        solution(n, arr);
    }
}
