package ir.pdf9.Q2;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class OrderlyPair2 {
    List<Integer> smallList = new LinkedList<>();
    List<Integer> finalList = new LinkedList<>();
    public List<Integer> seconde(List<Integer> list){


        for (int i = 0; i<list.size() ; i++) {

            while (smallList.size()<=2){
                smallList.add(list.get(i));
            }
            if (smallList.get(0)>smallList.get(1) && smallList.size()==2){
                smallList.remove(0);
                smallList.remove(1);
            }else {
                finalList.addAll(smallList);
                smallList.remove(0);
                smallList.remove(1);
                break;
            }

        }
        return finalList;
    }
}
