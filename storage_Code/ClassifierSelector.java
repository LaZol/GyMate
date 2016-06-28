/**
 * Created by Laura Zollo on 25/06/2016.
 */


public class ClassifierSelector extends AbstractClassifierSelector {
    @Override
    public Classifier getClassifier(String pType) {
        if (pType == "Scheda") {
            imp = new ClassifierScheda();
            return imp;
        }
        if (pType == "Esercizio"){

            //classifier esercizio
            return null;
        }else{return null;}
    }
}
