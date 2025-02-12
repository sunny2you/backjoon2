import java.util.*;
import java.io.*;

public class Main8{
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine(); //개행문자처리

        Set<String> wordSet=new HashSet<>(); //중복제거를 위한 HashSet
        for (int i=0;i<N;i++){
            wordSet.add(sc.nextLine()); //중복 방지하며 단어 입력 받기
        }
        //정렬을 위해 List로 변환
        List<String> words = new ArrayList<>(wordSet);

        //정렬 기준: 길이 우선 -> 길이가 같으면 사전순
        words.sort((a,b)->{
            if(a.length()!=b.length()){
            return a.length()-b.length();} //길이순 정렬
            else{
                return a.compareTo(b); //사전순
            }
        });

        for(String word : words){
            System.out.println(word);
        }

        sc.close();
    }

}
