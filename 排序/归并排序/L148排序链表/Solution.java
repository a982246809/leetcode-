package 排序.归并排序.L148排序链表;


import 哈希表.ListNode;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution);
    }
    public ListNode sortList(ListNode head) {

        if(head==null||head.next==null){
            return head;
        }

        ListNode h1 = head;
        ListNode h2 = split(head);

        h1 = sortList(h1);
        h2 =  sortList(h2);
        return merge(h1,h2);

    }

    private ListNode merge(ListNode h1, ListNode h2) {
        ListNode res  = new ListNode();
        while (h1!=null||h2!=null){
//            if (h1==null){
//                res.val = h2.val;
//                return h2 = h2.next;
//            }
//            if (h2==null){
//                res.val = h1.val;
//                return h1 = h1.next;
//            }
            if (h1.val<=h2.val||h2==null){
                res.val = h1.val;
                h1 = h1.next;
            }else {
                res.val = h2.val;
                h2 = h2.next;
            }
            res.next = new ListNode();
        }
        return res;
    }

    private ListNode split(ListNode h) {
        ListNode l1 = h,l2=h;

        while (l2!=null&&l2.next!=null){
            l1=l1.next;
            l2 = l2.next.next;
        }
        ListNode second = l1;
        l1.next = null;
        return second;
    }

}
