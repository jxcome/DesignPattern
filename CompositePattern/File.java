package com.chloe.solution;

public class File extends AbstractFile {
    int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print() {
        for (int i = 0; i < getDepth(); i++)
            System.out.print("\t");

        System.out.println("[File] " + getName() + ", Size: " + size);
    }
}
