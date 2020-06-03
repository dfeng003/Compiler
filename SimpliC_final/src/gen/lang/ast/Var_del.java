/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\lang.ast:22
 * @astdecl Var_del : Stmt ::= IdVar [Default:Expr];
 * @production Var_del : {@link Stmt} ::= <span class="component">{@link IdVar}</span> <span class="component">[Default:{@link Expr}]</span>;

 */
public class Var_del extends Stmt implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\PrettyPrint.jrag:172
   */
  public void prettyPrint(PrintStream out, String ind){
		out.print(ind+"int ");
		getIdVar().prettyPrint(out, ind);
		if (hasDefault()) {
			out.print(" = ");
			getDefault().prettyPrint(out, ind);
		}
		out.print(";");
	}
  /**
   * @declaredat ASTNode:1
   */
  public Var_del() {
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
    children = new ASTNode[2];
    setChild(new Opt(), 1);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"IdVar", "Default"},
    type = {"IdVar", "Opt<Expr>"},
    kind = {"Child", "Opt"}
  )
  public Var_del(IdVar p0, Opt<Expr> p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 2;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    lookupHere_reset();
    type_reset();
    initBoolean_reset();
    inExprOf_IdVar_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public Var_del clone() throws CloneNotSupportedException {
    Var_del node = (Var_del) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public Var_del copy() {
    try {
      Var_del node = (Var_del) clone();
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
   * @declaredat ASTNode:64
   */
  @Deprecated
  public Var_del fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public Var_del treeCopyNoTransform() {
    Var_del tree = (Var_del) copy();
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
   * @declaredat ASTNode:94
   */
  public Var_del treeCopy() {
    Var_del tree = (Var_del) copy();
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
   * @declaredat ASTNode:108
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the IdVar child.
   * @param node The new node to replace the IdVar child.
   * @apilevel high-level
   */
  public void setIdVar(IdVar node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the IdVar child.
   * @return The current node used as the IdVar child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdVar")
  public IdVar getIdVar() {
    return (IdVar) getChild(0);
  }
  /**
   * Retrieves the IdVar child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdVar child.
   * @apilevel low-level
   */
  public IdVar getIdVarNoTransform() {
    return (IdVar) getChildNoTransform(0);
  }
  /**
   * Replaces the optional node for the Default child. This is the <code>Opt</code>
   * node containing the child Default, not the actual child!
   * @param opt The new node to be used as the optional node for the Default child.
   * @apilevel low-level
   */
  public void setDefaultOpt(Opt<Expr> opt) {
    setChild(opt, 1);
  }
  /**
   * Replaces the (optional) Default child.
   * @param node The new node to be used as the Default child.
   * @apilevel high-level
   */
  public void setDefault(Expr node) {
    getDefaultOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Default child exists.
   * @return {@code true} if the optional Default child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasDefault() {
    return getDefaultOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Default child.
   * @return The Default child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Expr getDefault() {
    return (Expr) getDefaultOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Default child. This is the <code>Opt</code> node containing the child Default, not the actual child!
   * @return The optional node for child the Default child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Default")
  public Opt<Expr> getDefaultOpt() {
    return (Opt<Expr>) getChild(1);
  }
  /**
   * Retrieves the optional node for child Default. This is the <code>Opt</code> node containing the child Default, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Default.
   * @apilevel low-level
   */
  public Opt<Expr> getDefaultOptNoTransform() {
    return (Opt<Expr>) getChildNoTransform(1);
  }
/** @apilevel internal */
protected boolean lookupHere_visited = false;
  /** @apilevel internal */
  private void lookupHere_reset() {
    lookupHere_computed = false;
    
    lookupHere_value = null;
    lookupHere_visited = false;
  }
  /** @apilevel internal */
  protected boolean lookupHere_computed = false;

  /** @apilevel internal */
  protected IdVar lookupHere_value;

  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:92
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:91")
  public IdVar lookupHere() {
    ASTState state = state();
    if (lookupHere_computed) {
      return lookupHere_value;
    }
    if (lookupHere_visited) {
      throw new RuntimeException("Circular definition of attribute Stmt.lookupHere().");
    }
    lookupHere_visited = true;
    state().enterLazyAttribute();
    lookupHere_value = getIdVar();
    lookupHere_computed = true;
    state().leaveLazyAttribute();
    lookupHere_visited = false;
    return lookupHere_value;
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
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:42
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:42")
  public Type type() {
    ASTState state = state();
    if (type_computed) {
      return type_value;
    }
    if (type_visited) {
      throw new RuntimeException("Circular definition of attribute Var_del.type().");
    }
    type_visited = true;
    state().enterLazyAttribute();
    type_value = intType();
    type_computed = true;
    state().leaveLazyAttribute();
    type_visited = false;
    return type_value;
  }
/** @apilevel internal */
protected boolean initBoolean_visited = false;
  /** @apilevel internal */
  private void initBoolean_reset() {
    initBoolean_computed = false;
    initBoolean_visited = false;
  }
  /** @apilevel internal */
  protected boolean initBoolean_computed = false;

  /** @apilevel internal */
  protected boolean initBoolean_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:55
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:55")
  public boolean initBoolean() {
    ASTState state = state();
    if (initBoolean_computed) {
      return initBoolean_value;
    }
    if (initBoolean_visited) {
      throw new RuntimeException("Circular definition of attribute Var_del.initBoolean().");
    }
    initBoolean_visited = true;
    state().enterLazyAttribute();
    initBoolean_value = initBoolean_compute();
    initBoolean_computed = true;
    state().leaveLazyAttribute();
    initBoolean_visited = false;
    return initBoolean_value;
  }
  /** @apilevel internal */
  private boolean initBoolean_compute() {
  		if(hasDefault()){
  			return getDefault().type().equals(getDefault().boolType());
  		}
  		else return false;
  	}
  /**
   * @attribute inh
   * @aspect CircularDefinitions
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:129
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="CircularDefinitions", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:129")
  public boolean inExprOf(IdVar decl) {
    Object _parameters = decl;
    if (inExprOf_IdVar_visited == null) inExprOf_IdVar_visited = new java.util.HashSet(4);
    if (inExprOf_IdVar_values == null) inExprOf_IdVar_values = new java.util.HashMap(4);
    ASTState state = state();
    if (inExprOf_IdVar_values.containsKey(_parameters)) {
      return (Boolean) inExprOf_IdVar_values.get(_parameters);
    }
    if (inExprOf_IdVar_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Var_del.inExprOf(IdVar).");
    }
    inExprOf_IdVar_visited.add(_parameters);
    state().enterLazyAttribute();
    boolean inExprOf_IdVar_value = getParent().Define_inExprOf(this, null, decl);
    inExprOf_IdVar_values.put(_parameters, inExprOf_IdVar_value);
    state().leaveLazyAttribute();
    inExprOf_IdVar_visited.remove(_parameters);
    return inExprOf_IdVar_value;
  }
/** @apilevel internal */
protected java.util.Set inExprOf_IdVar_visited;
  /** @apilevel internal */
  private void inExprOf_IdVar_reset() {
    inExprOf_IdVar_values = null;
    inExprOf_IdVar_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map inExprOf_IdVar_values;

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:128
   * @apilevel internal
   */
  public boolean Define_inExprOf(ASTNode _callerNode, ASTNode _childNode, IdVar decl) {
    if (_callerNode == getDefaultOptNoTransform()) {
      // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:130
      return getIdVar() == decl || inExprOf(decl);
    }
    else {
      return getParent().Define_inExprOf(this, _callerNode, decl);
    }
  }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:128
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute inExprOf
   */
  protected boolean canDefine_inExprOf(ASTNode _callerNode, ASTNode _childNode, IdVar decl) {
    return true;
  }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:37
   * @apilevel internal
   */
  public Type Define_type(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getIdVarNoTransform()) {
      // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:39
      return type();
    }
    else {
      return getParent().Define_type(this, _callerNode);
    }
  }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:37
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute type
   */
  protected boolean canDefine_type(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\Errors.jrag:68
    if (initBoolean()) {
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
    if (initBoolean()) {
      collection.add(error("init boolean type"));
    }
  }
}
