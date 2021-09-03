public class asas {
    int F(int n)
    {
        if (n > 2)
            return F(n-1) + F(n-2);
        else return n;
    }
}
