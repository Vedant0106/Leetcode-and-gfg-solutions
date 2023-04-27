//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
	public static void main (String[] args) throws Exception{
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
                
        int t=Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n=Integer.parseInt(in.readLine().trim());
            String s=in.readLine().trim();
            int q=Integer.parseInt(in.readLine().trim());
            query a[]=new query[q];
            for(int i=0;i<q;i++){
                String str=in.readLine().trim();
                String st[]=str.split(" ");
                if(st[0].trim().equals("1")){
                    a[i]=new query("1",st[1],st[2],"");
                }else{
                    a[i]=new query("2",st[1],st[2],st[3]);
                }
            }
            Solution ob=new Solution();
            ArrayList<Character> ans=ob.easyTask(n,s,q,a);
            for(char ch:ans){
                out.print(ch+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static ArrayList<Character> easyTask(int n,String s,int q,query queries[])
    {
       StringBuilder sb = new StringBuilder(s);
        ArrayList<Character> list = new ArrayList<>();
        PriorityQueue<Character> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i< queries.length; i++){
            query Q = queries[i];
            if(Q.type == "1"){
                sb.setCharAt(Integer.valueOf(Q.a), Q.b.charAt(0));
            }else{
                int left = Integer.valueOf(Q.a);
                int right = Integer.valueOf(Q.b);
                int k = Integer.valueOf(Q.c);
                String substr = sb.substring(left, right+1);
                
                int [] arr= new int[26];
                for(int ind=left; ind<= right; ind++) arr[sb.charAt(ind)-'a']++;
                for(int ind=25; ind>=0; ind--){
                    k-= arr[ind];
                    if(k<=0) {
                        list.add((char)(ind+'a'));
                        break;
                    }
                }
                
            }
        }
        return list; 
    }
}

class query
{
    String type;
    String a;
    String b;
    String c;
    public query(String type,String a,String b,String c)
    {
        this.type=type;
        this.a=a;
        this.b=b;
        this.c=c;
    }
}