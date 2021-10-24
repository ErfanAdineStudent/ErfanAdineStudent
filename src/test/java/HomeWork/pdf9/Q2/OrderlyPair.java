package HomeWork.pdf9.Q2;

import java.util.List;

public class OrderlyPair {
//    List<Integer> smallList ;
    public List<Integer> first(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
//            smallList= new LinkedList<>();
//            smallList.add(list.get(i));
            for (int j = 1; j < list.size(); j++) {

                if (list.get(i)>list.get(j) && i<j){
                   int k=i;
                   int b =j;
                    list.remove(list.get(k));
                    list.remove(list.get(b));

//                    i=i+2;
                    i++;
                    j++;
                }
                break;

            }
        }
        return list;
    }
}
