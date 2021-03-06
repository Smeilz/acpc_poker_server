package glassfrog.players;

import java.util.Comparator;

/**
 * Compares the positions of the players.  Position 0 is first to act
 * @author jdavidso
 */
public class SeatComparator implements Comparator<Player>{
    
    /**
     * Compares the seats of the players. Used to sort the players
     * by thier seat
     * @param o1 Player 1
     * @param o2 Player 2
     * @return 0 for a tie, Negative if Player 1 acts before Player 2 and Positive
     * if Player 2 acts before Player 1
     */
    public int compare(Player o1, Player o2) {
        return o1.getSeat() - o2.getSeat();
    }

}
