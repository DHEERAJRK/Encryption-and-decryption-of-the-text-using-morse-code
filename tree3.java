class node
{
char info;
node right;
node left;
}
class tree3
{
public static void main(String []args)
{
	//0,1
	node head=new node();
	head.info=' ';
	node A=new node();
	head.left=A;
	head.left.info='e';
	head.right.info='t';
	//2
	node B=new node();
	head.left.left=B;
	head.left.left.info='i';
	head.left.right.info='a';
	
	head.right.left.info='n';
	head.right.right.info='m';
	
	//3
	head.left.left.left.info='s';
	head.left.left.right.info='u';
	head.left.right.left.info='r';
	head.left.right.right.info='w';
	
	head.right.left.left.info='d';
	head.right.left.right.info='k';
	head.right.right.left.info='g';
	head.right.right.right.info='o';
	
	//4
	head.left.left.left.left.info='h';
	head.left.left.left.right.info='v';
	head.left.left.right.left.info='f';
	head.left.left.right.right.info=' ';
	head.left.right.left.left.info='l';
	head.left.right.left.right.info=' ';
	head.left.right.right.left.info='p';
	head.left.right.right.right.info='j';
	
	head.right.left.left.left.info='b';
	head.right.left.left.right.info='x';
	head.right.left.right.left.info='c';
	head.right.left.right.right.info='y';
	head.right.right.left.left.info='z';
	head.right.right.left.right.info='q';
	head.right.right.right.left.info=' ';
	head.right.right.right.right.info=' ';
	
	//5
	head.left.left.left.left.left.info='5';
	head.left.left.left.left.right.info='4';
	head.left.left.left.right.left.info=' ';
	head.left.left.left.right.right.info='3';
	head.left.left.right.left.left.info=' ';
	head.left.left.right.left.right.info=' ';
	head.left.left.right.right.left.info=' ';
	head.left.left.right.right.right.info='2';
	head.left.right.left.left.left.info=' ';
	head.left.right.left.left.right.info=' ';
    head.left.right.left.right.left.info=' ';	
	head.left.right.left.right.right.info=' ';
	head.left.right.right.left.left.info=' ';
	head.left.right.right.left.right.info=' ';
	head.left.right.right.right.left.info=' ';
	head.left.right.right.right.right.info='1';
	
	head.right.left.left.left.left.info='6';
	head.right.left.left.left.right.info=' ';
	head.right.left.left.right.left.info=' ';
	head.right.left.left.right.right.info=' ';
	head.right.left.right.left.left.info=' ';
	head.right.left.right.left.right.info=' ';
	head.right.left.right.right.left.info=' ';
	head.right.left.right.right.right.info=' ';
	head.right.right.left.left.left.info='7';
	head.right.right.left.left.right.info=' ';
	head.right.right.left.right.left.info=' ';
	head.right.right.left.right.right.info=' ';
	head.right.right.right.left.left.info='8';
	head.right.right.right.left.right.info=' ';
	head.right.right.right.right.left.info='9';
	head.right.right.right.right.right.info='0';
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	