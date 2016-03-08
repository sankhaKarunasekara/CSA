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
		YamlReader reader = new YamlReader(new FileReader("match.yaml"));
        Object object = reader.read();
        
        Map map = (Map)object;
        System.out.println(map.size());
    
    
        Map info= (Map) map.get("info");
        System.out.println(info.size());
        
        ArrayList<String> teams = (ArrayList<String>) info.get("teams");
        System.out.println(info.get("teams"));
        m.setTeamOne(teams.get(0));
        m.setTeamTwo(teams.get(1));
        
        ArrayList<String> umpires = (ArrayList<String>) info.get("umpires");
        System.out.println(umpires);
        m.setUmprie1(umpires.get(0));
        m.setUmprie2(umpires.get(1));
        
        Map toss= (Map) info.get("toss");
        System.out.println((String) toss.get("winner"));
        m.setTossWinningTeam((String) toss.get("winner"));
        m.setTossDecision((String) toss.get("decision"));
        
        System.out.println(info.get("city"));
        m.setCity((String) info.get("city"));
        
        System.err.println(info.get("dates"));
        ArrayList<String> dates= (ArrayList<String>) info.get("dates");
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String dateInString = dates.get(0);
	Date date = sdf.parse(dateInString);
        m.setMatchDate(date);
        
        m.setVenue((String) info.get("venue"));
		return m;
	}
	
	
}
