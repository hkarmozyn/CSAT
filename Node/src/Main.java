/*
HK
9/26/23
CZ
*/


public class Main {

    public static void main(String[] args) {
        Node n1 = new Node(1); // new noden n1
        Node n2 = new Node(2);// new noden n2
        Node n3 = new Node(3,n1,n2);// new noden n3

        Node[] list; // new node list
        list = new Node[]{n1,n2,n3};
        for(int i =0; i<list.length; i++){ // prints the data of the nodes
            System.out.println(list[i].getData());
        }
        for(int i =0; i<list.length; i++){ // prints the values of the nodes
            System.out.println(list[i].getClass());
        }
        for(int i =0; i<list.length; i++){ // sets the data to 5 for the nodes
       list[i].setData(5);
        }
        for(int i =0; i<list.length; i++){ // new returns the values for the nodes
            System.out.println(list[i].getData());
        }
        System.out.println(n1.equals(n2)); // compares the values of the nodes
        System.out.println(n2.equals(n3));
        System.out.println(n3.equals(n1));
        for(int i =0; i<list.length; i++){ // tostring method for the nodes
            System.out.println(list[i].toString());
        }
        Node n4 = new Node<>("Bruh");
        System.out.println(n4.toString());

    }



}


