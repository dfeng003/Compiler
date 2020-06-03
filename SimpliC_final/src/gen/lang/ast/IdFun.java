/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\lang.ast:9
 * @astdecl IdFun : ASTNode ::= <ID:String>;
 * @production IdFun : {@link ASTNode} ::= <span class="component">&lt;ID:String&gt;</span>;

 */
public class IdFun extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\PrettyPrint.jrag:29
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print(getID());
	}
  /**
   * @declaredat ASTNode:1
   */
  public IdFun() {
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
  public IdFun(String p0) {
    setID(p0);
  }
  /**
   * @declaredat ASTNode:20
   */
  public IdFun(beaver.Symbol p0) {
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
    isMultiDeclared_reset();
    isUnknown_reset();
    func_del_reset();
    paraNum_reset();
    lookupf_String_reset();
    type_reset();
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
  public IdFun clone() throws CloneNotSupportedException {
    IdFun node = (IdFun) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public IdFun copy() {
    try {
      IdFun node = (IdFun) clone();
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
  public IdFun fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:76
   */
  public IdFun treeCopyNoTransform() {
    IdFun tree = (IdFun) copy();
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
  public IdFun treeCopy() {
    IdFun tree = (IdFun) copy();
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
    return super.is$Equal(node) && (tokenString_ID == ((IdFun) node).tokenString_ID);    
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
protected boolean isMultiDeclared_visited = false;
  /** @apilevel internal */
  private void isMultiDeclared_reset() {
    isMultiDeclared_computed = false;
    isMultiDeclared_visited = false;
  }
  /** @apilevel internal */
  protected boolean isMultiDeclared_computed = false;

  /** @apilevel internal */
  protected boolean isMultiDeclared_value;

  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:121
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:121")
  public boolean isMultiDeclared() {
    ASTState state = state();
    if (isMultiDeclared_computed) {
      return isMultiDeclared_value;
    }
    if (isMultiDeclared_visited) {
      throw new RuntimeException("Circular definition of attribute IdFun.isMultiDeclared().");
    }
    isMultiDeclared_visited = true;
    state().enterLazyAttribute();
    isMultiDeclared_value = lookupf(getID()) != this;
    isMultiDeclared_computed = true;
    state().leaveLazyAttribute();
    isMultiDeclared_visited = false;
    return isMultiDeclared_value;
  }
/** @apilevel internal */
protected boolean isUnknown_visited = false;
  /** @apilevel internal */
  private void isUnknown_reset() {
    isUnknown_computed = false;
    isUnknown_visited = false;
  }
  /** @apilevel internal */
  protected boolean isUnknown_computed = false;

  /** @apilevel internal */
  protected boolean isUnknown_value;

  /**
   * @attribute syn
   * @aspect UnknownFun
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\UnknownFun.jrag:8
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="UnknownFun", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\UnknownFun.jrag:8")
  public boolean isUnknown() {
    ASTState state = state();
    if (isUnknown_computed) {
      return isUnknown_value;
    }
    if (isUnknown_visited) {
      throw new RuntimeException("Circular definition of attribute IdFun.isUnknown().");
    }
    isUnknown_visited = true;
    state().enterLazyAttribute();
    isUnknown_value = false;
    isUnknown_computed = true;
    state().leaveLazyAttribute();
    isUnknown_visited = false;
    return isUnknown_value;
  }
  /**
   * @attribute inh
   * @aspect FunctionCalls
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:8
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="FunctionCalls", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:8")
  public Func_del func_del() {
    ASTState state = state();
    if (func_del_computed) {
      return func_del_value;
    }
    if (func_del_visited) {
      throw new RuntimeException("Circular definition of attribute IdFun.func_del().");
    }
    func_del_visited = true;
    state().enterLazyAttribute();
    func_del_value = getParent().Define_func_del(this, null);
    func_del_computed = true;
    state().leaveLazyAttribute();
    func_del_visited = false;
    return func_del_value;
  }
/** @apilevel internal */
protected boolean func_del_visited = false;
  /** @apilevel internal */
  private void func_del_reset() {
    func_del_computed = false;
    
    func_del_value = null;
    func_del_visited = false;
  }
  /** @apilevel internal */
  protected boolean func_del_computed = false;

  /** @apilevel internal */
  protected Func_del func_del_value;

  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:24
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:24")
  public int paraNum() {
    ASTState state = state();
    if (paraNum_computed) {
      return paraNum_value;
    }
    if (paraNum_visited) {
      throw new RuntimeException("Circular definition of attribute IdFun.paraNum().");
    }
    paraNum_visited = true;
    state().enterLazyAttribute();
    paraNum_value = getParent().Define_paraNum(this, null);
    paraNum_computed = true;
    state().leaveLazyAttribute();
    paraNum_visited = false;
    return paraNum_value;
  }
/** @apilevel internal */
protected boolean paraNum_visited = false;
  /** @apilevel internal */
  private void paraNum_reset() {
    paraNum_computed = false;
    paraNum_visited = false;
  }
  /** @apilevel internal */
  protected boolean paraNum_computed = false;

  /** @apilevel internal */
  protected int paraNum_value;

  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:120
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:120")
  public IdFun lookupf(String name) {
    Object _parameters = name;
    if (lookupf_String_visited == null) lookupf_String_visited = new java.util.HashSet(4);
    if (lookupf_String_values == null) lookupf_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (lookupf_String_values.containsKey(_parameters)) {
      return (IdFun) lookupf_String_values.get(_parameters);
    }
    if (lookupf_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute IdFun.lookupf(String).");
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
   * @aspect TypeAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:37
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:37")
  public Type type() {
    ASTState state = state();
    if (type_computed) {
      return type_value;
    }
    if (type_visited) {
      throw new RuntimeException("Circular definition of attribute IdFun.type().");
    }
    type_visited = true;
    state().enterLazyAttribute();
    type_value = getParent().Define_type(this, null);
    type_computed = true;
    state().leaveLazyAttribute();
    type_visited = false;
    return type_value;
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

  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\Errors.jrag:48
    if (isMultiDeclared()) {
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
  protected void contributeTo_Program_errors(Set<ErrorMessage> collection) {
    super.contributeTo_Program_errors(collection);
    if (isMultiDeclared()) {
      collection.add(error("symbol '" + getID() + "' is already declared!"));
    }
  }
}
