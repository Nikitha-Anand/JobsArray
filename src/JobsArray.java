public class JobsArray {
    public static Integer[][] Jobs = new Integer[100][2];
    static Integer NumberOfJobs;

    public static void Initialise(){
        for (int i = 0; i < 100; i++) {
            Jobs[i][0] = -1;
            Jobs[i][1] = -1;
        }
        NumberOfJobs = 0;
    }

    public static void AddJob(Integer JobNumber, Integer Priority){
        if(NumberOfJobs != 100){
            Jobs[NumberOfJobs][0] = JobNumber;
            Jobs[NumberOfJobs][1] = Priority;
            NumberOfJobs = NumberOfJobs + 1;
            System.out.println("Added");
        } else{
            System.out.println("Not added");
        }
    }

    public static void InsertionSort(){
        for (int i = 1; i < NumberOfJobs; i++) {
            int temp1 = Jobs[i][0];
            int temp2 = Jobs[i][1];
            int j = i - 1;
            while(j >= 0 && Jobs[j][1] > temp2){
                Jobs[j + 1][0] = Jobs[j][0];
                Jobs[j + 1][1] = Jobs[j][1];
                j--;
            }
            Jobs[j + 1][0] = temp1 ;
            Jobs[j + 1][1] = temp2;
        }
    }

    public static void PrintArray(){
        for (int i = 0; i < NumberOfJobs; i++) {
            System.out.println(Jobs[i][0] + " priority " + Jobs[i][1]);
        }
    }

    public static void main(String[] args){
        Initialise();
        AddJob(12, 10);
        AddJob(526, 9);
        AddJob(33, 8);
        AddJob(12, 9);
        AddJob(78, 1);
        InsertionSort();
        PrintArray();
    }
}
