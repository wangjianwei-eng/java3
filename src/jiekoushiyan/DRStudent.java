package jiekoushiyan;
//������ʿ�о�������
public class DRStudent implements Student, Teacher {
	private String name;                //����
	private String gender;              //�Ա�
	private int age;                        //����
	private String major;                //רҵ
	private String banji;                 //�༶
	private float feeOfTerm;         //ÿѧ��ѧ��
	private float salaryOfMonth;  //ÿ��нˮ
	private float money = 0;          //��ǰ�����
//ȫ�ι��췽��
	public DRStudent(String name, String gender, int age,String major,String banji, float feeOfTerm, float salaryOfMonth) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.major = major;
		this.banji =banji;
		this.feeOfTerm = feeOfTerm;
		this.salaryOfMonth = salaryOfMonth;
	}
//�������
	public String getName() {
		return name;
	}
//��������
	public void setName(String name) {
		this.name = name;
	}
//����Ա�
	public String getGender() {
		return gender;
	}
//�����Ա�
	public void setGender(String gender) {
		this.gender = gender;
	}
//�������
	public int getAge() {
		return age;
	}
//��������
	public void setAge(int age) {
		this.age = age;
	}
//����רҵ
	public String getMajor() {
		return major;
	}
//�õ�רҵ
	public void setMajor(String major) {
		this.major = major;
	}
//�õ��༶
public String getBanji() {
		return banji;
	}
//���ð༶
	public void setBanji(String banji) {
		this.banji = banji;
	}
//�õ�ÿѧ��ѧ��
	public float getFeeOfTerm() {
		return feeOfTerm;
	}
//����ÿѧ��ѧ��
	public void setFeeOfTerm(float feeOfTerm) {
		this.feeOfTerm = feeOfTerm;
	}
//�õ�ÿ��нˮ
	public float getSalaryOfMonth() {
		return salaryOfMonth;
	}
//����ÿ��нˮ
	public void setSalaryOfMonth(float salaryOfMonth) {
		this.salaryOfMonth = salaryOfMonth;
	}
//�õ���ǰ�����
	public float getMoney() {
		return money;
	}
//���õ�ǰ�����
	public void setMoney(float money) {
		this.money = money;
	}
//ÿ���ѧ��=ÿѧ�ڵ�ѧ��*2
	    public float feeOfYear() {
	        return feeOfTerm * 2;
	    }
//���ѧ��
public void getfee() {
	        money = money - feeOfTerm;
	    }
//���нˮ
	    public void getSalary() {
	        money = money + salaryOfMonth;
	    }

//ÿ��Ĺ���=ÿ���µĹ���*12
	    public float salaryOfYear() {
	        return salaryOfMonth * 12;
	    }
//���ѧ����Ϣ
    public String toString() {
        return "ѧ����Ϣ {" + "\n" +
                "����='" + name + '\'' + "\n" +
                "�Ա�='" + gender + '\'' + "\n" +
                "����=" + age + " ��\n" +
                "רҵ='" + major + '\'' + "\n" +
                "�༶='" + banji + '\'' + "\n" +
                "ѧ��=" + feeOfTerm + " Ԫ/ѧ��\n" +
                "����=" + salaryOfMonth + " Ԫ/��\n" +
                "���=" + money + " Ԫ\n" +
                '}';
    }
	
	public void statistics() {
		float tax = Tax.getTax(getMoney());
		System.out.println("��Ϣͳ�ƣ�\nѧ����" + getName() + "\n" + 
		"ÿѧ��ѧ�ѣ�" + getFeeOfTerm() + "\n" + 
		"ÿѧ��ѧ�ѣ�"+ feeOfYear() +"\n"+
		"ÿ��нˮ��" + getSalaryOfMonth() + "\n" + 
		"ÿ��нˮ��" + salaryOfYear() + "\n"+ 
		"˰ǰ�����룺" + getMoney() + "\n" + 
		"�轻˰��" + tax + "\n" +
		"˰�������룺" + (money - tax));
	}


}