package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorVertical: ImageVector
    get() {
        if (_MonitorVertical != null) {
            return _MonitorVertical!!
        }
        _MonitorVertical = ImageVector.Builder(
            name = "MonitorVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2f)
                horizontalLineTo(8f)
                curveTo(6.89f, 2f, 6f, 2.89f, 6f, 4f)
                verticalLineTo(16f)
                curveTo(6f, 17.11f, 6.9f, 18f, 8f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                curveTo(17.11f, 18f, 18f, 17.11f, 18f, 16f)
                verticalLineTo(4f)
                curveTo(18f, 2.89f, 17.1f, 2f, 16f, 2f)
                moveTo(16f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _MonitorVertical!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorVertical: ImageVector? = null
