import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestList {
	public static void main(String[] args) {
		display(getData());
	}
	public static List<Account> getData(){
		String str=null;
		Scanner sc=new Scanner(System.in);
		
		//List<Account> lst=new LinkedList<Account>();
		List<Account> lst=new ArrayList<Account>();
		
		do
		{
			System.out.println("Ente acc no,name,bal ");
			lst.add(new Account(sc.nextInt(),sc.next(),sc.nextDouble()));
			System.out.println("do you want to add more object press yes/no ");
		}while(sc.next().equals("yes"));
		return lst;
	}
	public static void display(List<Account> lst){
		for(Account a:lst){
			System.out.println(a.getAccNo()+"\t"+a.getCustName()+"\t"+a.getAccBal());
		}
	}
}
