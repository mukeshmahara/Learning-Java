import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] arg) {
		
		List<String> listname = new ArrayList<String>();
		listname.add("mukesh");
		listname.add("parash");
		listname.add("Anjana");
		
		System.out.println(listname);
		listname.set(1,"Sushil");
		System.out.println(listname);
		//listname.remove("Anjana");
		
		/*if(listname.remove("Anjaana")) {
			System.out.println("removed");
		}
		else {
			System.out.println("no such element");
		}
		System.out.println(listname);
*/	int k =0;
		for(String str: listname) {
			
			System.out.println(k+". "+str);
			k++;
			
		}
		
		
//		List<Object> listany = new ArrayList<Object>();
		
	}


}
