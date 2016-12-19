class node
{
char info;
node right;
node left;
}
class tree
{
public static void main(String []args)
{
String s= " etianmsurwdkgohvf l pjbxcyzq  543   2       16       7   8 90";
node head=new node();
head.info=s.charAt(0);
//System.out.println(head.info);
head.left=null;
head.right=null;
int i;	
for( i=1;i<s.length();i=i+2)
{
	char x=s.charAt(i);
	int f=(i-1)/2;
	node q=new node();
	q=s.charAt(f);
	q.left.info=s.charAt(i);
	q.right.info=s.charAt(i+1);
}
preor(head);
}

public static void preor(node head)
{
	if(head!=null)
	{
		System.out.println(head.info);
		preor(head.left);
		preor(head.right);
	}
}
public void checkalpha(String b,node head)
{	int j;
	for(j=0;j<b.length();j++)
	{
		if(b.charAt(j)== '.')
			checkalpha(b,head.left);
		else if (b.charAt(j)== '-')
			checkalpha(b,head.right);
	}	
}


}




