package handy.database.mapper_interface;


import handy.api.dto.JobDataSchema;
import handy.database.parameter.Mood;

public interface SomethingMapper {

    int insert(Mood something);
    JobDataSchema details(Mood something);
}
