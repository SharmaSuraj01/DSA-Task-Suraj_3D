import java.util.*;
public class Open_the_Lock_752 {
    public int openLock(String[] deadends, String target) {
        Set<String>deadendSet=new HashSet<>(Arrays.asList(deadends));
        Queue<String> queue= new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer("0000");
        visited.add("0000");
        int level=0;
        while(!queue.isEmpty())
        {
            int size =queue.size();
            while(size-- >0)
            {
                String current =queue.poll();
                if(deadendSet.contains(current))continue;
                if(current.equals(target)) return level;

                List <String> nextop= nextOptions(current);
                for(String op : nextop)
                {
                    if(!visited.contains(op))
                    {
                        queue.offer(op);
                        visited.add(op);
                    }
                }
            }
            level++;
        }
        return -1;
    }    
    private char bottomturn(char c)
    {
        return (c=='9'? '0':(char)(c+1));
    }
    private char upturn(char c)
    {
        return (c=='0'? '9':(char)(c-1));
    }
    private List<String>nextOptions(String s)
    {
        List<String>ans=new ArrayList<>();
        for(int i=0;i<4;i++)
        {
            StringBuilder copy=new StringBuilder(s);
            copy.setCharAt(i,bottomturn(s.charAt(i)));
            ans.add(copy.toString());
            copy.setCharAt(i,upturn(s.charAt(i)));
            ans.add(copy.toString());
        }
        return ans;
    }
}
