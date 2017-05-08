/*
 * Copyright (C) 2017 John Nolcox.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


public class Queue {
    private int[] items = new int[5];
    private int head = -1;
    private int tail = -1;
    private int numOfItems = 0; // this field makes the implementation easy, but we can implement even without it.

    public Queue() {}

    public Queue(int size) {
        this.items = new int[size];
    }

    public void enqueue(int item) {
        if (isFull())
            throw new RuntimeException("Queue is full");
        if (tail == items.length-1) // deal with circular case
            tail = -1;
        items[++tail] = item;
//		if (head == -1) head++;
        numOfItems++; // add 1 to the item count
    }

    public int dequeue() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        if (head == items.length-1)
            head = -1;
        numOfItems--;
        return items[++head];
    }

    public int peek() {
        return items[head+1];
    }

    public boolean isFull() {
        return numOfItems == items.length;
    }

    public boolean isEmpty() {
        return numOfItems == 0;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(10);
        q.enqueue(46);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(8);
        q.enqueue(10);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(13);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}