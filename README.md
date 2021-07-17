# fizz-buzz game

## 基本需求
写一个程序打印1到100这些数字: 
* 但是遇到数字为3的倍数的时候，打印“Fizz”替代数字， 
* 5的倍数用“Buzz”代替， 
* 既是3的倍数又是5的倍数打印“fizzbuzz.FizzBuzz”。

## 扩展需求
遇到包含3的数字打印“Fizz” 
遇到包含5的数字打印“Buzz”
如果既包含3，又包含5时，打印"fizzbuzz.FizzBuzz"


## 需求澄清 

既是3的倍数又是5的倍数打印“fizzbuzz.FizzBuzz”。
如果既包含3，又包含5时，打印"fizzbuzz.FizzBuzz"

如果被3包含，又被5整除时，打印什么呢？
打印"fizzbuzz.FizzBuzz" 

即两个需求结合：

如果是3的倍数或者包含3，又是5的倍数或者包含5时，打印"fizzbuzz.FizzBuzz"


测试用例：

```text

基本需求：

Input  1,2  =>  “1”,”2”

input  3,9  =>   Fizz

Input  5,10,20 => Buzz

Input   15 =>  fizzbuzz.FizzBuzz


扩展需求：

input  13,31 => Fizz

Input  52  => Buzz

同时包含3，包含5 
input  35 => fizzbuzz.FizzBuzz

包含3 ，被5整除
input  305  => fizzbuzz.FizzBuzz

被3整除，包含5
input   51  => fizzbuzz.FizzBuzz





```
