class Solution {
    public void printList(Node head) {
        // code here
       
       Node temp=head;
        do{
           System.out.print(temp.data+" ");
            temp=temp.next;
        }while(temp!=head);

    }
}