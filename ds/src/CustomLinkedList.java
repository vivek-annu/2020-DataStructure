import jdk.dynalink.NamedOperation;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public Node() {
    }

    public void setData(int data) {
        this.data = data;
    }
}

public class CustomLinkedList {


    Node root;
    int size;

    public int getSize() {
        return size;
    }

    public Node add(int data) {
        size++;
        Node node = new Node(data);
        if (root == null) {
            return root = node;
        } else {
            Node temp = root;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        return node;
    }

    public Node mergeSort(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node middleNode = middleNode(node);
        Node secondHalf = middleNode.next;
        middleNode.next = null;
        return merge(mergeSort(node), mergeSort(secondHalf));
    }

    public Node removeDuplicateList(Node node) {
        if (node == null && node.next == null) return node;
        if (node.data == node.next.data) {
            node.next = node.next.next;
            removeDuplicateList(node);
        } else return removeDuplicateList(node.next);
        return node;
    }



    public Node deleteNnodePostM(Node node){
        if(node==null)return node;

        return node;





    }




    public Node mergeTwoSortedList(Node a, Node b) {
        return merge(a, b);
    }

    public Node mergeTwoNodeList(Node a, Node b) {
        return merge(mergeSort(a), mergeSort(b));
    }

    private Node merge(Node a, Node b) {
        Node temp = new Node();
        Node finalList = temp;


        while (a != null && b != null) {
            if (a.data < b.data) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        temp.next = (a == null) ? b : a;
        return finalList.next;
    }

    private Node middleNode(Node node) {
        if (node == null) return node;

        Node a = node;
        Node b = node.next;

        while (b != null && b.next != null) {
            a = a.next;
            b = b.next.next;
        }
        return a;


    }

    public void printData() {
        Node temp = root;
        System.out.print("[ ");
        while (temp != null) {
            System.out.print(temp.data + ",");

            temp = temp.next;
        }
        System.out.print("]");
        System.out.println();

    }


    public Node insert(int index, int data) {

        Node node = new Node(data);
        Node temp = root;
        if (size - 1 > index) {
            int i = 1;
            while (i < index) {
                temp = temp.next;
                i++;
            }

            node.next = temp.next;
            temp.next = node;
            size++;
        } else {
            add(data);
        }


        return root;
    }

    public Node deleteFirst() {
        if (root != null) {
            size--;
            return root = root.next;
        } else return null;
    }

    public Node deleteLast() {
        if (root != null) {
            size--;
            Node node = root;
            if (node.next == null) {
                return root = null;
            } else {
                while (node.next.next != null) {
                    node = node.next;
                }
                node.next = null;
            }


            return root;
        } else return null;
    }


    public Node rotate() {
        if (root == null) return null;
        else {
            Node node = root;
            if (node.next == null) {
                return node;
            } else {


                while (node.next.next != null) {

                    node = node.next;

                }
                Node temp = node.next;
                node.next = null;
                temp.next = root;
                root = temp;

            }
        }
        return root;
    }

    public Node addFirst(int data) {
        Node node = new Node(data);
        size++;
        node.next = root;
        root = node;
        return node;
    }

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.add(20);
        linkedList.printData();
        for (int i = 0; i < 5; i++) {
            linkedList.add(21 + i);

        }
        linkedList.insert(2, 54);
        linkedList.insert(2, 65);

        linkedList.printData();
        // linkedList.reverse(linkedList.root);
        // linkedList.printData();
        linkedList.mergeSort(linkedList.root);
        linkedList.printData();

    }


    public Node reverse(Node node) {

        if (node == null || node.next == null) {
            return node;
        }
        Node temp = reverse(node.next);

        node.next.next = node;
        node.next = null;
        return temp;

    }

    public boolean contains(int data) {
        if (root == null) return false;
        else {
            Node node = root;
            while (node != null) {
                if (node.data == data) {
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }

    public Node deleteIndex(int index) {
        Node node = root;
        if (node == null) {
            return null;
        } else {
            if (size - 1 > index) {
                int i = 1;
                while (i < index) {
                    node = node.next;
                    i++;
                }
                node = node.next.next;


            } else {
                throw new ArrayIndexOutOfBoundsException("index is not present");
            }

        }
        return root;
    }

}
