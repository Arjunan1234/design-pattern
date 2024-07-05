    import java.util.Date;

public class TaskBuilder {
   private String description;
   private Date dueDate;
   private boolean isCompleted;
   private String tags;

   public TaskBuilder(String var1) {
      this.description = var1;
   }

   public TaskBuilder dueDate(Date var1) {
      this.dueDate = var1;
      return this;
   }

   public TaskBuilder isCompleted(boolean var1) {
      this.isCompleted = var1;
      return this;
   }

   public TaskBuilder tags(String var1) {
      this.tags = var1;
      return this;
   }

   public Task build() {
      return Task.createTask(this.description, this.dueDate, this.isCompleted, this.tags);
   }

   public static void main(String[] var0) {
      Task var1 = (new TaskBuilder("Complete project report")).dueDate(new Date()).tags("Work, Project").build();
      Task var2 = (new TaskBuilder("Exercise")).tags("Health, Fitness").build();
      Task var3 = (new TaskBuilder("Read a book")).dueDate(new Date()).isCompleted(true).build();
      System.out.println("Task 1:");
      System.out.println(var1);
      System.out.println();
      System.out.println("Task 2:");
      System.out.println(var2);
      System.out.println();
      System.out.println("Task 3:");
      System.out.println(var3);
   }
}