package jiekoushiyan;

public class Test {
	public static void main(String []args){
		run();
	}
	
	public static void run() {

        DRStudent[] stu = new DRStudent[2];
        for (int i = 0; i < stu.length; i++) {
            System.out.println("��ʼ��ѧ��" + i);
            stu[i] = new DRStudent(
                    Utils.PutString("ѧ������:"),
                    Utils.select("ѡ���Ա�", new String[]{"��", "Ů"}),
                    Utils.PutInt("ѧ������", 0, -1),
                    Utils.PutString("רҵ:"),
                    Utils.PutString("�༶:"),
                    Utils.PutFloat("ÿѧ��ѧ��", 0, -1),
                    Utils.PutFloat("ÿ�¹���", 0, -1)
            );
            System.out.println("��¼�룡\n" + stu[i]);
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

