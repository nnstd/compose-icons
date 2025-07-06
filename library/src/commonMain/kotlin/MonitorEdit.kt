package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorEdit: ImageVector
    get() {
        if (_MonitorEdit != null) {
            return _MonitorEdit!!
        }
        _MonitorEdit = ImageVector.Builder(
            name = "MonitorEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                curveTo(1.9f, 2f, 1f, 2.9f, 1f, 4f)
                verticalLineTo(16f)
                curveTo(1f, 17.11f, 1.9f, 18f, 3f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                curveTo(22.11f, 18f, 23f, 17.11f, 23f, 16f)
                verticalLineTo(4f)
                curveTo(23f, 2.9f, 22.11f, 2f, 21f, 2f)
                moveTo(21f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                moveTo(15.84f, 8.2f)
                lineTo(14.83f, 9.21f)
                lineTo(12.76f, 7.18f)
                lineTo(13.77f, 6.16f)
                curveTo(13.97f, 5.95f, 14.31f, 5.94f, 14.55f, 6.16f)
                lineTo(15.84f, 7.41f)
                curveTo(16.05f, 7.62f, 16.06f, 7.96f, 15.84f, 8.2f)
                moveTo(8f, 11.91f)
                lineTo(12.17f, 7.72f)
                lineTo(14.24f, 9.8f)
                lineTo(10.08f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(11.91f)
                close()
            }
        }.build()

        return _MonitorEdit!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorEdit: ImageVector? = null
