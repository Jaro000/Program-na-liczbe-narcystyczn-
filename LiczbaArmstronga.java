//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class LiczbaArmstronga {
    public LiczbaArmstronga() {
    }

    public static void main(String[] var0) {
        zadaniezArmstrongiem();
    }

    static void zadaniezArmstrongiem() {
        short var0 = 153;
        System.out.println(isArmstrong(var0));
    }

    static int iluCyfrowa(int var0) {
        int var1;
        for(var1 = 0; var0 > 0; var0 /= 10) {
            ++var1;
        }

        return var1;
    }

    static boolean isArmstrong(int var0) {
        int var1 = iluCyfrowa(var0);
        int var2 = 0;
        int var3 = var0;
        System.out.println("kopia = " + var0);

        while(var3 > 0) {
            int var4 = var3 % 10;
            System.out.println("cyfra1 = " + var4 + " wykladnik = " + var1);
            var3 /= 10;
            System.out.println("kopia = " + var3);
            var2 += (int)Math.pow((double)var4, (double)var1);
            System.out.println("suma = " + var2);
        }

        return var2 == var0;
    }
}
