package com.gcj.dao;

import com.gcj.source.*;

import java.util.List;

/**
 * Created by gaochuanjun on 14-6-12.
 */
public abstract class DBAbstract {

    public abstract List<IostatMonitorEntity> select_iostat_monitor(String ip, String begin, String end, String diskname);

    public abstract List<ServerMonitorEntity> select_server_monitor(String ip, String begin, String end, String processId);

    public abstract List<TrafficMonitorEntity> select_traffic_monitor(String ip, String begin, String end);

    public abstract List<NetstatMonitorEntity> select_netstat_monitor(String ip, String begin, String end, String port);

    public abstract List<ComputeNodeStatusEntity> select_compute_node_status(String ip, String begin, String end);
}
