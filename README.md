# ilivalidator-benchmark

```
jbang edit -b run_ilivalidator.java
```
## dedicated vcpu 

nur xtf, kein itf, sieht dann vielleicht wieder anders aus.

32GB RAM -> 1/2 davon automatisch Heap

GraalVM 23:
- Time taken: 4210 seconds
- Time taken: 4032 seconds
- Time taken: 3976 seconds
- Time taken: 4001 seconds

GraalVM 21:
- Time taken: 3993 seconds
- Time taken: 4036 seconds
- Time taken: 4017 seconds 
- Time taken: 3948 seconds

OpenJDK 21:
- Time taken: 4021 seconds
- Time taken: 3964 seconds
- Time taken: 3951 seconds
- Time taken: 3984 seconds

GraalVM 17:
- Time taken: 3995 seconds
- Time taken: 3994 seconds
- Time taken: 4022 seconds
- Time taken: 4033 seconds

OpenJDK 17:
- Time taken: 4352 seconds
- Time taken: 4316 seconds
- Time taken: 4343 seconds
- Time taken: 4353 seconds

OpenJDK 11:
- Time taken: 4334 seconds
- Time taken: 4298 seconds
- Time taken: 4284 seconds
- Time taken: 4217 seconds

OpenJDK 8:
- Time taken: 4041 seconds
- Time taken: 4112 seconds
- Time taken: 4119 seconds
- Time taken: 4142 seconds

GraalVM 21 (ParallelGC):
- Time taken: 3592 seconds
- Time taken: 3561 seconds
- Time taken: 3630 seconds
- Time taken: 3606 seconds

GraalVM 21 (ParallelGC, 4GB):
- Time taken: 3735 seconds
- Time taken: 3740 seconds
- Time taken: 3749 seconds
- Time taken: 3758 seconds

## shared vcpu
GraalVM 23:
- Time taken: 8072 seconds
- Time taken: 8256 seconds
- Time taken: 8107 seconds
- 
GraalVM 23 ParallelGC:
- Time taken: 7316 seconds

GraalVM 23 ParallelGC 2GB Heap:
- Time taken: 9712 seconds
- Time taken: 9639 seconds Mindestens beim zweiten Mal: Error: GC overhead limit exceeded

GraalVM 23 ParallelGC 4GB Heap:
- Time taken: 7465 seconds


OpenJDK 11 ParallelGC:
- Time taken: 7460 seconds
- 

## local

- Time taken: 3527 seconds GraalVM 21
-  Time taken: 3788 seconds --java-options="-XX:+UseParallelGC"
- Time taken: 3890 seconds java 17
- Time taken: 3911 seconds java 17
- Time taken: 3602 seconds (21 , string depulication)