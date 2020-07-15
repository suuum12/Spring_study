package org.zerock.mapper;

//import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.zerock.domain.BoardVO;
//import org.zerock.domain.Criteria;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

@ContextConfiguration(classes = {org.zerock.config.RootConfig.class} )
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

	@Test
	public void testGetList() {

		mapper.getList().forEach(board -> log.info(board));

	}
	
//	@Test
//	public void testInsert() {
//
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글");
//		board.setContent("새로 작성하는 내용");
//		board.setWriter("newbie");
//		
//		mapper.insert(board);
//		
//		log.info(board);
//
//	}
//	
//	@Test
//	public void testInsertSelectKey() {
//
//		BoardVO board = new BoardVO();
//		board.setTitle("마지막 작성하는 글 select key");
//		board.setContent("마지막 작성하는 내용 select key");
//		board.setWriter("last");
//		
//		mapper.insert(board);
//		
//		log.info(board);
//
//	}
	
	@Test
	public void testRead() {

		BoardVO board = mapper.read(5L); //long형 타입이라는 것을 명시
		
		log.info(board);

	}

	@Test
	public void testDelete() {
		
		log.info("DELETE COUNT: " + mapper.delete(3L));
	}
}
