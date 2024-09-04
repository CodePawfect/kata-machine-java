package datastructure;

public class SinglyLinkedList <T>{
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(T value) {
        if(this.head == null) {
            Node<T> node = new Node<>(value);
            this.head = node;
            this.tail = node;
            this.size++;
            return;
        }

        Node<T> temp = this.tail;
        this.tail = new Node<>(value);
        temp.next = this.tail;
        this.size++;
    }

    public void addFirst(T value) {
        if(this.head == null) {
            Node<T> node = new Node<>(value);
            this.head = node;
            this.tail = node;
        }

        Node<T> temp = this.head;
        this.head = new Node<>(value);
        this.head.next = temp;

        if(temp.next == null) {
            this.tail = temp;
        }

        this.size++;
    }

    public T get(int index) {
        if(this.head == null) return null;
        if(index == 0) return this.head.value;
        if(index == this.size -1) return this.tail.value;

        Node<T> node = this.head.next;

        for(int i = 1; i < this.size; i++) {
            if (index == i) {
                return node.value;
            } else {
                node = node.next;
            }
        }

        return null;
    }

    public void set(int index, T value) throws IllegalArgumentException {
       if(this.head == null) throw new IllegalArgumentException();
       if(index == 0) {
           this.head.value = value;
           return;
       }
       if(index == this.size -1) {
           this.tail.value = value;
           return;
       }

       Node<T> node = this.head.next;

       for(int i = 1; i < this.size; i++) {
            if(index == i) {
                node.value = value;
                return;
            } else {
                node = node.next;
            }
       }
    }

    public boolean remove(T value) {
        if(this.head == null) return false;
        if(this.head.value.equals(value)) {
            if(this.size == 1) {
                this.head = null;
            } else {
                this.head = this.head.next;
            }
            this.size--;
            return true;
        }

        Node<T> prevNode = this.head;
        Node<T> curNode = this.head.next;

        for(int i = 0; i < this.size; i++) {
            if (curNode.value.equals(value)) {
                prevNode.next = curNode.next;
                this.size--;
                return true;
            } else {
                prevNode = curNode;
                curNode = curNode.next;
            }
        }

        return false;
    }

    public T removeFirst() {
        if(this.head == null) return null;
        if(this.head.next == null) {
            T value = this.head.value;
            this.head = null;
            this.tail = null;
            return value;
        }

        T value = this.head.value;
        Node<T> temp = this.head;
        this.head = this.head.next;
        temp = null;
        this.size--;

        return value;
    }

    public T removeLast() {
        if(this.head == null) return null;
        if(this.head.next == null) {
            T value = this.head.value;
            this.head = null;
            this.tail = null;
            return value;
        }

        Node<T> prevNode = this.head;
        Node<T> curNode = this.head.next;

        for(int i = 1; i < this.size; i++) {
            if(i == this.size -1) {
                this.tail = prevNode;
                prevNode.next = null;
                this.size--;
                return curNode.value;
            } else {
                prevNode = curNode;
                curNode = prevNode.next;
            }
        }

        return null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }
}
