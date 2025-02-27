package TowerofHanoi;

public class Moves{
    public int count(int n, char t1, char t2, char t3) {
        if (n == 1) {
            return 1;
        }
        int step1 = count(n-1, t1, t3, t2);
        int step2 = 1;
        int step3 = count(n-1, t3, t2, t1);
        return step1 + step2 + step3;
    }
}
