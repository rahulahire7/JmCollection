import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class TestSetDemo {
	public static void main(String[] args) {
		Account a1=new Account(101,"Ramesh",10000);
		Account a2=new Account(100,"Ganesh",15000);
		Account a3=new Account(111,"Mahesh",1000);
		Account a4=new Account(111,"Mahesh",1000);

		Set<Account> hst=new HashSet<Account>();
		hst.add(a1);
		hst.add(a2);
		hst.add(a3);
		hst.add(a4);
		
		
		/*Set<Account> st=new TreeSet<Account>();
		System.out.println("test1");
		st.add(a1);
		System.out.println("test2");
		st.add(a2);
		System.out.println("test3");
		st.add(a3);
		System.out.println("test4");
		*/
		for(Account a:hst){
			System.out.println(a.getAccNo()+"\t"+a.getCustName()+"\t"+a.getAccBal());
		}
		
		
		
	}

}
