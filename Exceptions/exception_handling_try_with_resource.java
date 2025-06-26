public ReturnType methodName(...) {
    try (ResourceType resource = new ResourceType(...)) {
        // Use the resource
    } catch (ExceptionType e) {
        // Handle exceptions
    }
    // Resource is auto-closed here
}
