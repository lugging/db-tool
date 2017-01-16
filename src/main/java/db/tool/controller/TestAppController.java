package db.tool.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import db.tool.dao.AccruleSimMapper;
import db.tool.model.AccruleSim;
import db.tool.util.Context;
import tk.mybatis.mapper.common.Mapper;

@RequestMapping("AccruleSim")
@Controller
public class TestAppController extends AbstractBaseController<AccruleSim>{

	private static final Logger LOG = LoggerFactory.getLogger(TestAppController.class);
	
	@Autowired
	private AccruleSimMapper mapper;
	
	@Override
	protected AccruleSim beanFactory(Object param) {
		AccruleSim po = new AccruleSim();
		return po;
	}

	@Override
	public Context getState() {
		LOG.info(context.toString());
		return context;
	}

	@Override
	protected Mapper<AccruleSim> getMapper() {
		return mapper;
	}
}
