package com.csa.entity;

public class Result {

	int matchId;
	String winningTeam;
	int wonByFirstBatOrSecondBat;
	boolean isDLmethod;
	int wonByRuns;
	int wonByWickets;
	
	String plyerOfTheMatch; 
	
	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getWinningTeam() {
		return winningTeam;
	}

	public void setWinningTeam(String winningTeam) {
		this.winningTeam = winningTeam;
	}

	public int getWonByFirstBatOrSecondBat() {
		return wonByFirstBatOrSecondBat;
	}

	public void setWonByFirstBatOrSecondBat(int wonByFirstBatOrSecondBat) {
		this.wonByFirstBatOrSecondBat = wonByFirstBatOrSecondBat;
	}

	public boolean isDLmethod() {
		return isDLmethod;
	}

	public void setDLmethod(boolean isDLmethod) {
		this.isDLmethod = isDLmethod;
	}

	public int getWonByRuns() {
		return wonByRuns;
	}

	public void setWonByRuns(int wonByRuns) {
		this.wonByRuns = wonByRuns;
	}

	public int getWonByWickets() {
		return wonByWickets;
	}

	public void setWonByWickets(int wonByWickets) {
		this.wonByWickets = wonByWickets;
	}

	public Result() {
		// TODO Auto-generated constructor stub
	}
}
