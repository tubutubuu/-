package handy.server;

import handy.api.dto.JobDataSchema;
import handy.database.parameter.Mood;
import handy.database.repository.Repository;
import handy.database.table.JobData;
import handy.discovery.ArtifactProviderClient;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the` <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
enum ORDER  {STRING,UUID,OTHER,POM,MAP};
enum METHOD {INSERT,READ}
public class Main {
    @AllArgsConstructor
    @Getter
    public static class FilterCondition {
        enum MatchType {
            EXACT,
            PARTIAL
        }
        private String searchValue;
        private MatchType matchType;
    }


    public static void main(String[] args)
    {
       ORDER order = ORDER.MAP;
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
           case MAP:
               Map2();
               break;
       }
    }
    private static void Map(){
        String search1 = "";
        String search2 = "2";
        List<Map<String,String>> map = List.of(Repository.method(),Repository.method());
        List<Map<String,String>> filtered = new ArrayList<>();
        boolean sw1 = false;
        boolean sw2 = true;

        for(Map<String,String> pconf : map){
            for (String mapValue : pconf.values()){
                if(sw1 && pconf.containsValue(search1)  || sw2 && mapValue.contains(search2)){
                    filtered.add(pconf);
                    break;
                }
            }
        }
        System.out.println();
    }

    private static void Map2(){
        List<FilterCondition> filters = List.of(
                new FilterCondition("search1", FilterCondition.MatchType.EXACT),    // 全一致
                new FilterCondition("2", FilterCondition.MatchType.EXACT)     // 部分一致
     // 部分一致
        );

        List<Map<String, String>> map = List.of(Repository.method(), Repository.method());
        List<Map<String, String>> filtered = new ArrayList<>();

        for (Map<String, String> pconf : map) {
            for (String mapValue : pconf.values()) {
                boolean matched = false;
                for (FilterCondition filter : filters) {
                        if ((filter.getMatchType() == FilterCondition.MatchType.EXACT && mapValue.equals(filter.getSearchValue())) ||
                                (filter.getMatchType() == FilterCondition.MatchType.PARTIAL && mapValue.contains(filter.getSearchValue()))) {
                            matched = true;
                            break;
                        }

                }
                if (matched) {
                    filtered.add(pconf);
                    break;
                }
            }
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
            JobDataSchema schema = ArtifactProviderClient.detailsSomething(something);
            if(schema != null){
                System.out.println("mood is " + schema.getMood());
            }
            else{
                System.out.println("none mood");
            }
        }

    }


}