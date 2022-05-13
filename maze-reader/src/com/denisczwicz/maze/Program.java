package com.denisczwicz.maze;

import com.denisczwicz.maze.reader.MazeReader;

public class Program {
    public static void main(String[] args) {

        MazeReader mazeReader = new MazeReader();

        System.out.println(mazeReader.readFromFile("maze.csv"));
    }

}