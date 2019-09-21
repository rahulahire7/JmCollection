import java.util.*;
public class TestCollection {
	public static void main(String[] args) {
List <Integer> lst=new LinkedList<Integer>();
lst.add(new Integer(10));
lst.add(new Integer(100));
lst.add(new Integer(10));
lst.add(new Integer(50));
lst.add(5);//AutoBoxing...
System.out.println("list is :"+lst);
System.out.println(lst.contains(50));
lst.remove(2);
System.out.println(lst);
System.out.println(lst.indexOf(50));
//lst.sort(c);
Set<Integer>st=new TreeSet<Integer>();
st.add(10);
st.add(40);
st.add(10);
st.add(60);
st.add(20);
System.out.println("Tree set"+st);
Set<Integer>hst=new HashSet<Integer>();
hst.add(10);
hst.add(40);
hst.add(10);
hst.add(60);
hst.add(20);
System.out.println("Hash set"+hst);





		
		
		
	}

}
