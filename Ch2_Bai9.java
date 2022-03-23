import java.util.Scanner;
class Ch2_Bai9{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String n;char kytu;int daucach;     
        System.out.print("Nhap vao chuoi n: ");
        n=scanner.nextLine();
        System.out.println(n.length()+" ky tu co trong chuoi la: ");
        for(int i=0;i<n.length();i++){
           kytu=n.charAt(i);        
           System.out.println(kytu);         
        }       
    }
}