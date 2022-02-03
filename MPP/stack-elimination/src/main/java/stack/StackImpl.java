package stack;

import kotlinx.atomicfu.AtomicArray;
import kotlinx.atomicfu.AtomicRef;

import java.util.Random;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class StackImpl implements Stack {
    private static class Node {
        final AtomicRef<Node> next;
        final int x;

        Node(int x, Node next) {
            this.next = new AtomicRef<>(next);
            this.x = x;
        }
    }

    private static final int SIZE = 35;
    private static final int WAIT = 30;
    private AtomicArray<Integer> elArray = new AtomicArray<>(SIZE);


    // head pointer
    private AtomicRef<Node> head = new AtomicRef<>(null);
    final Random random = new Random();

    @Override
    public void push(int x) {
        int index = 1 + (int) (Math.random() * SIZE);
        for (int i = min(0, index - 1); i < max(SIZE, index + 1) - 1; i++) {
            Integer value = x;
            if (elArray.get(i).compareAndSet(null, value)) {
                for (int j = 0; j < WAIT; j++) {
                    Integer curV = elArray.get(i).getValue();
                    if (curV == null || curV != x) return;
                }
                if (elArray.get(i).compareAndSet(value, null)) break;
                return;
            }
        }
        while (true) {
            Node curHead = head.getValue();
            Node newHead = new Node(x, curHead);
            if (head.compareAndSet(curHead, newHead)) return;
        }
    }

    @Override
    public int pop() {
        int index = 1 + (int) (Math.random() * SIZE);
        for (int i = min(0, index - 1); i < max(SIZE, index + 1) - 1; i++) {
            Integer value = elArray.get(i).getValue();
            if (value != null && elArray.get(i).compareAndSet(value, null)) return value;
        }
        while (true) {
            Node curHead = head.getValue();
            if (curHead == null) return Integer.MIN_VALUE;
            if (head.compareAndSet(curHead, curHead.next.getValue())) return curHead.x;
        }
    }
}
