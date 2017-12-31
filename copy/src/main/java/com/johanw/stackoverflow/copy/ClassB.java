package com.johanw.stackoverflow.copy;

public class ClassB {
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    String b;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassB) && !(o instanceof ClassY)) return false;

        if (o instanceof ClassB) {
            ClassB classB = (ClassB) o;
            return b != null ? b.equals(classB.b) : classB.b == null;
        } else {
            ClassY classY = (ClassY) o;
            return b != null ? b.equals(classY.b) : classY.b == null;
        }
    }
}
