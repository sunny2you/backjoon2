import java.util.*;

public class Main3{
    static int T;
    static int[] x;
    static int[] y;
    static int[] r;
    static double[] A;
    static int[] res;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        x=new int[T*2];
        y=new int[T*2];
        r=new int[T*2];
        A=new double[T];
        res=new int[T];
        for(int i=0; i<T*2; i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            r[i]=sc.nextInt();
        }
        for(int i=0;i<T;i++){
            A[i]=distance(x[i*2],y[i*2],x[i*2+1],y[i*2+1]);
        }
        for(int i=0;i<T;i++){
            res[i]=PointofContact(A[i],r[i*2],r[i*2+1]);
        }
        for(int i=0;i<T;i++){
            System.out.println(res[i]);
        }
    }
        static double distance(int x1, int y1, int x2, int y2){
            return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        }
        static int PointofContact(double A, int r1, int r2){

            if(A!=0&&A<r1+r2){ //내접 조건도 포함됨 이렇게쓰면
                return 2;
            }
            else if(A+Math.min(r1,r2)==Math.max(r1,r2)||A==r1+r2){
                return 1;
            }
            else if(A>r1+r2||(A==0&&r1!=r2)||A+Math.min(r1,r2)<Math.max(r1,r2)){
                return 0;
            }
            else if(A==0&&r1==r2){
                return -1;
            }
            else{
                return -2;
            }
                
        }
        
    }
