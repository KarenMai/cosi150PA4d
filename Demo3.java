class Demo3 {
    public static void main(String[] args){
        System.out.println((new Test()).start(5));
    }
}

class Test{
    boolean debugging;
    int[] log;
    int max;

    boolean init(boolean d,int m){
        debugging = d;
        max = m;
        log = new int[m];
        return d;
    }

    int start(int x){
        boolean b;
        Test t;
        int i;
        t = this;
        max=10;
        b=(0<max) && (max<10);
        b=t.init(b,max);
        i=0;
        while (i<max){
            log[i]=2*i-1;
            i=i+1;
        }
        return log[max-1];
    }

}
