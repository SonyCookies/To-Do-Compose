package com.example.to_docompose.data.repositories


import com.example.to_docompose.data.ToDoDao
import com.example.to_docompose.data.model.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {

    val getAllTasks: Flow<List<ToDoTask>> = toDoDao.getAllTasks()
    val sortByLowestPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowestPriority()
    val sortByHighestPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighestPriority()

    fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
        return  toDoDao.getSelectedTask(taskId = taskId)
    }

    suspend fun addTask(toDoTask: ToDoTask){
        toDoDao.addTask(toDoTask = toDoTask)
    }

    suspend fun updateTask(toDoTask: ToDoTask){
        toDoDao.updateTask(toDoTask = toDoTask)
    }

    suspend fun deleteTask(toDoTask: ToDoTask){
        toDoDao.deleteTask(toDoTask = toDoTask)
    }

    suspend fun deleteAllTask(toDoTask: ToDoTask){
        toDoDao.deleteAllTask()
    }

    fun searchDatabase(searchQuery: String): Flow<List<ToDoTask>> {
        return toDoDao.searchDataBase(searchQuery = searchQuery)

    }


}