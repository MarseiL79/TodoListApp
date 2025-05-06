package com.mrsl.TodoListApp.repositories;

import com.mrsl.TodoListApp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//@Repository  Эта аннотация необязательна т.к. Spring и так понимает
//что нужно создать bean, т.к. использовался Spring boot
public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

}
