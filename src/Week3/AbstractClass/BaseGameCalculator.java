package Week3.AbstractClass;

public abstract class BaseGameCalculator {
    public abstract void calculate();

    public final void finalscreen(){//kimse finalscreeni override edemez herkes bu haliyle kulllnmalÄ±
        System.out.println("game over");
    }
}
