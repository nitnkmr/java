package ArrayMatrix;

public class RotateMatrixClockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{1,7,4},{7,4,8}};
		int n=a.length;
		int m=a[0].length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<m;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		for (int j = 0; j < n; j++) {
            int i = 0;
            int k = m - 1;
            while (i < k) {
                int temp = a[j][i];
                a[j][i] = a[j][k];
                a[j][k] = temp;
                i++;
                k--;
            }
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
