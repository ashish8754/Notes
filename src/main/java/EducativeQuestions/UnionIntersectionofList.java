package EducativeQuestions;

import java.util.HashSet;

public class UnionIntersectionofList {

    public static <T> SLL<T> union(SLL<T> list1, SLL<T> list2) {
        SLL<T> result = new SLL<T>();
        // Write -- Your -- Code
        HashSet<T> unionSet=new HashSet<>();
        SLL.Node current=list1.getHeadNode();
        while(current!=null){
            if(unionSet.contains(current.data)){
                current=current.nextNode;
            }else {
                unionSet.add((T) current.data);
                result.insertAtHead((T) current.data);
                current=current.nextNode;
            }
        }

        current= list2.getHeadNode();
        while(current!=null){
            if(unionSet.contains(current.data)){
                current=current.nextNode;
            }else {
                unionSet.add((T) current.data);
                result.insertAtHead((T) current.data);
                current=current.nextNode;
            }
        }

        return result;
    }

    //performs intersection between list
    public static <T> SLL<T> intersection(SLL<T> list1, SLL<T> list2) {
        SLL<T> result = new SLL<T>();
        list1.removeDuplicatesWithHashing();
        list2.removeDuplicatesWithHashing();
        // Write -- Your -- Code
        HashSet<T> unionSet=new HashSet<>();

        SLL.Node current=list1.getHeadNode();
        while(current!=null){
            if(unionSet.contains(current.data)){
                current=current.nextNode;
            }else {
                unionSet.add((T) current.data);
                current=current.nextNode;
            }
        }

        current= list2.getHeadNode();
        while(current!=null){
            if(unionSet.contains(current.data)){
                result.insertAtHead((T) current.data);
                current=current.nextNode;
            }else {
                current=current.nextNode;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SLL<Integer> list1=new SLL<>();
        list1.insertAtHead(15);
        list1.insertAtHead(22);
        list1.insertAtHead(8);

        SLL<Integer> list2=new SLL<>();
        list2.insertAtHead(7);
        list2.insertAtHead(22);
        list2.insertAtHead(14);

        SLL<Integer> result=intersection(list1, list2);
        result.printList();
    }
}
