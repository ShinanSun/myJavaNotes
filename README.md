# myJavaNotes
Camille Java Notes


#### Java directory
 project/module/package/class


#### Java Primitive Types
| Type        | Description | size               |
|-------------|-------------|--------------------|
| Integer（整数） | byte        | 1 byte             |
|             | short       | 2 byte             |
|             | int         | 4 byte 2^4 = 32 位  |
|             | long        | 8 byte 2^8 = 256 位 |
| Float（小数）   | float       | 4 byte 2^4 = 32 位  |
|             | double      | 8 byte 2^8 = 256 位 |
| 字节          | char        | 2 byte             |
| 真假          | boolean     | 1 byte             |

其他所有都是 =》 引用数据类型，e.g array， string
引用数据类型存储是地址值。
![Screenshot 2023-06-18 at 7.42.16 PM.png](..%2F..%2F..%2Fvar%2Ffolders%2F7z%2Fz3sj9gfj4qs2y8x72_lkrbgw0000gr%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_KxGWsQ%2FScreenshot%202023-06-18%20at%207.42.16%20PM.png)

类型转换 vs 强制转换
小的可以转大的， 大的不能轻易转小的。 强制转换需要casting

#### Java operators
increment ++
decrement --
- 如在variable前面（++a）， 先运算再assign
- 如在variable后面（a++）， 先assign再运算。
```agsl
int a = 10;
int b = a++;
// print a is 11, b is 10;
```

java operator precedence: https://introcs.cs.princeton.edu/java/11precedence/

java keywords: those are 51 reserved words. 

#### Java Methods
Method overloading: same method name, different parameters that Java will decide which method to run. we can change 
the parameters to make the method unique, not by changing the return type,
 
