package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("{[]}"));
        System.out.println(vp.isValid("[]"));
        System.out.println(vp.isValid("]"));
        System.out.println(vp.isValid("[([]])"));

    }

    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');


        List<Character> val = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char currCar = s.charAt(i);
            if (map.containsKey(currCar)) {
                val.add(map.get(currCar));
            } else {
                if (!val.isEmpty() && val.get(val.size() - 1).equals(currCar)) {
                    val.remove(val.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return val.isEmpty();
    }
}
