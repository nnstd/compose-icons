package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorAccount: ImageVector
    get() {
        if (_MonitorAccount != null) {
            return _MonitorAccount!!
        }
        _MonitorAccount = ImageVector.Builder(
            name = "MonitorAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                curveTo(22.05f, 2f, 22.92f, 2.81f, 23f, 3.85f)
                lineTo(23f, 4f)
                verticalLineTo(16f)
                curveTo(23f, 17.05f, 22.18f, 17.92f, 21.15f, 18f)
                lineTo(21f, 18f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                curveTo(1.95f, 18f, 1.08f, 17.18f, 1f, 16.15f)
                lineTo(1f, 16f)
                verticalLineTo(4f)
                curveTo(1f, 2.94f, 1.81f, 2.08f, 2.85f, 2f)
                lineTo(3f, 2f)
                horizontalLineTo(21f)
                moveTo(21f, 4f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                moveTo(12f, 11f)
                curveTo(14.21f, 11f, 16f, 11.9f, 16f, 13f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                curveTo(8f, 11.9f, 9.79f, 11f, 12f, 11f)
                moveTo(12f, 6f)
                curveTo(13.11f, 6f, 14f, 6.9f, 14f, 8f)
                reflectiveCurveTo(13.11f, 10f, 12f, 10f)
                reflectiveCurveTo(10f, 9.11f, 10f, 8f)
                reflectiveCurveTo(10.9f, 6f, 12f, 6f)
                close()
            }
        }.build()

        return _MonitorAccount!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorAccount: ImageVector? = null
