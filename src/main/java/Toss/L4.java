import java.util.*;

public class L4 {

    static List solution(int servers, boolean sticky, List request){
        List result = new ArrayList();
        int requestSize = request.size();
        Map<Integer, Integer> serverMap = new HashMap<>();

        List<List> serverList = new ArrayList<>();
        for(int i=0;i<servers;i++){
            serverList.add(new ArrayList());
        }

        if(sticky){
            int index = -1;
            for(int i=0;i<requestSize;i++){
                if(serverMap.containsKey(request.get(i))){
                    index = serverMap.get(request.get(i));
                    serverList.get(index).add(request.get(i));
                }else {
                    index = (index+1)%servers;
                    serverMap.put((Integer) request.get(i), index);
                    serverList.get(index).add(request.get(i));
                }
            }
        } else { // 라운드 로빈 방식
            for(int i=0;i<servers;i++){
                serverList.get(i%servers).add(request.get(i));
            }
        }

        return serverList;
    }

    public static void main(String[] args) {
        int servers = 2;
        boolean sticky = true;
        List requests = Arrays.asList(1,2,2,3,4,1);

        List result = solution(servers, sticky, requests);
        System.out.println(result);
    }
}
