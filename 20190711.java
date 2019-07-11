/**
 * 斐波那契数列应用
 * 计算应用要点f(n)=f(n-1)+f(n-2)
 * */
class test1 {
	public static void main(String[] args) {
		System.out.println("请输入第几个数，以回车结束：");
		Scanner sc = new Scanner(Sytem.in);
		int x = sc.nextInt();
		for(int i = 1;i <= x; i++){
			System.out.println(fib(i)+"\t");
		}
	}
	//创建算法函数，让主函数调用该算法
	public static int fib(int num){
		//外部传入一个整数，进行判断，如若是第1，2个，则返回1，否则返回fib(num-2)+fib(num-1)
	if(num == 1|| num == 2){
		return 1；
	}
	else{
		return fib(num-2)+fib(num-1);
	}
	}
}
