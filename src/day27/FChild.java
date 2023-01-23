package day27;

public class FChild extends EParent{

    @Override
    protected void method1() {
        super.method1();
        //Eger Overriding method ile birlikte overridden method da calissin istersek
        //overridding method icinden süper.method1; yazabiliriz.
    }

    @Override
    protected void method2() {
        super.method2();
    }
}
