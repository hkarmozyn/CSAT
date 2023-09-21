/*
HK
9/26/23
CZ
*/



public class Node<T> {
    private int index;
    private T data;
    private Node parent;
    private Node child;


    public Node(){

    }


    public Node(T data,Node parent, Node child){
        this.data=data;
        this.parent=parent;
        this.child=child;


    }


    public int getIndex(){
        return index;
    }
    public void setIndex(int index){
        this.index=index;
    }

    public T getData() {
        return data;
    }
    public void setData(T data){ this.data=data;}

    public String toString(Node n){
        return "Node:";
    }



    public boolean equals(Node n1, Node n2){
        return n1.equals(n2);


    }

}
