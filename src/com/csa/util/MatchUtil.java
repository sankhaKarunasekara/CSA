package com.csa.util;

import java.io.File;

import com.csa.entity.Match;
import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

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
	
	
	public static Match getMatchInfoFromFile(File filePath) throws FileNotFoundException, YamlException, ParseException{
	
		Match m = new Match();
		
		return m;
	}
	
	
}
