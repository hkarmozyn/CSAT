/*
HK
9/26/23
CZ
*/



public class Node<T> {
    private int index; // private index
    private T data; // private data
    private Node parent;
    private Node child;


    public Node(){ // default constructor

    }
    public Node(T data){ // overided constructor
        this.data=data;
    }


    public Node(T data,Node parent, Node child){
        this.data=data;
        this.parent=parent;
        this.child=child;


    }


    public int getIndex(){
        return index;
    } // get index
    public void setIndex(int index){
        this.index=index;
    } // sets index

    public T getData() {
        return data;
    } // returns data
    public void setData(T data){ this.data=data;} // sets data

    public String toString(){// tostring method
        return "Node:" +this.data; // returns the Node and the data
    }



    public boolean equals(Node n1){ // equals method compares to values of the nodes

        return this.data.equals(n1.getData());


    }

}
