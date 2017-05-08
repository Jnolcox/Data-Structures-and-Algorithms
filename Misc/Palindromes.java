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

import java.util.Scanner;

public class Palindromes {

    /**
     * Given a String as an input, write a method to check if the String is a palindrome.
     *
     * A palindrome is a word, phrase, number, or other sequence of characters which reads
     * the same backward or forward. Factor in capital letters, punctuation, and word dividers.
     */

    public boolean evaluate(String word) {
        if (word == null) {
            throw new IllegalArgumentException("You can't pass a null string as input");
        }
        boolean result = true;

        int length = word.length();

        for (int i = 0; i < length/2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }

}
