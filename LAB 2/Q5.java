class data{
    int height;
    int width;
    int length;
    public void volume(int l,int w,int h){
        int vol=h*w*l;
        System.out.println("volume is "+ vol);
    }
}
public class Q5 {
    public static void main(String[] args) {
        data ob=new data();
        ob.volume(5, 6, 2);
    }
}
