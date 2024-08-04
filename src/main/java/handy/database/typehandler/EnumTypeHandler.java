package handy.database.typehandler;

import java.sql.*;

import handy.database.parameter.Mood;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;


public class EnumTypeHandler extends BaseTypeHandler<Mood> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Mood parameter, JdbcType jdbcType)
            throws SQLException {
        ps.setObject(i, parameter.name(), Types.OTHER);
    }

    @Override
    public Mood getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return Mood.valueOf(rs.getString(columnName));
    }

    @Override
    public Mood getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return Mood.valueOf(rs.getString(columnIndex));
    }

    @Override
    public Mood getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return Mood.valueOf(cs.getString(columnIndex));
    }
}
