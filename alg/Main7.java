import java.util.*;
import java.io.*;
public class Main7 {
    //단어 정렬 1181
    //길이가 짧은것부터,
    //길이가 같으면 사전 순으로
    //중복된 거 있으면 제거 - Set 사용
    //정렬을 위해 List로 변경

    static public void main(String []args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        //BufferWriter을 써서 빠르게 출력
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        //중복제거를 위해 HashSet 사용
        Set<String> wordSet=new HashSet<>();

        //N개의 단어 입력 받기
        for(int i=0;i<N;i++){
            wordSet.add(br.readLine());
        }

        List<String> wordList=new ArrayList<>(wordSet);

        //정렬 
        Collections.sort(wordList,(a,b)->{
            if(a.length()==b.length()){
                return a.compareTo(b); //a가 b보다 사전순으로 앞에 있다면 음수반환
            }
            return Integer.compare(a.length(),b.length()); //길이가 a가 더
        });
        
        for(String word:wordList){
            bw.write(word+"\n");
        }
        bw.flush();
        bw.close();
    }
    
}
