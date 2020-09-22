class Fib {

    private long[] arr;

    public long go(int n) {

        arr = new long[n];
        if (n == 1 || n == 2) {
            return 1;
        }
        arr[0] = 1;
        arr[1] = 1;
        arr[n-1] = fib(n-1)+fib(n-2);
        for(int i = 0;i<n;i++){System.out.print(arr[i]+" ");}
        return arr[n-1];

    }

    private long fib(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }

        if (arr[n-1] == 0) {
            arr[n-1] = fib(n - 2) + fib(n - 1);
            return arr[n-1];
        } else {
            return arr[n-1];
        }

    }

}

class Main {

    public static void main(String[] args) {

        Fib f = new Fib();
        System.out.println(f.go(500));

    }
}