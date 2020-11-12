package jiekoushiyan;
//按照不同阶段工资计算纳税的额度：
//不超过1500元的，按照3%;
//超过1500元至4500元的部分，按照10%；
//超过4500元至9000元的部分，按照20%；
//超过9000元至35000元的部分按照25%；
//超过35000元至55000元的部分，按照30%；
//超过55000元至80000元的部分，按照35%；
//超过80000元的部分，按照45%。
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

