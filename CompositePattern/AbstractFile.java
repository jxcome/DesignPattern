package com.chloe.solution;

/**
 * CompositePattern에서 Component의 역할
 * 즉, Leaf클래스와 전체에 해당하는 Composite 클래스에 공통 인터페이스를 정의
 *
 * @date 2019/04/09
 * @author chloe choi
 */
public abstract class AbstractFile {
    private String name;
    private int depth = 0;

    public AbstractFile(String name) {
        this.name = name;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getName() {
        return name;
    }

    public int getDepth() {
        return depth;
    }

    public abstract int getSize();
    public abstract void print();
}
