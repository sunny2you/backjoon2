import java.io.*;
import java.util.*;

/*
2차원 평면 위의 N개의 점을 정렬하는 문제이다.
x좌표 기준 오름차순 정렬한다.
x좌표가 같다면 y좌표 기준 오름차순으로 정렬한다.
[입력]
첫 번째 줄에는 점의 개수
다음 줄에는 N개의 줄, 각 점의 xi,yi 중복은 없음
[출력]
정렬된 N개의 좌표를 한 줄씩 출력
 */
public class Main10{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringBuilder sb = new StringBuilder(); //결과를 한 번에 출력하기 위해 stringbuilder 만듦

        int N=Integer.parseInt(br.readLine()); // 점 개수 입력
        int[][] points = new int[N][2]; //추후 Array로 정렬해야함.

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0]=Integer.parseInt(st.nextToken());
            points[i][1]=Integer.parseInt(st.nextToken());
        }

        //x 기준 오름차순, x가 같으면 y기준 오름차순
        Arrays.sort(points,(a,b)->(a[0]==b[0])?Integer.compare(a[1],b[1]):Integer.compare(a[0],b[0]));
        
        //정렬된 좌표 출력 
        for(int i=0;i<N;i++){
            sb.append(points[i][0]).append(" ").append(points[i][1]).append("\n");
        }

        System.out.print(sb);
    }
}
