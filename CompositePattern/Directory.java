package com.chloe;

import java.util.ArrayList;
import java.util.List;

/**
 * 디렉토리 이름과 복수의 객체(디렉토리, 파일)를 관리하는 클래스
 *
 * @date 2019/04/09
 */
public class Directory {
    private  String name;
    private int depth = 0;

    /**
     * Directory와 File을 담기 위한 리스트로, 둘의 상위 클래스인 Object 타입의 객체를 담는다.
     * 이는 다음과 같은 문제점이 있다.
     *
     * 1. File, Directory 외의 다른 타입의 객체가 담길 수 있다.
     *    이는 Directory 클래스의 개념과 맞지 않는다.
     *
     * 2. 이를 이용해 getSize, print 메소드를 쓸 때, 그 타입에 따라 형변환 한다.
     * 3. 새로운 타입의 객체에 대해 확장해야 하는 경우, 그 타입을 반영해 geSize, print를 수정해야 한다.
     *    이는 SOLID의 OCP(개방-폐쇄 원칙)에 위배된다.
     *
     *  -> 위 문제점을 컴포지트 패턴을 활용해 해결하고자 한다.
     */
    private List<Object> entries = new ArrayList<Object>();

    public Directory(String name) {
        this.name = name;
    }

    public void addEntry(Object entry) {
        entries.add(entry);

        if (entry instanceof  File)
            ((File) entry).setDepth(depth + 1);
        if (entry instanceof Directory)
            ((Directory) entry).setDepth(depth + 1);
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void removeEntry(Object entry) {
        entries.remove(entry);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int size = 0;

        for (Object entry:entries) {
            if (entry instanceof  File)
                size += ((File) entry).getSize();
            if (entry instanceof Directory)
                size += ((Directory) entry).getSize();
        }

        return size;
    }

    public void print() {
        for (int i = 0; i < depth; i++)
            System.out.print("\t");

        System.out.println("[Directory] " + name + ", Size: " + getSize());

        for (Object entry:entries) {
            if (entry instanceof  File)
                ((File) entry).print();
            if (entry instanceof Directory)
                ((Directory) entry).print();
        }
    }
}
