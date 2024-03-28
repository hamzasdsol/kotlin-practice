package clean_architecture.mistakes

/**
 * Don't do this
 * Because as the app grows you'd be stuck with so many classes for multiple features.
 * This won't scale well.
 */

// app > data
// app > domain
// app > presentation

/**
 * Instead do this
 * Have these layers in every feature separately.
 * With this structure, the data, domain and presentation
 * would only have classes related to this particular feature.
 */

// app > feature1 > data
// app > feature1 > domain
// app > feature1 > presentation

// app > feature2 > data
// app > feature2 > domain
// app > feature2 > presentation
