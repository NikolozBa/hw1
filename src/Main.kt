fun main()
{
    print(calculate(327));
}


fun calculate(x: Int): Int
{
    var num = x;

    if(num<0){
        num*=-1;
    }

    var sum: Int=0;
    var product: Int=1;

    while(num!=0){
        sum+=(num%10);
        product*=(num%10);
        num/=10;
    }

    return product-sum;
}