package de.tudresden.inf.st.mathgrassserver.api;
import de.tudresden.inf.st.mathgrassserver.apiModel.TaskTemplateApi;
import de.tudresden.inf.st.mathgrassserver.model.TaskTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TaskTemplateApiImpl implements TaskTemplateApi {
    @Override
    public ResponseEntity<Void> createTaskTemplate(TaskTemplate body) {
        return null;
    }

    @Override
    public ResponseEntity<TaskTemplate> getTaskTemplateById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> setTaskTemplateLabel(Long id, String label) {
        return null;
    }

    @Override
    public ResponseEntity<Void> setTaskTemplateQuestion(Long id, String question) {
        return null;
    }

}
