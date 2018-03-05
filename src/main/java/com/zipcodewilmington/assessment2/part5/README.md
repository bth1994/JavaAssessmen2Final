## Election Problem 

HackLand is conducting an election to choose their leader. You have been invited to help out with the election process.

Each voter writes the name of a candidate on a ballot and places it in a ballot box. The candidate with the highest number of votes wins the election. If two or more candidates have the same number of votes, then the tied candidates' names are ordered alphabetically and the last name in the alphabetical order wins.

 

### Function Description

Complete the electionWinner function in the editor below. It has the following properties:

```
public String electionWinner(String[] votes) 
```

### Sample Test Case

```
@Test
public void electionWinnerTest1(){
   String[] votes = {"Alex",
   "Michael",
   "Harry",
   "Dave",
   "Michael",
   "Victor",
   "Harry",
   "Alex",
   "Mary",
   "Mary"};
   ElectionLand electionLand = new ElectionLand();
   String expected = "Michael";
   String actual = electionLand.electionWinner(votes);
   Assert.assertEquals(expected, actual);
}

```

### Explanation

The votes tally is:

* ***2 votes:*** Alex, Harry, Michael, Mary
* ***1 vote:*** Dave, Victor
 

The highest vote count is 2, and among those receiving 2 votes, the last name alphabetically is Michael

