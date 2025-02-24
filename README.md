# Monte Carlo Pi Estimation

This repository demonstrates how to estimate the value of π using the Monte Carlo method. The method leverages random sampling to approximate π through probabilistic techniques.

## Overview

The basic idea behind the Monte Carlo method for estimating π is to:
- Inscribe a circle of radius 1 inside a square that spans from -1 to 1 on both the x and y axes.
- The area of the circle is π (since π·1² = π) and the area of the square is 4.
- By randomly sampling points in the square and checking if they fall within the circle, we can estimate the ratio of the circle's area to the square's area.

## How It Works

1. **Setup**:  
   - Imagine a circle with radius 1 centered at the origin (0,0).
   - The square that bounds this circle extends from -1 to 1 on both the x and y axes.

2. **Random Sampling**:  
   - Generate a large number of random points within the square.
   - For each point \((x, y)\), determine if it lies inside the circle by checking if:
     ```
     x² + y² ≤ 1
     ```

3. **Estimation**:  
   - The fraction of points that fall inside the circle approximates the ratio of the circle's area to the square's area, which is \(\pi/4\).
   - Multiply this fraction by 4 to estimate π:
     ```
     π ≈ 4 × (number of points inside circle / total number of points)
     ```

4. **Accuracy**:  
   - Increasing the number of sampled points improves the accuracy of the π estimate.

