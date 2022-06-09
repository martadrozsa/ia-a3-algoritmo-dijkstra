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


        // criação de nodes
        for (int i = 0; i < mazeData.size(); i++) {
            List<Integer> row = mazeData.get(i);  //pegou a linha

            for (int j = 0; j < row.size(); j++) {
                //para verificar se existe ligação no nó (se 1 ou se 0)
                if (row.get(j) == 0) {
                    continue;
                }
                String id = i + "," + j;

                Integer weight = row.get(j); // valor na posição j

                Node node = new Node(id, i, j, weight);
                nodes.add(node);
            }
        }

        int north; //      i = i - 1       &&    j = j
        int west;  //      i = i          &&    j = j - 1
        int east;  //      i = i          &&    j = j + 1
        int south; //      i = i + 1      &&    j = j

        for (Node node : nodes) {

            int nodeI = node.getI();
            int nodeJ = node.getJ();

            int northI =  nodeI - 1;
            int northJ = nodeJ;
            String northId = northI + "," + northJ;

           // Node northNeighbor =
        }

        //ligação dos nodes
        //

        return nodes;
    }
}
