package com.tasks.graf;

import java.util.Iterator;
import java.util.LinkedList;

// поиск в ширину
public class FindByBreadth {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 3);
        graph.addEdge(0, 1);
        graph.addEdge(1, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.addEdge(3, 2);
        graph.addEdge(3, 3);

        graph.BFS(0);
    }
}

class Graph {
    private final int v;
    private final LinkedList<Integer>[] adjacents;

    public Graph(int v) {
        this.v = v;
        adjacents = new LinkedList[v];

        for (int i = 0; i < v; ++i) {
            adjacents[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int e) {
        adjacents[v].add(e);
    }

    public void BFS(int start) {
        boolean visited[] = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[start] = true;

        queue.add(start);

        while (Boolean.FALSE.equals(queue.isEmpty())) {
            start = queue.poll();
            System.out.print(start + " ");

            Iterator<Integer> i = adjacents[start].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (Boolean.FALSE.equals(visited[n])) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
