/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSA.src.com.csa.util;

import java.io.File;
import com.csa.entity.Match;
import com.esotericsoftware.yamlbeans.YamlReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
public static Match getMatchInfoFromFile(File filePath) throws FileNotFoundException{
Match m = new Match();
YamlReader reader = new YamlReader(new FileReader(filePath));
System.out.println(filePath);
//return match object
return m;
}
}
