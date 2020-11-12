package jiekoushiyan;

public class Test {
	public static void main(String []args){
		run();
	}
	
	public static void run() {

        DRStudent[] stu = new DRStudent[2];
        for (int i = 0; i < stu.length; i++) {
            System.out.println("初始化学生" + i);
            stu[i] = new DRStudent(
                    Utils.PutString("学生姓名:"),
                    Utils.select("选择性别", new String[]{"男", "女"}),
                    Utils.PutInt("学生年龄", 0, -1),
                    Utils.PutString("专业:"),
                    Utils.PutString("班级:"),
                    Utils.PutFloat("每学期学费", 0, -1),
                    Utils.PutFloat("每月工资", 0, -1)
            );
            System.out.println("已录入！\n" + stu[i]);
        }

        for (DRStudent drStudent : stu) {

            
            for (int j = 0; j < 2; j++) {
                drStudent.salaryOfYear();
            }

        
            for (int j = 0; j < 12; j++) {
                drStudent.getSalary();

            }

            drStudent.statistics();
            System.out.println();
        }
    }
}

