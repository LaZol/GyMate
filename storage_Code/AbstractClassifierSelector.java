/**
 * Created by Laura Zollo on 25/06/2016.
 */
public abstract class AbstractClassifierSelector {
    protected Classifier imp;

    public abstract Classifier getClassifier(String pType);
}
