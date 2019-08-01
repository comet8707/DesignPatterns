import java.io.*;
public class GenerateBill {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println("Enter the name of plan for which bill will be generated: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planName = br.readLine();
		System.out.println("Enter the number of units for bill will be calculated");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planName);
		//call getRage() method and caculateBill() method of DomesticPlan.
		
		System.out.println("Bill amount for " + planName + " of" + units + "unit is:" );
		p.getRate();
		p.calculateBill(units);
	}

}
