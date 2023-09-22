/*
HK
9/26/23
CZ
*/


public class Main {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3,n1,n2);

        Node[] list;
        list = new Node[]{n1,n2,n3};
        for(int i =0; i<list.length; i++){
            System.out.println(list[i].getData());
        }
        for(int i =0; i<list.length; i++){
            System.out.println(list[i].getClass());
        }
        for(int i =0; i<list.length; i++){
       list[i].setData(5);
        }
        for(int i =0; i<list.length; i++){
            System.out.println(list[i].getData());
        }
        System.out.println(n1.equals(n2));
        System.out.println(n2.equals(n3));
        System.out.println(n3.equals(n1));
        for(int i =0; i<list.length; i++){
            System.out.println(list[i].toString());
        }
        Node n4 = new Node<>("Bruh");
        System.out.println(n4.toString());

    }



}


