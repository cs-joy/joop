package org.neutral_networks.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> emailList = new HashMap<>(); // declare a map

        // add or append element into the Map
        emailList.put("Mike", "mike@freecodecamp.org");
        emailList.put("Jim", "jim@gmail.com");
        emailList.put("Tom", "tom@yahoo.com");
        emailList.put("Jerry", "jerry@tss.inc");

        // print a specific elements from the map
        System.out.println(emailList.get("Tom")); // print: tom@yahoo.com
        // if given key are not in present inside the map then it should be return `null`
        System.out.println(emailList.get("tom")); // print: null

        // get size of the map
        System.out.println(emailList.size());

        // removing the element
        emailList.remove("Tom");
        System.out.println(emailList.size());

        // check if the given Key is exists in the map
        System.out.println(emailList.containsKey("Jerry")); // return boolean value (if exists it will be return tru otherwise false
        // check if the given Value is exists in the map
        System.out.println(emailList.containsValue("jim@gmail.com")); // return boolean value (if exists it will be return tru otherwise false
    }
}
