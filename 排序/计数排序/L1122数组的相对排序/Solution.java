package 排序.计数排序.L1122数组的相对排序;

public class Solution {

    public static void main(String[] args) {
//        [2,3,1,3,2,4,6,7,9,2,19]
//[2,1,4,3,9,6]
        Solution solution = new Solution();
        System.out.println(solution.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19},new int[]{2,1,4,3,9,6}).toString());
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
//        //把arr1 用一个空间数组  计数  , 然后在 按顺序弹出 给一个新排序数组
//        int min = Integer.MAX_VALUE;
//        int max =Integer.MIN_VALUE;
//        for(int v : arr1){
//            min = Math.min(min,v);
//            max = Math.max(max,v);
//        }
//
//        int[] countArr = new int[max-min+1];
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int v : arr1){
//            countArr[v - min]++;
//            boolean exist = true;
//            for (int i = 0; i < arr2.length; i++) {
//                if (arr2[i]==v){
//                    list.add(v);
//                }
//                exist = false;
//            }
//        }
//        int index=0;
//        for(int v : arr2){
////            按照次数 添加进去
//            for (int i = 0; i < countArr[v - min]; i++) {
//                arr1[index] = v;
//                index++;
//            }
//        }

        int[] counts = new int[1001];
        for(int v : arr1){
          counts[v]++;
        }

        int i=0;
        for(int num : arr2){
            while (counts[num]>0){
                arr1[i++] = num;
                counts[num]--;
            }
        }

        for (int j = 0; j < counts.length ; j++) {
            while (counts[j]>0){
                arr1[i++]=j;
                counts[j]--;
            }
        }

        return  arr1;
    }

}
