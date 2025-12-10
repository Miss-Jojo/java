class Palindrome {
    public static void main(String[] args) {
        int num = 1211;    // change the number
        int temp = num, rev = 0;

        while(temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if(num == rev)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is not a Palindrome");
    }
}
