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

public class DoublyLinkedList {
    private DoublyLinkedNode head;

    public void insertAtHead (int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(this.head);
        if (this.head != null) {
            this.head.setPreviousNode(newNode);
        }
        this.head = newNode;
    }

    public int length() {
        if (head == null)
            return 0;
        int length = 0;
        DoublyLinkedNode current = this.head;

        while (current != null) {
            length +=1;
            current = current.getNextNode();
        }
        return length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DoublyLinkedNode n = this.head;

        while (n != null) {
            sb.append("Node data");
            sb.append(n);
            sb.append("\n");

            n = n.getNextNode();
        }
        return sb.toString();
    }
}
