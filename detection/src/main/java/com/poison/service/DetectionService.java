package com.poison.service;

import java.util.List;

/**
 * @author xjm
 * @date 2022年10月28日 10:35
 * @Description TODO
 */
public interface DetectionService {

    public double getSemanticScore(String repo, int prNumber);

    public List<String> getLabels(String repo, int prNumber);

    public List<Double> getCommitsScore(String repo, int prNumber);
}
