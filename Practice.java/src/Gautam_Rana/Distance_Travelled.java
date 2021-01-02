package Gautam_Rana;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Distance_Travelled {

	float distance, time, speed;
	static Distance_Travelled dt;

	
	public Distance_Travelled() throws IOException {
		// TODO Auto-generated constructor stub

		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the speed of vechile (in miles-per-hour)");
			speed = s.nextBigDecimal().floatValue();
			System.out.println("Enter the time of travel in miles ");
			time = s.nextBigDecimal().floatValue();

			distance = calDistance(speed, time);

//			Writing in file
			FileWriter myWriter = new FileWriter("Report.txt");
			

//			System.out.println("Time\t\tSpeed");
			myWriter.write("Time\t\tSpeed\n");
			for (float i = 1; i <= time; i++) {

//				System.out.println(i + "hr" + "\t\t" + speed * i + "miles");
				myWriter.write(i + "hr" + "\t\t" + speed * i + "miles\n");

				

			}
			myWriter.close();
			
//			Closing the file
//			System.out.println("Total Distance travelled in " + time + "hr" + " is :" + this.distance);

		}

	}

	public float calDistance(float speed, float time) {
		if (time < 0 || speed < 0) {
			System.out.println("Warning!!\nTime and Speed cannot be negative!!");
			return 0;
		} 
		else {

			System.out.println("Report generated sucessfull Check the Report.txt file in the root directory of your project");
			return (speed * time);

		}

	}

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		dt = new Distance_Travelled();


	}

}
