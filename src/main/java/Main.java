class Main {
  public static int q1(int n) {
			if(n==1)
				return 1;

			return n+q1(n-1);

		}
		
		public static double q2(double n) {
			if(n==1)
				return 1;

			double a= n*q2(n-1);

			return a;

		}

		public static int q3(int n) {

			if (n==1)

				return 1;

			if(n%2!=0) {

				return n*q3(n-1);

			}

			return q3(n-1);

		}

		public static int q4(int n) {

			if (n/10==0)

				return 1;

			n=n/10;

			return 1+q4(n);

		}

		public static int q5(int a,int b) {

			if(a<b)

				return 0;

			return 1+q5(a-b,b);

		}

		public static int q6(int a, int b) {

			if(a<b)

				return a;

			return q6(a-b,b);

		}

		public static boolean q7(int x, int y) {
			if(x==0)
				return true;
			if(x<y) {
				return false;
			}
			
			return q7(x-y,y);
		}
		public static boolean q8(int n,int p) {
			if(p==1)
				return true;
			if(n%p==0)
				return false;
			return q8(n,p-1);
			
		}
		public static boolean q9(int n,int a) {
			if(a==3) {
				return false;
			}
			else if(n==0) {
				return true;
			}
			else if(a==0 && (n%10)%2==0)
				a=1;
			else if(a==0)
				a=2;
			else if(a==1 && (n%10)%2!=0)
				a=3;
			else if(a==2 && (n%10)%2==0)
				a=3;
			return q9(n/10,a);
		}
