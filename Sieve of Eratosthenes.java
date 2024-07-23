class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int n){
        ArrayList<Integer> list = new ArrayList<>();
          int count=0;
            for (int i = 2; i <= n; i++) {
            count=0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
                if (count == 0) {
                    list.add(i);
                }
        }
        return list;
}
}
