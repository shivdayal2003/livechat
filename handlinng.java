@PostMapping("/upload")
public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) {
    // Save file locally or to a cloud service
    String fileUrl = fileService.save(file);
    return ResponseEntity.ok(fileUrl);
}
