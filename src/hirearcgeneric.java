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

class class3 extends class1 {
    public int attr4;

    class3(String attr1, String attr2, int attr4) {
        super(attr1, attr2);
        this.attr4 = attr4;
    }

    public void meth5() {
        System.out.println("This is method 5 of class3");
    }
}



class hirearcgeneric{

    public static void main(String[] args) {
        class2 obj = new class2("Ram", "Lakshman", 2);
        System.out.println(obj.getattr1());
        System.out.println(obj.getattr2());
        System.out.println(obj.attr3);  
        obj.meth2();
        obj.meth4();

        class3 obj1 = new class3("Ram", "Lakshman", 4);
        System.out.println(obj1.getattr1());
        System.out.println(obj1.getattr2());
        System.out.println(obj1.attr4);
        obj1.meth2();
        obj1.meth5();
    }
}


