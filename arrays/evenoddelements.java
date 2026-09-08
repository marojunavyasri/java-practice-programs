class evenoddelements {
    public static void main(String[] args) {

        int num[] = {9,28,20,63,33,42};

        String even = "";
        String odd = "";

        for (int i = 0; i < num.length; i++) {

            if (num[i] % 2 == 0) {
                even = even + num[i] + " "; //" is used to concatenate the even numbers in the string"
            } else {
                odd = odd + num[i] + " ";
            }
        }

        System.out.println("Even numbers are:"+even);
        System.out.println("Odd numbers are:"+odd);
    }
}
