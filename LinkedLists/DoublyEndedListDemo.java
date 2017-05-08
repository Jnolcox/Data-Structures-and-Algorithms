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

public class DoublyEndedListDemo {
    public static void main(String[] args) {
        DoublyEndedList dList = new DoublyEndedList();

        dList.insertAtTail(19);
        dList.insertAtTail(18);
        dList.insertAtTail(17);

        System.out.println(dList);
    }
}
