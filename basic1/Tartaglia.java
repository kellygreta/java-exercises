import java.util.Arrays;

public class Tartaglia {
	public static void main(String[] args) {
		int n = 1;
		tartaglia(n)
	}

	public static int[] tartaglia(int n)
{
    int[] pt = new int[n+1];
    if(n == 0)
    {
        pt[0] = 1;
        return pt;
    }
    int[] ppt = PascalTriangle(n-1);
    pt[0] = pt[n] = 1;
    for(int i = 0; i < ppt.length; i++)
    {
        pt[i] = ppt[i-1] + ppt[i];
    }
    return pt;
}

}
