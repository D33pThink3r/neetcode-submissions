class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        int[] res=new int[n];
        int[] inDegree=new int[n];
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        Queue<Integer> Q=new LinkedList<>();
        for(int[] pre:prerequisites){
            graph.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;
        }
        for(int i=0;i<n;i++){
            if(inDegree[i]==0) Q.add(i);
        }
        int count=0;
        while(!Q.isEmpty()){
            int u=Q.poll();
            res[count]=u;
            count++;
            for(int v:graph.get(u)){
                inDegree[v]--;
                if(inDegree[v]==0)Q.add(v);
            }
        }
        return(count==n)?res:new int[0];
    }
}
