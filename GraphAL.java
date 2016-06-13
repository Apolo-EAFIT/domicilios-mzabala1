import java.util.ArrayList;

public class GraphAL extends Graph
{
   private ArrayList<ArrayList<String>> vertices;
   private ArrayList<ArrayList<Integer>> weights;
   
   public GraphAL(long size)
   {
       super(size);
       vertices = new ArrayList<ArrayList<String>>();
       weights = new ArrayList<ArrayList<Integer>>();
       for (long i = 0; i < size; i++)
       {
        ArrayList<String> arcs = new ArrayList<String>();
        ArrayList<Integer> ws = new ArrayList<Integer>();
        vertices.add(arcs);
        weights.add(ws);
       }
   }

  
   
   public void addArc(String source, String destination, int weight)
   {
     
       vertices.get((int) Long.parseLong(source)).add(destination);
       weights.get((int) Long.parseLong(source)).add(weight);
       
       //vertices.get(destination).add(source);
       //weights.get(destination).add(weight);
   }
   
   public int getWeight(String source, String destination)
   {
      for (int j = 0; j < size; j++)
      {
        if (vertices.get((int)Long.parseLong(source)).get(j) == destination)
            return weights.get((int)Long.parseLong(source)).get(j);
      }
      return -1;
   }
  
   public ArrayList<String> getSuccessors(String vertice)
   {
      return vertices.get((int) Long.parseLong(vertice));
   }
}
