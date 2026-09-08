class Ascendingorder {

    public static void main(String[] args) {

        int num[] = {7,8,6,10,20,1};

        for (int i = 0; i < num.length; i++) {

            for (int j = i + 1; j < num.length; j++) {

                if (num[i] > num[j]) {

                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.println("Array in ascending order:");

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}

/*output 
Array in ascending order:
1 6 7 8 10 20 */
