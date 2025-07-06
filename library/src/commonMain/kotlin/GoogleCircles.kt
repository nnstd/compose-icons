package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleCircles: ImageVector
    get() {
        if (_GoogleCircles != null) {
            return _GoogleCircles!!
        }
        _GoogleCircles = ImageVector.Builder(
            name = "GoogleCircles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.66f, 15f)
                horizontalLineTo(17f)
                curveTo(18f, 15f, 19f, 14.8f, 19.87f, 14.46f)
                curveTo(19.17f, 18.73f, 15.47f, 22f, 11f, 22f)
                curveTo(6f, 22f, 2f, 17.97f, 2f, 13f)
                curveTo(2f, 8.53f, 5.27f, 4.83f, 9.54f, 4.13f)
                curveTo(9.2f, 5f, 9f, 6f, 9f, 7f)
                verticalLineTo(7.34f)
                curveTo(6.68f, 8.16f, 5f, 10.38f, 5f, 13f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 19f)
                curveTo(13.62f, 19f, 15.84f, 17.32f, 16.66f, 15f)
                moveTo(17f, 10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 10f)
                moveTo(17f, 1f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 7f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 13f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 7f)
                curveTo(11f, 3.68f, 13.69f, 1f, 17f, 1f)
                close()
            }
        }.build()

        return _GoogleCircles!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleCircles: ImageVector? = null
