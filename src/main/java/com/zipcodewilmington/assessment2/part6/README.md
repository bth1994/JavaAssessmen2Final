## The Love-Letter Mystery

John wants to write a love letter to his crush but is too shy to make it obvious. He decides to change all the words in the letter into palindromes. so it can only be deciphered by someone sufficiently intelligent, passionate, and lucky to boot.

To do this, he sets himself two 2 rules:

* He can reduce the value of a letter, e.g. he can change 'd' to 'c', but he cannot change 'c' to 'd'.
* In order to form a palindrome, if can repeatedly reduce the value of any of the letters of a word, but only down to the letter 'a'.
 

Each reduction in the value of any letter counts as a single operation. 
 

Complete the mystery function in your editor. It has 1 parameters:

* A string array, letter, where letteri denotes i<sup>th</sup> love letter.
 

It must return an integer array, where ith element in the arrays denotes the minimum number of operations required to convert letteri into a palindrome.


### Sample Test Case 1

```
@Test
public void mysteryTest1(){
    LoveLetter loveLetter = new LoveLetter();
    String[] input = {"abc", "abcba", "abcd"};
    Integer[] expected = {2,0,4};
    Integer[] actual = loveLetter.mystery(input);
    Assert.assertArrayEquals(expected, actual);
}
```
 
### Explanation

For the first test case, 2 operations are: abc ⇒ abb ⇒ aba.

For the second test case, abcba is already a palindrome.

For the third test case, 4 operations are: abcd ⇒ abcc ⇒ abcb ⇒ abca ⇒ abca ⇒ abba