package src;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		/*int z=Integer.parseInt(args[0]);
        int x =Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        for(int i=1;i<y;i++) {
        	z=z*x;}
        System.out.println("2^3="+z); */
		
		Scanner sc=new Scanner(System.in);
		int number1,number2;
		System.out.println("Ýlk sayýyý (tabaný) giriniz");
		number1=sc.nextInt();
		System.out.println("Ýkinci sayýyý (üssü( giriniz");
		number2=sc.nextInt();
		
		int u=number1;
		
		for(int i=1;i<number2;i++) {
        	u=u*number1;}
        System.out.println("Sonuc="+u);
		
        
        System.out.println("Lütfen bir deðer giriniz:");
        int para;
        para=sc.nextInt();
        int kalan,kagit;
        kagit=0;
        
        kalan=para%10;
        if(kalan==1) {System.out.println("1 tlnizi yedim :) ");}
        if(kalan==2) {System.out.println("2 tlnizi yedim :) ");}
        if(kalan==3) {System.out.println("2 tlmizi yediniz :( ");
        kagit++;}
        if(kalan==4) {System.out.println("1 tlmizi yediniz :( ");
        kagit++;}
        if(kalan==6) {System.out.println("1 tlnizi yedim :) ");}
        if(kalan==7) {System.out.println("2 tlnizi yedim :) ");}
        if(kalan==8) {System.out.println("2 tlmizi yediniz :( ");
        kagit++;}
        if(kalan==9) {System.out.println("1 tlmizi yediniz :( ");
        kagit++;}
        
       
        	
             while(para/50!=0){
            	 kagit++;
               para=para-50;
            }
             while(para/20!=0){
            	 kagit++;
               para=para-20;
            }
             while(para/10!=0){
            	 kagit++;
               para=para-10;
            }
             while(para/5!=0){
            	
            	 kagit++;
               para=para-5;
            }
             
             
             

System.out.println("Kagit para sayisi="+kagit);






		
	}

}
