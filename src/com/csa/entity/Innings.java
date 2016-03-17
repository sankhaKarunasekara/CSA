package com.csa.entity;

import java.util.Map;

public class Innings {

	public Team battingTeam;
	public Team fieldingTeam;
	public int numberOfOvers;
	
	public Map<Integer,Bowl> deliveries; 
	
	public Innings() {
		// TODO Auto-generated constructor stub
	}

    /**
     * @return the battingTeam
     */
    public Team getBattingTeam() {
        return battingTeam;
    }

    /**
     * @param battingTeam the battingTeam to set
     */
    public void setBattingTeam(Team battingTeam) {
        this.battingTeam = battingTeam;
    }

    /**
     * @return the fieldingTeam
     */
    public Team getFieldingTeam() {
        return fieldingTeam;
    }

    /**
     * @param fieldingTeam the fieldingTeam to set
     */
    public void setFieldingTeam(Team fieldingTeam) {
        this.fieldingTeam = fieldingTeam;
    }

    /**
     * @return the numberOfOvers
     */
    public int getNumberOfOvers() {
        return numberOfOvers;
    }

    /**
     * @param numberOfOvers the numberOfOvers to set
     */
    public void setNumberOfOvers(int numberOfOvers) {
        this.numberOfOvers = numberOfOvers;
    }

    /**
     * @return the deliveries
     */
    public Map<Integer,Bowl> getDeliveries() {
        return deliveries;
    }

    /**
     * @param deliveries the deliveries to set
     */
    public void setDeliveries(Map<Integer,Bowl> deliveries) {
        this.deliveries = deliveries;
    }

}
