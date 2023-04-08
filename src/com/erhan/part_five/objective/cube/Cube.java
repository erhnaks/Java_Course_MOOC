package com.erhan.part_five.objective.cube;

public class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    }

    public int getEdgeLength() {
        return this.edgeLength;
    }

    public String toString() {
        return "The edge is " + this.edgeLength + ", and the volume is: " + volume();
    }


}
