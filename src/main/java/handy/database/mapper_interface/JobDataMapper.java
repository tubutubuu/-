package handy.database.mapper_interface;

import handy.database.table.JobData;

public interface JobDataMapper {
    JobData select(int data_id);
    int insert(String s1,String s2,String s3);
}
