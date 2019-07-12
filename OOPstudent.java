package oopstudent;

import java.text.ParseException;

public class OOPstudent {

    public static void main(String[] args) throws ParseException {

        String filepath = "F:\\IdeaProjects\\students.txt";
        Filerd f1 = new Filerd();
        String filecontents = f1.readFromFile(filepath);
        System.out.println();
        System.out.println("Content of students.txt file read: \n" + filecontents);

        String[] linesread = filecontents.split("\n");
        // Load student details (  a line in file ) into array of Student Objects

        Student records[] = new Student[linesread.length];

        int count = 0;
        String[] words; // capture each stdent words

        for (String s : linesread) {  // slit each line to get values to initialise the Student Object
            words = s.split(",");
            records[count] = new Student(Integer.parseInt(words[0]), words[1], Integer.parseInt(words[2]), words[3]);
            count++;

        }
        System.out.println(count);

        // Display the student words though Student objects laoded
        System.out.println("Display the student words though Student objects loaded");
        for (Student st : records) {
            System.out.println(st.getRollno() + ":" + st.getName() + ":" + st.getAge() + ":" + st.getplace());
        }
        System.out.println();

        System.out.println("Display the student with age > 19");
        for (Student st : records) {
            if (st.getAge() > 19) {
                System.out.println(st.getRollno() + ":" + st.getName() + ":" + st.getAge() + ":" + st.getplace());
            }
        }
        System.out.println();
        String str="";

        System.out.println("Display the student with place starting with letter B");
        for (Student st : records) {
            if (st.getplace().charAt(0) == 'b') {
                System.out.println(st.getRollno() + ":" + st.getName() + ":" + st.getAge() + ":" + st.getplace());

                str += (((Integer) st.getRollno()).toString()) + "," + st.getName() + "," + ((Integer) st.getAge()).toString() + "," + st.getplace()+"\n";
            }
        }
        System.out.println("Now writing to files ");
        String filepath1 = "F:\\IdeaProjects\\outputofstudents.txt";

        Filewr filewr = new Filewr();
        filewr.writeToFile(str, filepath1);// write file contents /*/
    }

}
