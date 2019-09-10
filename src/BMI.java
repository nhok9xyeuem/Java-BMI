import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight , height;
        Scanner input=new Scanner(System.in);
        System.out.println("Moi Ban Nhap Can Nang");
        weight=input.nextInt();
        System.out.println("Moi Ban Nhap Chieu Cao");
        height=input.nextDouble();

        while (weight<0 || height<0){
            System.out.println("Moi Ban Nhap Can Nang");
            weight=input.nextInt();
            System.out.println("Moi Ban Nhap Chieu Cao");
            height=input.nextDouble();
        }

        double bmi;
        bmi=weight/(height*height);
        if (bmi<18){
            System.out.println("Ban Qua Gay , Can Tang Can Ngay: " + bmi);
        }else if (18<=bmi && bmi<25){
            System.out.println("Ban  Muc Do Binh Thuong : "+bmi);
        }else if (25<=bmi && bmi<30){
            System.out.println("Ban Hoi Beo , Nen Giam Can Di : "+bmi);
        }else {
            System.out.println("Ban Beo Qua Muc Quy Dinh : ");
        }
    }
}
