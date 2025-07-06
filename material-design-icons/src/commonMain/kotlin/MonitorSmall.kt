package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorSmall: ImageVector
    get() {
        if (_MonitorSmall != null) {
            return _MonitorSmall!!
        }
        _MonitorSmall = ImageVector.Builder(
            name = "MonitorSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                horizontalLineTo(5f)
                curveTo(3.89f, 2f, 3f, 2.89f, 3f, 4f)
                verticalLineTo(16f)
                curveTo(3f, 17.11f, 3.9f, 18f, 5f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                curveTo(20.11f, 18f, 21f, 17.11f, 21f, 16f)
                verticalLineTo(4f)
                curveTo(21f, 2.89f, 20.1f, 2f, 19f, 2f)
                moveTo(19f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _MonitorSmall!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorSmall: ImageVector? = null
