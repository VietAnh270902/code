//import java.util.Scanner;
// GHI CHÚ
// hiện tượng 1 classs bất kì chứa nhiều hangf mà trùng tên nhưng khác phần tham số mà phải khác tên trên datatype chứ không phải khác trên tên biến
//dc gọi là overload/ overloading - quá tải hàm




//fibbo va modulo
//public static long fib(int n)
//	{
//	    int F[][] = {{1, 1}, {1, 0}};
//	    if (n == 0)
//	        return 0;
//	    power(F, n - 1);
//	 
//	    return F[0][0];
//	}
//	 
//	// Optimized version of power() in method 4
//	public static void power(int F[][], int n)
//	{
//	    if(n == 0 || n == 1)
//	       return;
//	    int M[][] = {{1, 1}, {1, 0}};
//	     
//	    power(F, n / 2);
//	    multiply(F, F);
//	     
//	    if (n % 2 != 0)
//	        multiply(F, M);
//	}
//	 
//	public static void multiply(int F[][], int M[][])
//	{
//	    int x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
//	    int y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
//	    int z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
//	    int w = F[1][0] * M[0][1] + F[1][1] * M[1][1];
//	     
//	    F[0][0] = x;
//	    F[0][1] = y;
//	    F[1][0] = z;
//	    F[1][1] = w;
//	    
// CHIa tien
//c1
//	public static void chiatien(double n) {
//		if((1.375 * n) == (int)(1.375 * n)){
//			if((0.875 * n) == (int)(0.875 * n)) {
//				if((0.75 * n) == (int)(0.75 * n)) {
//					System.out.print((int)(1.375 * n) + " " + (int)(0.875 * n) +  " " + (int)(0.75 * n));
//				}
//				else
//					System.out.print("NO");
//			}
//			else
//				System.out.print("NO");
//		}
//		else 
//			System.out.print("NO");
//		
//	}
//C2
//public static void chiatien(double n) {
//if((1.375 * n) == (int)(1.375 * n) && (0.875 * n) == (int)(0.875 * n) && (0.75 * n) == (int)(0.75 * n)){
//	System.out.print((int)(1.375 * n) + " " + (int)(0.875 * n) +  " " + (int)(0.75 * n));
//}
//else 
//	System.out.print("NO");
//
//}












// giai thua loi~
//public static void factorial(int n)
//	{
//		int res[] = new int [1000];
//
//		// Initialize result
//		res[0] = 1;
//		int res_size = 1;
//
//		// Apply simple factorial formula n! = 1 * 2 * 3 * 4...*n
//		for (int x=2; x<=n; x++)
//			res_size = multiply(x, res, res_size);
//
//		for (int i=res_size-1; i>=0; i--)
//			 System.out.print(res[i]);
//	}
//
//	// This function multiplies x with the number
//	// represented by res[].
//	// res_size is size of res[] or number of digits in the
//	// number represented by res[]. This function uses simple
//	// school mathematics for multiplication.
//	// This function may value of res_size and returns the
//	// new value of res_size
//	public static int multiply(int x, int res[], int res_size)
//	{
//		int carry = 0; // Initialize carry
//
//		// One by one multiply n with individual digits of res[]
//		for (int i=0; i<res_size; i++)
//		{
//			int prod = res[i] * x + carry;
//
//			// Store last digit of 'prod' in res[]
//			res[i] = prod % 10;
//
//			// Put rest in carry
//			carry = prod/10;
//		}
//
//		// Put carry in res and increase result size
//		while (carry > 0)
//		{
//			res[res_size] = carry%10;
//			carry = carry/10;
//			res_size++;
//		}
//		return res_size;
//	}





// giờ kết thúc
//		public static void main(String[] args) {
//		Scanner ip = new Scanner(System.in);
//		int h, m, s, x;	
//		h = ip.nextInt();
//		m = ip.nextInt();
//		s = ip.nextInt();
//		x = ip.nextInt();
//		s += x;
//		while(s >= 60) {
//			++m;
//			s -= 60;
//		}
//		while(m >= 60) {
//			++h;
//			m -= 60;
//		}
//		while(h > 12 && h > 0) {
//			h-=12;
//		}
//		
//		System.out.print(h + " " + m + " " + s);
	//}

// UCLN và BCNN
//	public static long UCLN(long a, long b) {
//		if(b == 0)
//			return a;
//		else
//			return UCLN(b, a % b);
//	}
//	public static long BCNN(long a, long b) {
//		return a / UCLN(a , b) * b;
//	}

// năm nhuận
//int n;
//		n = ip.nextInt();
//		if((n % 4 == 0) && (n % 100 != 0))
//			System.out.println("YES");
//		else if(n % 400 == 0)
//			System.out.println("YES");
//		else
//			System.out.println("NO");
//		
//	}

// Nhi phân
//public static void main(String[] args) {
//		Scanner ip = new Scanner(System.in);
//		int n;
//		n = ip.nextInt();
//		System.out.print(Integer.toBinaryString(n));
//		ip.close();
//	}

// giai thua
//public static long giaithua(long n) {
//		if(n == 0|| n == 1) return 1;
//		else return n * giaithua(n - 1);
//	}
//	public static void main(String[] args) {
//		//playwithVariables();
//		int n;
//		Scanner ip = new Scanner(System.in);
//		n = ip.nextInt();
//		ip.close();
//		System.out.print(giaithua((long)n));
//	}


// So nguyen to
//package ITforstudent;
//
//import java.util.Scanner;
//
//public class baitap {
//	
//	public static void main(String[] args) {
//		//playwithVariables();
//		int n;
//		Scanner ip = new Scanner(System.in);
//		n = ip.nextInt();
//		ip.close();
//		if(n == 5 || n == 7|| n == 2 || n == 3)
//		System.out.print("Yes");
//		else {
//			boolean check = true;
//			for(int i = 2; i < n / 2; i++) {
//				if(n % i == 0) check = false;
//				if(check== false) break;
//			}
//			if(check = true) System.out.print("Yes");
//			else System.out.print("NO");
//		}
//		
//	}
//}

//Số Nguyên tố
//public static boolean SoNguyenTo( double n) {
//		if(n < 2)
//			return false;
//		if(n == 2)
//			return true;
//		for (int i = 2; i <= Math.sqrt(n); i++) {
//			if(n % i == 0)
//				return false;
//		}
//		return true;
//	}

// fibonaci
//package ITforstudent;
//
//import java.util.Scanner;
//
//public class baitap {
//	
//	public static long Fib(long n) {
//		if(n == 1|| n == 2)
//			return 1;
//		else 
//			return Fib(n - 1)+ Fib(n - 2);
//}
//	public static void main(String[] args) {
//	//playwithVariables();
//		long n;
//		Scanner ip = new Scanner(System.in);
//		n = ip.nextLong();
//		ip.close();
//		System.out.print(Fib(n));
//}
//}


// mod modulo
//BigInteger n, m, k;
//		//Scanner ip = new Scanner(System.in);
//		m = ip.nextBigInteger();
//		n = ip.nextBigInteger();
//		k = ip.nextBigInteger();
//		//ip.close();
//		System.out.print(m.modPow(n, k)); 
//	}


// Dem uoc
//public static int DemUoc(int n) {
//		int dem = 0;
//		for(int i = 1; i * i <= n; ++i) {
//			if(n % i == 0) {
//				++dem;
//				int j = n / i;
//				if(j != i)
//					++dem;
//			}
//		}
//		return dem;
//	}

// Số tự mãn
//	public static int DemCso(int n) {
//		int k = 0;
//		while(n != 0) {
//			n /= 10;
//			k++;
//		}
//		return k;
//	}
//	public static void SoTuMan(int n) {
//		int s = 0, n1 = n;
//		int mu = DemCso(n1);
//		int chuso;
//		while(n != 0) {
//		chuso = n % 10;
//		s += Math.pow(chuso,mu);
//		n /= 10;
//		}
//		if(s == n1) 
//			System.out.print("YES");
//		else
//			System.out.print("NO");
//	}

// dem ki tu
//public static void main(String[] args) {
//		Scanner ip = new Scanner(System.in);
//		String S;
//		S = ip.nextLine();
//		ip.close();
//		int dem = 0;
//		for (int i = 0; i < S.length(); i++) {
//			if(S.charAt(i) == ' ')
//				dem++;
//		}
//		System.out.print(dem);
//		
//	}
