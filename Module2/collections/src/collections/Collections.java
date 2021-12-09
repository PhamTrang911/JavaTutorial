/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("-----------ArrayList-----------");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println("The element at index two is " + list.get(1));
        System.out.println("The size of the List is " + list.size());

        System.out.println("------------LinkedList----------");

        LinkedList<String> animals = new LinkedList<String>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        Iterator<String> it = animals.iterator();

        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);

            if (value.equals("cat")) {
                it.remove();
            }
        }

        System.out.println();

        for (String animal : animals) {
            System.out.println(animal);
        }
            System.out.println("\n----------HashSet-------------");

            HashSet<String> h = new HashSet<String>();

            h.add("Trang");
            h.add("Hoa");
            h.add("Chi");
            h.add("Quynh");

            System.out.println(h);
            System.out.println("List contains Trang or not:" + h.contains("Trang"));

            h.remove("Chi");
            System.out.println("List after removing Chi:" + h);

        }

    }
