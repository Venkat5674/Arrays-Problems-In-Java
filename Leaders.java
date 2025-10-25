public class Leaders {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> Lead = new ArrayList<>();

        for(int i = 0; i < n; i++){
            boolean isLead = true;
            for(int j = i + 1; j < n; j++){
                if(arr[i] <= arr[j]){
                    isLead = false;
                    break;
                }
            }
            if(isLead){
                Lead.add(arr[i]);
            }
        }
        System.out.println("Leaders in the array are:" + Lead);
    }
}
