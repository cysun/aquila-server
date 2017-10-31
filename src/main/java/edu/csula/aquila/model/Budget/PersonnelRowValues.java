//those objects contain user name, type, and column values
public class PersonnelRowValues extends PersonnelRow{
	
	String workload_type; //RT, OS, OL, Full Time, can be null(for 5 and 6)
	double salary_unit_or_hourly_rate;
	double requested_units_or_hours;
	int cost_shared_units;
	int in_kind_units;
	double requested_funds;
	double csula_costsharing;
	double csula_in_kind_contribution;
	double total_project_cost;
	
	PersonnelRowValues(String workload_type, double salary_unit_or_hourly_rate, double requested_units_or_hours, int cost_shared_units, int in_kind_units, double requested_funds, double csula_costsharing, 
						double csula_in_kind_contribution, double total_project_cost){
		this.workload_type = workload_type;
		this.salary_unit_or_hourly_rate = salary_unit_or_hourly_rate;
		this.requested_units_or_hours = requested_units_or_hours;
		this.cost_shared_units = cost_shared_units;
		this.in_kind_units = in_kind_units;
		this.requested_funds = requested_funds;
		this.csula_costsharing = csula_costsharing;
		this.csula_in_kind_contribution = csula_in_kind_contribution;
		this.total_project_cost;
	}

	String getWorkload_type(){
		return workload_type;
	}
	
	double getSalary_unit_or_hourly_rate(){
		return salary_unit_or_hourly_rate;
	}
	
	double getRequested_units_or_hours(){
		return requested_units_or_hours;
	}
	
	int getCost_shared_units(){
		return cost_shared_units;
	}
	
	int getIn_kind_units(){
		return in_kind_units;
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
	
	void setSalary_unit_or_hourly_rate(){
		this.salary_unit_or_hourly_rate = salary_unit_or_hourly_rate;
	}
	
	void setRequested_units_or_hours(){
		this.requested_units_or_hours = requested_units_or_hours;
	}
	
	void setCost_shared_units(){
		this.cost_shared_units = cost_shared_units;
	}
	
	void setIn_kind_units(){
		this.in_kind_units = in_kind_units;
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