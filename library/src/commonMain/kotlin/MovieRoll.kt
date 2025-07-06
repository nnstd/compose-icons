package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieRoll: ImageVector
    get() {
        if (_MovieRoll != null) {
            return _MovieRoll!!
        }
        _MovieRoll = ImageVector.Builder(
            name = "MovieRoll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 4f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                moveTo(4.4f, 9.53f)
                curveTo(3.97f, 10.84f, 4.69f, 12.25f, 6f, 12.68f)
                curveTo(7.32f, 13.1f, 8.73f, 12.39f, 9.15f, 11.07f)
                curveTo(9.58f, 9.76f, 8.86f, 8.35f, 7.55f, 7.92f)
                curveTo(6.24f, 7.5f, 4.82f, 8.21f, 4.4f, 9.53f)
                moveTo(19.61f, 9.5f)
                curveTo(19.18f, 8.21f, 17.77f, 7.5f, 16.46f, 7.92f)
                curveTo(15.14f, 8.34f, 14.42f, 9.75f, 14.85f, 11.07f)
                curveTo(15.28f, 12.38f, 16.69f, 13.1f, 18f, 12.67f)
                curveTo(19.31f, 12.25f, 20.03f, 10.83f, 19.61f, 9.5f)
                moveTo(7.31f, 18.46f)
                curveTo(8.42f, 19.28f, 10f, 19.03f, 10.8f, 17.91f)
                curveTo(11.61f, 16.79f, 11.36f, 15.23f, 10.24f, 14.42f)
                curveTo(9.13f, 13.61f, 7.56f, 13.86f, 6.75f, 14.97f)
                curveTo(5.94f, 16.09f, 6.19f, 17.65f, 7.31f, 18.46f)
                moveTo(16.7f, 18.46f)
                curveTo(17.82f, 17.65f, 18.07f, 16.09f, 17.26f, 14.97f)
                curveTo(16.45f, 13.85f, 14.88f, 13.6f, 13.77f, 14.42f)
                curveTo(12.65f, 15.23f, 12.4f, 16.79f, 13.21f, 17.91f)
                curveTo(14f, 19.03f, 15.59f, 19.27f, 16.7f, 18.46f)
                moveTo(12f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10.5f)
                close()
            }
        }.build()

        return _MovieRoll!!
    }

@Suppress("ObjectPropertyName")
private var _MovieRoll: ImageVector? = null
