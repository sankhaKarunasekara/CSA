package com.csa.visualization;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class InningByInningsResults {

	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	int matchId;

	int firstInningsOrSecondInnings;
	
	Double dotBallPresentage_1_6;
	Double dotBallPresentage_7_15;
	Double dotBallPresentage_16_20;
	
	Double sixHitingPresentage_1_6;
	Double sixHitingPresentage_7_15;
	Double sixHitingPresentage_16_20;
	
	Double fourHitingPresentage_1_6;
	Double fourHitingPresentage_7_15;
	Double fourHitingPresentage_16_20;
	
	Double runRate_1_6;
	Double runRate_7_15;
	Double runRate_16_20;
	
	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getFirstInningsOrSecondInnings() {
		return firstInningsOrSecondInnings;
	}

	public void setFirstInningsOrSecondInnings(int firstInningsOrSecondInnings) {
		this.firstInningsOrSecondInnings = firstInningsOrSecondInnings;
	}

	public Double getDotBallPresentage_1_6() {
		return dotBallPresentage_1_6;
	}

	public void setDotBallPresentage_1_6(Double dotBallPresentage_1_6) {
		this.dotBallPresentage_1_6 = dotBallPresentage_1_6;
	}

	public Double getDotBallPresentage_7_15() {
		return dotBallPresentage_7_15;
	}

	public void setDotBallPresentage_7_15(Double dotBallPresentage_7_15) {
		this.dotBallPresentage_7_15 = dotBallPresentage_7_15;
	}

	public Double getDotBallPresentage_16_20() {
		return dotBallPresentage_16_20;
	}

	public void setDotBallPresentage_16_20(Double dotBallPresentage_16_20) {
		this.dotBallPresentage_16_20 = dotBallPresentage_16_20;
	}

	public Double getSixHitingPresentage_1_6() {
		return sixHitingPresentage_1_6;
	}

	public void setSixHitingPresentage_1_6(Double sixHitingPresentage_1_6) {
		this.sixHitingPresentage_1_6 = sixHitingPresentage_1_6;
	}

	public Double getSixHitingPresentage_7_15() {
		return sixHitingPresentage_7_15;
	}

	public void setSixHitingPresentage_7_15(Double sixHitingPresentage_7_15) {
		this.sixHitingPresentage_7_15 = sixHitingPresentage_7_15;
	}

	public Double getSixHitingPresentage_16_20() {
		return sixHitingPresentage_16_20;
	}

	public void setSixHitingPresentage_16_20(Double sixHitingPresentage_16_20) {
		this.sixHitingPresentage_16_20 = sixHitingPresentage_16_20;
	}

	public Double getFourHitingPresentage_1_6() {
		return fourHitingPresentage_1_6;
	}

	public void setFourHitingPresentage_1_6(Double fourHitingPresentage_1_6) {
		this.fourHitingPresentage_1_6 = fourHitingPresentage_1_6;
	}

	public Double getFourHitingPresentage_7_15() {
		return fourHitingPresentage_7_15;
	}

	public void setFourHitingPresentage_7_15(Double fourHitingPresentage_7_15) {
		this.fourHitingPresentage_7_15 = fourHitingPresentage_7_15;
	}

	public Double getFourHitingPresentage_16_20() {
		return fourHitingPresentage_16_20;
	}

	public void setFourHitingPresentage_16_20(Double fourHitingPresentage_16_20) {
		this.fourHitingPresentage_16_20 = fourHitingPresentage_16_20;
	}

	public Double getRunRate_1_6() {
		return runRate_1_6;
	}

	public void setRunRate_1_6(Double runRate_1_6) {
		this.runRate_1_6 = runRate_1_6;
	}

	public Double getRunRate_7_15() {
		return runRate_7_15;
	}

	public void setRunRate_7_15(Double runRate_7_15) {
		this.runRate_7_15 = runRate_7_15;
	}

	public Double getRunRate_16_20() {
		return runRate_16_20;
	}

	public void setRunRate_16_20(Double runRate_16_20) {
		this.runRate_16_20 = runRate_16_20;
	}

	public String getWinOrLoss() {
		return winOrLoss;
	}

	public void setWinOrLoss(String winOrLoss) {
		this.winOrLoss = winOrLoss;
	}

	String winOrLoss;

	public InningByInningsResults() {
		// TODO Auto-generated constructor stub
	}

}
