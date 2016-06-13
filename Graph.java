import java.util.ArrayList;

public abstract class Graph
{
   protected long size;
   public  Graph(long vertices) 
   {
       size = vertices;
   }
   public  abstract void addArc(String source, String destination, int weight);
   public abstract ArrayList<String> getSuccessors(String vertice);
   public abstract int getWeight(String source, String destination);
   public  long size() {return size;}
}
