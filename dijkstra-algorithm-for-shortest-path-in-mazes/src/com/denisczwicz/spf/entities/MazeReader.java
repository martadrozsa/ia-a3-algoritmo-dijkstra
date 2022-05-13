package com.denisczwicz.spf.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MazeReader {

    public List<List<Integer>> readFromFile(String filePath) {
        String line = "";
        String splitBy = ",";

        List<List<Integer>> maze = new ArrayList<>();

        try { //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] mazeRow = line.split(splitBy); // use comma as separator

                List<Integer> row = new ArrayList<>();
                for (String m : mazeRow) {
                    int current = Integer.parseInt(m);
                    row.add(current);
                }
                maze.add(row);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return maze;
    }

    public List<Node> createListNodes() {

        List<List<Integer>> mazeData =  readFromFile("maze.csv");

        List<Node> nodes = new ArrayList<>();

        for (int i = 0; i < mazeData.size(); i++) {
            for (int j = 0; j < mazeData.get(i).size(); j++) {
                String id = i + "," + j;
                Node node = new Node(id);
                nodes.add(node);
            }
        }
        return nodes;
    }
}
