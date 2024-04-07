package com.ignateva.tags_task;

import com.ignateva.tags_task.entity.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public ArrayList<Student> getAll() {
        ArrayList<Student> students = new ArrayList<>();
        try (Connection connection = DBManager.createConnection();
             Statement statement=connection.createStatement();){
            ResultSet resultSet = statement.executeQuery("SELECT*from students");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String F_name = resultSet.getString(2);
                String L_name = resultSet.getString(3);
                int score = resultSet.getInt(4);
                students.add(new Student(id,F_name,L_name,score));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return students;
    }
    public List<Student> getByTask() {
        List<Student> students = new ArrayList<>();
        List<Integer> scores= new ArrayList<>();
        try (Connection connection = DBManager.createConnection();
             Statement statement=connection.createStatement();){
            ResultSet selectsScores = statement.executeQuery("select score from Students group by score having count(score)>1 order by score DESC;");
            while (selectsScores.next()){
                scores.add(selectsScores.getInt(1));
            }
            for (int i =0; i <scores.size() ; i++)
            {
                ResultSet resultSet = statement.executeQuery("SELECT*from students where score ="+scores.get(i));
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String F_name = resultSet.getString(2);
                    String L_name = resultSet.getString(3);
                    int score = resultSet.getInt(4);
                    students.add(new Student(id,F_name,L_name,score));
                }
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return students;
    }
}
