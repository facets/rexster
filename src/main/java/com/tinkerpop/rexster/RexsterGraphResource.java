package com.tinkerpop.rexster;

import com.tinkerpop.blueprints.pgm.Graph;
import com.tinkerpop.rexster.traversals.Traversal;

import java.util.Map;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class RexsterGraphResource extends BaseResource {
/*
    @Get
    public Representation evaluate() {
        StatisticsHelper sh = new StatisticsHelper();
        sh.stopWatch();

        this.resultObject.put("name", "Rexster: A RESTful Graph Shell");
        
        String graphName = this.getRequest().getResourceRef().getSegments().get(0);
        Graph graph = this.getRexsterApplication().getGraph(graphName);
        this.resultObject.put("graph", graph.toString());

        JSONArray queriesArray = new JSONArray();
        for (Map.Entry<String, Class<? extends Traversal>> traversal : this.getRexsterApplication().getLoadedTraversalServices(graphName).entrySet()) {
            queriesArray.add(traversal.getKey());
        }
        this.resultObject.put("traversals", queriesArray);
        
        this.resultObject.put("query_time", sh.stopWatch());
        this.resultObject.put("up_time", this.getTimeAlive());
        this.resultObject.put("version", RexsterApplication.getVersion());
        return getStringRepresentation();
    }

    private String getTimeAlive() {
        long timeMillis = System.currentTimeMillis() - this.getRexsterApplication().getStartTime();
        long timeSeconds = timeMillis / 1000;
        long timeMinutes = timeSeconds / 60;
        long timeHours = timeMinutes / 60;
        long timeDays = timeHours / 24;

        String seconds = Integer.toString((int) (timeSeconds % 60));
        String minutes = Integer.toString((int) (timeMinutes % 60));
        String hours = Integer.toString((int) timeHours % 24);
        String days = Integer.toString((int) timeDays);

        for (int i = 0; i < 2; i++) {
            if (seconds.length() < 2) {
                seconds = "0" + seconds;
            }
            if (minutes.length() < 2) {
                minutes = "0" + minutes;
            }
            if (hours.length() < 2) {
                hours = "0" + hours;
            }
        }
        return days + "[d]:" + hours + "[h]:" + minutes + "[m]:" + seconds + "[s]";
    }

    protected RexsterApplication getRexsterApplication() {
        return (RexsterApplication) this.getApplication();
    }
    */
}
