package myssm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.mapping.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import myssm.user.User;

@Component
public class Dao {
@Autowired
private JdbcTemplate ta;
public List<?> selectall() {
	String sql="select * from user";
	List<User> list=ta.query(sql, new RowMapper<User>(){

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user=new User();
		
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		return user;
		}
		
	});
//for(User u:list)
//	System.out.println(u);
	System.out.println(list);
return list;	
}
}
