public class Factoriel
{ public static void main (String args[])
{
//System.out.println ("Mon premier programme java") ;
int N=10, F=1; // F est factoriel de N
	
if	(N==0 || N==1) F=1;
else for(int i=2;i<=N;i++) F*=i;
System.out.println ("Factoriel de "+N+" est : "+F) ;
}
}