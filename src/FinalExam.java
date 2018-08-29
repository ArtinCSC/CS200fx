import java.util.Scanner;

public class FinalExam {
	static double x1Double, y1Double, c1Double, x2Double, y2Double, c2Double, slope1, slope2, yIntercept1, yIntercept2,
	dDouble, dXDouble, dYDouble, xDouble, yDouble;
	public static void main(String[] args)
 {
 
 Scanner input = new Scanner(System.in);
 
 System.out.println("Enter the equations");
 String firstEqu = input.nextLine();
 String secondEqu = input.nextLine();
 
 int equalSign = firstEqu.indexOf("=");
 int x = firstEqu.indexOf("x");
 int equalSign2 = secondEqu.indexOf("=");
 int x2Eq = secondEqu.indexOf("x");
 
 String c1 = firstEqu.substring(++equalSign);
 String y1 = firstEqu.substring(x+1, equalSign-2);
 String x1 = firstEqu.substring(0, x);
 
 String c2 = secondEqu.substring(++equalSign2);
 String y2 = secondEqu.substring(x2Eq+1, equalSign2-2);
 String x2 = secondEqu.substring(0, x2Eq);
 
 double x1Double = Double.parseDouble(x1);
 double y1Double = Double.parseDouble(y1);
 double c1Double = Double.parseDouble(c1);
 
 double x2Double = Double.parseDouble(x2);
 double y2Double = Double.parseDouble(y2);
 double c2Double = Double.parseDouble(c2);
 
 double slope1 = (x1Double * -1) / y1Double;
 double slope2 = (x2Double * -1) / y2Double;
 
 double yIntercept1 = c1Double / y1Double;
 double yIntercept2 = c2Double / y2Double;
 
 if ((slope1 == slope2) && (yIntercept1 == yIntercept2))
	 int i = 0;
	if ((slope1 == slope2) && (yIntercept1 == yIntercept2)){
		for ( i = 0; i < 50; i++){
			 infinSolu[i] = slope1 * i + yIntercept1;
			infinSolu1[i] = "( " + i + " , " + infinSolu[i] + " )";
			// myString = "( " + i + " , " + infinSolu1[i] + " )";
			for(i = 0; i < 50; i++)
			myString = myString +  infinSolu1[i];
		}
 System.out.println("The lines are the same and there are infinite solution");
 
 else if ((slope1 == slope2) && (yIntercept1 != yIntercept2))
 System.out.println("The lines are parallel to each other; therefore, there is no solution");
 
 else
	 double dDouble = (x1Double * y2Double) - (y1Double * x2Double);
 double dXDouble = (c1Double * y2Double) - (y1Double * c2Double);
 double dYDouble = (x1Double * c2Double) - (c1Double * x2Double);
 
 double xDouble = dXDouble / dDouble;
 double yDouble = dYDouble / dDouble;
 
 System.out.println("( " + xDouble + " , " + yDouble + " )");
 
 //for(int i =0; i >=5; i++){
 
  
  //System.out.println(c2 + " " + y2+ " " + x2);
  //team[i].readInput();
 // }
 }

}
