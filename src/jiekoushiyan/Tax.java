package jiekoushiyan;
//���ղ�ͬ�׶ι��ʼ�����˰�Ķ�ȣ�
//������1500Ԫ�ģ�����3%;
//����1500Ԫ��4500Ԫ�Ĳ��֣�����10%��
//����4500Ԫ��9000Ԫ�Ĳ��֣�����20%��
//����9000Ԫ��35000Ԫ�Ĳ��ְ���25%��
//����35000Ԫ��55000Ԫ�Ĳ��֣�����30%��
//����55000Ԫ��80000Ԫ�Ĳ��֣�����35%��
//����80000Ԫ�Ĳ��֣�����45%��
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
   
   public static boolean inRange(float num, float min, float max) {
	   if(min>0&&num<min) return false;
	   if(max>0&&num>max) return false;
	   return true;
   }
}

