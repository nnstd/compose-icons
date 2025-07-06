package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorMultiple: ImageVector
    get() {
        if (_MonitorMultiple != null) {
            return _MonitorMultiple!!
        }
        _MonitorMultiple = ImageVector.Builder(
            name = "MonitorMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 17f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                moveTo(22f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 7f)
                verticalLineTo(17f)
                curveTo(24f, 18.11f, 23.1f, 19f, 22f, 19f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                curveTo(4.89f, 19f, 4f, 18.11f, 4f, 17f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 5f)
                horizontalLineTo(22f)
                moveTo(2f, 3f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 1f)
                horizontalLineTo(20f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _MonitorMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorMultiple: ImageVector? = null
