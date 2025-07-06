package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorScreenshot: ImageVector
    get() {
        if (_MonitorScreenshot != null) {
            return _MonitorScreenshot!!
        }
        _MonitorScreenshot = ImageVector.Builder(
            name = "MonitorScreenshot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 6f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                moveTo(19f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                moveTo(21f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(21f)
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                curveTo(1.89f, 2f, 1f, 2.89f, 1f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 16f)
                verticalLineTo(4f)
                curveTo(23f, 2.89f, 22.1f, 2f, 21f, 2f)
            }
        }.build()

        return _MonitorScreenshot!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorScreenshot: ImageVector? = null
