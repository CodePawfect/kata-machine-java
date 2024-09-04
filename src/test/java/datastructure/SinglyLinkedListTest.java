package datastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SinglyLinkedListTest {

    @Test
    void add() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);

        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals(10, list.get(0));
    }

    @Test
    void addFirst() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(5);

        Assertions.assertEquals(2, list.size());
        Assertions.assertEquals(10, list.get(0));
        Assertions.assertEquals(5, list.get(1));
    }

    @Test
    void get() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(5);

        Assertions.assertEquals(2, list.size());
        Assertions.assertEquals( 10, list.get(0));
        Assertions.assertEquals(5, list.get(1));
    }

    @Test
    void set() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(5);

        list.set(1, 20);

        Assertions.assertEquals(2, list.size());
        Assertions.assertEquals(10, list.get(0));
        Assertions.assertEquals(20, list.get(1));
    }

    @Test
    void remove() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(5);

        list.remove(10);

        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals(5, list.get(0));
    }

    @Test
    void removeFirst() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(5);

        list.removeFirst();

        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals(5, list.get(0));
    }

    @Test
    void removeLast() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(5);

        list.removeLast();

        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals(10, list.get(0));
    }

    @Test
    void isEmpty() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(5);

        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();

        Assertions.assertFalse(list.isEmpty());
        Assertions.assertTrue(list2.isEmpty());
    }

    @Test
    void size() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(10);
        list.add(5);

        Assertions.assertEquals(2, list.size());
    }
}