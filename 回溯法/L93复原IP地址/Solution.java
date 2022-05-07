package 回溯法.L93复原IP地址;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.restoreIpAddresses( "101023"));
    }

    public List<String> restoreIpAddresses(String s) {
        LinkedList<String> res = new LinkedList<>();
        dfs(res,s,0,"");
        return res;
    }

    private void dfs(LinkedList<String> res, String s, int index, String paths) {
        if (index==s.length()-2){
            if(paths.length()==s.length()+3){
                res.add(new String(paths) );
            }
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isIPItem(s.substring(index,i+1))){
                String back = paths;
                paths=  paths.length()==0 ? paths : paths+".";
                paths = paths + s.substring(index,i+1);
                dfs(res,s,i+1,paths);
                paths=back;
            }
        }
    }

    private boolean isIPItem(String substring) {
        if (substring.length()>3){
            return false;
        }
        if (substring.length()>1&&substring.startsWith("0")){
            return false;
        }
        if (Integer.parseInt(substring)>255){
            return false;
        }
        return  true;
    }

}
