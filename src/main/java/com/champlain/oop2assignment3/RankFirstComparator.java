package com.champlain.oop2assignment3;

import java.util.Comparator;

/**
 * Sorts Cards by rank first, and then suit
 */
public class RankFirstComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        int rankComparison = card1.getRank().compareTo(card2.getRank());
        if (rankComparison == 0) {
            return card1.getSuit().compareTo(card2.getSuit());
        }
        return rankComparison;
    }
}
