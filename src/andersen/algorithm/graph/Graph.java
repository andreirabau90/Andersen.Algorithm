package andersen.algorithm.graph;

public class Graph {
    private Integer[][] arr;
    private int peak;

    private void init() {
        peak = 4;
        arr = new Integer[peak][peak];
        arr[0][1] = 3;
        arr[0][2] = 8;
        arr[0][3] = 20;
        arr[1][2] = 4;
        arr[1][3] = 10;
        arr[2][3] = 2;
    }

    private int start() {
        Integer[] costs = new Integer[peak];
        Integer current = 0;
        while (current != null) {
            Integer min = null;
            for (int i = 0; i < arr.length; i++) {
                if (arr[current][i] == null) continue;
                if (min == null || arr[current][min] > arr[current][i]) {
                    min = i;
                }
                if (costs[i] == null || costs[i] > costs[current] + arr[current][i]) {
                    costs[i] = (costs[current] != null ? costs[current] : 0) + arr[current][i];
                }
            }
            current = min;
        }
        return costs[peak - 1];
    }


    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.init();
        System.out.println(graph.start());
    }
}
