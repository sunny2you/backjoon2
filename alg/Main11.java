import java.util.*;
import java.io.*;
/*
 * 이 문제는 N개의 숫자를 오름차순으로 정렬하는 문제이다. 
 * 하지만, 일반적인 정렬 문제와는 달리 제약 조건을 잘 활용해야한다. 
 * 수의 개수가 최대 10.000.000 천만. 
 * 각 수는 10,000보다 작거나 같은 자연수이다. 
 * 일반적인 정렬 알고리즘을 사용하면 시간 초과 가능성이 있다. 
 * O(NlogN)이 아닌 O(N) 알고리즘을 선택해야한다. 
 *
 */
public class Main11 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());
        //계수 정렬을 위해서 하는거임. count[i]는 i에 해당하는 숫자의 개수이다. 
        int[] count = new int [10001]; //숫자의 범위가 1~10,000이므로 크기 10001배열 선언

        for(int i=0;i<N;i++){
            //i에 해당하는 숫자의 개수를 하나 증가시킴
            count[Integer.parseInt(br.readLine())]++; //해당 숫자의 개수를 1 증가 
        }

        for(int i=1;i<=10000;i++){
            while(count[i]>0){ //i가 존재하지 않을때까지
                bw.write(i+"\n"); //출력하고 줄바꿈
                count[i]--; //한번 출력했으면 뺀다. 
            }
        }

        bw.flush(); // 버퍼에 저장된 내용을 한 번에 출력
        br.close();
        bw.close();
    }
    
}
