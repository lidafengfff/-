package com.oracle.hrb.cloudnote.dao;

import java.util.List;

public interface NotebookTypeDao {
    NotebookTypeDao findNormal();
    List<NotebookTypeDao> findSpecial();
}
