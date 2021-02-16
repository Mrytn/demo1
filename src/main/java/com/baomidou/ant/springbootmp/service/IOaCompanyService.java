package com.baomidou.ant.springbootmp.service;

import com.baomidou.ant.springbootmp.entity.OaCompany;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 公司信息表 服务类
 * </p>
 *
 * @author jobob
 * @since 2021-02-09
 */
public interface IOaCompanyService extends IService<OaCompany> {
    /**
     * 新建
     *
     * @param oaCompany
     */
    void insert(OaCompany oaCompany);

    /**
     * 更新
     *
     * @param resource
     */
    void update(OaCompany resource);

    /**
     * 删除
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * 按照ID查找
     *
     * @param id
     * @return
     */
    OaCompany findById(Integer id);

    /**
     * 初始化
     *
     * @return
     */
    void init();

    /**
     *  分页查询
     *
     * @param channelPage 通道分页对象
     * @return 通道列表
     */
    //Page<OaCompany> findByPage(Page<OaCompany> channelPage, OaCompanyBO channelBO);
}
