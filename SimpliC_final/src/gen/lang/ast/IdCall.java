/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\lang.ast:21
 * @astdecl IdCall : ASTNode ::= <ID:String>;
 * @production IdCall : {@link ASTNode} ::= <span class="component">&lt;ID:String&gt;</span>;

 */
public class IdCall extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\PrettyPrint.jrag:33
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(getID());
	}
  /**
   * @declaredat ASTNode:1
   */
  public IdCall() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
  }
  /**
   * @declaredat ASTNode:12
   */
  @ASTNodeAnnotation.Constructor(
    name = {"ID"},
    type = {"String"},
    kind = {"Token"}
  )
  public IdCall(String p0) {
    setID(p0);
  }
  /**
   * @declaredat ASTNode:20
   */
  public IdCall(beaver.Symbol p0) {
    setID(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 0;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    decl_reset();
    isWrongParaNum_reset();
    type_reset();
    in_func_reset();
    lookupf_String_reset();
    callParaNum_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public IdCall clone() throws CloneNotSupportedException {
    IdCall node = (IdCall) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public IdCall copy() {
    try {
      IdCall node = (IdCall) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:66
   */
  @Deprecated
  public IdCall fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:76
   */
  public IdCall treeCopyNoTransform() {
    IdCall tree = (IdCall) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:96
   */
  public IdCall treeCopy() {
    IdCall tree = (IdCall) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:110
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_ID == ((IdCall) node).tokenString_ID);    
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   */
  public void setID(String value) {
    tokenString_ID = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_ID;
  /**
   */
  public int IDstart;
  /**
   */
  public int IDend;
  /**
   * JastAdd-internal setter for lexeme ID using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme ID
   * @apilevel internal
   */
  public void setID(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setID is only valid for String lexemes");
    tokenString_ID = (String)symbol.value;
    IDstart = symbol.getStart();
    IDend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme ID.
   * @return The value for the lexeme ID.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ID")
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
/** @apilevel internal */
protected boolean decl_visited = false;
  /** @apilevel internal */
  private void decl_reset() {
    decl_computed = false;
    
    decl_value = null;
    decl_visited = false;
  }
  /** @apilevel internal */
  protected boolean decl_computed = false;

  /** @apilevel internal */
  protected IdFun decl_value;

  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:4")
  public IdFun decl() {
    ASTState state = state();
    if (decl_computed) {
      return decl_value;
    }
    if (decl_visited) {
      throw new RuntimeException("Circular definition of attribute IdCall.decl().");
    }
    decl_visited = true;
    state().enterLazyAttribute();
    decl_value = lookupf(getID());
    decl_computed = true;
    state().leaveLazyAttribute();
    decl_visited = false;
    return decl_value;
  }
/** @apilevel internal */
protected boolean isWrongParaNum_visited = false;
  /** @apilevel internal */
  private void isWrongParaNum_reset() {
    isWrongParaNum_computed = false;
    isWrongParaNum_visited = false;
  }
  /** @apilevel internal */
  protected boolean isWrongParaNum_computed = false;

  /** @apilevel internal */
  protected boolean isWrongParaNum_value;

  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:36
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:36")
  public boolean isWrongParaNum() {
    ASTState state = state();
    if (isWrongParaNum_computed) {
      return isWrongParaNum_value;
    }
    if (isWrongParaNum_visited) {
      throw new RuntimeException("Circular definition of attribute IdCall.isWrongParaNum().");
    }
    isWrongParaNum_visited = true;
    state().enterLazyAttribute();
    isWrongParaNum_value = decl().paraNum() != callParaNum();
    isWrongParaNum_computed = true;
    state().leaveLazyAttribute();
    isWrongParaNum_visited = false;
    return isWrongParaNum_value;
  }
/** @apilevel internal */
protected boolean type_visited = false;
  /** @apilevel internal */
  private void type_reset() {
    type_computed = false;
    
    type_value = null;
    type_visited = false;
  }
  /** @apilevel internal */
  protected boolean type_computed = false;

  /** @apilevel internal */
  protected Type type_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:23
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:23")
  public Type type() {
    ASTState state = state();
    if (type_computed) {
      return type_value;
    }
    if (type_visited) {
      throw new RuntimeException("Circular definition of attribute IdCall.type().");
    }
    type_visited = true;
    state().enterLazyAttribute();
    type_value = type_compute();
    type_computed = true;
    state().leaveLazyAttribute();
    type_visited = false;
    return type_value;
  }
  /** @apilevel internal */
  private Type type_compute() {
  		 if(getID().equals("read")){
  		 	return intType();
  		 }
  		 if(getID().equals("print")){
  		 	return intType();
  		 }
  		 return decl().type();
  	}
  /**
   * @attribute inh
   * @aspect FunctionCalls
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:10
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="FunctionCalls", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:10")
  public Func_del in_func() {
    ASTState state = state();
    if (in_func_computed) {
      return in_func_value;
    }
    if (in_func_visited) {
      throw new RuntimeException("Circular definition of attribute IdCall.in_func().");
    }
    in_func_visited = true;
    state().enterLazyAttribute();
    in_func_value = getParent().Define_in_func(this, null);
    in_func_computed = true;
    state().leaveLazyAttribute();
    in_func_visited = false;
    return in_func_value;
  }
/** @apilevel internal */
protected boolean in_func_visited = false;
  /** @apilevel internal */
  private void in_func_reset() {
    in_func_computed = false;
    
    in_func_value = null;
    in_func_visited = false;
  }
  /** @apilevel internal */
  protected boolean in_func_computed = false;

  /** @apilevel internal */
  protected Func_del in_func_value;

  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:8
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:8")
  public IdFun lookupf(String name) {
    Object _parameters = name;
    if (lookupf_String_visited == null) lookupf_String_visited = new java.util.HashSet(4);
    if (lookupf_String_values == null) lookupf_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (lookupf_String_values.containsKey(_parameters)) {
      return (IdFun) lookupf_String_values.get(_parameters);
    }
    if (lookupf_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute IdCall.lookupf(String).");
    }
    lookupf_String_visited.add(_parameters);
    state().enterLazyAttribute();
    IdFun lookupf_String_value = getParent().Define_lookupf(this, null, name);
    lookupf_String_values.put(_parameters, lookupf_String_value);
    state().leaveLazyAttribute();
    lookupf_String_visited.remove(_parameters);
    return lookupf_String_value;
  }
/** @apilevel internal */
protected java.util.Set lookupf_String_visited;
  /** @apilevel internal */
  private void lookupf_String_reset() {
    lookupf_String_values = null;
    lookupf_String_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map lookupf_String_values;

  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:34
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:34")
  public int callParaNum() {
    ASTState state = state();
    if (callParaNum_computed) {
      return callParaNum_value;
    }
    if (callParaNum_visited) {
      throw new RuntimeException("Circular definition of attribute IdCall.callParaNum().");
    }
    callParaNum_visited = true;
    state().enterLazyAttribute();
    callParaNum_value = getParent().Define_callParaNum(this, null);
    callParaNum_computed = true;
    state().leaveLazyAttribute();
    callParaNum_visited = false;
    return callParaNum_value;
  }
/** @apilevel internal */
protected boolean callParaNum_visited = false;
  /** @apilevel internal */
  private void callParaNum_reset() {
    callParaNum_computed = false;
    callParaNum_visited = false;
  }
  /** @apilevel internal */
  protected boolean callParaNum_computed = false;

  /** @apilevel internal */
  protected int callParaNum_value;

  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\Errors.jrag:44
    if (decl().isUnknown()) {
      {
        Program target = (Program) (program());
        java.util.Set<ASTNode> contributors = _map.get(target);
        if (contributors == null) {
          contributors = new java.util.LinkedHashSet<ASTNode>();
          _map.put((ASTNode) target, contributors);
        }
        contributors.add(this);
      }
    }
    // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\Errors.jrag:56
    if (isWrongParaNum()) {
      {
        Program target = (Program) (program());
        java.util.Set<ASTNode> contributors = _map.get(target);
        if (contributors == null) {
          contributors = new java.util.LinkedHashSet<ASTNode>();
          _map.put((ASTNode) target, contributors);
        }
        contributors.add(this);
      }
    }
    super.collect_contributors_Program_errors(_root, _map);
  }
  /** @apilevel internal */
  protected void collect_contributors_Func_del_functionCalls(Func_del _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:31
    if (!decl().isUnknown()) {
      {
        Func_del target = (Func_del) (in_func());
        java.util.Set<ASTNode> contributors = _map.get(target);
        if (contributors == null) {
          contributors = new java.util.LinkedHashSet<ASTNode>();
          _map.put((ASTNode) target, contributors);
        }
        contributors.add(this);
      }
    }
    super.collect_contributors_Func_del_functionCalls(_root, _map);
  }
  /** @apilevel internal */
  protected void contributeTo_Program_errors(Set<ErrorMessage> collection) {
    super.contributeTo_Program_errors(collection);
    if (decl().isUnknown()) {
      collection.add(error("symbol '" + getID() + "' is not declared"));
    }
    if (isWrongParaNum()) {
      collection.add(error("the calling of symbol '" + getID() + "' is wrong"));
    }
  }
  /** @apilevel internal */
  protected void contributeTo_Func_del_functionCalls(Set<Func_del> collection) {
    super.contributeTo_Func_del_functionCalls(collection);
    if (!decl().isUnknown()) {
      collection.add(decl().func_del());
    }
  }
}
