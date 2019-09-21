import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestMapEmp {
	public static void main(String args[]){
		Map<String,Employee> emp=accept(); 
		display(emp);
		//displaysort(emp);
	}
	public static Map<String,Employee> accept()
	{
		Map<String,Employee> emp=new HashMap<String, Employee>(); 
		emp.put("emp111",new Employee("Ramesh",40000));
		emp.put("emp101",new Employee("Suresh",50000));
		emp.put("emp201",new Employee("Ganesh",25000));
		emp.put("emp51",new Employee("Mahesh",1000));
		return emp;
	}
	public static void display(Map<String,Employee> map){
		Set<String> st=map.keySet();
		//Set<Entry<String, Employee>> st2=map.entrySet();
		
		for(String s:st){
			Employee e=map.get(s);
			System.out.println(s+"\t==>"+e.getEname()+"\t"+e.getEsal());
		}
	}
	public static void displaysort(Map<String,Employee> map2){
		System.out.println("Sorted....");
		TreeMap<String,Employee> tmap=new TreeMap<String,Employee>(map2);
		Set<String> st=tmap.keySet();
		//Set<Entry<String, Employee>> st2=map.entrySet();
		for(String s:st){
			Employee e=tmap.get(s);
			System.out.println(s+"\t==>"+e.getEname()+"\t"+e.getEsal());
		}
	}
}
