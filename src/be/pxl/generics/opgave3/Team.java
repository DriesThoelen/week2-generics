package be.pxl.generics.opgave3;

import java.util.ArrayList;
import java.util.List;

public class Team <P>{
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    private List<P> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public List<P> getMembers() {
        return members;
    }

    public void addPlayer(P player) {
        if (!(members.contains(player))) {
            members.add(player);
        }
    }

    public int numberOfPlayers() {
        return members.size();
    }

    public void matchResult(Team<P> opponent, int ourScore, int theirScore) {
        if (ourScore == theirScore) {
            tied++;
            opponent.tied++;
        } else {
            if (ourScore > theirScore) {
                won++;
                opponent.lost++;
            } else if (ourScore < theirScore) {
                lost++;
                opponent.won++;
            }
        }
        played++;
        opponent.played++;
    }

    public int ranking() {
        return 3 * won + tied;
    }
}
