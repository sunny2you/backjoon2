import java.io.*;
import java.util.*;

public class Main7_1{
    public static void main(String[] args) throws IOException {
        // 입력 최적화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 중복 제거 + 자동 정렬 (TreeSet 사용)
        Set<String> wordSet = new TreeSet<>((a, b) -> 
            (a.length() == b.length()) ? a.compareTo(b) : a.length() - b.length()
        );

        // 입력받아 TreeSet에 저장 (중복 제거 + 자동 정렬)
        for (int i = 0; i < N; i++) {
            wordSet.add(br.readLine());
        }

        // 초고속 출력
        BufferedOutputStream bos = new BufferedOutputStream(System.out);
        StringBuilder sb = new StringBuilder();

        for (String word : wordSet) {
            sb.append(word).append("\n");
        }

        bos.write(sb.toString().getBytes());
        bos.flush();
        bos.close();
    }
}