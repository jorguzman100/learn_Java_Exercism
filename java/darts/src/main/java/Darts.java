class Darts {
    int score(double xOfDart, double yOfDart) {
        int score = 0;
        // Calculate the radius at the point (hypotenuse)
        double radius = Math.sqrt(xOfDart*xOfDart + yOfDart*yOfDart);

        // Identify the circle
        // Get the points
        if (radius > 10) score = 0;
        else if (radius > 5) score = 1 ;
        else if (radius > 1) score = 5 ;
        else score = 10;
        return score;
    }
}
