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

public class TowerOfHanoi {

    public void move(int numberOfDiscs, char from, char to, char inter) {

        if (numberOfDiscs == 1) {
            System.out.println("Moving Disc 1 from " + from + " to " + to);
        } else {
            move(numberOfDiscs-1, from, inter, to);
            System.out.println("Moving Disc " + numberOfDiscs + " from " + from + " to " + to);
            move(numberOfDiscs-1, inter, to, from);
        }
    }

    public static void main(String[] args) {
        int numSteps = 0;
        TowerOfHanoi toh = new TowerOfHanoi();
        toh.move(3, 'A', 'C', 'B');
        System.out.println();
    }
}
