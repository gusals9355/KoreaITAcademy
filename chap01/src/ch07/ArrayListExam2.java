package ch07;

import java.util.ArrayList;
import java.util.List;


import ch06.blackjack.Card;

public class ArrayListExam2 {

	public static void main(String[] args) {
		List<Card> list = new ArrayList<Card>();
		Card c1 = new Card("","");
		
		list.add(c1);
		Card c2 = list.get(0);
	}

}
