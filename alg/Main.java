import java.util.*;

public class Main {
    static List<List<Integer>> graph = new ArrayList<>(); // 인접 리스트
    static boolean[] visited; // 방문 체크 배열
    static StringBuilder dfsResult = new StringBuilder(); //String을 바꿔가며 사용할 수 있음
    static StringBuilder bfsResult = new StringBuilder(); 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 정점 개수
        int M = sc.nextInt(); // 간선 개수
        int V = sc.nextInt(); // 시작 정점

        // 그래프 초기화 (1번부터 사용하므로 N+1 크기로 설정)
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 정보 입력받기
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // 정점 번호가 작은 것부터 방문하도록 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i)); 
        }

        // DFS 실행
        visited = new boolean[N + 1]; // 방문 배열 초기화
        dfs(V); 
        System.out.println(dfsResult.toString().trim()); 

        // BFS 실행
        visited = new boolean[N + 1]; // 방문 배열 초기화
        bfs(V);
        System.out.println(bfsResult.toString().trim());

        sc.close();
    }

    // DFS (재귀 방식) 1-2,3,4 2-5라면 1-2-5-3-4 로 방문s
    static void dfs(int node) { 
        visited[node] = true; //방문처리 
        dfsResult.append(node).append(" "); // 결과 저장

        for (int next : graph.get(node)) { //node 에 연결된 next들을 하나씩 탐색
            if (!visited[next]) {
                dfs(next); //1번 인덱스의 리스트로 [2,3,4]가 연결되어있다면, 3,4를 방문하기 전에 2번 인덱스의 리스트에 연결된 첫번째 원소를 먼저 방문함. 
            }
        }
    }

    // BFS (Queue 사용) 1 - 2,3,4 2-5 라면, 1-2-3-4-5로방문
    static void bfs(int start) { //java에서 메서드를 static으로 선언하면 클래스가 인스턴스화 됨. 클래스명으로 바로 호출가능
        Queue<Integer> queue = new LinkedList<>(); //정수를 넣는 큐를 만들거임. 인터페이스는 Queue, 구현체는 LinkedList임
        queue.add(start); //큐에 start를 넣음
        visited[start] = true; //큐에 넣는 순간 방문 처리해야, 큐 안에 중복된 정점이 들어올일이 없음

        while (!queue.isEmpty()) { //큐가 빌때까지 큐에서 빼고, 그거에 대한걸 넣고를 반복
            int node = queue.poll(); //가장 먼저들어온거 빼서 node에 저장
            bfsResult.append(node).append(" "); //Stringbuilder인 bfsResult는 계속해서 수정할 수 있음. [1 2 3 ] 형태로 만들거임

            for (int next : graph.get(node)) { //해당 정점과 연결된 정점들을 모두 큐에 넣을것임
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            } //큐가 다시 찼으면, 다시 while문 안에꺼 반복. 
        }
    }
}
