package handy.database.mapper_interface;

import handy.database.table.JobData;

public interface DataMapper {
    JobData select(int data_id);
    void insert(String s1,String s2,String s3);
}
