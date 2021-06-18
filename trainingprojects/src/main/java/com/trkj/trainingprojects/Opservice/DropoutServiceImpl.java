package com.trkj.trainingprojects.Opservice;

import com.trkj.trainingprojects.dao.DropoutDao;
import com.trkj.trainingprojects.Opservice.DropoutService;
import com.trkj.trainingprojects.vo.DropoutVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DropoutServiceImpl implements DropoutService {
    @Resource
    private DropoutDao dropoutDao;

    @Override
    @Transactional
    public int addDropout(DropoutVo record) {
        return dropoutDao.addDropout(record);
    }

    @Override
    public DropoutVo selectByDropoutKey(Integer dropId) {
        return dropoutDao.selectByDropoutKey(dropId);
    }

    @Override
    @Transactional
    public int updateByDropoutKeySelective(DropoutVo record) {
        return dropoutDao.updateByDropoutKeySelective(record);
    }

    @Override
    @Transactional
    public int deleteByDropoutKey(DropoutVo record) {
        return dropoutDao.updateByDropoutKey(record);
    }

    @Override
    public List<DropoutVo> selectByDropoutStudentId(Integer studentId) {
        return dropoutDao.selectByDropoutStudentId(studentId);
    }

    @Override
    public List<DropoutVo> selectByDropoutCourseId(Integer courseId) {
        return dropoutDao.selectByDropoutCourseId(courseId);
    }

    @Override
    public List<DropoutVo> selectByDropoutCoursedetailsId(Integer coursedetailsId) {
        return dropoutDao.selectByDropoutCoursedetailsId(coursedetailsId);
    }

    @Override
    public List<DropoutVo> selectByDropoutClassesId(Integer classesId) {
        return dropoutDao.selectByDropoutClassesId(classesId);
    }

    @Override
    public List<DropoutVo> selectAllDropouts() {
        return dropoutDao.selectAllDropouts();
    }
}
