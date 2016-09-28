# findI
Find i==a[i] in a sorted array with distinct values

AmagicindexinanarrayA[0...n-1]isdefinedtobeanindexsuchthat A[i]
= i. Given a sorted array of distinct integers, write a method to find a magic index, if one exists, in arrayA.

Binary Search

FOLLOW UP
What if the values are not distinct?

//search left
int leftIndex=Math.min(mid-1, midValue);

//search right
int rightIndex=Math.max(mid+1,midValue);
