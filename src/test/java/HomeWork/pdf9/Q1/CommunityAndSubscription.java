package HomeWork.pdf9.Q1;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CommunityAndSubscription {
    Set<Character> community = new TreeSet<>();
    List<Character> subscription = new LinkedList<>();

    /**
     * This method is community of <b>a , b</b><ul
     * <li>just it has an if and else</li>
     *
     * @param a
     * @param b
     */
    public void firstMethod(Set a, Set b) {
        community.addAll(a);
        if (a.containsAll(b) == false) {
            community.addAll(b);
            System.out.println(community);
        } else {
            System.out.println(community);
        }

    }

    /**
     * This method is subscription of <b>a</b> and <b>b</b>
     * <li>this method has two input -----------> a , b</li>
     * <li>there is Object of <b>TreeSet</b> that is filled with <b>subscription a , b</b>--<b>('b.contains(subscription.get(i))')</b> </li>
     *
     * @param a
     * @param b
     */
    public void secondMethod(Set a, Set b) {
        Set<Character> space = new TreeSet<>();
        subscription.addAll(a);

        for (int i = 0; i < subscription.size(); i++) {
            if (b.contains(subscription.get(i)) == true) {
                space.add(subscription.get(i));

            }
        }

        System.out.println(space);

    }
}
