
package ppl_assignment;

public class matching {
  static void matchup(girl girl[], boy boy[]){
        int i,x, max, ind;
        
        for(i=0;i<50;i++){
            switch (girl[i].criteria) {
                case 1:
                    max=0;  
                    ind=-1;
                    for(x=0;x<30;x++){
                        if(boy[x].committed==0 && girl[i].maintb <= boy[x].budget){
                            if(boy[x].budget>max){
                                max = boy[x].budget;
                                ind = x;
                            }
                        }
                    }
                    if(ind==-1){
                        x=0;
                        while(true){
                            if(boy[x].committed ==0){
                                ind=x;
                                break;
                            }
                            x++;
                        }
                    }
                        boy[ind].committed = 1;
                        girl[i].committed = 1;
                        girl[i].bf = boy[ind].name;
                       break;
                case 2:
                    max=0;
                    ind=-1;
                    for(x=0;x<30;x++){
                        if(boy[x].committed==0 && girl[i].maintb <= boy[x].budget){
                            if(boy[x].intel>max){
                                max = boy[x].intel;
                                ind=x;
                            }
                        }
                    }
                    if(ind==-1){
                        x=0;
                        while(true){
                            if(boy[x].committed ==0){
                                ind=x;
                                break;
                            }
                            x++;
                        }
                    }
                        boy[ind].committed = 1;
                        girl[i].committed = 1;
                        girl[i].bf = boy[ind].name;
                       break;
                case 3:
                    max=0;
                    ind=-1;
                    for(x=0;x<30;x++){
                        if(boy[x].committed==0 && girl[i].maintb <= boy[x].budget){
                            if(boy[x].attr>max){
                                max = boy[x].attr;
                                ind = x;
                            }
                        }
                    }
                    if(ind==-1){
                        x=0;
                        while(true){
                            if(boy[x].committed ==0){
                                ind=x;
                                break;
                            }
                            x++;
                        }
                    }
                        boy[ind].committed = 1;
                        girl[i].committed = 1;
                        girl[i].bf = boy[ind].name;
                       break;
                default:
                    break;
            }
        }    
        }  
}
