import java.util.Scanner;
class GST{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the cost of product:");
        double cost = x.nextDouble();
        System.out.println("Enter the GST Percent:");
        int gst_prcnt = x.nextInt();

        double amount = cost+(gst_prcnt*cost)/100;
        System.out.println("********************************");
        System.out.println("*******/ GST CALCULATOR /*******");
        System.out.println("********************************");
        System.out.println("Cost Of Product:" + cost);
        System.out.println("GST% :" + gst_prcnt + "%");
        System.out.println("Cost Of Product [GST Inclusive]:" + amount);
    }
}