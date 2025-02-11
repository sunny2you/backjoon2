import java.util.*;
import java.io.*; //Bufferedreader와 InputsStreamReader
public class Main4 {
    public static void main(String[] args) throws IOException{
        //입력 속도를 높이기 위해 Scanner 대신 Bufferedreader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //한 줄 입력을 받고 정수형으로 변환(N은 숫자의 개수)
        int N=Integer.parseInt(br.readLine());

        int[] arr=new int[N];

        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        //출력 속도를 높이기 위해 System.out.println 대신 Stringbuilder 사용
        StringBuilder sb = new StringBuilder();

        //정렬된 결과를 Stringbuilder에 추가
        for(int num : arr){
            sb.append(num).append("\n");
        }

        System.out.print(sb);
    }
}
