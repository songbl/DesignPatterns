package statuepattern;

/**
 *  创建一个Statue接口，所有的状态都必须实现这个接口
 *
 *  1.糖果机的每个动作都对应一个方法。
 *  2.为状态机的每个状态实现状态类。这些类将负责在对应的状态下进行机器的行为。
 *  3.就动作委托给状态类
 */
public interface Statue {
    void insertQuarter();
    void ejectQUarter();
    void turnCrank();
    void dispense();
}
