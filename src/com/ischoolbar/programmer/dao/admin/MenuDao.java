package com.ischoolbar.programmer.dao.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.admin.Menu;

/**
 * @author 作者: lubingliang:
 * @version 创建时间：2020年3月14日 上午9:02:18
 */
@Repository
public interface MenuDao {

	public int add(Menu menu);
	public  List<Menu> findList (Map<String, Object> queryMap);
	public  List<Menu> findTopList ();
	public int getTotal(Map<String, Object> queryMap);
	public int edit(Menu menu);
	public int delete(Long id);
	public  List<Menu> findChildernList (Long parentId);
}
