package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FootPrint: ImageVector
    get() {
        if (_FootPrint != null) {
            return _FootPrint!!
        }
        _FootPrint = ImageVector.Builder(
            name = "FootPrint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 2f)
                moveTo(12.04f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10.54f, 4.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.04f, 3f)
                moveTo(9.09f, 4.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.09f, 5.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.09f, 4.5f)
                moveTo(7.04f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.04f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.04f, 6f)
                moveTo(14.53f, 12f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 9.24f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.39f, 7f)
                horizontalLineTo(11.91f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.12f, 11.4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.23f, 12.8f)
                arcTo(6.8f, 6.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.91f, 15.76f)
                arcTo(6.89f, 6.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.22f, 18.55f)
                arcTo(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.3f, 20.31f)
                arcTo(3.62f, 3.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.19f, 21.91f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.36f, 16.63f)
                arcTo(2.82f, 2.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.91f, 15f)
                reflectiveCurveTo(11.68f, 12f, 14.53f, 12f)
                close()
            }
        }.build()

        return _FootPrint!!
    }

@Suppress("ObjectPropertyName")
private var _FootPrint: ImageVector? = null
