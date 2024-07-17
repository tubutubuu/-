package org.mapper;

import org.dto.AllDataTypes;
import org.dto.Data;

import java.util.List;

public interface DataMapper {
    Data select(int data_id);
}
