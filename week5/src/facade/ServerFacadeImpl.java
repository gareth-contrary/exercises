package facade;

public class ServerFacadeImpl implements ServerFacade {

	private ScheduleServer scheduleServer;
	
	public ServerFacadeImpl(ScheduleServer scheduleServer) {
		this.scheduleServer = scheduleServer;
	}
	
	@Override
	public void startServer() {
		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializeContext();
		scheduleServer.initializeListeners();
		scheduleServer.createSystemObjects();
		System.out.println("Start working......");
		System.out.println("After work done.........");
	}

	@Override
	public void stopServer() {
		scheduleServer.releaseProcesses();
		scheduleServer.destory();
		scheduleServer.destroySystemObjects();
		scheduleServer.destoryListeners();
		scheduleServer.destoryContext();
		scheduleServer.shutdown();
	}

}
