import java.util.*; //Java의 유틸리티 패키지를 가져옴 (List, ArrayList, Stack, Queue 등 사용 )

public class GraphTraversal2{ //그래프 탐색을 수행하는 클래스 
    public static void main (String[] args){ //메인 메서드 (프로그램 실행의 시작점)
        Scanner scanner = new Scanner(System.in); //사용자 입력을 받기 위한 Scanner 객체

        int n = scanner.nextInt(); //정점 개수 입력
        int m = scanner.nextInt(); //간선 개수 입력
        int v = scanner.nextInt(); //탐색을 시작할 정점 번호 입력받기

        List<List<Integer>> graph = new ArrayList<>(); //인접 리스트로 그래프를 표현하기 위한 리스트 
        //graph.get(i)는 정점 i에 연결된 정점들의 리스트를 나타냄

        //정점 번호가 1부터 시작하므로 0번 인덱스는 사용하지 않고 1번부터 n번까지 접근 가능하도록 n+1 개의 빈 리스트 생성
        for (int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        //간선 정보를 입력받아 그래프를 구성 (양방향 그래프)
        for (int i=0; i<m; i++){
            graph.add(new ArrayList<>());
        }
    }
}
