package Gautam_Rana;

public class TeamLeader extends ProductionWorker {
	
	int monthly_bonus,req_training_hours,attended_training_hours;

	public TeamLeader(int monthly_bonus,int req_training_hours,int attended_training_hours) { //constructor to initilize the variable of teamleader
		this.monthly_bonus = monthly_bonus;
		this.req_training_hours= req_training_hours;
		this.attended_training_hours = attended_training_hours;

	}
	
	public static void main(String[] args) {
		TeamLeader TL = new TeamLeader(15000,80,65);
		
	}

}
