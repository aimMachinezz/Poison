package com.poison.service;

import com.poison.pojo.PrFile;
import com.poison.pojo.ResponseVO;

import java.util.List;

/**
 * @author xjm
 * @date 2022年10月28日 10:35
 * @Description TODO
 */
public interface DetectionService {
    /**
     * @Description 获取PR的提交者名称，会被多次调用
     * @author xjm
     * @date 11:28 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getPrAuthor(String repo, int prNumber);

    /**
     * @Description 获取提交者在某一仓库提交的所有PR
     * @author xjm
     * @date 11:39 2022/10/28
     * @param author
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getAuthorPrList(String author, String repo);

    /**
     * @Description 获取PR的语义得分来判断异常
     * @author xjm
     * @date 11:32 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getSemanticScore(String repo, int prNumber);

    /**
     * @Description 获取PR的标签信息
     * @author xjm
     * @date 11:32 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getLabels(String repo, int prNumber);

    /**
     * @Description 调用子服务，获取PR的所有commit得分
     * @author xjm
     * @date 11:33 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getCommitsScore(String repo, int prNumber);

    /**
     * @Description 获取所有commit得分后，检测commit异常
     * @author xjm
     * @date 11:34 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getCommitScoreAnomaly(String repo, int prNumber);

    /**
     * @Description 获取PR的所有文件信息
     * @author xjm
     * @date 11:34 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getPrFiles(String repo, int prNumber);

    /**
     * @Description 根据获取到的文件信息，检测文件种类和数量的异常
     * @author xjm
     * @date 11:34 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getPrFileAnomaly(String repo, int prNumber);

    /**
     * @Description 获取PR的修改代码行信息
     * @author xjm
     * @date 11:35 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getPrLines(String repo, int prNumber);

    /**
     * @Description 根据PR修改代码行信息检测异常
     * @author xjm
     * @date 11:36 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getPrLineAnomaly(String repo, int prNumber);

    /**
     * @Description 检测commit数量的异常
     * @author xjm
     * @date 13:20 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getPrCommitsNumberAnomaly(String repo, int prNumber);

    /**
     * @Description 检测作者提交PR频率的异常
     * @author xjm
     * @date 13:20 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getPrFrequencyAnomaly(String repo, int prNumber);

    /**
     * @Description 获取PR选择的评审者
     * @author xjm
     * @date 13:22 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getPrReviewers(String repo, int prNumber);

    /**
     * @Description 检测PR选择的评审者异常
     * @author xjm
     * @date 13:22 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getPrReviewerAnomaly(String repo, int prNumber);

    /**
     * @Description 获取PR的评审内容
     * @author xjm
     * @date 13:23 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getPrReviewContents(String repo, int prNumber);

    /**
     * @Description 检测PR的评审内容异常：第一次响应时间等异常
     * @author xjm
     * @date 13:23 2022/10/28
     * @param repo
     * @param prNumber
     * @return com.poison.pojo.ResponseVO
     **/
    public ResponseVO getPrReviewContentAnomaly(String repo, int prNumber);
}
