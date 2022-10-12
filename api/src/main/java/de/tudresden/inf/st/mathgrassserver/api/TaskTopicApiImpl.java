package de.tudresden.inf.st.mathgrassserver.api;

import de.tudresden.inf.st.mathgrassserver.apiModel.TaskTopicApi;
import de.tudresden.inf.st.mathgrassserver.database.entity.TaskTopicEntity;
import de.tudresden.inf.st.mathgrassserver.database.repository.TaskRepository;
import de.tudresden.inf.st.mathgrassserver.database.repository.TaskTopicRepository;
import de.tudresden.inf.st.mathgrassserver.model.TaskTopic;
import de.tudresden.inf.st.mathgrassserver.transform.TaskTopicTransformer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskTopicApiImpl extends AbstractApiElement implements TaskTopicApi {

    final TaskTopicRepository taskTopicRepository;

    final TaskRepository taskRepository;

    public TaskTopicApiImpl(TaskTopicRepository taskTopicRepository, TaskRepository taskRepository) {
        this.taskTopicRepository = taskTopicRepository;
        this.taskRepository = taskRepository;
    }


    @Override
    public ResponseEntity<Void> createTaskTopic(TaskTopic taskTopic) {
        this.taskTopicRepository.save(new TaskTopicTransformer(this.taskRepository).toEntity(taskTopic));
        return ok();
    }

    @Override
    public ResponseEntity<List<TaskTopic>> getTaskTopics() {
        List<TaskTopicEntity> collections = taskTopicRepository.findAll();
        return ok(new TaskTopicTransformer(this.taskRepository).toDtoList(collections));
    }
}
