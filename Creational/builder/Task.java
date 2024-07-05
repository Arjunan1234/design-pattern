 import java.util.Date;

public class Task {
   private final String description;
   private final Date dueDate;
   private final boolean isCompleted;
   private final String tags;

   private Task(String var1, Date var2, boolean var3, String var4) {
      this.description = var1;
      this.dueDate = var2;
      this.isCompleted = var3;
      this.tags = var4;
   }

   public String getDescription() {
      return this.description;
   }

   public Date getDueDate() {
      return this.dueDate;
   }

   public boolean isCompleted() {
      return this.isCompleted;
   }

   public String getTags() {
      return this.tags;
   }

   public String toString() {
      String var1 = this.isCompleted ? "Completed" : "Pending";
      String var2 = this.dueDate != null ? this.dueDate.toString() : "No due date";
      String var3 = this.tags != null ? this.tags : "No tags";
      return String.format("Task[description='%s', dueDate='%s', status='%s', tags='%s']", this.description, var2, var1, var3);
   }

   public static Task createTask(String var0, Date var1, boolean var2, String var3) {
      return new Task(var0, var1, var2, var3);
   }
}