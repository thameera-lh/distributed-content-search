package com.distributed.p2pFileTransfer;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.concurrent.Future;

class QueryDispatcher {
    private final AbstractFileTransferService fileTransferService;
//    private final QueryQueue;

    QueryDispatcher(AbstractFileTransferService fileTransferService) {
        this.fileTransferService = fileTransferService;
    }

    /**
     * Used to dispatch a query to a single node
     * @param query query to dispatch
     * @return result of query
     */
    Future<QueryResult> dispatchOne(Query query){
        throw new NotImplementedException();
    }

    /**
     * Dispatch all the queries given and get the results for all of them
     * @param queries queries to dispatch
     * @return results of all the queries
     */
    List<Future<QueryResult>> dispatchAll(List<Query> queries){
        throw new NotImplementedException();
    }

    /**
     * Used to dispatch one of a given set of queries. May dispatch all or a selected number. Use when dispatching
     * any one of the given queries is sufficient.
     * @param queries queries to dispatch
     * @return result of any successful queries if any, else failure
     */
    Future<QueryResult> dispatchAny(List<Query> queries){
        throw new NotImplementedException();
    }

}