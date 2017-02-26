
package ppl_assignment;

public class girl {
    int name;
    int attr;
    int intel;
    int happy;
    int maintb;
    int type;
    int criteria;
    int bf;
    int committed;
    rand r;
    girl(){
        this.r = new rand();
        this.attr = r.randnum(1, 10);
            this.intel = r.randnum(1, 10);
            this.maintb = r.randnum(1000, 5000);
            this.type = r.randnum(1, 3);
            this.criteria = r.randnum(1, 3);
            this.committed = 0;
            this.bf = 0; 
    }
}
