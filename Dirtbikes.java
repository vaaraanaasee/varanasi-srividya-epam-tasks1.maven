import java.util.Scanner;
//POLYMORPHISM
class rating
{
	public void brating() {
		System.out.println("\n");
		System.out.println("Review of Harley Davidson V Rod Muscle by Rick's Motorcycles");
}
}
class lbp extends rating
{
	public void brating()
	{
		System.out.println("\n");
		System.out.println("Looks of the Bike: 7.8 ");
		System.out.println("Body of the Bike: 7.5 ");
		System.out.println("Parts of the Bike: 8.1 ");
	}
}
//INHERITANCE
class parts
{
	public void bkdetails()
	{
		System.out.println("\n");
		System.out.println("Harley Davidson V Rod Parts");
		System.out.println("\n");
		System.out.println("Wheels Rick’s Motorcycles 9,0″ x 18″ 3,0″ x 19″\r\n" + 
				"Tires Metzeler Marathon 260/40 18″ 120/70 19″\r\n" + 
				"Exhaust System KessTech\r\n" + 
				"Headlights Rick’s Motorcycles Good Guys\r\n" + 
				"Airbox cover Rick’s Motorcycles Race\r\n" + 
				"Rear fender Rick’s Motorcycles Short\r\n" + 
				"Cut Rick’s Motorcycles GFK 240/260\r\n" + 
				"Front fender Rick’s Motorcycles 19″ VRod\r\n" + 
				"Front fork Harley Davidson\r\n" + 
				"Shock Arnott Airride\r\n" + 
				"Gas Tank Rick’s Motorcycles\r\n" + 
				"Turn Signals Rizoma\r\n" + 
				"License Plate Holder Rick’s Motorcycles\r\n" + 
				"Brake disc Rick’s Motorcycles Rodder\r\n" + 
				"Swingarm Rick’s Motorcycles CNC VRod\r\n" + 
				"Handlebar Rick’s Motorcycles Superbike Low\r\n" + 
				"Riser Rick’s Motorcycles Dirt\r\n" + 
				"Grips Harley-Davidson\r\n" + 
				"Pegs Harley-Davidson\r\n" + 
				"Seat Rick’s Motorcycles\r\n" + 
				"Painter Rick’s Motorcycles");
	}
}
//INTERFACE
interface model{
	public void mname();
}
class bmodel implements model{
	public void mname()
	{
		System.out.println("\n");
		System.out.println("The Bike Model is:V Rod muscle");
	}
}
//ABSTRACT CLASSES
abstract class Name { 
    final void print() { 
    	System.out.println("\n");
    	System.out.println("The Brand of the bike is : Harley Davidson"); } 
} 
   
class Brand extends Name {}

public class Dirtbikes{
	private String name;
	public String getname()
	{
		return name;
	}
	public void setname(String bname)
	{
		name=bname;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Name n=new Brand();
		n.print();
		bmodel b=new bmodel();
		b.mname();
		Dirtbikes db=new Dirtbikes();
		parts bk=new parts();
		bk.bkdetails();
		rating r=new rating();
		lbp x=new lbp();
		r.brating();
		x.brating();
		System.out.println("\n");
		System.out.println("enter your country name to see if the bike is available or not:");
		String s=sc.nextLine();
		db.setname(s);
		String u=s.toUpperCase();
		if(u.equals("USA"))
		{
			System.out.println("\n");
			System.out.println("USA is available");
		}
		else
		{
			System.out.println("\n");
			System.out.println(db.getname()+" is not available but you can import it from USA");
		}
		
		sc.close();
	}

}
