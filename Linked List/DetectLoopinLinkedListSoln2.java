
class Solution {
    public boolean detectLoop(Node head) {
        // code here
       Node temp=head;
       HashSet<Node> set=new HashSet<>();
       while(temp!=null){
           if(set.contains(temp)){
               return true;
           }
           set.add(temp);
           temp=temp.next;
       }
       return false;
    }
}