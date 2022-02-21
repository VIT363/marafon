package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private final int year;
    private final List<String>members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public static void transferMembers(MusicBand a, MusicBand b){
        for (String members: a.getMembers())
            b.getMembers().add(members);
            a.getMembers().clear();

    }

    public void printMembers(){
        System.out.println(this.members);
    }
}
