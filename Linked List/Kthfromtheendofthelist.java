
class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        ArrayList<Node> list=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        if(k>list.size()){
            return -1;
        }
        return list.get(list.size()-k).data;
    }
}