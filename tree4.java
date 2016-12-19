class node
{
char info;
node right;
node left;
}
class tree4
{
public static void main(String []args)
{
	//0,1
	node head=new node();
	head.info=' ';
	node A=new node();
	head.left=A;
	A.info='e';
	node B=new node();
	head.right=B;
	B.info='t';
	//2
	node C=new node();
	A.left=C;
	C.info='i';
	node D=new node();
	A.right=D;
	D.info='a';
	
	node E=new node();
	B.left=E;
	E.info='n';
	node F=new node();
	B.right=F;
	F.info='m';
	
	//3
	node G=new node();
	C.left=G;
	G.info='s';
	node H=new node();
	C.right=H;
	H.info='u';
	node I=new node();
	D.left=I;
	I.info='r';
	node J=new node();
	D.right=J;
	D.info='w';
	node K=new node();
	E.left=K;
	K.info='d';
	node L=new node();
	E.right=L;
	L.info='k';
	node M=new node();
	F.left=M;
	M.info='g';
	node N=new node();
	F.right=N;
	N.info='o';
	
	//4
	node O=new node();
	G.left=O;
	O.info='h';
	node P=new node();
	G.right=P;
	P.info='v';
	node Q=new node();
	H.left=Q;
	Q.info='f';
	node R=new node();
	H.right=R;
	R.info=' ';
	node S=new node();
	I.left=S;
	S.info='l';
	node T=new node();
	I.right=T;
	T.info=' ';
	node U=new node();
	J.left=U;
	U.info='p';
	node V=new node();
	J.right=V;
	V.info='j';
	
	node W=new node();
	K.left=W;
	W.info='b';
	node X=new node();
	K.right=X;
	X.info='x';
	node Y=new node();
	L.left=Y;
	Y.info='c';
	node Z=new node();
	L.right=Z;
	Z.info='y';
	node AA=new node();
	M.left=AA;
	AA.info='z';
	node BB=new node();
	M.right=BB;
	BB.info='q';
	node CC=new node();
	N.left=CC;
	CC.info=' ';
	node DD=new node();
	N.right=DD;
	DD.info=' ';
	
	//5
	node EE=new node();
	O.left=EE;
	EE.info='5';
	node FF=new node();
	O.right=FF;
	FF.info='4';
	node GG=new node();
	P.left=GG;
	GG.info=' ';
	node HH=new node();
	P.right=HH;
	HH.info='3';
	node II=new node();
	Q.left=II;
	II.info=' ';
	node JJ=new node();
	Q.right=JJ;
	JJ.info=' ';
	node KK=new node();
	R.left=KK;
	KK.info=' ';
	node LL=new node();
	R.right=LL;
	LL.info='2';
	node MM=new node();
	S.left=MM;
	MM.info=' ';
	node NN=new node();
	S.right=NN;
	NN.info=' ';
	node OO=new node();
	T.left=OO;
    OO.info=' ';	
	node PP=new node();
	T.right=PP;
	PP.info=' ';
	node QQ=new node();
	U.left=QQ;
	QQ.info=' ';
	node RR=new node();
	U.right=RR;
	RR.info=' ';
	node SS=new node();
	V.left=SS;
	SS.info=' ';
	node TT=new node();
	V.right=TT;
	TT.info='1';
	
	node UU=new node();
	W.left=UU;
	UU.info='6';
	node VV=new node();
	W.right=VV;
	VV.info=' ';
	node WW=new node();
	X.left=WW;
	WW.info=' ';
	node XX=new node();
	X.right=XX;
	XX.info=' ';
	node YY=new node();
	Y.left=YY;
	YY.info=' ';
	node ZZ=new node();
	Y.right=ZZ;
	ZZ.info=' ';
	node AAA=new node();
	Z.left=AAA;
	AAA.info=' ';
	node BBB=new node();
	Z.right=BBB;
	BBB.info=' ';
	node CCC=new node();
	AA.left=CCC;
	CCC.info='7';
	node DDD=new node();
	AA.right=DDD;
	DDD.info=' ';
	node EEE=new node();
	BB.left=EEE;
	EEE.info=' ';
	node FFF=new node();
	BB.right=FFF;
	FFF.info=' ';
	node GGG=new node();
	CC.left=GGG;
	GGG.info='8';
	node HHH=new node();
	CC.right=HHH;
	HHH.info=' ';
	node III=new node();
	DD.left=III;
	III.info='9';
	node JJJ=new node();
	DD.right=JJJ;
	JJJ.info='0';
	node KKK=new node();
	KK.left=KKK;
	KKK.info='?';
	node LLL=new node();
	GGG.left=LLL;
	LLL.info=':';
	node MMM=new node();
	DDD.right=MMM;
	MMM.info=',';
	node NNN=new node();
	OO.right=NNN;
	NNN.info='.';
	
	//preor(head);
}
/*public static void preor(node head)
{
	if(head!=null)
	{
		System.out.println(head.info);
		preor(head.left);
		preor(head.right);
	}
}*/
public void checkalpha(String []b,node head)
{	int j;
	for(j=0;j<b.length;j++)
	{
		if(b[j]== ".")
			checkalpha(b,head.left);
			
		else if (b[j]== "-")
			checkalpha(b,head.right);
		
	}	System.out.println(head.info);
}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	