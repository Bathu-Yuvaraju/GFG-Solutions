<h2><a href="https://www.geeksforgeeks.org/problems/adding-array-element4756/1">Repeated Replacement of Min 2 with Sum</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given an array <strong>arr </strong>and an integer <strong>k</strong>, repeatedly remove the two smallest elements from the array and insert their sum back into the array. </span></p>
<p><span style="font-size: 18px;">Continue this process until every element in the array is greater than or equal to k. Return the minimum number of operations required. </span></p>
<p><span style="font-size: 18px;">If it is not possible to make all elements greater than or equal to k, return -1.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input: </strong><span style="font-size: 18px;">arr[] = [1, 10, 12, 9, 2, 3], k = 6
</span><strong style="font-size: 18px;">Output:</strong><span style="font-size: 18px;"> 2
</span><strong style="font-size: 18px;">Explanation:</strong><span style="font-size: 18px;"> Remove 1 and 2, then insert 3. The array becomes [3, 3, 9, 10, 12]. Next, remove 3 and 3, then insert 6. The array becomes {6, 9, 10, 12}. Now every element is at least 6, so the answer is 2. 
</span></span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [5, 4, 6, 4], k = 4
<strong>Output:</strong> 0
<strong>Explanation:</strong> All elements are already greater than or equal to 4.
</span></pre>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Heap</code>&nbsp;