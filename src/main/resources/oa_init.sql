DROP TABLE IF EXISTS `oa_company`;
CREATE TABLE `oa_company`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '公司编号',
  `parent_id` bigint NOT NULL DEFAULT 0 COMMENT '上级公司',
  `name` varchar(50)   NOT NULL COMMENT '公司名称',
  `province` varchar(10) NOT NULL  COMMENT '省',
  `city` varchar(10)	 NOT NULL COMMENT '市',
  `area` varchar(10)	 NOT NULL  COMMENT '区',
  `address_details` varchar(100) NOT NULL  COMMENT '详细地址',
  `manager_id` bigint	  NULL COMMENT '公司负责人',
  `valid` tinyint	 NOT NULL DEFAULT 0  COMMENT '有效',
  `create_user` bigint NOT NULL    COMMENT '创建者',
  `create_time` timestamp(0)	 NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '公司信息表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_dept`;
CREATE TABLE `oa_dept`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `parent_id` bigint NOT NULL DEFAULT 0 COMMENT '上级部门',
  `company_id` bigint NOT NULL  COMMENT '公司编号',
  `name` varchar(50)   NOT NULL COMMENT '部门名称',
  `manager_id` bigint  NULL  COMMENT '部门负责人',
  `valid` tinyint	 NOT NULL DEFAULT 0  COMMENT '有效',
  `create_user` bigint NOT NULL    COMMENT '创建者',
  `create_time` timestamp(0)	 NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '公司部门信息表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_job`;
CREATE TABLE `oa_job`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '岗位编号',
  `name` varchar(50)   NOT NULL COMMENT '岗位名称',
  `grade` varchar(100)  NULL  COMMENT '岗位等级',
  `valid` tinyint	 NOT NULL DEFAULT 0  COMMENT '有效',
  `create_user` bigint NOT NULL    COMMENT '创建者',
  `create_time` timestamp(0)	 NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '岗位信息表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_employee`;
CREATE TABLE `oa_employee`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '员工编号',
  `user_id` bigint NOT NULL  COMMENT '用户编号',
  `name` varchar(50)   NOT NULL COMMENT '姓名',
  `age` tinyint  NULL  COMMENT '年龄',
  `sex` char(1)  NULL COMMENT '性别',
  `married` tinyint    NULL COMMENT '婚否',
  `education` varchar(50)  NULL  COMMENT '学历',
  `birth` date    NULL COMMENT '出生日期',
  `startwork_date` date  NULL  COMMENT '参加工作日期',
  `major` varchar(50)  NULL COMMENT '专业',
  `identity_card` char(18)    NULL COMMENT '身份证',
  `phone` char(11)  NULL  COMMENT '手机号',
  `mail` varchar(50)   NULL COMMENT '邮箱',
  `home_address` varchar(50)  NULL  COMMENT '家庭住址',
  `bank_account` varchar(50)  NULL COMMENT '银行账号',
  `sub_branch` varchar(50)    NULL COMMENT '支行',
  `entry_date` date  NULL COMMENT '入职时间',
  `apply_date` date    NULL COMMENT '转正时间',
  `job_id` bigint  NULL  COMMENT '岗位',
  `leader` bigint   NULL COMMENT '直属领导',
  `first_contract_startdate` date  NULL  COMMENT '第一次合同开始日期',
  `first_contract_enddate` date  NULL COMMENT '第一次合同结束日期',
  `second_contract_startdate` date    NULL COMMENT '第二次合同开始日期',
  `second_contract_enddate` date  NULL COMMENT '第二次合同结束日期',
  `unfixed_term_contract` tinyint    NULL COMMENT '无固定期限合同',
  `state` tinyint  NULL  COMMENT '在职状态 1 在职 ,2 离职',
  `employee_attr` tinyint   NULL COMMENT '员工属性 1 正式员工 2 非正式员工',
  `employee_attr_remark` varchar(50)	 NULL  COMMENT '员工属性备注',
  `valid` tinyint	 NOT NULL DEFAULT 0  COMMENT '有效',
  `create_user` bigint NOT NULL    COMMENT '创建者',
  `create_time` timestamp(0)	 NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '员工信息表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_company_dept_job_employee`;
CREATE TABLE `oa_company_dept_job_employee`  (
  `company_id` bigint NOT NULL  COMMENT '公司编号',
  `dept_id` bigint   NOT NULL COMMENT '部门编号',
  `employee_id` BIGINT NOT  NULL  COMMENT '员工编号',
  `valid` tinyint	 NOT NULL DEFAULT 0  COMMENT '有效',
  `create_user` bigint NOT NULL    COMMENT '创建者',
  `create_time` timestamp(0)	 NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`company_id`,`dept_id`,`employee_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '公司部门员工关系表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_address_book`;
CREATE TABLE `oa_address_book`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
  `employee_id` BIGINT NOT  NULL  COMMENT '员工编号',
  `phone` char(11)  NULL  COMMENT '手机号',
  `landline_areacode` char(4)  NULL  COMMENT '座机区号',
  `landline_phone` char(8)  NULL  COMMENT '座机号码',
  `extension_num` varchar(10)  NULL  COMMENT '内网分机',
  `spare_phone` char(11)  NULL  COMMENT '备用手机号',
  `emergency_contact` varchar(10)  NULL  COMMENT '紧急联系人',
  `emergency_contact_phone` varchar(50)  NULL  COMMENT '紧急联系人号码',
  `valid` tinyint	 NOT NULL DEFAULT 0  COMMENT '有效',
  `create_user` bigint NOT NULL    COMMENT '创建者',
  `create_time` timestamp(0)	 NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '通讯录表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_conference`;
CREATE TABLE `oa_conference`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '会议室编号',
  `name` varchar(50)	 NOT  NULL  COMMENT '会议室名称',
  `location` varchar(50) NOT NULL  COMMENT '会议室地址',
  `valid` tinyint	 NOT NULL DEFAULT 0  COMMENT '有效',
  `create_user` bigint NOT NULL    COMMENT '创建者',
  `create_time` timestamp(0)	 NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '会议室表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_schedule`;
CREATE TABLE `oa_schedule`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '日程编号',
  `start_time` timestamp	 NOT  NULL  COMMENT '开始时间',
  `end_time` timestamp NOT NULL  COMMENT '结束时间',
  `conference_id` bigint	 NOT  NULL DEFAULT 0  COMMENT '会议室编号',
  `repeat_type` tinyint NOT NULL  COMMENT '重复类型 0(不重复)、1（每天）、2（每周）、3（每月）、4（每年）',
  `remind_style` tinyint	 NOT  NULL  COMMENT '提醒方式 0（不提醒）、 1（开始时）、2（5分钟前提醒）、3（15分钟前提醒）、4（30分钟前提醒）、5（1小时前提醒）、6（1天前提醒）',
  `notice_time` timestamp NOT NULL  COMMENT '通知时间',
  `description` varchar(200) NULL  COMMENT '描述',
  `valid` tinyint	 NOT NULL DEFAULT 0  COMMENT '有效',
  `create_user` bigint NOT NULL    COMMENT '创建者',
  `create_time` timestamp(0)	 NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '日程表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_employee_schedule`;
CREATE TABLE `oa_employee_schedule`  (
  `schedule_id` bigint NOT NULL  COMMENT '日程编号',
  `employee_id` bigint	 NOT  NULL  COMMENT '员工编号',
  `state` tinyint NOT NULL  COMMENT '响应状态 1 未响应 2 已接受 3 已拒绝',
  PRIMARY KEY (`schedule_id`,`employee_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '员工日程表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_notice`;
CREATE TABLE `oa_notice`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '公告编号',
  `title` varchar(100)	 NOT  NULL  COMMENT '标题',
  `content` longtext  NULL  COMMENT '内容',
  `type` tinyint NOT NULL  COMMENT '类型 1 通知  2 公告 3系统通知',
  `publish` tinyint	 NOT  NULL  COMMENT '发布状态',
  `publish_date` date NOT NULL  COMMENT '发布日期',
  `description` varchar(200) NULL  COMMENT '描述',
  `valid` tinyint	 NOT NULL DEFAULT 0  COMMENT '有效',
  `create_user` bigint NOT NULL    COMMENT '创建者',
  `create_time` timestamp(0)	 NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '通知公告表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_employee_notice`;
CREATE TABLE `oa_employee_notice`  (
  `notice_id` bigint	 NOT  NULL  COMMENT '公告编号',
  `employee_id` bigint  NOT NULL  COMMENT '员工编号',
  `read_state` tinyint NOT NULL  COMMENT '阅读状态',
  PRIMARY KEY (`notice_id`,`employee_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '员工公告表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_fixed_assets`;
CREATE TABLE `oa_fixed_assets`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
  `asset_type_id` bigint	 NOT  NULL  COMMENT '资产类别编号',
  `company_id` bigint NOT NULL  COMMENT '公司编号',
  `dept_id` bigint NOT NULL  COMMENT '部门编号',
  `asset_num` varchar(50)	 NOT NULL  COMMENT '资产编码',
  `name` varchar(50)	 NOT  NULL  COMMENT '资产名称',
  `specifications` varchar(50) NULL  COMMENT '规格型号',
  `unit_price` bigint NULL  COMMENT '单价(分)',
  `amount` bigint NULL  COMMENT '数量',
  `total_price` bigint NULL  COMMENT '总金额（分）',
  `acquisition_date` DATE NOT NULL  COMMENT '购置日期',
  `storage_place` varchar(50) NULL  COMMENT '存放地',
  `purchase_id` varchar(200) NULL  COMMENT '关联采购单',
  `remark` varchar(50) NULL  COMMENT '备注',
  `defined_property` json NULL  COMMENT '自定义属性',
  `use_state` tinyint NULL  COMMENT '资产状态 1 在用 2 报废',
  `valid` tinyint	 NOT NULL DEFAULT 0  COMMENT '有效',
  `create_user` bigint NOT NULL    COMMENT '创建者',
  `create_time` timestamp(0)	 NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '固定资产表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_fixed_assets_use_accord`;
CREATE TABLE `oa_fixed_assets_use_accord`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '记录编号',
  `asset_id` bigint	 NOT  NULL  COMMENT '资产编号',
  `user_id` bigint NOT NULL  COMMENT '使用人',
  `start_date` date NOT NULL  COMMENT '开始日期',
  `end_date` date NOT NULL  COMMENT '结束日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '固定资产使用记录表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_picture_attachment`;
CREATE TABLE `oa_picture_attachment`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
  `module` tinyint	 NOT  NULL  COMMENT '模块 1 日程 2 公告 3 固定资产',
  `module_id` bigint NOT NULL  COMMENT '各类型的id',
  `type` tinyint NOT NULL  COMMENT '类型 1 图片 2 附件',
  `name` varchar(50)	  NULL  COMMENT '名称',
  `url` varchar(200)	 NOT NULL  COMMENT '地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '图片附件表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_work_schedule`;
CREATE TABLE `oa_work_schedule`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
  `work_date` date	 NOT  NULL  COMMENT '日期',
  `date_attr` tinyint NOT NULL  COMMENT '日期属性 1 工作日 2 休息日 3 法定假日',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '排班表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `oa_serial_number`;
CREATE TABLE `oa_serial_number`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
  `parent_id` bigint	 NOT  NULL DEFAULT 0  COMMENT '上级',
  `classify` tinyint NOT NULL  COMMENT '分类 1（资产类别）',
  `name` varchar(50)	 NOT  NULL  COMMENT '名称',
  `prefix` varchar(50) NOT NULL  COMMENT '前缀',
  `postfix_length` tinyint NOT NULL  COMMENT '后缀长度',
  `next_postfix` varchar(10) NOT NULL  COMMENT '下一个资产编号后缀',
  `version` bigint NOT NULL  COMMENT '版本号',
  `valid` tinyint	 NOT NULL DEFAULT 0  COMMENT '有效',
  `create_user` bigint NOT NULL    COMMENT '创建者',
  `create_time` timestamp(0)	 NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '编号表' ROW_FORMAT = Dynamic;
