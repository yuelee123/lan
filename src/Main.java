public class Main {
    public static void main (String[] args){
        int count=0;
        for(int i=1;i<=10000;i++){
            String str=i+"";
            long a=(long)i*i*i;
            String str2=a +"";
            if(str2.endsWith(str))
                count+=1;
        }
        System.out.println(count);
    }


}
