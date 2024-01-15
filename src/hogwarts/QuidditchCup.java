package hogwarts;

import java.util.ArrayList;
import java.util.Collections;

public class QuidditchCup {
	
	private ArrayList<QuidditchGame> quidditchGames;
	
	public QuidditchCup() {
		this.quidditchGames = new ArrayList<QuidditchGame>();
	}

	public ArrayList<QuidditchGame> getQuidditchGames() {
		return quidditchGames;
	}
	
	public void setQuidditchGames(ArrayList<QuidditchGame> quidditchGames) {
		this.quidditchGames = quidditchGames;
	}
	
	public void addQuidditchGame(QuidditchGame qg) {
		this.quidditchGames.add(qg);
	}
	
	public void removeQuidditchGame(QuidditchGame qg) {
		this.quidditchGames.remove(qg);
	}
	
	private ArrayList<House> getAllWinners(){
		ArrayList<House> tmp = new ArrayList<House>();
		for(QuidditchGame qc : this.quidditchGames) {
			tmp.add(qc.getWinner());
			// House h = qc.getWinner();
			// tmp.add(h);
		}
		return tmp;
	}
	
	private ArrayList<House> getDistinctWinners(ArrayList<House> allWinner){
		ArrayList<House> distinctWinners = new ArrayList<House>();
		for(House h : allWinner) {
			if(!distinctWinners.contains(h)) {
				distinctWinners.add(h);
			}
		}
		return distinctWinners;
	}
	
	public House getCurrentLeader() {
		ArrayList<House> allWinners = this.getAllWinners();
		ArrayList<House> distinctWinners = this.getDistinctWinners(allWinners);
		ArrayList<Integer> countWin = new ArrayList<Integer>();
		for(House h : distinctWinners) {
			//Collections.frequency(Datenstruktur, Suchwert)
			countWin.add(Collections.frequency(allWinners, h));
			// int count = Collections.frequency(allWinners, h);
			// countWin.add(count);
		}
		int maximum = Collections.max(countWin);
		int index = countWin.indexOf(maximum);
		return distinctWinners.get(index);
	}

}
