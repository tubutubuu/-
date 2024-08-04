package handy.database.mapper_interface;


import handy.database.parameter.Mood;

public interface SomethingMapper {

    int insert(Mood something);
    Mood details(Mood something);
}
