import matplotlib.pyplot as plt

# Data (grouped by Java version)
run_times = {
    "OpenJDK 8": [4041, 4112, 4119, 4142],
    "OpenJDK 11": [4334, 4298, 4284, 4217],
    "OpenJDK 17": [4352, 4316, 4343, 4353],
    "OpenJDK 21": [4021, 3964, 3951, 3984],
    "GraalVM 17": [3995, 3994, 4022, 4033],
    "GraalVM 21": [3993, 4036, 4017, 3948],
    "GraalVM 23": [4210, 4032, 3976, 4001],
    "GraalVM 21 (ParallelGC)": [3592, 3561, 3630, 3606],
    "GraalVM 21 (ParallelGC, 4GB)": [3735, 3740, 3749, 3758]
}

# Extract the Java versions and corresponding run times
java_versions = list(run_times.keys())
times = list(run_times.values())

# Create a box plot
plt.figure(figsize=(10, 10))
plt.boxplot(times, labels=java_versions)

# Add labels and title
plt.xlabel('JVM Version')
plt.ylabel('Time (s)')
plt.title('Benchmark Run Times by JVM Version')
plt.xticks(rotation=20)

# Show plot
plt.grid(True, linestyle='--', color='lightgray', alpha=0.5)  # Adjust color and transparency
plt.show()
