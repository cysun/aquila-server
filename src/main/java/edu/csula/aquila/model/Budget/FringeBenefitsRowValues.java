public class FringeBenefitsRowValues extends FringeBenefitsRow {

	String workload_type; //RT, OS, OL, Full Time, can be null if its a student(5 and 6)
	int rate;
	double factor;
	double requested_funds;
	double csula_costsharing;
	double csula_in_kind_contribution;
	double total_project_cost;
	
	FringeBenefitsRowValues(String workload_type, int rate, double factor, double requested_funds, double csula_costsharing, 
						double csula_in_kind_contribution, double total_project_cost){
		this.workload_type = workload_type;
		this.rate = rate;
		this.factor = factor;
		this.requested_funds = requested_funds;
		this.csula_costsharing = csula_costsharing;
		this.csula_in_kind_contribution = csula_in_kind_contribution;
		this.total_project_cost;
	}

	String getWorkload_type(){
		return workload_type;
	}
	
	int getRate(){
		return rate;
	}
	
	double getFactor(){
		return factor;
	}
	
	double getRequested_funds(){
		return requested_funds;
	}
	
	double getCsula_costsharing(){
		return csula_costsharing;
	}
	
	double getCsula_in_kind_contribution(){
		return csula_in_kind_contribution;
	}
	
	double getTotal_project_cost(){
		return total_project_cost;
	}
	
	void setWorkload_type(){
		this.workload_type = workload_type;
	}
	
	void setRate(){
		this.rate = rate;
	}
	
	void setFactor(){
		this.factor = factor;
	}
	
	void setRequested_funds(){
		this.requested_funds = requested_funds;
	}
	
	void setCsula_costsharing(){
		this.csula_costsharing = csula_costsharing;
	}
	
	void setCsula_in_kind_contribution(){
		this.csula_in_kind_contribution = csula_in_kind_contribution;
	}
	
	void setTotal_project_cost(){
		this.total_project_cost;
	}
	
}