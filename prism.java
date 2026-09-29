import java.util.*;

class prism {

    static class edge {
        int s;
        int d;
        int w;

        public edge(int s, int d, int w) {
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }

    public static void createGraph(ArrayList<edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Undirected graph

        graph[0].add(new edge(0, 1, 4));
        graph[1].add(new edge(1, 0, 4));

        graph[0].add(new edge(0, 2, 3));
        graph[2].add(new edge(2, 0, 3));

        graph[0].add(new edge(0, 3, 2));
        graph[3].add(new edge(3, 0, 2));

        graph[1].add(new edge(1, 2, 2));
        graph[2].add(new edge(2, 1, 2));

        graph[1].add(new edge(1, 3, 5));
        graph[3].add(new edge(3, 1, 5));

        graph[2].add(new edge(2, 3, 1));
        graph[3].add(new edge(3, 2, 1));

        graph[2].add(new edge(2, 4, 4));
        graph[4].add(new edge(4, 2, 4));

        graph[3].add(new edge(3, 4, 7));
        graph[4].add(new edge(4, 3, 7));
    }

    static class pair {
        int v;
        int cost;

        public pair(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }
    }

    public static void prims(ArrayList<edge>[] graph) {

        boolean[] visited = new boolean[graph.length];

        PriorityQueue<pair> pq = new PriorityQueue<>(
                (a, b) -> a.cost - b.cost);

        // Start from vertex 0
        pq.add(new pair(0, 0));

        int finalCost = 0;

        while (!pq.isEmpty()) {

            pair curr = pq.poll();

            // If already visited, skip
            if (visited[curr.v]) {
                continue;
            }

            // Mark visited
            visited[curr.v] = true;

            // Add edge weight to MST cost
            finalCost += curr.cost;

            // Add all unvisited neighbours
            for (edge e : graph[curr.v]) {

                if (!visited[e.d]) {

                    // IMPORTANT:
                    // Add only edge weight
                    pq.add(new pair(e.d, e.w));
                }
            }
        }

        System.out.println("MST Cost = " + finalCost);

    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<edge> graph[] = new ArrayList[V];

        createGraph(graph);

        prims(graph);
    }
}