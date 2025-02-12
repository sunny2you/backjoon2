import java.util.*;
import java.io.*;

public class Main6 {
    //ATM. 11399
    /*
     * 첫째 줄 5
     * 둘째줄 3 1 4 3 2
     * 가 주어졌을 때, 합을 최소로 만드는 방법
     * 맨 처음 3은 다섯번 더해지고, 맨 처음 2는 한번더해진다
     * 따라서 오름차순으로 정렬한뒤 각 수에 (전체-인덱스번호)를 곱하고 각 수를 더하면됨
    
     */


     public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());
        //다음 줄 읽어와서, StringTokenizer로 변환
        StringTokenizer st=new StringTokenizer(br.readLine());

        List<Integer> arr=new ArrayList<>();

        for(int i=0; i<N;i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);

        int res=0; //변수 선언할때 초깃값을 줘야 에러안남

        for(int i=0; i<N;i++){
            int num=arr.get(i);
            res+=num*(N-i);
        }

        System.out.print(res);
        
     }
}
