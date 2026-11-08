<h2><a href="https://www.geeksforgeeks.org/problems/padovan-sequence2855/1">Padovan Sequence</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given a number <strong>n</strong>, find the <strong>n<sup>th</sup></strong>&nbsp;number in the<strong> </strong>Padovan Sequence.&nbsp; </span><span style="font-size: 18px;">A&nbsp;Padovan Sequence&nbsp;is a sequence which is represented by the following recurrence relation<br>P(n) = P(n-2) + P(n-3)<br>P(0) = P(1) = P(2) = 1</span></p>
<p><span style="font-size: 18px;"><strong>Note</strong>: Since the output may be too large, compute the answer modulo 10^9+7.</span></p>
<p><span style="font-size: 18px;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 3
<strong>Output:</strong> 2
<strong>Explanation</strong>: We already know, P<sub>1</sub> + P<sub>0</sub> = P<sub>3 </sub>and P<sub>1 </sub>= 1 and P<sub>0</sub> = 1
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input</strong>: n = 4
<strong>Output:</strong> 2
<strong>Explanation</strong>: We already know, P<sub style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">4  </sub>= P<sub>2</sub>&nbsp;+ P<sub>1 </sub>and P<sub>2</sub> = 1 and P<sub>1</sub> = 1</span></pre>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Dynamic Programming</code>&nbsp;<code>series</code>&nbsp;<code>Modular Arithmetic</code>&nbsp;