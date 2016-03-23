package com.csa.businessLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.csa.entity.Bowl;
import com.csa.entity.Innings;
import com.csa.entity.MatchDetails;
import com.csa.entity.Result;
import com.csa.entity.Team;
import com.csa.entity.Wicket;
import com.csa.util.MatchUtil;
import com.esotericsoftware.yamlbeans.YamlException;

public class Main {

	public static void main(String[] args) {

		// Result result = new Result();
		// Team team1 = new Team();
		// Team team2 = new Team();

		// Innings innings2 = new Innings();

		// innings1.setBattingTeam(team1);
		// innings1.setFieldingTeam(team2);

		// Wicket wicket = new Wicket();
		// bowl.setWicket(wicket);
		// match.setResult(result);
		// match.setFirstInnings(innings1);
		// match.setSecondInnings(innings2);

		File file = new File("resources/ipl/335982.yaml");

		MatchDetails match;

		Innings innings1;
		Innings innings2;

		// need to change, unnecessary
		Team battingTeam1;
		Team fieldingTeam1;

		Team battingTeam2;
		Team fieldingTeam2;

		Bowl bowl;
		Wicket wicket;

		Result result;

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		try {
			match = MatchUtil.getMatchInfoFromFile(file);

			innings1 = match.getFirstInnings();
			innings2 = match.getSecondInnings();

			battingTeam1 = innings1.getBattingTeam();
			fieldingTeam1 = innings1.getFieldingTeam();

			battingTeam2 = innings2.getBattingTeam();
			fieldingTeam2 = innings2.getFieldingTeam();

			session.save(match);

			session.save(innings1);
			session.save(innings2);

			session.save(battingTeam1);
			session.save(fieldingTeam1);

			session.save(battingTeam2);
			session.save(fieldingTeam2);

			Map<Integer, Bowl> firstInningsDeliveries = innings1
					.getDeliveries();
			Map<Integer, Bowl> secondInningsDeliveries = innings2
					.getDeliveries();

			for (int i = 0; i < firstInningsDeliveries.size(); i++) {
				bowl = firstInningsDeliveries.get(i);
				System.out.println(bowl.bowlnumber);
				session.save(bowl);
				
				wicket = bowl.getWicket();
				if (bowl.isWicket == 1) {
					session.save(wicket);
				}
			}

			for (int i = 0; i < secondInningsDeliveries.size(); i++) {
				bowl = secondInningsDeliveries.get(i);
				session.save(bowl);
				System.out.println(bowl.bowlnumber);

				wicket = bowl.getWicket();
				if (bowl.isWicket == 1) {
					session.save(wicket);
				}
			}

			result = match.getResult();
			session.save(result);
			session.getTransaction().commit();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (YamlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
