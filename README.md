## 实验目的：
* 掌握Java中抽象类和抽象方法的定义； 
* 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
* 了解异常的使用方法，并在程序中根据输入情况做异常处理
## 实验内容及要求
* 某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
* 设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
* 设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）
* 编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额
* 1.在博士研究生类中实现各个接口定义的抽象方法;
* 2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；
* 3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
* 4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
* 5.根据输入情况，要在程序中做异常处理。
## 实验设计与核心代码
* 1.设计两个管理接口：
* 学生管理接口Sudent（缴纳学费、查学费抽象方法）
    * getfee     缴纳学费
    * feeOfYear  查询学费
* 教师管理接口Teacher（发放薪水、查询薪水抽象方法）
    * getSalary   发放薪水
    * salaryOfYear查询薪水
* 2.设计博士研究生类DRStudents，实现上述的两个接口（属性：姓名、性别、年龄、专业、班级、每学期学费、每月薪水）
    * String name           姓名
    * String gender         性别
    * int age               年龄
    * String Major          专业
    * String banji          班级
    * float feePerTerm      每学期学费
    * float salaryPerMonth  每月薪水
    * float money = 0       当前余额<br/> 
    * 然后根据两者之差（对年学费和年收入进行统计，用收入减去学费）求得纳税额算出每名博士研究生的年应纳税金额
* 3.设计纳税算法类Tax纳税算法依据国家最新工资纳税标准，方法用static final修饰定义
* 4.实例化研究生类时，采用运行时通过main方法的参数args一次性赋值以及采用Scanner类实现运行时交互式输入
* 5.根据输入情况，在程序中做异常处理类Utils (分别作了输入字符型数据的异常处理、输入浮点型数据的异常处理和输入整型数据的异常处理)
* 6.编写测试类Test，实例化两名博士研究生，统计他们的年收入和学费

### 税务计算实现代码
* 将数值存储在两个数组中，通过数组的下标判断所在税务档位，并取出另一个数组对应档位的税额百分比进行计算。
```java
public class Tax {
   final static float[] tax = {0.03f,0.1f,0.2f,0.25f,0.35f,0.45f};
   final static int[ ][ ] rules = {{0, 3000}, {3000, 12000}, {12000, 25000}, {25000, 35000}, {35000, 55000}, {55000, 80000}, {80000, -1}};
   public static float getTax(float revenues) {
       return tax[getLevel(revenues)] * revenues;
   }
   public static int getLevel(float revenues) {
       for (int i = 0; i < rules.length; i++) {
           if (inRange(revenues, rules[i][0], rules[i][1])) return i;
       }
       return rules.length - 1;
   }
 //用boolean来判断
   public static boolean inRange(float num, float min, float max) {
	   if(min>0&&num<min) return false;
	   if(max>0&&num>max) return false;
	   return true;
   }
}
```
## 实验截图与结果
### 实验结果
![1](https://github.com/wangjianwei-eng/java3/blob/main/src/%E6%B5%8B%E8%AF%951.JPG)<br/>
![2](https://github.com/wangjianwei-eng/java3/blob/main/src/%E6%B5%8B%E8%AF%952.JPG)
### 异常处理
![3](https://github.com/wangjianwei-eng/java3/blob/main/src/%E5%BC%82%E5%B8%B8%E5%A4%84%E7%90%86.JPG)
## 实验感想
* 掌握了接口的使用方法
* 掌握了抽象类和抽象方法的定义
* 明白了定义异常处理的方法
