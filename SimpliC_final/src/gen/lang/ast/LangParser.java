package lang.ast;
import beaver.*;
import java.util.ArrayList;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Stack;
import java.util.zip.DeflaterOutputStream;

// This is a parser generated by NeoBeaver.
public class LangParser extends beaver.Parser {
  
	static public class SyntaxError extends RuntimeException { public SyntaxError(String msg) {super(msg);}}
	// Disable syntax error recovery
	protected void recoverFromError(Symbol token, TokenStream in) {
		throw new SyntaxError("Cannot recover from the syntax error");
	}

  public static class Terminals {
    public static final short EOF = 0;
    public static final short SUB = 1;
    public static final short ADD = 2;
    public static final short ID = 3;
    public static final short RPAR = 4;
    public static final short COMMA = 5;
    public static final short SEMI = 6;
    public static final short LPAR = 7;
    public static final short INT = 8;
    public static final short RBRACKET = 9;
    public static final short RETURN = 10;
    public static final short NUMERAL = 11;
    public static final short WHILE = 12;
    public static final short IF = 13;
    public static final short GEQ = 14;
    public static final short NEQ = 15;
    public static final short LEQ = 16;
    public static final short EQ = 17;
    public static final short GTHN = 18;
    public static final short LTHN = 19;
    public static final short MOD = 20;
    public static final short DIV = 21;
    public static final short MUL = 22;
    public static final short LBRACKET = 23;
    public static final short ASSIGN = 24;
    public static final short ELSE = 25;
    public static final short BOOL = 26;

    public static final String[] NAMES = {
        "EOF",
        "SUB",
        "ADD",
        "ID",
        "RPAR",
        "COMMA",
        "SEMI",
        "LPAR",
        "INT",
        "RBRACKET",
        "RETURN",
        "NUMERAL",
        "WHILE",
        "IF",
        "GEQ",
        "NEQ",
        "LEQ",
        "EQ",
        "GTHN",
        "LTHN",
        "MOD",
        "DIV",
        "MUL",
        "LBRACKET",
        "ASSIGN",
        "ELSE",
        "BOOL",
    };
  }

  private final Action[] actions = {
    new Action() { // [0] func_list = 
      public Symbol reduce(Symbol[] _symbols, int offset) {
        return new List();
      }
    },
    new Action() { // [1] program =  func_list
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final List a = (List) _symbols[offset + 1].value;
        return new Program(a);
      }
    },
    new Action() { // [2] GOAL =  program EOF
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Program program = (Program) _symbols[offset + 1].value;
        final Symbol sym2 = _symbols[offset + 2];
        return program;
      }
    },
    new Action() { // [3] func_list =  func_list func_del
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final List a = (List) _symbols[offset + 1].value;
        final Func_del func = (Func_del) _symbols[offset + 2].value;
        return a.add(func);
      }
    },
    new Action() { // [4] idfun =  INT ID
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Symbol INT = _symbols[offset + 1];
        final Symbol id = _symbols[offset + 2];
        return new IdFun(id);
      }
    },
    new Action() { // [5] param_list2 = 
      public Symbol reduce(Symbol[] _symbols, int offset) {
        return new List();
      }
    },
    new Action() { // [6] param_list1 =  param
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Parafactor par = (Parafactor) _symbols[offset + 1].value;
        return new List().add(par);
      }
    },
    new Action() { // [7] param =  idVar
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final IdVar id = (IdVar) _symbols[offset + 1].value;
        return new Parafactor(id);
      }
    },
    Action.RETURN, // [8] param_list2 =  param_list1 (default action: return symbol 1)
    new Action() { // [9] idVar =  INT ID
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Symbol INT = _symbols[offset + 1];
        final Symbol id = _symbols[offset + 2];
        return new IdVar(id);
      }
    },
    new Action() { // [10] stmt_list2 = 
      public Symbol reduce(Symbol[] _symbols, int offset) {
        return new List();
      }
    },
    new Action() { // [11] param_list1 =  param_list1 COMMA param
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final List a = (List) _symbols[offset + 1].value;
        final Symbol COMMA = _symbols[offset + 2];
        final Parafactor par = (Parafactor) _symbols[offset + 3].value;
        return a.add(par);
      }
    },
    Action.RETURN, // [12] stmt =  ifStmt (default action: return symbol 1)
    Action.RETURN, // [13] stmt_list2 =  stmt_list1 (default action: return symbol 1)
    new Action() { // [14] idUse =  ID
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Symbol id = _symbols[offset + 1];
        return new IdUse(id);
      }
    },
    new Action() { // [15] idCall =  ID
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Symbol id = _symbols[offset + 1];
        return new IdCall(id);
      }
    },
    new Action() { // [16] stmt_list1 =  stmt
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Stmt st = (Stmt) _symbols[offset + 1].value;
        return new List().add(st);
      }
    },
    new Action() { // [17] func_del =  idfun LPAR param_list2 RPAR LBRACKET stmt_list2 RBRACKET
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final IdFun id = (IdFun) _symbols[offset + 1].value;
        final Symbol LPAR = _symbols[offset + 2];
        final List p = (List) _symbols[offset + 3].value;
        final Symbol RPAR = _symbols[offset + 4];
        final Symbol LBRACKET = _symbols[offset + 5];
        final List t = (List) _symbols[offset + 6].value;
        final Symbol RBRACKET = _symbols[offset + 7];
        return new Func_del (id,p,t);
      }
    },
    new Action() { // [18] declare =  idVar SEMI
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final IdVar a = (IdVar) _symbols[offset + 1].value;
        final Symbol SEMI = _symbols[offset + 2];
        return new Var_del(a, new Opt());
      }
    },
    new Action() { // [19] stmt_list1 =  stmt_list1 stmt
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final List a = (List) _symbols[offset + 1].value;
        final Stmt st = (Stmt) _symbols[offset + 2].value;
        return a.add(st);
      }
    },
    new Action() { // [20] arg_list2 = 
      public Symbol reduce(Symbol[] _symbols, int offset) {
        return new List();
      }
    },
    Action.RETURN, // [21] factor =  numeral (default action: return symbol 1)
    Action.RETURN, // [22] expr =  sum (default action: return symbol 1)
    Action.RETURN, // [23] term =  factor (default action: return symbol 1)
    new Action() { // [24] numeral =  NUMERAL
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Symbol num = _symbols[offset + 1];
        return new Numeral(num);
      }
    },
    Action.RETURN, // [25] sum =  term (default action: return symbol 1)
    Action.RETURN, // [26] arg_list2 =  arg_list1 (default action: return symbol 1)
    new Action() { // [27] arg_list1 =  expr
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Expr a = (Expr) _symbols[offset + 1].value;
        return new List().add(a);
      }
    },
    new Action() { // [28] unaryminus =  SUB factor
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Symbol SUB = _symbols[offset + 1];
        final Expr f = (Expr) _symbols[offset + 2].value;
        return new Minn(f);
      }
    },
    new Action() { // [29] unaryplus =  ADD factor
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Symbol ADD = _symbols[offset + 1];
        final Expr f = (Expr) _symbols[offset + 2].value;
        return new Par(f);
      }
    },
    new Action() { // [30] returnStmt =  RETURN expr SEMI
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Symbol RETURN = _symbols[offset + 1];
        final Expr a = (Expr) _symbols[offset + 2].value;
        final Symbol SEMI = _symbols[offset + 3];
        return new Return(a);
      }
    },
    new Action() { // [31] declare =  idVar ASSIGN expr SEMI
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final IdVar a = (IdVar) _symbols[offset + 1].value;
        final Symbol ASSIGN = _symbols[offset + 2];
        final Expr b = (Expr) _symbols[offset + 3].value;
        final Symbol SEMI = _symbols[offset + 4];
        return new Var_del(a,new Opt(b));
      }
    },
    new Action() { // [32] assign =  idUse ASSIGN expr SEMI
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final IdUse id = (IdUse) _symbols[offset + 1].value;
        final Symbol ASSIGN = _symbols[offset + 2];
        final Expr a = (Expr) _symbols[offset + 3].value;
        final Symbol SEMI = _symbols[offset + 4];
        return new Asst(id,a);
      }
    },
    new Action() { // [33] sum =  sum ADD term
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Expr a = (Expr) _symbols[offset + 1].value;
        final Symbol ADD = _symbols[offset + 2];
        final Expr b = (Expr) _symbols[offset + 3].value;
        return new Plus(a, b);
      }
    },
    new Action() { // [34] sum =  sum SUB term
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Expr a = (Expr) _symbols[offset + 1].value;
        final Symbol SUB = _symbols[offset + 2];
        final Expr b = (Expr) _symbols[offset + 3].value;
        return new Minus(a, b);
      }
    },
    new Action() { // [35] compare =  sum GEQ sum
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Expr a = (Expr) _symbols[offset + 1].value;
        final Symbol GEQ = _symbols[offset + 2];
        final Expr b = (Expr) _symbols[offset + 3].value;
        return new GreatEq(a,b);
      }
    },
    new Action() { // [36] compare =  sum LEQ sum
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Expr a = (Expr) _symbols[offset + 1].value;
        final Symbol LEQ = _symbols[offset + 2];
        final Expr b = (Expr) _symbols[offset + 3].value;
        return new LessEq(a,b);
      }
    },
    new Action() { // [37] compare =  sum EQ sum
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Expr a = (Expr) _symbols[offset + 1].value;
        final Symbol EQ = _symbols[offset + 2];
        final Expr b = (Expr) _symbols[offset + 3].value;
        return new Eq(a,b);
      }
    },
    new Action() { // [38] compare =  sum NEQ sum
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Expr a = (Expr) _symbols[offset + 1].value;
        final Symbol NEQ = _symbols[offset + 2];
        final Expr b = (Expr) _symbols[offset + 3].value;
        return new NotEq(a,b);
      }
    },
    new Action() { // [39] compare =  sum GTHN sum
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Expr a = (Expr) _symbols[offset + 1].value;
        final Symbol GTHN = _symbols[offset + 2];
        final Expr b = (Expr) _symbols[offset + 3].value;
        return new Great(a,b);
      }
    },
    new Action() { // [40] compare =  sum LTHN sum
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Expr a = (Expr) _symbols[offset + 1].value;
        final Symbol LTHN = _symbols[offset + 2];
        final Expr b = (Expr) _symbols[offset + 3].value;
        return new Less(a,b);
      }
    },
    new Action() { // [41] factor =  LPAR sum RPAR
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Symbol LPAR = _symbols[offset + 1];
        final Expr s = (Expr) _symbols[offset + 2].value;
        final Symbol RPAR = _symbols[offset + 3];
        return s;
      }
    },
    new Action() { // [42] term =  term MOD factor
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Expr a = (Expr) _symbols[offset + 1].value;
        final Symbol MOD = _symbols[offset + 2];
        final Expr b = (Expr) _symbols[offset + 3].value;
        return new Remi(a, b);
      }
    },
    new Action() { // [43] term =  term DIV factor
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Expr a = (Expr) _symbols[offset + 1].value;
        final Symbol DIV = _symbols[offset + 2];
        final Expr b = (Expr) _symbols[offset + 3].value;
        return new Div(a, b);
      }
    },
    new Action() { // [44] term =  term MUL factor
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Expr a = (Expr) _symbols[offset + 1].value;
        final Symbol MUL = _symbols[offset + 2];
        final Expr b = (Expr) _symbols[offset + 3].value;
        return new Mul(a, b);
      }
    },
    new Action() { // [45] opt_block = 
      public Symbol reduce(Symbol[] _symbols, int offset) {
        return new Opt();
      }
    },
    new Action() { // [46] funcStmt =  idCall LPAR arg_list2 RPAR SEMI
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final IdCall id = (IdCall) _symbols[offset + 1].value;
        final Symbol LPAR = _symbols[offset + 2];
        final List l = (List) _symbols[offset + 3].value;
        final Symbol RPAR = _symbols[offset + 4];
        final Symbol SEMI = _symbols[offset + 5];
        return new Func_call_stmt(id,l);
      }
    },
    new Action() { // [47] arg_list1 =  arg_list1 COMMA expr
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final List a = (List) _symbols[offset + 1].value;
        final Symbol COMMA = _symbols[offset + 2];
        final Expr ar = (Expr) _symbols[offset + 3].value;
        return a.add(ar);
      }
    },
    new Action() { // [48] whileStmt =  WHILE LPAR expr RPAR block
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Symbol WHILE = _symbols[offset + 1];
        final Symbol LPAR = _symbols[offset + 2];
        final Expr a = (Expr) _symbols[offset + 3].value;
        final Symbol RPAR = _symbols[offset + 4];
        final Block b = (Block) _symbols[offset + 5].value;
        return new WhileStmt(a, b);
      }
    },
    new Action() { // [49] funcCall =  idCall LPAR arg_list2 RPAR
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final IdCall id = (IdCall) _symbols[offset + 1].value;
        final Symbol LPAR = _symbols[offset + 2];
        final List l = (List) _symbols[offset + 3].value;
        final Symbol RPAR = _symbols[offset + 4];
        return new Func_call(id, l);
      }
    },
    new Action() { // [50] ifStmt =  IF LPAR expr RPAR block opt_block
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Symbol IF = _symbols[offset + 1];
        final Symbol LPAR = _symbols[offset + 2];
        final Expr a = (Expr) _symbols[offset + 3].value;
        final Symbol RPAR = _symbols[offset + 4];
        final Block b = (Block) _symbols[offset + 5].value;
        final Opt c = (Opt) _symbols[offset + 6].value;
        return new IfStmt(a,b,c);
      }
    },
    new Action() { // [51] block =  LBRACKET RBRACKET
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Symbol LBRACKET = _symbols[offset + 1];
        final Symbol RBRACKET = _symbols[offset + 2];
        return new Block(new List());
      }
    },
    new Action() { // [52] opt_block =  ELSE block
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Symbol ELSE = _symbols[offset + 1];
        final Block a = (Block) _symbols[offset + 2].value;
        return new Opt(a);
      }
    },
    new Action() { // [53] block =  LBRACKET stmt_list2 RBRACKET
      public Symbol reduce(Symbol[] _symbols, int offset) {
        final Symbol LBRACKET = _symbols[offset + 1];
        final List t = (List) _symbols[offset + 2].value;
        final Symbol RBRACKET = _symbols[offset + 3];
        return new Block(t);
      }
    },
  };

  static final ParsingTables PARSING_TABLES = new ParsingTables(
    "U9pjcbbm54KOn$yXroORI3W3X73b0a888P2GW88eu86e22hY0NW2eb1b#U3zvF5eMULH#cB" +
    "fWm##YALF7bK#gK14EHGKH0WGm0CK44Hi$z$q97DkPgU1hO3qLx$#Uhg$$toTdjwPpUu2oG" +
    "rA8Hjvw8KYzIMAy12Fyt4VLk0Hw98a$T4RGp2KhJvsRuxjIyb8L60O1g4Smp420p3OYfs8I" +
    "PY5gMX67LfqhFeNOponkLPKGrTK4oQW5VLMx$MTlUfCIDGqEyhREvszdIKHCdvPg6gcerB$" +
    "m5qkv$6C4CKLhZnI2W8nytmzj$cE5pFNwO3gza3F4gjdkREEwcyxPs4Wzev0pvrTComEZDq" +
    "LwBdRwhd7bUkKEfLYlQJtNi$LbRAKp50drSaGrOFsckbzv2#bAF7jezNSHv55$OM#qL41rG" +
    "cnTE8yX$tYPu9S9vDIvkZLSOoc7uM1KI9rJ1qpo5Lfe06gJ4JgJwSbfdsah3gDKzS4Ujnh#" +
    "4UwQuYnQUGAbd4c8dLK7TKrxOX$n6lIPuyPhU45eFhTQObf7wL2RMH4M1cFoLtxez7sKo9d" +
    "QFPt$TRzyJcTuQzEIqpxyvJh5wSbfltvoQLLwh29oYnNN9Kwf0xfMhn$n6kkmQjm9ICEYlb" +
    "EE1jNOmxcuXfS6yWL5XzPp6QeEbI7hiLxL1r#SmrU5tTsLidazJgW3kXQl7$4Qwwn$Mg$hi" +
    "LxLFiTmtpSW1jTOsOhdq4LRkfsiLAL1KQgcurK2urKYqn4QXzkCL2rgtQ3PBSQQA3sghsw5" +
    "kyVyPfhC8ElhqkgSwMA$TIpdYbO5XddAMgFsgDhyVuHh$bdQBTxv1ggdvsMcFQHkUwFZ0ZB" +
    "jTjfYMaVgVh9QObf7vdi0PCP6gwysMhiKhjqBTu$qcc1P#LEjLFNuZsgdOxvLVRxg1$5Oan" +
    "HgtuGYwtQ8HPRjLqijkfxiTYgxyHYg5R6YEqgQflQfcln$X6lkSQsggsw5kzHRVMRQsoBsg" +
    "9hyHxL5h#vnZQhpReMxr5jzfjhx5kd9QPzYaLOrTLoVUQ0XzF#tEORfoMcVQHgazeK5HEY#" +
    "jffYMaVgMfJRReMxn$ncclGxBwnqMc9QHyfMsEKQuFJ4jC#CdQzqnBJFZBNLqvBJFjkOfju" +
    "hvwAQhIIPYGm3JLYoYgO9F3UNOPXRBNOlR1zDHc3iHY7Mjxpwp31#ioMiHRw4zQH6ALZcSi" +
    "Rc$16SHzNe19Llbwa5MNtAhiWsqW5vIfeu0mRkrTOSVaXCVuUtt6QgWh$EYB7pXcsTe6URb" +
    "SZZLp8JMSLdVKYZQbLLeorZ$o5UoCdk8#2SG4TSqL7XQcGbqRSOCzHQVnCSfsCLDcE7WKef" +
    "2z2xqYLsMeKnDV8xZLIcVrTiQ$LMUGAd2UTOhWQMUZLkHkzPq0V5AC4VT4F$J60J$P1pimC" +
    "$wwBLMMyyftvEi#0v7cQ8Np7QTqHCZh3df$BKkbdNroLMIuJLVYJ9Uor74yLo9NcyojpCmo" +
    "eClcgx77Nwm9KnTvDbYh7I6MMAvCpD7vNQQAAhpcRlP79rzSbrRbGcJpruk#hYtP7cRrBCV" +
    "jVBvFlUytkXsPhQBOQFUAfPpR3$wKgmq#Y7gwAyQh441ELMIwNokpzXl5$RGPhcCcxgDcdM" +
    "3tqAcC8WBNFEX$KbrcVq#lVpwmWpvCto4T4leCw0cGLaYeoaomXZv6doRla2xA7d0Hw3IIJ" +
    "oJooagmXRv9Fo3Po5CWk8ZLa5bbC7YSla$V9Uj8Ev6IHeQIPB22hoGlaRV8fuRboZW6vnQI" +
    "Ip2PBoHFa5S9pvMuW1yWP88$dociayyagyXnvYtnCTf3ZG7u9gILpo3Bo97cLh2CRIGUGo2" +
    "R3IGjPI3YlnAE4yqfmNWdEAt62d0OAnfEvP3bvYhn6FY1jv21GoB#nS0Hf9Oi8rwhmHV8E#" +
    "Oni9vnNiXyf9PnNackVvBoId5TodLn3Nj3rp#WBsoRU3ykki7xN#6voAcoCfo$kJkkAgtIr" +
    "csq$o$Ro2olv5J$t3FfsSmvUNzIdao#5$YNoEk6rm7laSoBVQCbtrV9xZ#Eks0$9OUvPs6k" +
    "mrtkkh1AwTfDvi6oYlZoaVr#AUQ#D#jRjeYXDrZrcAfUybUyJcyWq8h$RQ67V93A5LBEltk" +
    "hBnXWUrvCoCenC99EHZph6J2GDZ2jdNoKPJKQI2j906iaenemW4tYkEZvVnf8AjeMg59IJq" +
    "Ivu$y5uFfaQsHv7Fvpdg4KUQdZUPbB3$kd$0NDfzJy=");

  public LangParser() {
    super(PARSING_TABLES);
  }

  protected Symbol invokeReduceAction(int rule_num, int offset) {
    return actions[rule_num].reduce(_symbols, offset);
  }
}
