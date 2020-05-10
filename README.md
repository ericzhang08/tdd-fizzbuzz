# TDD @FizzBuzz


## 开发环境
 - JDK1.8+
 
## 业务需求

你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有N名学生在上课。游戏的规则是：

- 让所有学生排成一队，然后按顺序报数。

- 学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz；如果所报数字是5的倍数，那么要说Buzz；如果所报数字是第7的倍数，那么要说Whizz。

- 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。

## tasking

- [ ] given number is not dividable by any number when say then return raw number
- [ ] given number is dividable by 3 when say then return fizz
- [ ] given number is dividable by 5 when say then return buzz
- [ ] given number is dividable by 7 when say then return whizz
- [ ] given number is dividable by 3 and 5 when say  then return  fizzbuzz
- [ ] given number is dividable by 3 and 7 when say then return fizzWhizz
- [ ] given number is dividable by 5 and 7 when say  then return buzzWhizz
- [ ] given number is dividable by 3 and 5 and 7 when say then return fizzbuzzWhizz
- [ ] given number contains 3 when say then return fizz   13 
- [ ] given number contains 3 and is dividable by all number when say then return fizz 2310
- [ ] given number contains 5 and is dividable by all number when say then return BuzzWhizz  2415
- [ ] given number contains 3 and 5 and is dividable by all number should return  buzzWhizz  1365
- [ ] given number contains 7 and is  dividable by all number when say return FizzWhizz 1470 
- [ ] given number contains 3 and 7 is dividable by all number when say return fizz 2730
- [ ] given number contains 5 and 7 and is dividable by 3 and 5 and 7 shoud return FizzWhizz 1785
- [ ] given number contains 3 and 5 and 7 and is dividable by 3 and 5 and 7 should return  FizzWhizz   735

## question
1. tdd是不是把所有的条件分支都在测试里面列出来

2. 后面的测试影响到前面的测试应该如何办？
  1. 修改原有的测试，那怎么保证以前的场景被cover

3. 当当前的实现方式与后面需要实现的需求改动量非常大的时候，如何保证小步快跑?

## What we have learned
tasking的时候不要想着怎么实现，而是将所有的case都列举出来

