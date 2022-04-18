#syntax 

import java.util.Scanner
Scanner s = new Scanner(System.in)

凡是带有else分支的，一定会保证有一个分支被执行。

如果只有一条java语句，大括号可以省略

嵌套的if语句不要冗杂在一起分析
 if() {
	 这里如果有嵌套，可以单独拿出来分析，这样更有层次一些
 } else {
 }

switch语句
switch（值，可能是int或者string）{
	case1(值)：{
		java语句。。。;
		break;
	}
	case2(值)：{
		java语句。。。
		break; 
	}
	default: {
		java语句。。
	}
}
注意， case可以合并 case 1: case 2: case 3: 

for loop  for(int x=0; x<2; x++) 
如果条件表达式是真， 执行java语句 并且更新x 然后再判断 条件表达式。
如果条件表达式是假，退出 for loop.

f0r(;;) 这是一个死循环

初始化表达式，条件表达式和更新表达式 都不是必须的

i 变量属于for循环的局部变量，for循环结束 储存i的内存就被释放了

do{} while(); 记住， do while后面要接分号. 因为大括号代表结束，所以不用加分号，但是小括号不代表结束，所以需要分号。

do while 先执行循环体，在判断while跟的布尔表达式。简称，先斩后奏

break执行不会让整个方法结束，主要是用来终止离它最近的循环

a: for , 这个语法意思是给这个for loop取名为a；  break a; 意思是专门break a loop

continue意思是终止当前本次循环，直接跳到一下个更新表达式。 同时，continue后面也可以直接接循环名字（循环名字意味着更新那个循环的更新表达式）








