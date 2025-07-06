package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorShare: ImageVector
    get() {
        if (_MonitorShare != null) {
            return _MonitorShare!!
        }
        _MonitorShare = ImageVector.Builder(
            name = "MonitorShare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 4f)
                verticalLineTo(16f)
                curveTo(23f, 17.11f, 22.11f, 18f, 21f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                curveTo(1.9f, 18f, 1f, 17.11f, 1f, 16f)
                verticalLineTo(4f)
                curveTo(1f, 2.89f, 1.89f, 2f, 3f, 2f)
                horizontalLineTo(21f)
                curveTo(22.1f, 2f, 23f, 2.89f, 23f, 4f)
                moveTo(13f, 13f)
                horizontalLineTo(16f)
                lineTo(12f, 9f)
                lineTo(8f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _MonitorShare!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorShare: ImageVector? = null
