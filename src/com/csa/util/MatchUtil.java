/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSA.src.com.csa.util;

import com.csa.entity.Bowl;
import com.csa.entity.Innings;
import java.io.File;
import com.csa.entity.Match;
import com.csa.entity.Team;
import com.csa.entity.Wicket;
import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**
* @author sankha
*
*/
public class MatchUtil {
/**
* @param match
*/
public void printMatch(Match match) {
System.out.println("match Id: " + match.getMatchId());
System.out.println("matchDate: " + match.getMatchDate());
System.out.println("matchDayOrNight: " + match.getDayOrNight());
System.out.println("idDLMethod: " + match.isDLMethod());
System.out.println("teamOne: " + match.getTeamOne());
System.out.println("teamTwo: " + match.getTeamTwo());
System.out.println("umprie1: " + match.getUmprie1());
System.out.println("umprie2: " + match.getUmprie2());
}
public Match getMatchInfoFromFile(File filePath) throws FileNotFoundException, YamlException, ParseException{
        Match m = new Match();
        YamlReader reader = new YamlReader(new FileReader(filePath));
    
        Object object = reader.read();
        //System.out.println(object);
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
        
        //System.err.println(info.get("dates"));
        ArrayList<String> dates= (ArrayList<String>) info.get("dates");
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String dateInString = dates.get(0);
	Date date = sdf.parse(dateInString);
        m.setMatchDate(date);
        
        m.setVenue((String) info.get("venue"));
        //end of extracting basic match info
        
        HashMap<String,Integer> extraMap = new HashMap<>();
        extraMap.put("byes", 1);
        extraMap.put("legbyes", 2);
        extraMap.put("noballs", 3);
        extraMap.put("wides", 4);
        
        
        
        
        ArrayList<Map> innings = (ArrayList<Map>) map.get("innings");

        
        
        
        Map inn1 = innings.get(0);
        Map inn1_info = (Map) inn1.get("1st innings");
        System.out.println(inn1_info.get("team"));
        
        Map inn2 = innings.get(1);
        Map inn2_info = (Map) inn2.get("2nd innings");
        System.out.println(inn2_info.get("team"));
        
        
        
        HashMap<Integer,Bowl> inni1_deli = getDeliveriesinfo(inn1_info);
        HashMap<Integer,Bowl> inni2_deli = getDeliveriesinfo(inn2_info);
        
        
        
        
        
        
        
        
        
        
        
        
        Innings firstInnings= new Innings();
        
        Team battingTeam = new Team();
        String name = (String) inn1_info.get("team");
        battingTeam.setTeamName(name);
        firstInnings.setBattingTeam(battingTeam);
        
        Team fieldingTeam = new Team();
        name = (String) inn2_info.get("team");
        fieldingTeam.setTeamName(name);
        firstInnings.setFieldingTeam(fieldingTeam);
        
        
        firstInnings.setDeliveries(inni1_deli);
        int inni1_numberOfOvers = 0; //don't know how to find this
        firstInnings.setNumberOfOvers(inni1_numberOfOvers);
        
        
        m.setFirstInnings(firstInnings);
        
        
        
        
        Innings secondInnings= new Innings();
        
        secondInnings.setBattingTeam(fieldingTeam);
        secondInnings.setFieldingTeam(battingTeam);
        secondInnings.setDeliveries(inni2_deli);
        int inni2_numberOfOvers=0; //don't know how to find this
        secondInnings.setNumberOfOvers(inni2_numberOfOvers);
        
        m.setSecondInnings(secondInnings);
        
        
        
        
        
        
        
        
        
        
        
        
//return match object
return m;
}



public HashMap<Integer,Bowl> getDeliveriesinfo(Map inn1_info){
        
        HashMap<Integer,Bowl> inni1_deli= new HashMap<>();
        
        ArrayList<Map> deli_list=  (ArrayList<Map>) inn1_info.get("deliveries");
        int inni1_wicketNumber=0; //
        
        for (int i = 0; i < deli_list.size(); i++) {
            
            Map deli_map = deli_list.get(i);
            System.out.println(deli_map);
            String deli_name= (String) deli_map.keySet().toArray()[0];
            int overNumber= Integer.parseInt(deli_name.split("\\.")[0]);
            
            Map delivery= (Map) deli_map.get(deli_name);
            System.out.println(delivery.get("runs"));
            
            Map run_map= (Map) delivery.get("runs");
            int extras=  Integer.parseInt((String) run_map.get("extras"));
            int total=  Integer.parseInt((String) run_map.get("total"));
            int runs=  Integer.parseInt((String) run_map.get("batsman"));
            
            
            
            
            Bowl b = new Bowl();

            b.setBatsman((String) delivery.get("batsman"));
            b.setNonStriker((String) delivery.get("non_striker"));
            b.setBowler((String) delivery.get("bowler"));
            b.setOverNumber(overNumber);
            
            b.setBowlnumber(i); //what is this ????? 3.2 or 20th ball
            
            if(delivery.containsKey("extras"))
                b.setExtraType(extras); //type int ??? ;for now it's string
            
            b.setRuns(runs);
            b.setExtras(extras);
            b.setTotalRuns(total);
             // runs and totoal runs ????
            
            if(delivery.containsKey("wicket")){
                 
                Map wicket_map= (Map) delivery.get("wicket");
                String player_out= (String) wicket_map.get("player_out");
                ArrayList<String> fielders= (ArrayList<String>) wicket_map.get("fielders");
                String kind = (String) wicket_map.get("kind");
                
                inni1_wicketNumber++;
                Wicket w= new Wicket();
                w.setWicketNumber(inni1_wicketNumber);
                w.setBowler((String) delivery.get("bowler"));
                w.setBatsman(player_out);
                w.setFielder(fielders);
                w.setWicketType(kind);
                
                
                b.setIsWicket(1); //boolean or int;
                b.setWicket(w);
            }
            
            inni1_deli.put(i, b);
            
            
        }
        
        
        return inni1_deli;
    }
    
}
