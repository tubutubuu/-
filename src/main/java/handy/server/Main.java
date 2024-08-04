package handy.server;

import handy.database.parameter.Mood;
import handy.database.table.JobData;
import handy.discovery.ArtifactProviderClient;

import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the` <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
enum ORDER  {STRING,UUID,OTHER,POM};
enum METHOD {INSERT,READ}
public class Main {
    public static void main(String[] args)
    {
       ORDER order = ORDER.POM;
       METHOD method = METHOD.READ;
       switch (order){
           case STRING:
               B(method);
               break;
           case UUID:
               C(method);
               break;
           case OTHER:
               break;
           case POM:
               E(method);
               break;
       }




    }
    private void A(METHOD method){
        JobData data = null;
        if(method == METHOD.READ){
            data  = ArtifactProviderClient.search(1);  if(data==null){
            }
            else{
                System.out.println("dataset_id="+ data.getId());
                data.getTerms().forEach((String a)->{System.out.println("id_a:="+a);});
                data.getTags().forEach((String a)->{System.out.println("id_a:="+a);});
            }


        }
        else if(method == METHOD.INSERT){
            int row = ArtifactProviderClient.create("a1","b1","c1");
            System.out.println(row);
        }
    }
    private static void B(METHOD method){
        UUID data = null;
        if(method == METHOD.READ){
            data  = ArtifactProviderClient.detailsString("a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11");
            if(data==null){
                System.out.println("none");
            }
            else{
                System.out.println(data.toString());
            }
        }

    }
    private static void C(METHOD method){
        UUID input = UUID.fromString("a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11");
        UUID data = null;
        if(method == METHOD.READ){
            data  = ArtifactProviderClient.detailsUuid(input);
            if(data==null){
                System.out.println("none");
            }
            else{
                System.out.println(data.toString());
            }
        }

    }
    private static void D(METHOD method){

        Mood something = Mood.POMPOM;
        if(method == METHOD.INSERT){
           int row = ArtifactProviderClient.insertSomething(something);
            if(row==0){
                System.out.println("none");
            }
            else{
              System.out.println("success");
            }
        }

    }
    private static void E(METHOD method){

        Mood something = Mood.POMPOM;
        if(method == METHOD.READ){
            Mood mood = ArtifactProviderClient.detailsSomething(something);
            if(mood != null){
                System.out.println("mood is " + mood);
            }
            else{
                System.out.println("none mood");
            }
        }

    }


}