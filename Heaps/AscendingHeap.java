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

import java.util.Arrays;

public class AscendingHeap {
    private Integer[] heapData;
    private int currentPosition = -1;

    public AscendingHeap(int size) {
        this.heapData = new Integer[size];
    }

    public void insert(int item) {
        if (isFull())
            throw new RuntimeException("Heap is full");
        this.heapData[++currentPosition] = item;
        fixUp(currentPosition);
    }

    public int deleteRoot() {
        int result = heapData[0];
        heapData[0] = heapData[currentPosition--];
        heapData[currentPosition+1] = null;
        fixDown(0);
        return result;
    }

    private void fixDown(int index) {
        while (index <= currentPosition) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            if (leftChild <= currentPosition) {
                int childToSwap;
                if (rightChild > currentPosition)
                    childToSwap = leftChild;
                else
                    childToSwap = (heapData[leftChild] < heapData[rightChild]) ? leftChild : rightChild;

                if (heapData[index] > heapData[childToSwap]) {
                    int tmp = heapData[index];
                    heapData[index] = heapData[childToSwap];
                    heapData[childToSwap] = tmp;
                } else {
                    break;
                }
                index = childToSwap;
            } else {
                break;
            }

        }
    }

    private void fixUp(int index) {
        int i = (index-1)/2; //parent index
        while (i >= 0 && heapData[i] > heapData[index]) {
            int tmp = heapData[i];
            heapData[i] = heapData[index];
            heapData[index] = tmp;
            index = i;
            i = (index-1)/2;
        }
    }

    private boolean isFull() {
        return currentPosition == heapData.length-1;
    }

    public static void main(String[] args) {
        AscendingHeap heap = new AscendingHeap(10);
        heap.insert(10);
        heap.insert(15);
        heap.insert(27);
        heap.insert(5);
        heap.insert(2);
        heap.insert(21);
        System.out.println(heap.deleteRoot());
        System.out.println(Arrays.deepToString(heap.heapData));
    }

}