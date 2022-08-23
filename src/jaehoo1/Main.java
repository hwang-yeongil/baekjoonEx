package jaehoo1;

// https://www.acmicpc.net/workbook/view/2032
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count= 5;
		int point;
		int sum1=0;
		int sum2=0;
		for(int i =1; i<=count ;i++) {
			point = sc.nextInt();
			sum2+=point;
		}
		System.out.println(sum2);
    }
}
//public class Main {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str1="";
//		int num0 =Integer.parseInt(br.readLine());
//		int count=1;
//		do {
//			int tmp=10000000;
//			String str2="";
//			int num = Integer.parseInt(br.readLine());
//			
//			for(int i =1;i<=num;i++) {
//				for(int j=1;j<=num;j++) {
//					
//					if(i!=j&&i+j==num&&i<j) {
//						if(tmp<i) {
//							str2 +=", "+i+" "+j;
//						}else {
//							str2 +=i+" "+j;
//							tmp = i;
//						}
//					}
//				}		
//			}
//			if(str2=="") {
//				str1 +="Pairs for "+num+": \n";
//			}else {
//				str1 += "Pairs for "+num+": "+str2+"\n";
//			}
//			count++;			
//		}while(count <=num0);
//		System.out.println(str1);
//	}
//}

//public static void main(String[] args) throws IOException {
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	
//	String str="";
//	int count=1;
//	while(true) {
//
//		
//		int num0 = Integer.parseInt(br.readLine());
//		if(num0 == 0) {break;}
//		str +=count++ +". "; 
//		int num1 = 3*num0;
//		int num2;
//		if(num1%2 ==0) {
//			num2 = num1/2;
//			str +="even ";
//		}else {
//			num2 = (num1+1)/2;
//			str +="odd ";
//		}
//		int num3 = num2 *3;
//		int num4 = num3/9;
//		str += num4+"\n";
//	}
//	System.out.println(str);
//}

//public static void main(String[] args) throws IOException {
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	
//	int num = Integer.parseInt(br.readLine());
//	String str="";
//	while(num-->0) {
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int x = Integer.parseInt(st.nextToken());
//		int y = Integer.parseInt(st.nextToken());
//		if(x<y) {
//			str += "NO BRAINS\n";
//		}else {
//			str += "MMM BRAINS\n";
//		}
//	}
//	System.out.println(str);
//}



//    private void solution() throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
//        while (n-->0) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int x = Integer.parseInt(st.nextToken());
//            int y = Integer.parseInt(st.nextToken());
//            sb.append(x<y?"NO BRAINS\n":"MMM BRAINS\n");
//        }
//        System.out.print(sb);
//    }
//
//    public static void main(String[] args) throws Exception {
//        new Main().solution();
//    }

//Scanner scanner = new Scanner(System.in);
//
//int N = scanner.nextInt();
//
//for(int i = 1 ; i<=N; i++) {
//	System.out.println(i);
//}

//Scanner scanner = new Scanner(System.in);
//
//int N = scanner.nextInt();
//
//for(int i =N ; i>=1; i--) {
//	System.out.println(i);
//}