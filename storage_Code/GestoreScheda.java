/**
 * Created by Laura Zollo on 25/06/2016.
 */
public class GestoreScheda {

    AbstractClassifierSelector abstractClassifierSelector;
    Classifier classifier;

    Scheda scheda;

    public void salvaScheda(){

        classifier = abstractClassifierSelector.getClassifier(scheda.getType());
        classifier.store(scheda);

    }
}
