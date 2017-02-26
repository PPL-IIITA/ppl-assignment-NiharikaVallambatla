
package ppl_assignment;

public class rand_generator {
    rand_generator(girl girl[],boy boy[]){
        int i,j,p;
        for(i=0;i<100;i++){
            boy[i] = new boy();
            boy[i].name=i+600;
            
        }
        for(i=0;i<50;i++){
            girl[i] = new girl();
            girl[i].name=i+500;
        }
    }
}
