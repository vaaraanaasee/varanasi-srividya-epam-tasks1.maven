package com.code.sweets.newyeargift;
import java.util.*;
interface methods
{
	public int totalweightofchocolates(int choco[],int i);
	public void printc(int choco[],int i);
}
interface methods1{
	public int totalweightofothersweets(int other[],int j);
	public void printos(int other[],int i);
}
class giftcalculationofchoco implements methods
{
	public int sum,a;
	public int totalweightofchocolates(int choco[],int i) {
		sum=0;
		for(int k=0;k<choco.length;k++)
		{
			a=choco[k];
			switch(a)
			{
			case 1:sum+=85;break;
			case 2:sum+=100;break;
			case 3:sum+=144;break;
			case 4:sum+=90;break;
			case 5:sum+=110;break;
			case 6:sum+=70;break;
			}
			
		}
		return sum;
	}
	public void printc(int choco[],int i)
	{
		a=0;
		if(choco.length!=0) {
			System.out.println("The chocolates you have selected:");
		for(int k=0;k<choco.length;k++)
		{
			a=choco[k];
			switch(a)
			{
			case 1:System.out.println("Kitkat Chocolates");break;
			case 2:System.out.println("Bournville Chocolates");break;
			case 3:System.out.println("Ferrero Rocher Chocolates");break;
			case 4:System.out.println("Imported Chocolates");break;
			case 5:System.out.println("Dairy Milk Chocolates");break;
			case 6:System.out.println("Lindt Swiss Classic Chocolates");break;
			}
		}
	}
		else {
			System.out.println("You have selected no chocolates");
		}
		}
	}
class giftcalculationofother implements methods1{
	public int sum,a;
	public int totalweightofothersweets(int other[],int j) {
		 sum=0;
		 for(int k=0;k<other.length;k++)
		{
			a=other[k];
			switch(a)
			{
			case 1:sum+=8500;break;
			case 2:sum+=10000;break;
			case 3:sum+=14000;break;
			case 4:sum+=90000;break;
			case 5:sum+=11000;break;
			case 6:sum+=7070;break;
			case 7:sum+=90000;break;
			case 8:sum+=80000;break;
			case 9:sum+=60000;break;
			case 10:sum+=77770;break;
			}
		}
		
		return sum;
	}
	public void printos(int other[],int i) {
		a=0;
		if(i!=0) {
			System.out.println("The other sweets you have selected:");
			for(int k=0;k<other.length;k++) {
			a=other[k];
			switch(a)
			{
			case 1:System.out.println("Classic Jelly Donuts");break;
			case 2:System.out.println("Merry Meringues ");break;
			case 3:System.out.println("Skillet Cookie Sundaes");break;
			case 4:System.out.println("Waffle Dippers");break;
			case 5:System.out.println("Ruby Red Grapefruit Tartlets");break;
			case 6:System.out.println("Fudgy Beet Brownies");break;
			case 7:System.out.println("Three-Ingredient Chocolate Mousse ");break;
			case 8:System.out.println("Chocolate Hazelnut Caramel Tart");break;
			case 9:System.out.println("Fancy Fortune Cookies");break;
			case 10:System.out.println("S'mores Icebox Cake");break;
			
			}
		}
	}
		else {
			System.out.println("You have selected no othersweets");
		}
		}
	
}
public class newyearsweets {

	public static void main(String[] args) {
		int i=0,n=0,j=0,p=0;
		Scanner sc=new Scanner(System.in);
		int choco[]= new int[1000];
		int other[]=new int[1000];
		
		//the hierarchy of chocolates and other sweets
		//CHOCOLATES
		while(n!=1)
		{
			System.out.println("Do you want Chocolates(Y/N): ");
			String c=sc.next();
			if(c.equals("Y")) 
			{
				System.out.println("CHOCOLATES for new year gift\n");
				System.out.println("1.Kitkat Chocolates\n"+
				"2.Bournville Chocolates\n"+
						"3.Ferrero Rocher Chocolates\n"+
				"4.Imported Chocolates\n"+
						"5.Dairy Milk Chocolates\n"+
				"6.Lindt Swiss Classic Chocolates\n");
				choco[i++]=sc.nextInt();p++;
			}
			else 
			{
				n=1;
				}
		}
		n=0;
		/*for(j=0;j<i;j++)
			System.out.println(choco[i]);*/
		//OTHER SWEETS
		Scanner s=new Scanner(System.in);
		while(n!=1)
		{
			System.out.println("Do you want other sweets(Y/N):");
			String c1=s.next();
			if(c1.equals("Y"))
			{
				System.out.println();
				System.out.println("OTHER SWEETS for new year gift\n");
				System.out.println("1.Classic Jelly Donuts\n"
						+"2.Merry Meringues \n"+
						"3.Skillet Cookie Sundaes \n"+
						"4.Waffle Dippers \n"+
						"5.Ruby Red Grapefruit Tartlets \n"+
						"6.Fudgy Beet Brownies \n"+
						"7.Three-Ingredient Chocolate Mousse \n"+
						"8.Chocolate Hazelnut Caramel Tart\n"+
						"9.Fancy Fortune Cookies\n"+
						"10.S'mores Icebox Cake \n");
				int b=s.nextInt();
				other[j++]=b;p++;
			}
			else 
			{
				n=1;
			}
		}
		giftcalculationofchoco gc=new giftcalculationofchoco();
		int a=gc.totalweightofchocolates(choco,i);
		giftcalculationofother go=new giftcalculationofother();
		int b=go.totalweightofothersweets(other,j);
		System.out.println("The total weights of chocolates is "+(a*0.001)+" kgs");
		System.out.println("The total weights of other sweets is "+(b*0.001)+" kgs");
		System.out.println("The total weights of chocolate and other sweets is "+((a+b)*0.001)+" kgs");
		System.out.println();
		gc.printc(choco,i);
		System.out.println();
		go.printos(other,j);
		System.out.println("the total number of candies in the gift should be "+p);
		s.close();sc.close();
}
	}