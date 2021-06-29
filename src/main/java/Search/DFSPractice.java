package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class DFSPractice {

  private static int N, M, V;
  private LinkedList<Integer> nodes[];

  public DFSPractice(int n) {
    N = n;
    nodes = new LinkedList[n];
    for (int i = 0; i < n; i++) {
      nodes[i] = new LinkedList();
    }
  }

  void addEdge(int startNode, int endNode) {
    nodes[startNode].add(endNode);
  }

  void DFSUtils(int v, boolean visited[]) {
    visited[v] = true;
    Iterator<Integer> i = nodes[v].listIterator();
    while (i.hasNext()) {
      int n = i.next();
      if (!visited[n]) {
        DFSUtils(n, visited);
      }
    }
  }

  void DFS(int v) {
    boolean visited[] = new boolean[N];
    DFSUtils(v, visited);
  }

  void DFS() {
    boolean visited[] = new boolean[N];
    for (int i = 0; i < N; ++i) {
      if (visited[i] == false) {
        DFSUtils(i, visited);
      }
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken()); // 정점 개수
    M = Integer.parseInt(st.nextToken()); // 간선 개수
    V = Integer.parseInt(st.nextToken()); // 시작 정점 번호

    DFSPractice dfsPractice = new DFSPractice(M);
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int startNode = Integer.parseInt(st.nextToken());
      int endNode = Integer.parseInt(st.nextToken());
      dfsPractice.addEdge(startNode, endNode);
    }

    dfsPractice.DFS(V);
  }

}
