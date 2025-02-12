import java.io.*;
import java.util.*;

public class Main9 {
    /** 
     수 찾기
     주어진 정수 배열 A 안에 정수 X가 존재하는지 빠르게 판별하는 문제이다. 
     N개의 정수를 입력받고, 이를 저장한다.
     M개의 정수를 입력받고, 각각 A에 존재하는지 판별한다.
     각 정수는 -2^31이상, 2^31 -1 이하의 범위를 가진다. 
     M개의 수에 대해 A에 존재하면 1, 존재하지 않으면 0 출력
     **/
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //N개의 숫자 입력받기
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>(); //중복을 허용하지 않으며 빠른 탐색을 위한 HashSet 사용

        //N개의 정수를 입력받아 HashSet에 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        //두 번째 숫자 M입력 (찾아야 할 숫자의 개수)
        int M=Integer.parseInt(br.readLine());
        
        //M개의 숫자가 A 안에 존재하는지 확인한다. 
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            if(set.contains(Integer.parseInt(st.nextToken()))){
                sb.append("1\n");
            }else{
                sb.append("0\n");
            }
        }

        System.out.println(sb);
        }





    }
    

