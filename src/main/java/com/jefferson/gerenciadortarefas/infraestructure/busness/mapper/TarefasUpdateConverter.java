package com.jefferson.gerenciadortarefas.infraestructure.busness.mapper;

import com.jefferson.gerenciadortarefas.infraestructure.busness.dto.TarefasDTO;
import com.jefferson.gerenciadortarefas.infraestructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
public interface TarefasUpdateConverter {
    void updateTarefas(TarefasDTO dto,  @MappingTarget TarefasEntity entity);

}
