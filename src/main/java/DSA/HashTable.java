package DSA;

import java.util.ArrayList;

public class HashTable {
    private ArrayList<hashEntry> bucket;
    private int slots;
    private int size;

    public HashTable(){
        bucket=new ArrayList<hashEntry>();
        slots=10;
        size=0;

        for(int i=0;i<slots;i++)
            bucket.add(null);
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    private int getIndex(String key) {

        //hashCode is a built in function of Strings
        int hashCode = key.hashCode();
        System.out.println("hashCode: "+hashCode);
        int index = hashCode % slots;
        //Check if index is negative
        if(index<0){
            index=(index + slots) % slots;
        }
        return index;
    }

    public void insert(String Key,int value){


        int Index=getIndex(Key);
        hashEntry head=bucket.get(Index);

        while(head !=null)
        {
            if(head.Key.equals(Key))
            {
                head.value=value;
                return;
            }
            head=head.next;
        }

        size++;
        head=bucket.get(Index);
        hashEntry newSlot=new hashEntry(Key,value);
        newSlot.next=head;
        bucket.set(Index,newSlot);

        //note: helper function to resize the array if its 60% filled
        if ((1.0*size)/slots >= 0.6)
        {
            ArrayList<hashEntry> temp = bucket;
            bucket = new ArrayList();
            slots = 2 * slots;
            size = 0;
            for (int i = 0; i < slots; i++)
                bucket.add(null);

            for (hashEntry head_Node : temp)
            {
                while (head_Node != null)
                {
                    insert(head_Node.Key, head_Node.value);
                    head_Node = head_Node.next;
                }
            }
        }
    }

    public Integer Search(String Key){
        int Index=getIndex(Key);
        hashEntry head=bucket.get(Index);

        while(head !=null)
        {
            if(head.Key.equals(Key))
                return head.value;
            head=head.next;
        }

        return null;
    }

    public Integer delete(String Key){
        int Index=getIndex(Key);
        hashEntry head=bucket.get(Index);

        hashEntry prev=null;
        while(head !=null)
        {
            if(head.Key.equals(Key))
                break;
            prev=head;
            head=head.next;
        }

        if(head==null)
            return null;

        size--;
        if(prev!=null)
            prev.next=head.next;
        else
            bucket.set(Index,head.next);

        return head.value;
    }

    public static void main(String[] args) {
        HashTable table = new HashTable(); //Create a HashTable
        //Before Insertion
        System.out.println("Table Size = " + table.size());
        table.insert("This",1 ); //Key-Value Pair
        table.insert("is",2 );
        table.insert("a",3 );
        table.insert("Test",4 );
        table.insert("Driver",5 );
        System.out.println("Table Size = " + table.size());
        // first search the key then delete it in the table
        // see the implementation first
        System.out.println(table.delete("is")+ " : This key is deleted from table");
        System.out.println("Now Size of the table = " + table.size() );
        if(table.isEmpty())
            System.out.println("Table is Empty");
        else
            System.out.println("Table is not Empty");

    }
    }


