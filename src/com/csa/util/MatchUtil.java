package com.csa.util;

import java.io.File;

import com.csa.entity.Match;

/**
 * @author sankha
 * 
 */
public class MatchUtil {

	/**
	 * @param match
	 */
	public static void printMatch(Match match) {

		System.out.println("match Id: " + match.getMatchId());
		System.out.println("matchDate: " + match.getMatchDate());
		System.out.println("matchDayOrNight: " + match.getDayOrNight());
		System.out.println("idDLMethod: " + match.isDLMethod());
		System.out.println("teamOne: " + match.getTeamOne());
		System.out.println("teamTwo: " + match.getTeamTwo());
		System.out.println("umprie1: " + match.getUmprie1());
		System.out.println("umprie2: " + match.getUmprie2());
		
	}
	
	
	public static Match getMatchInfoFromFile(File filePath){
	
		Match m = new Match();
                System.out.println(filePath);
		
		return m;
	}
	
	
}
