class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder ans=new StringBuilder();
        int n=strs.length;
        char[]f=strs[0].toCharArray();
        char[]l=strs[n-1].toCharArray();
        for(int i=0;i<f.length;i++){
            if(f[i]!=l[i])
            break;
            ans.append(f[i]);
        }
        return ans.toString();


        }
        
    }
