package mybatis1.com.mapper;

import mybatis1.com.po.SC;

import java.util.List;

public interface SCMapper {
    public List<SC> selectAll();
    public int insert(SC sc);
}
