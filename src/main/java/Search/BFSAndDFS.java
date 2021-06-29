package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BFSAndDFS {

    static int N,M,V;
    static LinkedList<Integer> nodes[];

    BFSAndDFS(int n){
        nodes = new LinkedList[n];
        for(int i=0;i<n;i++){
            nodes[i] = new LinkedList<>();
        }
    }

    void addEdge(int startNode, int endNode){
        nodes[startNode].add(endNode);
    }

    static void BFS(int v){
        boolean visited[] = new boolean[N];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[v] = true;
        queue.add(v);

        while(!queue.isEmpty()){
            v = queue.poll();
            System.out.print(v + " ");

            Iterator<Integer> nearNode = nodes[v].listIterator();
            while (nearNode.hasNext()){
                int n = nearNode.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

    }

    static void DFS(int v){

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 정점 개수
        M = Integer.parseInt(st.nextToken()); // 간선 개수
        V = Integer.parseInt(st.nextToken()); // 시작할 정점

        BFSAndDFS bfsAndDFS = new BFSAndDFS(N);
        int startNode, endNode;

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            startNode = Integer.parseInt(st.nextToken());
            endNode = Integer.parseInt(st.nextToken());
            bfsAndDFS.addEdge(startNode,endNode);
        }
        BFS(V);
        DFS(V);
    }
}
