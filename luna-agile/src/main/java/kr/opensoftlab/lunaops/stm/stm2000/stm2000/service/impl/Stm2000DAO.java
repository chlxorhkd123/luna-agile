package kr.opensoftlab.lunaops.stm.stm2000.stm2000.service.impl;

import java.util.List;
import java.util.Map;

import kr.opensoftlab.lunaops.com.dao.ComOslitsAbstractDAO;

import org.springframework.stereotype.Repository;



@Repository("stm2000DAO")
public class Stm2000DAO extends ComOslitsAbstractDAO {
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Map> selectStm2000BaseMenuList(Map paramMap) throws Exception {
		 return (List<Map>) list("stm2000DAO.selectStm2000BaseMenuList", paramMap);
    }
	
	
	@SuppressWarnings("rawtypes")
	public Map selectStm2000MenuInfo(Map paramMap) throws Exception{
		return (Map) select("stm2000DAO.selectStm2000MenuInfo", paramMap);
	}
	
	
	@SuppressWarnings("rawtypes")
	public String insertStm2000MenuInfo(Map paramMap) throws Exception{
		return (String) insert("stm2000DAO.insertStm2000MenuInfo", paramMap);
	}
	
	
	@SuppressWarnings("rawtypes")
	public int deleteStm2000MenuInfo(Map paramMap) throws Exception{
		return (int) delete("stm2000DAO.deleteStm2000MenuInfo", paramMap);
	}
	
	
	@SuppressWarnings("rawtypes")
	public int updateStm2000MenuInfo(Map paramMap) throws Exception{
		return (int) update("stm2000DAO.updateStm2000MenuInfo", paramMap);
	}
	
	
	@SuppressWarnings("rawtypes")
	public List selectStm2000deleteMenuList(Map paramMap) throws Exception{
		return (List) list("stm2000DAO.selectStm2000deleteMenuList", paramMap);
    }	
	
	
	@SuppressWarnings("rawtypes")
	public int deleteStm2000projectTypeAuth(Map paramMap) throws Exception{
		return (int) delete("stm2000DAO.deleteStm2000projectTypeAuth", paramMap);
	}
	
	
	
	
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public List<Map> selectStm2000StmAuthGrpList(Map paramMap) throws Exception{
		return (List<Map>) list("stm2000DAO.selectStm2000StmAuthGrpList", paramMap);
    }
	
	
	@SuppressWarnings("rawtypes")
	public int selectStm2000StmAuthGrpListCnt(Map paramMap) throws Exception {
		 return (Integer)select("stm2000DAO.selectStm2000StmAuthGrpListCnt", paramMap);
	}
	
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public List<Map> selectStm2000StmAuthGrpNoPagingList(Map paramMap) throws Exception{
		return (List<Map>) list("stm2000DAO.selectStm2000StmAuthGrpNoPagingList", paramMap);
    }
	
	
	@SuppressWarnings("rawtypes")
	public Map selectStm2000StmAuthGrpInfo(Map paramMap) throws Exception{
		return (Map) select("stm2000DAO.selectStm2000StmAuthGrpInfo", paramMap);
	}
	
	
	@SuppressWarnings("rawtypes")
	public int selectStm2000StmAuthGrpNextOrd(Map paramMap) throws Exception{
		return (int) select("stm2000DAO.selectStm2000StmAuthGrpNextOrd",paramMap);
	}
	
	
	@SuppressWarnings("rawtypes")
	public void insertStm2000StmAuthGrpInfo(Map paramMap) throws Exception{
		insert("stm2000DAO.insertStm2000StmAuthGrpInfo", paramMap);
	}	
	
	
	@SuppressWarnings({ "rawtypes" })
	public int updateStm2000StmAuthGrpInfo(Map paramMap) throws Exception{
		return update("stm2000DAO.updateStm2000StmAuthGrpInfo", paramMap);
	}
	
	
	@SuppressWarnings("rawtypes")
	public int deleteStm2000StmAuthGrpInfo(Map paramMap) throws Exception{
		return (int) delete("stm2000DAO.deleteStm2000StmAuthGrpInfo", paramMap);
	}
	
	
	@SuppressWarnings("rawtypes")
	public int deleteStm2000StmAuthMenuList(Map paramMap) throws Exception{
		return (int) delete("stm2000DAO.deleteStm2000StmAuthMenuList", paramMap);
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Map> selectStm2000AuthGrpSmallMenuList(Map paramMap) throws Exception{
		return (List<Map>) list("stm2000DAO.selectStm2000AuthGrpSmallMenuList", paramMap);
    }	
	
	
	@SuppressWarnings({ "rawtypes" })
	public int saveStm2000AuthGrpMenuAuthListOracle(Map paramMap) throws Exception{
		return update("stm2000DAO.saveStm2000AuthGrpMenuAuthList", paramMap);
	}
	
	
	@SuppressWarnings({ "rawtypes" })
	public void saveStm2000AuthGrpMenuAuthListCubrid(Map paramMap) throws Exception{
		select ("stm2000DAO.saveStm2000AuthGrpMenuAuthList", paramMap);
	}
	
	
	@SuppressWarnings({ "rawtypes" })
	public int saveStm2000AuthGrpMenuAuthListMariaDB(Map paramMap) throws Exception{
		return update("stm2000DAO.saveStm2000AuthGrpMenuAuthList", paramMap);
	}
	
	
}
