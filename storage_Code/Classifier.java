import java.util.LinkedList;

public interface Classifier
{
	public void store(IStorable pack);
	public LinkedList<Object> recover(String pID);
}
