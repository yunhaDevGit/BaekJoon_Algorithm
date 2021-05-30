package Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//public class SumOfThreeNumbers {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(br.readLine());
//        int elements[] = new int[num];
//        int maxElement = -1;
//
//        // 세 수 입력
//        for(int i=0; i<num;i++){
//            elements[i] = Integer.parseInt(br.readLine());
//        }
//
//        for(int i=0;i<num;i++){
//            for(int j=i+1;j<num;j++){
//                for(int l=j+1;l<num;l++){
//
//                    for(int m=0;m<num;m++){
//                        if(elements[m] == elements[i]+elements[j]+elements[l]){
//                            if(maxElement<elements[m]){
//                                maxElement = elements[m];
//                            }
//                        }
//                    }
//
//                }
//            }
//        }
//
//        System.out.println(maxElement);
//
//    }
//}
public class SumOfThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> elements = new ArrayList<>();
        int maxElement = -1;

        // 세 수 입력
        for(int i=0; i<num;i++){
            elements.add(Integer.parseInt(br.readLine()));
        }

        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                for(int l=j+1;l<num;l++){

                    if(elements.contains(elements.get(i)+elements.get(j)+elements.get(l))){
                        if (maxElement<(elements.get(i)+elements.get(j)+elements.get(l)))
                            maxElement = (elements.get(i)+elements.get(j)+elements.get(l));
                    }
                }
            }
        }

        System.out.println(maxElement);

    }
}