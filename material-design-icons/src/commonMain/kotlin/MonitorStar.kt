package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorStar: ImageVector
    get() {
        if (_MonitorStar != null) {
            return _MonitorStar!!
        }
        _MonitorStar = ImageVector.Builder(
            name = "MonitorStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                moveTo(21f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 18f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                curveTo(1.89f, 18f, 1f, 17.1f, 1f, 16f)
                verticalLineTo(4f)
                curveTo(1f, 2.89f, 1.89f, 2f, 3f, 2f)
                horizontalLineTo(21f)
                moveTo(12.97f, 9f)
                horizontalLineTo(16f)
                lineTo(13.53f, 10.76f)
                lineTo(14.47f, 13.67f)
                lineTo(12f, 11.87f)
                lineTo(9.53f, 13.67f)
                lineTo(10.47f, 10.76f)
                lineTo(8f, 9f)
                horizontalLineTo(11.03f)
                lineTo(12f, 6f)
                lineTo(12.97f, 9f)
                close()
            }
        }.build()

        return _MonitorStar!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorStar: ImageVector? = null
