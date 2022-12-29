package com.tasks.objects_immutable;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsHashCode {
    public static void main(String[] args) {
        Player p1 = new Player(1, "Vit Vit");
        Player p2 = new Player(1, "Vit Vit");

        System.out.println(p1.equals(p2)); // false
        System.out.println("хеш-код pl: " + p1.hashCode()); // 93122545
        System.out.println("хеш-код p2: " + p2.hashCode()); // 1449621165

        Set<Player> players = new HashSet<>();
        players.add(p1);
        players.add(p2);
        System.out.println ("хеш-код pl: " + p1.hashCode());
        System.out.println("хеш-код p2: " + p2.hashCode());
        System.out.println("Размер множества: " + players.size());
        System.out.println("Множество содержит Рафаэля Надаля: "
        + players.contains(new Player(1, "Vit Vit")));
    }
}

class Player {
    private int id;
    private String name;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return this.id == player.id && Objects.equals(this.name, player.name);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }
}
