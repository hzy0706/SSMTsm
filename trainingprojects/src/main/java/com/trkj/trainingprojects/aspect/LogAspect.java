package com.trkj.trainingprojects.aspect;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.aspectj.lang.ProceedingJoinPoint;

import java.io.IOException;
import java.io.Reader;

@Slf4j
public class LogAspect {
    /*private static Reader reader;
    static {
        try {
            reader = Resources.getResourceAsReader("Config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
    @After
    public void close() throws IOException {
        reader.close();
    }

    public LogAspect() {
    }
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object obj = null;
        if(joinPoint.getSignature().getName().equals("userLogin")){
            SqlSession sqlSession = factory.openSession();
            LoginRecordDao loginRecordDao = sqlSession.getMapper(LoginRecordDao.class);
            log.debug("记录登录信息开始");
            obj = joinPoint.proceed();
            Object[] args = joinPoint.getArgs();
            LoginRecord loginRecord = new LoginRecord();
            loginRecord.setU_id(((Users)args[0]).getU_id());
            loginRecordDao.addLoginRecord(loginRecord);
            sqlSession.commit();
            sqlSession.close();
            log.debug("记录登录信息结束");
        }
        return obj;
    }*/
}
