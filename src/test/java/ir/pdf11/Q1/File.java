package ir.pdf11.Q1;

import jdk.nashorn.api.tree.Tree;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class File {
   static TreeSet<Integer> list = new TreeSet<>();

   @Override
   public String toString() {
      return String.valueOf(list);
   }
}
