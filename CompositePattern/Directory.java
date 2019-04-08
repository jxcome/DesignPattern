package com.chloe.solution;

import java.util.ArrayList;
import java.util.List;

public class Directory extends AbstractFile {
    private List<AbstractFile> entries = new ArrayList<AbstractFile>();

    public Directory(String name) {
        super(name);
    }

    public void addEntry(AbstractFile entry) {
        entries.add(entry);
        entry.setDepth(getDepth() + 1);
    }

    public void removeEntry(AbstractFile entry) {
        entries.remove(entry);
    }

    @Override
    public int getSize() {
        int size = 0;

        for (AbstractFile entry:entries) {
            size += entry.getSize();
        }

        return size;
    }

    @Override
    public void print() {
        for (int i = 0; i < getDepth(); i++)
            System.out.print("\t");

        System.out.println("[DirectoryP] " + getName() + ", Size: " + getSize());

        for (AbstractFile entry:entries) {
            entry.print();
        }
    }
}
