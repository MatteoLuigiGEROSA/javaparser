package com.github.javaparser.metamodel;

import java.util.Optional;

public class ArrayAccessExprMetaModel extends ClassMetaModel {

    ArrayAccessExprMetaModel(JavaParserMetaModel parent, Optional<ClassMetaModel> superClassMetaModel) {
        super(superClassMetaModel, parent, com.github.javaparser.ast.expr.ArrayAccessExpr.class, "ArrayAccessExpr", "com.github.javaparser.ast.expr.ArrayAccessExpr", "com.github.javaparser.ast.expr", false);
    }
}

