package com.denisczwicz.spf;

import com.denisczwicz.spf.entities.MazeReader;

public class Main {

    public static void main(String[] args) {

        MazeReader mazeReader = new MazeReader();

        System.out.println(mazeReader.readFromFile("maze.csv"));
        System.out.println(mazeReader.createListNodes());
    }
}
