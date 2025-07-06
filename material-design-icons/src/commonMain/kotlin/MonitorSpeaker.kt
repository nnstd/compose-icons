package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorSpeaker: ImageVector
    get() {
        if (_MonitorSpeaker != null) {
            return _MonitorSpeaker!!
        }
        _MonitorSpeaker = ImageVector.Builder(
            name = "MonitorSpeaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 2f)
                curveTo(1.9f, 2f, 1f, 2.9f, 1f, 4f)
                verticalLineTo(16f)
                curveTo(1f, 17.1f, 1.9f, 18f, 3f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                verticalLineTo(4f)
                curveTo(23f, 2.9f, 22.1f, 2f, 21f, 2f)
                horizontalLineTo(3f)
                moveTo(21f, 9f)
                horizontalLineTo(16f)
                curveTo(14.9f, 9f, 14f, 9.9f, 14f, 11f)
                verticalLineTo(20f)
                curveTo(14f, 21.1f, 14.9f, 22f, 16f, 22f)
                horizontalLineTo(21f)
                curveTo(22.1f, 22f, 23f, 21.1f, 23f, 20f)
                verticalLineTo(11f)
                curveTo(23f, 9.9f, 22.1f, 9f, 21f, 9f)
                moveTo(18.5f, 10.5f)
                curveTo(19.3f, 10.5f, 20f, 11.2f, 20f, 12f)
                reflectiveCurveTo(19.3f, 13.5f, 18.5f, 13.5f)
                reflectiveCurveTo(17f, 12.8f, 17f, 12f)
                reflectiveCurveTo(17.7f, 10.5f, 18.5f, 10.5f)
                moveTo(18.5f, 20.5f)
                curveTo(16.8f, 20.5f, 15.5f, 19.2f, 15.5f, 17.5f)
                curveTo(15.5f, 15.9f, 16.8f, 14.5f, 18.4f, 14.5f)
                horizontalLineTo(18.5f)
                curveTo(20.2f, 14.5f, 21.5f, 15.8f, 21.5f, 17.5f)
                reflectiveCurveTo(20.2f, 20.5f, 18.5f, 20.5f)
                moveTo(18.5f, 16f)
                curveTo(17.7f, 16f, 17f, 16.7f, 17f, 17.5f)
                reflectiveCurveTo(17.7f, 19f, 18.5f, 19f)
                reflectiveCurveTo(20f, 18.3f, 20f, 17.5f)
                reflectiveCurveTo(19.3f, 16f, 18.5f, 16f)
                close()
            }
        }.build()

        return _MonitorSpeaker!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorSpeaker: ImageVector? = null
