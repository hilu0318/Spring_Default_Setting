package hilu.kr.dao;

import java.util.HashMap;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import hilu.kr.domain.TestDto;

@Repository
public class TestDao {

	@Inject
	private SqlSession session;
	
	public HashMap<String, Object> iqryTest(){
		return session.selectOne("test.select");
	}
}
