module com.consumer {
	requires com.service.provider;
	requires transitive java.logging;
}