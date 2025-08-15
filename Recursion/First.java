class First {
    public static void main(String args[]){
        // func(1, 3);

        int ans = sumFirstNno(5);
        System.err.println(ans);
    }

    public static int sumFirstNno(int N){
        if(N == 1){
            return N;
        }

        return N + sumFirstNno(N-1);
    }

    public static void func(int i, int N){
        if(i>N){
            return;
        }

        func(i+1, N);
        System.out.println(i);
    }
}