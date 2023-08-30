public class Sample 
{
    private int x;
    private double y;

    public Sample() {
        this.x = 0;
        this.y = 0;
    }

    public Sample(int a, double b){
        this.x = a;
        this.y = b;
    }

    public void setSample(){
        this.x = 10;
        this.y = 25.8;
    }

    public void print(){
        System.out.print("x = " + x + "; y = " + y + "\n");
    }
}