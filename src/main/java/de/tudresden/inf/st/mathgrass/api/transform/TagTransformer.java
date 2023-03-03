package de.tudresden.inf.st.mathgrass.api.transform;

import de.tudresden.inf.st.mathgrass.api.label.Label;
import de.tudresden.inf.st.mathgrass.api.model.LabelDTO;

/**
 * This class can convert {@link LabelDTO} to {@link Label} and vice versa.
 */
public class TagTransformer extends ModelTransformer<LabelDTO, Label> {
    /**
     * {@inheritDoc}
     */
    @Override
    public LabelDTO toDto(Label entity) {
        LabelDTO label = new LabelDTO();
        label.setId(entity.getId());
        label.setLabel(entity.getValue());
        return label;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Label toEntity(LabelDTO dto) {
        Label labelEntity = new Label();
        labelEntity.setId(dto.getId());
        labelEntity.setValue(dto.getLabel());
        return labelEntity;
    }
}
