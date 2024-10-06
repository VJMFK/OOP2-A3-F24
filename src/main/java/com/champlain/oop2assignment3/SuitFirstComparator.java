package com.champlain.oop2assignment3;

import java.util.Comparator;

/**
 * Sorts Cards by Suit first, and then rank
 */
public class SuitFirstComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        int suitComparison = card1.getSuit().compareTo(card2.getSuit());
        if (suitComparison == 0) {
            return card1.getRank().compareTo(card2.getRank());
        }
        return suitComparison;
    }
}
