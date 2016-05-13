package com.csa.player.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bowler {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int playerId;

	private String name;
	//private int numberOfBowlsBowled;
	private Double bowlingAverage;
	private Double bowlingStrikeRate;
	private Double bowlersDotBowlPresentage;
	private Double bowlingEconomy;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBowlingAverage() {
		return bowlingAverage;
	}

	public void setBowlingAverage(Double bowlingAverage) {
		this.bowlingAverage = bowlingAverage;
	}

	public Double getBowlingStrikeRate() {
		return bowlingStrikeRate;
	}

	public void setBowlingStrikeRate(Double bowlingStrikeRate) {
		this.bowlingStrikeRate = bowlingStrikeRate;
	}

	public Double getBowlersDotBowlPresentage() {
		return bowlersDotBowlPresentage;
	}

	public void setBowlersDotBowlPresentage(Double bowlersDotBowlPresentage) {
		this.bowlersDotBowlPresentage = bowlersDotBowlPresentage;
	}

	public Double getBowlingEconomy() {
		return bowlingEconomy;
	}

	public void setBowlingEconomy(Double bowlingEconomy) {
		this.bowlingEconomy = bowlingEconomy;
	}

//	public int getNumberOfBowlsBowled() {
//		return numberOfBowlsBowled;
//	}
//
//	public void setNumberOfBowlsBowled(int numberOfBowlsBowled) {
//		this.numberOfBowlsBowled = numberOfBowlsBowled;
//	}

}
