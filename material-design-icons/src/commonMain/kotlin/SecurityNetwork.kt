package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SecurityNetwork: ImageVector
    get() {
        if (_SecurityNetwork != null) {
            return _SecurityNetwork!!
        }
        _SecurityNetwork = ImageVector.Builder(
            name = "SecurityNetwork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 23f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17.34f)
                curveTo(8.07f, 16.13f, 6f, 13f, 6f, 9.67f)
                verticalLineTo(5.67f)
                lineTo(12f, 3f)
                lineTo(18f, 5.67f)
                verticalLineTo(9.67f)
                curveTo(18f, 13f, 15.93f, 16.13f, 13f, 17.34f)
                verticalLineTo(19f)
                moveTo(12f, 5f)
                lineTo(8f, 6.69f)
                verticalLineTo(10f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                moveTo(12f, 10f)
                verticalLineTo(16f)
                curveTo(13.91f, 15.53f, 16f, 13.06f, 16f, 11f)
                verticalLineTo(10f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _SecurityNetwork!!
    }

@Suppress("ObjectPropertyName")
private var _SecurityNetwork: ImageVector? = null
