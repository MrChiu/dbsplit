package com.robert.dbsplit.core.sql.parser;

/**
 * SQL解析
 */
public interface SplitSqlParser {

	public static final SplitSqlParser INST = new SplitSqlParserDefImpl();

	public SplitSqlStructure parseSplitSql(String sql);
}
