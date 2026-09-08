class sumofarray {
  public static void main(String[] args) {
    int[] arr = {10,20,40,68,21};
    int sum = 0;
    for(int i=0;i<arr.length; i++) {
      sum = sum + arr[i];
    }
    System.out.println("sum of elements:" +sum);  
  }
}

//output: sum of elements:159
