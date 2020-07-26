import java.util.*; 
class LargestOf3
{
 public static void main(String args[])
 {
   int p,q,r,large;
   Scanner obj=new Scanner(System.in);
   System.out.print("Enter 3 numbers");
   p=obj.nextInt();
   q=obj.nextInt();
   r=obj.nextInt();
   
    if(p>q)
     {
        if(p>r)
           large=p;
        else
          large=r;
     }
     else
     {
        if(q>r)
           large=q;
        else
            large=r;
     }

   System.out.println("Largest of 3 numbers is "+large);
 }
}