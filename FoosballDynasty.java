import java.util.*;

public class FoosballDynasty {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        String winSeq;
        Map<String, Integer> scoreMap = new LinkedHashMap<>();
        //Initializes teams
        String woff = io.getWord(), boff = io.getWord(), wdef = io.getWord(), bdef = io.getWord();
        Team black = new Team(boff, bdef);
        Team white = new Team(woff, wdef);

        //Adds remaining players to deque
        Deque<String> queue = new ArrayDeque<>();
        for (int i = 0; i < n - 4; i++) {
            queue.add(io.getWord());
        }

        winSeq = io.getWord();

        for (int i = 0; i < winSeq.length(); i++) {

            if (winSeq.charAt(i) == 'W') {
                white.switchPlaces();
                scoreMap.put(black.getName(), black.getMaxDyn());
                queue.add(black.getDef());
                black.reset(queue.remove());
            }
            if (winSeq.charAt(i) == 'B') {
                black.switchPlaces();
                scoreMap.put(white.getName(), white.getMaxDyn());
                queue.add(white.getDef());
                white.reset(queue.remove());
            }
            System.err.println(white.getName());
            System.err.println(black.getName());
            System.err.println();
        }

        int maxdyn = scoreMap.values().stream()
                .max(Comparator.naturalOrder())
                .orElse(-1);
        System.out.println(maxdyn);

        System.out.println(scoreMap.size());
        for (String s : scoreMap.keySet()) {
            if (scoreMap.get(s) == maxdyn) System.out.println(s);
        }
    }
}
