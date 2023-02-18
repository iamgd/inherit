class class1 {
    private String attr1;
    private String attr2;

    class1(String attr1, String attr2) {
        this.attr1 = attr1;
        this.attr2 = attr2;
    }

    public void meth2() {
        System.out.println("This is the first attribute");
    }

    protected String getattr1() {
        return this.attr1;
    }

    protected String getattr2() {
        return this.attr2;
    }

}

class class2 extends class1 {
    public int attr3;

    class2(String attr1, String attr2, int attr3) {
        super(attr1, attr2);
        this.attr3 = attr3;
    }

    public void meth4() {
        System.out.println("This is method 4 of class2");
    }
}

class singlegeneric {

    public static void main(String[] args) {
        class2 obj = new class2("Ram", "Lakshman", 2);
        System.out.println(obj.getattr1());
        System.out.println(obj.getattr2());
        System.out.println(obj.attr3);
        obj.meth2();
        obj.meth4();
    }
}