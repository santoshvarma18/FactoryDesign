package UserInterface;

import Phone.FactoryObjInstantiater;
import Phone.*;

public class FactoryMain {
    public static void main(String[] args) {
        FactoryObjInstantiater smartphone = new FactoryObjInstantiater();
        Shortcuts andriod = smartphone.getShortcut("assistant");
        andriod.demonstration();

    }
    
}
