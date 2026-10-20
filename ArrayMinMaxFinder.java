class ArrayMinMaxFinder{
  public static void main(String[] args){

    int numbers[] = {42,65,16,57,89,36};

    int smallest = numbers[0];
    int largest = numbers[0];

    for(int num : numbers){
      if(num < smallest){
        smallest = num;
      }
      if(num > largest){
        largest = num;
      }
    }
    System.out.println("Smallest : " + smallest);
    System.out.println("Largest : " + largest);
  }
}
