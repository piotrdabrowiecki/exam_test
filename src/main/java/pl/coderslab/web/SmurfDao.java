package pl.coderslab.web;

import java.util.ArrayList;
import java.util.List;

public class SmurfDao {
    private static final String[] names = {"Maruda", "Laluś", "Osiłek", "PapaSmerf", "Smerfetka"};
    private static final String[] attributes = {"marudzenie", "lusterko", "biceps", "mądrość", "uroda"};
    private static final String[] descriptions = {"ciągle marudzi", "dba o wygląd", "dużo ćwiczy", "dowodzi smerfami", "jest ładna"};

    public static List<Smurf> getList() {
        List<Smurf> list = new ArrayList<>();
        for (int i =0 ; i<5; i++) {
            list.add(new Smurf(names[i], attributes[i], descriptions[i]));
        }
        return list;
    }
}