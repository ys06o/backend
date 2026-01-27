package DAY06;

public class Visualizer {
    String getStars(int n) {
        String star = "";
        for (int i = 1; i <= n; i++) {
            star+="★";
        }
        return star;
    }
}
