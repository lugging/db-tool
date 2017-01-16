package db.tool.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import db.tool.model.DruidApp;
import db.tool.util.Context;
import tk.mybatis.mapper.common.Mapper;

@RequestMapping("AccruleSim")
@Controller
public class TestAppController extends AbstractBaseController<DruidApp>{

	private static final Logger LOG = LoggerFactory.getLogger(TestAppController.class);
	
	@Autowired
	private Mapper<DruidApp> mapper;
	
	@Override
	protected DruidApp beanFactory(Object param) {
		DruidApp po = new DruidApp();
		return po;
	}

	@Override
	public Context getState() {
		LOG.info(context.toString());
		return context;
	}

	@Override
	protected Mapper<DruidApp> getMapper() {
		return mapper;
	}
}
