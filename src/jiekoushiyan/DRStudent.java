package jiekoushiyan;
//创建博士研究生对象
public class DRStudent implements Student, Teacher {
	private String name;                //姓名
	private String gender;              //性别
	private int age;                        //年龄
	private String major;                //专业
	private String banji;                 //班级
	private float feeOfTerm;         //每学期学费
	private float salaryOfMonth;  //每月薪水
	private float money = 0;          //当前的余额
//全参构造方法
	public DRStudent(String name, String gender, int age,String major,String banji, float feeOfTerm, float salaryOfMonth) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
		this.banji =banji;
		this.feeOfTerm = feeOfTerm;
		this.salaryOfMonth = salaryOfMonth;
	}
//获得姓名
	public String getName() {
		return name;
	}
//设置姓名
	public void setName(String name) {
		this.name = name;
	}
//获得性别
	public String getGender() {
		return gender;
	}
//设置性别
	public void setGender(String gender) {
		this.gender = gender;
	}
//获得年龄
	public int getAge() {
		return age;
	}
//设置年龄
	public void setAge(int age) {
		this.age = age;
	}
//设置专业
	public String getMajor() {
		return major;
	}
//得到专业
	public void setMajor(String major) {
		this.major = major;
	}
//得到班级
public String getBanji() {
		return banji;
	}
//设置班级
	public void setBanji(String banji) {
		this.banji = banji;
	}
//得到每学期学费
	public float getFeeOfTerm() {
		return feeOfTerm;
	}
//设置每学期学费
	public void setFeeOfTerm(float feeOfTerm) {
		this.feeOfTerm = feeOfTerm;
	}
//得到每月薪水
	public float getSalaryOfMonth() {
		return salaryOfMonth;
	}
//设置每月薪水
	public void setSalaryOfMonth(float salaryOfMonth) {
		this.salaryOfMonth = salaryOfMonth;
	}
//得到当前的余额
	public float getMoney() {
		return money;
	}
//设置当前的余额
	public void setMoney(float money) {
		this.money = money;
	}
//每年的学费=每学期的学费*2
	    public float feeOfYear() {
	        return feeOfTerm * 2;
	    }
//获得学费
public void getfee() {
	        money = money - feeOfTerm;
	    }
//获得薪水
	    public void getSalary() {
	        money = money + salaryOfMonth;
	    }

//每年的工资=每个月的工资*12
	    public float salaryOfYear() {
	        return salaryOfMonth * 12;
	    }
//获得学生信息
    public String toString() {
        return "学生信息 {" + "\n" +
                "姓名='" + name + '\'' + "\n" +
                "性别='" + gender + '\'' + "\n" +
                "年龄=" + age + " 岁\n" +
                "专业='" + major + '\'' + "\n" +
                "班级='" + banji + '\'' + "\n" +
                "学费=" + feeOfTerm + " 元/学期\n" +
                "工资=" + salaryOfMonth + " 元/月\n" +
                "余额=" + money + " 元\n" +
                '}';
    }
	
	public void statistics() {
		float tax = Tax.getTax(getMoney());
		System.out.println("信息统计：\n学生：" + getName() + "\n" + 
		"每学期学费：" + getFeeOfTerm() + "\n" + 
		"每学年学费："+ feeOfYear() +"\n"+
		"每月薪水：" + getSalaryOfMonth() + "\n" + 
		"每年薪水：" + salaryOfYear() + "\n"+ 
		"税前年收入：" + getMoney() + "\n" + 
		"需交税：" + tax + "\n" +
		"税后年收入：" + (money - tax));
	}


}