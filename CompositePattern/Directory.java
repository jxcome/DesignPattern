package com.chloe.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * CompositePattern에서 Composite에 해당하는 클래스.
 * 즉, 전체 클래스로 복수 개의 Component를 갖도록 정의
 *
 * AbstractFile 클래스의 하위 클래스로 정의
 * AbstractFile 클래스를 이용해 File과 동일한 방식으로 Directory 클래스를 사용
 *
 * @date 2019/04/09
 * @author chloe choi
 */
public class Directory extends AbstractFile {

    //복수 개의 AbstractFile을 담는 변수
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

        // 일반화한 클래스를 이용해 타입을 확인하지 않고 처리 -> OCP를 준수
        for (AbstractFile entry:entries) {
            size += entry.getSize();
        }

        return size;
    }

    @Override
    public void print() {
        for (int i = 0; i < getDepth(); i++)
            System.out.print("\t");

        System.out.println("[Directory] " + getName() + ", Size: " + getSize());

        for (AbstractFile entry:entries) {
            entry.print();
        }
    }
}
