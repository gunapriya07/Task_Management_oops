import java.util.Scanner;

abstract  class Task{
    //member variables
    private String taskName;
    private String deadline;
    private  int priority;

    public Task(String taskName, String deadline, int priority){
        this.taskName=taskName;
        this.deadline=deadline;
        this.priority=priority;
    }

    public String getTaskName(){
        return taskName;
    }

    public  void setTaskName(String taskName){
        this.taskName=taskName;
    }

    public String getDeadline(){
        return deadline;
    }

    public void setDeadline(String deadline){
        this.deadline=deadline;
    }

    public int getPriority(){
        return  priority;
    }
    
    public void setPriority(int priority){
        this.priority=priority;
    }

    public abstract  void displayTaskInfo();

}

class  PersonalTask extends  Task{
    private String personalNote;

    public PersonalTask(String taskString,String deadline, int priority,String personalNote){
        super(taskString, deadline, priority);
        this.personalNote=personalNote;
    }

    public String getPersonalNote(){
        return personalNote;
    }

    public void setPersonalNote(String personalNote){
        this.personalNote=personalNote;
    }

    public  void displayTaskInfo(){
        System.out.println("Persoanl Task: "+getTaskName());
        System.out.println("Deadline: "+getDeadline());
        System.out.println("Priority: "+getPriority());
        System.out.println("Note: "+personalNote);
    }
}

class  WorkTask extends  Task{
    private  String workDetails;

    public WorkTask(String taskName, String deadline,int priority,String workDetails){
        super(taskName, deadline, priority);
        this.workDetails=workDetails;
    }
    public String getWorkDetails(){
        return workDetails;
    }
    public void setWorkDetails(String workDetails){
        this.workDetails=workDetails;
    }

    public void displayTaskInfo(){
        System.out.println("Work Task: "+getTaskName());
        System.out.println("Deadline: "+getDeadline());
        System.out.println("Priority: "+getPriority());
        System.out.println("Work Details: "+workDetails);
    }
}


public class Main{
    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter the personal tasks");

    System.out.println("Enter the taskName: ");
    String taskName=scanner.nextLine();
    System.out.println("Enter dealine: ");
    String dealine=scanner.nextLine();
    System.out.println("Enter priority: ");
    int priority=scanner.nextInt();
    System.out.println("Enter the Personal Note detail: ");
    String personalNote=scanner.nextLine();
    scanner.nextLine();

    PersonalTask personalTask=new PersonalTask(taskName,dealine, priority,personalNote);

    System.out.println("Enter the work taskName: ");

    System.out.println("Enter the task Name: ");
    String worktaskName=scanner.nextLine();
    System.out.println("Enter the dealine: ");
    String workdealine=scanner.nextLine();
    System.out.println("Enter the work Priority: ");
    int workpriority=scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter the work Details: ");
    String workDetails=scanner.nextLine();




    WorkTask worktask=new WorkTask(worktaskName,workdealine,workpriority,workDetails);

    System.out.println(" TASK DETAILS : PERSONAL ");

    personalTask.displayTaskInfo();

    System.out.println("TASK DETAILS : WORK");

    worktask.displayTaskInfo();
 
    }
}
