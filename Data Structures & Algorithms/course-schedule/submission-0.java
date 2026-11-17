class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        int inDegree[]=new int[n];
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            int u=edge[0];
            int v=edge[1];
            graph.get(u).add(v);
            inDegree[v]++;
        }
        //Kahn Algorithm
        Queue<Integer> Q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inDegree[i]==0) Q.add(i);
        }
        int count=0;
        while(!Q.isEmpty()){
            int u=Q.poll();
            count++;
            for(int v:graph.get(u)){
                inDegree[v]--;
                if(inDegree[v]==0)Q.add(v);            
            }
        }
        return count==n;

    }
}
