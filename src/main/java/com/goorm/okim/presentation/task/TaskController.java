package com.goorm.okim.presentation.task;

import com.goorm.okim.common.Response;
import com.goorm.okim.jwt.Login;
import com.goorm.okim.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    public ResponseEntity<?> createTask(@Login long userId) {
        return Response.createdWithBody(taskService.createTask(userId));
    }

    @GetMapping("/{taskId}/items")
    public ResponseEntity<?> getTaskItems(@PathVariable long taskId) {
        return Response.success(taskService.getTaskItems(taskId));
    }
}
