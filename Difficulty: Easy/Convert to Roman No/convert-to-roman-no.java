class Solution {
    String convertToRoman(int n) {
        // code here
        int[] val={1000, 900, 500, 400, 100,90, 50,40,10,9,5,4,1};
        String[] symbol={"M", "CM", "D", "CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder res= new StringBuilder();
        for(int i=0;i<val.length;i++){
            while(n>=val[i]){
                res.append(symbol[i]);
                n-=val[i];
            }
        }
        return res.toString();
    }
}