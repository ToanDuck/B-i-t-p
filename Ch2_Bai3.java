import java.util.Scanner;
class Ch2_Bai3{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String ten;
        int tuoi;
        System.out.println("Vui long nhap ten : ");
        ten=scanner.nextLine();
        System.out.println("Vui long nhap tuoi: ");
        tuoi=scanner.nextInt();
        if(tuoi<16)
        System.out.println("Ban "+ten+" o do tuoi vi thanh nien");
        else if(tuoi>=16&&tuoi<18)
        System.out.println("Ban "+ten+" o do tuoi truong thanh");
        else
        System.out.println("Ban "+ten+" đa gia");
    }
}