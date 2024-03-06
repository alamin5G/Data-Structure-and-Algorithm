import java.util.Scanner;

public class test {
    public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        //String[] res = new String[n];
        for( int i =0;i<n;i++){
          String s =sc.nextLine();
            if(s.length()%2!=0){
               //res[i]="NO";
               System.out.println("NO");
            }else{
               StringBuffer sb = new StringBuffer(s);
               if(s.endsWith(sb.subSequence(0,s.length()/2).toString())){
                  // res[i]="YES";
                  System.out.println("YES");
               }else{
                System.out.println("NO");
                //res[i]="NO";
               }
                   
            }
        }
    //    for(String s :res){
    //        System.out.println(s);
    //    }
    }
}
