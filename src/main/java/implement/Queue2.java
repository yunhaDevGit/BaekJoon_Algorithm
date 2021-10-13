package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Queue2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        String command;
        for(int i=0;i<N;i++){
            command = br.readLine();
            switch (command) {
                case "pop":
                    Integer item = queue.poll();
                    if(item==null)
                        System.out.println(-1);
                    else
                        System.out.println(item);
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if(queue.isEmpty())
                        System.out.println(1);
                    else System.out.println(0);
                    break;
                case "front":
                    if(queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.getFirst());
                    break;
                case "back":
                    if(queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.getLast());
                    break;
                default:
                    int X = Integer.parseInt(command.split(" ")[1]);
                    queue.add(X);
                    break;
            }
        }
    }
}
