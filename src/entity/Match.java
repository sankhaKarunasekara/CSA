package entity;

import java.util.Date;

public class Match {

	int matchId;
	Date matchDate;
	int dayOrNight;
	boolean isDLmethod;
	
	String teamOne;
	String teamTwo;
	
	String umprie1;
	String umprie2;
	
	String tossWinningTeam;
	String tossDecision;
	
	String city;
	String venue;
	
	Innings firstInnings;
	Innings secondInnings;
	
	Result result;
	
	public Match() {
		// TODO Auto-generated constructor stub
	}

}
