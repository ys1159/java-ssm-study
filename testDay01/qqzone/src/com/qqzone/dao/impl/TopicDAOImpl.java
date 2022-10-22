package com.qqzone.dao.impl;



import com.myssm.basedao.BaseDAO;
import com.qqzone.dao.TopicDAO;
import com.qqzone.pojo.Topic;
import com.qqzone.pojo.UserBasic;

import java.util.List;

public class TopicDAOImpl extends BaseDAO<Topic> implements TopicDAO {
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return super.executeQuery("select * from t_topic where author = ? " , userBasic.getId());
    }

    @Override
    public void addTopic(Topic topic) {

    }

    @Override
    public void delTopic(Topic topic) {
        executeUpdate("delete from t_topic where id = ? " , topic.getId());
    }

    @Override
    public Topic getTopic(Integer id) {
        return load("select * from t_topic where id = ? ", id);
    }
}
