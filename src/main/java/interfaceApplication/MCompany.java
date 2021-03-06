package interfaceApplication;

import java.util.HashMap;

import json.JSONHelper;
import model.MCompanyModel;

public class MCompany {
	private MCompanyModel model = new MCompanyModel();
	private HashMap<String, Object> map = new HashMap<>();

	public MCompany() {

		map.put("companyDesp", "");
		map.put("companyURL", "");
		map.put("companyTele", "");
		map.put("companyMob", 0);
		map.put("companyEmail", "0");
		map.put("companyQQ", 0);
		map.put("companyPerson", 0);
		map.put("type", 0);
		map.put("wbid", 0);
		map.put("rPlv", 1000); // 读取 权限值
		map.put("uPlv", 2000); // 修改 权限值
		map.put("dPlv", 3000); // 删除 权限值
	}

	public String AddComp(String compInfo) {
		return model.addComp(model.AddMap(map, JSONHelper.string2json(compInfo)));
	}

	public String updateComp(String cid, String comInfo) {
		return model.updateComp(cid, JSONHelper.string2json(comInfo));
	}

	public String DeleteComp(String cid) {
		return model.deleteComp(cid);
	}

	public String SearchComp(String Info) {
		return model.find(JSONHelper.string2json(Info));
	}

	// 分页
	public String PageMComp(int idx, int pageSize) {
		return model.page(idx, pageSize);
	}

	// 条件分页
	public String PageByMComp(int idx, int pageSize, String msgInfo) {
		return model.page(idx, pageSize, JSONHelper.string2json(msgInfo));
	}

}
