
import java.util.Scanner;
class Bai1{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    float a,b;
    System.out.println("Nhap so a: ");
    a=scanner.nextFloat();
    System.out.println("Nhap so b: ");
    b=scanner.nextFloat();
    // 1. Tính tổng, hiệu, tích, thương, phép chia lấy dư của 2 số đó.
    float tong=a+b;
    System.out.println(a+"+"+b+"="+tong);
    float hieu=a-b;
    System.out.println(a+"-"+b+"="+hieu);
    float tich=a*b;
    System.out.println(a+"*"+b+"="+tich);
    float thuong=a/b;
    System.out.println(a+"/"+b+"="+thuong);
    float du=a%b;
    System.out.println(a+"%"+b+"="+du);
    // 2. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó.
        System.out.println("Ket qua so sanh bang 2 so " +a+ " va " + b + " la " + (a==b));
        System.out.println("Ket qua so sanh khong bang 2 so " +a+ " va " + b+ " la " + (a != b));
        System.out.println("Ket qua so sanh lon hon 2 so " + a + " va " + b + " la " + (a > b));
        System.out.println("Ket qua so sanh lon hon hoac bang 2 so " + a + " va " +  b + " la " + (a >= b));
        System.out.println("Ket qua so sanh nho hơn 2 so " + a + " va " + b + " la " + (a < b));
        System.out.println("Ket quả so sanh nho hon hoac bang 2 so " + a + " va " +b + " la " + (a <= b));
}
}
