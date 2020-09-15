package com.chendehe.entity;

import java.util.List;
import java.util.Map;

import lombok.Data;

/**
 * @author CDH
 * @since 2019/7/29 11:01
 */
@Data
public class Table {
    private String modelPackage;
    private String modelFolder;
    private String daoPackage;
    private String daoFolder;
    private String modelPrefix;
    private String modelSuffix;
    private String daoPrefix;
    private String daoSuffix;
    private String tablePrefix;
    /**
     * K:tableName#comment V:fields
     */
    private Map<String, List<Field>> tableFields;

    public String getModelPackage() {
        return modelPackage;
    }

    public void setModelPackage(String modelPackage) {
        this.modelPackage = modelPackage;
    }

    public String getModelFolder() {
        return modelFolder;
    }

    public void setModelFolder(String modelFolder) {
        this.modelFolder = modelFolder;
    }

    public String getDaoPackage() {
        return daoPackage;
    }

    public void setDaoPackage(String daoPackage) {
        this.daoPackage = daoPackage;
    }

    public String getDaoFolder() {
        return daoFolder;
    }

    public void setDaoFolder(String daoFolder) {
        this.daoFolder = daoFolder;
    }

    public String getModelPrefix() {
        return modelPrefix;
    }

    public void setModelPrefix(String modelPrefix) {
        this.modelPrefix = modelPrefix;
    }

    public String getModelSuffix() {
        return modelSuffix;
    }

    public void setModelSuffix(String modelSuffix) {
        this.modelSuffix = modelSuffix;
    }

    public String getDaoPrefix() {
        return daoPrefix;
    }

    public void setDaoPrefix(String daoPrefix) {
        this.daoPrefix = daoPrefix;
    }

    public String getDaoSuffix() {
        return daoSuffix;
    }

    public void setDaoSuffix(String daoSuffix) {
        this.daoSuffix = daoSuffix;
    }

    public String getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    public Map<String, List<Field>> getTableFields() {
        return tableFields;
    }

    public void setTableFields(Map<String, List<Field>> tableFields) {
        this.tableFields = tableFields;
    }
}
