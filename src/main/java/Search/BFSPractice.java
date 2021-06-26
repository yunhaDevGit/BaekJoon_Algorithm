package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BFSPractice {
    static private int N, M, V;
    private LinkedList<Integer> nodes[]; // 인접 리스트

    BFSPractice(int n){
        N = n;
        nodes = new LinkedList[n];
        for(int i=0;i<n;i++) // 인접 리스트 초기화
            nodes[i] = new LinkedList();
    }

    void addEdge(int v, int w){
        nodes[v].add(w);
    }

    void BFS(int s){
        boolean visited[] = new boolean[M];

        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()){
            int q =  queue.poll();
            System.out.println(q + " ");

            LinkedList<Integer> sortnodes = nodes[q];
            Collections.sort(sortnodes);
            Iterator<Integer> i = nodes[q].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 정점 개수
        M = Integer.parseInt(st.nextToken()); // 간선 개수
        V = Integer.parseInt(st.nextToken()); // 시작 정점 번호

        BFSPractice bfsPractice = new BFSPractice(N);
        int startNode, endNode;

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            startNode = Integer.parseInt(st.nextToken());
            endNode = Integer.parseInt(st.nextToken());
            bfsPractice.addEdge(startNode,endNode);
        }

        bfsPractice.BFS(V);

    }
}
