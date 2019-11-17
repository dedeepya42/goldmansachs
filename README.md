# goldmansachs
Coderpad Questions

1. Suppose we are given a string “aaabbbbbccccdaa”, then we to print “a3b5c4d1a2”.

2. Given an array in which there are arrays that are of length two, the first index of that array has the student name and the second index has the marks scored. Find the maximum average scored by any student. The array can have multiple subjects of marks for a particular student.

3. a/b + c/d = simple form
4. grid [][] contain coins find optimal path to collect most coins (only allowed north and east)

5. Given a string ” A B A B C A B A B C D”, you have to compress it into the following format:
A B * C * D.
Here, till A B * of the output, A B repeats twice, but till A B * C *, A B A B C repeats twice. I could not solve this and went to next question.

6. Given a matrix of numbers, the task was to collect the maximum numbers possible when going from bottom left corner of the matrix to top right corner of the matrix. The only two directions you can move are up and right. I was able to solve this.

7. Given two fractions which are represented as an array of two elements (numerator and denominator), the task to find the reduced fraction which is the sum of two fractions.

8. Given two sorted arrays, find the median of them.
9.  Trapping rain water problem.
10. Find minimum sub array whose sum is at least to the given target. eg: Sub array: 1, 2, 5, 6, 11, 2 Target: 12 Answer: 11, 2

11.  https://leetcode.com/problems/trapping-rain-water/ (Trapping the rainwater).
12. A variant of Knapsack (0-1 )- https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/ (She wanted the DP solution only. She was not accepting the recursive solution)

13. There are some students, sitting in a circle. Each student is assigned a roll no (1 to n). There is a teacher who was given an initial roll no and he has to remove the student with initial roll no. and then has to remove the student who was at that position starting from the removed student. Your function should return the last student left.
Example: 2, 3, 1, 4, 5 start with 3, remove 3, then remove 5, then remove 1 (follow circle), then remove 4. Ans – 2. Problem is similar to https://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/

14. Given a list of students with their scores in different subjects find the student with a max average score.

15. Median of two sorted arrays (without extra space). Link – https://www.geeksforgeeks.org/median-two-sorted-arrays-different-sizes-ologminn-m/
16. Given a log file, each line begins with some IP address, find the most frequent IP address.

17. https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
18. https://www.geeksforgeeks.org/median-two-sorted-arrays-different-sizes-ologminn-m/ O(n) accepted
19. https://leetcode.com/problems/string-compression/
20. https://www.geeksforgeeks.org/container-with-most-water/
21. Repeated Character Whose First Appearance is Leftmost
22. Find the first maximum length even word from a string
23. Write a function that takes input and output as shown under:-
    Input (string) Output (string)
    —– ——
    aaa a3
    aabbcc a2b2c2
    aaabcdd a3b1c1d2
    a a1

24. a) You are an avid rock collector who lives in southern California. Some rare and desirable rocks just became available in New York, so you are planning a cross-country road trip. There are several other rare rocks that you could pick up along the way. You have been given a grid filled with numbers, representing the number of rare rocks available in various cities across the country. Your objective is to find the optimal path from So_Cal to New_York that would allow you to accumulate the most rocks along the way.

Note: You can only travel either north (up) or east (right).
b) Consider adding some additional tests in doTestsPass().
c) Implement optimalPath() correctly.
d) Here is an example:
^
{{0, 0, 0, 0, 5}, New_York (finish) N
{0, 1, 1, 1, 0},
So_Cal (start) {2, 0, 0, 0, 0}} S
v
The total for this example would be 10 (2+0+1+1+1+0+5).


