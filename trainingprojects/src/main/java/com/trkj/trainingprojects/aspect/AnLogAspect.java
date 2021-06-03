package com.trkj.trainingprojects.aspect;

import com.trkj.trainingprojects.Opservice.OpJournalService;
import com.trkj.trainingprojects.entity.ClassMeta;
import com.trkj.trainingprojects.entity.Opjournal;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Slf4j
@Component
@Aspect
public class AnLogAspect<faqVoClass> {
    @Resource
    private OpJournalService opJournalService;

    @Pointcut("execution(* com.trkj.trainingprojects.service..*.*(..))")
    public void x(){
    }
    /*@Before("execution(* com.trkj.service..IEmpService.*(..))")
    public void logBefore(){
        log.debug("开始做日志");
    }
    @Before("x()")
    public void logBeforeLogInfo(JoinPoint joinPoint){
        log.debug("即将进入到{}类的{}方法",joinPoint.getTarget().getClass(),joinPoint.getSignature());
    }
    @After("x()")
    public void logAfter(JoinPoint joinPoint){
        log.debug("完成{}类的{}方法执行",joinPoint.getTarget().getClass(),joinPoint.getSignature());
    }*/
    @Around("x()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        log.debug(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>即将进入到{}类的{}方法",joinPoint.getTarget().getClass().getName(),joinPoint.getSignature());
        Object obj = joinPoint.proceed();
        Object[] args = joinPoint.getArgs();
        String className = joinPoint.getSignature().getName().substring(0,3);
        if(className.equals("add")){
            Class faqVoClass = args[0].getClass();
            ClassMeta fieldMeta = (ClassMeta)faqVoClass.getAnnotation(ClassMeta.class);
            String tableName = fieldMeta.className();
            String addName =  args[0].getClass().getDeclaredField("addname").get(args[0]).toString();
            Opjournal opjournal = new Opjournal();
            opjournal.setEmpName(addName);
            opjournal.setOpcontent("添加"+tableName+"数据");
            opJournalService.addOpJournal(opjournal);
        }else if(className.equals("upd")){
            Class faqVoClass = args[0].getClass();
            ClassMeta fieldMeta = (ClassMeta)faqVoClass.getAnnotation(ClassMeta.class);
            String tableName = fieldMeta.className();
            String updateName =  args[0].getClass().getDeclaredField("updatename").get(args[0]).toString();
            Opjournal opjournal = new Opjournal();
            opjournal.setEmpName(updateName);
            opjournal.setOpcontent("修改"+tableName+"数据");
            opJournalService.addOpJournal(opjournal);
        }else if(className.equals("del")){
            Class faqVoClass = args[0].getClass();
            ClassMeta fieldMeta = (ClassMeta)faqVoClass.getAnnotation(ClassMeta.class);
            String tableName = fieldMeta.className();
            String deleteName =  args[0].getClass().getDeclaredField("deletename").get(args[0]).toString();
            Opjournal opjournal = new Opjournal();
            opjournal.setEmpName(deleteName);
            opjournal.setOpcontent("删除"+tableName+"数据");
            opJournalService.addOpJournal(opjournal);
        }
        log.debug("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<完成{}类的{}方法执行",joinPoint.getTarget().getClass().getName(),joinPoint.getSignature());
        return obj;
    }
}

