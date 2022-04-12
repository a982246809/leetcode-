package 字符串;

import java.util.HashMap;

class Solution {

    public static void main(String[] args) {
        checkInclusion("a",
                "ab");
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int l=0;
        int r=s1.length()-1;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : s1.toCharArray()
        ) {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < r+1; i++) {
            map.put(chars2[i],map.getOrDefault(chars2[i],0)-1);
        }
        if(isZero(map)){
            return  true;
        }


        while (r<s2.length()){
            l++;
            r++;
            map.put(chars2[l-1],map.get(chars2[l-1])+1);
            map.put(chars2[r],map.getOrDefault(chars2[r],0)-1);


            //判斷 map  是否全为 0
            // Collection<Integer> values = map.values();
            if(isZero(map)){
                return  true;
            }
        }
        return  false;
    }
    public static boolean isZero(HashMap<Character, Integer> map){
        boolean isZero = true;
        for (int v:  map.values()
        ) {
            if (v!=0){
                isZero=false;
            }
        }
        if (isZero){
            return true;
        }
        return  false;
    }

//    public static boolean checkInclusion(String s1, String s2) {
//        int r=0;
//        int l=0;
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (char i : s1.toCharArray()
//             ) {
//            map.put(i,map.getOrDefault(i,0)+1);
//        }
//        HashMap<Character, Integer> clone = (HashMap<Character, Integer>) map.clone();
//
//        while (r<s2.length()){
////            if (l==r&& map.get(s2.charAt(r))==null ){
////                l++;
////                r++;
////            }
//            Integer count = map.get(s2.charAt(r));
//            if (count!=null){
//                map.put(s2.charAt(r),map.get(s2.charAt(r))-1);
//                r++;
//            }
//
//            if (count==null){
//                map = (HashMap<Character, Integer>) clone.clone();
//                r++;
//                l=r;
//            }
//
//
//
//
//            //判斷 map  是否全为 0
//            // Collection<Integer> values = map.values();
//            boolean isZero = true;
//            for (int v:  map.values()
//                 ) {
//                if (v!=0){
//                    isZero=false;
//                }
//            }
//            if (isZero){
//                return true;
//            }
//        }
//        return  false;
//    }

}