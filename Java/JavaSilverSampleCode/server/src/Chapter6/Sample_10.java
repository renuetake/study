package Chapter6;

abstract class X { // 抽象クラス
    protected abstract void methodA();
}

abstract class Y extends X { } // 抽象クラス

class Z extends Y { // 具象クラス
    protected void methodA() { }
    // public void methodA() { } // public 修飾子でもOK
    // void methodA() { } // 修飾子の指定なしはNG
}