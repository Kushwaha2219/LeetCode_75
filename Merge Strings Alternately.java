//Beat 85.52%
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int n1 = word1.length(), n2 = word2.length();
        int i = 0 , j = 0;
        while(i < n1 && j < n2){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i < n1){
            sb.append(word1.charAt(i));
            i++;
        }

        while(j < n2){
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }
}
//Beat 100%
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int n1 = word1.length(), n2 = word2.length();
        int i = 0 , j = 0;
        while(i < n1 && j < n2){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        if(i < n1){
            sb.append(word1.substring(i,n1));
        }

        if(j < n2){
            sb.append(word2.substring(j,n2));
        }

        return sb.toString();
    }
}
