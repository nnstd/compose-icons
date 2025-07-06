package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorEye: ImageVector
    get() {
        if (_MonitorEye != null) {
            return _MonitorEye!!
        }
        _MonitorEye = ImageVector.Builder(
            name = "MonitorEye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                moveTo(3f, 2f)
                horizontalLineTo(21f)
                curveTo(22.1f, 2f, 23f, 2.89f, 23f, 4f)
                verticalLineTo(16f)
                curveTo(23f, 16.53f, 22.79f, 17.04f, 22.41f, 17.41f)
                curveTo(22.04f, 17.79f, 21.53f, 18f, 21f, 18f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                curveTo(2.47f, 18f, 1.96f, 17.79f, 1.59f, 17.41f)
                curveTo(1.21f, 17.04f, 1f, 16.53f, 1f, 16f)
                verticalLineTo(4f)
                curveTo(1f, 2.89f, 1.89f, 2f, 3f, 2f)
                moveTo(10.84f, 8.93f)
                curveTo(11.15f, 8.63f, 11.57f, 8.45f, 12f, 8.45f)
                curveTo(12.43f, 8.46f, 12.85f, 8.63f, 13.16f, 8.94f)
                curveTo(13.46f, 9.24f, 13.64f, 9.66f, 13.64f, 10.09f)
                curveTo(13.64f, 10.53f, 13.46f, 10.94f, 13.16f, 11.25f)
                curveTo(12.85f, 11.56f, 12.43f, 11.73f, 12f, 11.73f)
                curveTo(11.57f, 11.73f, 11.15f, 11.55f, 10.84f, 11.25f)
                curveTo(10.54f, 10.94f, 10.36f, 10.53f, 10.36f, 10.09f)
                curveTo(10.36f, 9.66f, 10.54f, 9.24f, 10.84f, 8.93f)
                moveTo(10.07f, 12f)
                curveTo(10.58f, 12.53f, 11.28f, 12.82f, 12f, 12.82f)
                curveTo(12.72f, 12.82f, 13.42f, 12.53f, 13.93f, 12f)
                curveTo(14.44f, 11.5f, 14.73f, 10.81f, 14.73f, 10.09f)
                curveTo(14.73f, 9.37f, 14.44f, 8.67f, 13.93f, 8.16f)
                curveTo(13.42f, 7.65f, 12.72f, 7.36f, 12f, 7.36f)
                curveTo(11.28f, 7.36f, 10.58f, 7.65f, 10.07f, 8.16f)
                curveTo(9.56f, 8.67f, 9.27f, 9.37f, 9.27f, 10.09f)
                curveTo(9.27f, 10.81f, 9.56f, 11.5f, 10.07f, 12f)
                moveTo(6f, 10.09f)
                curveTo(6.94f, 7.7f, 9.27f, 6f, 12f, 6f)
                curveTo(14.73f, 6f, 17.06f, 7.7f, 18f, 10.09f)
                curveTo(17.06f, 12.5f, 14.73f, 14.18f, 12f, 14.18f)
                curveTo(9.27f, 14.18f, 6.94f, 12.5f, 6f, 10.09f)
                close()
            }
        }.build()

        return _MonitorEye!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorEye: ImageVector? = null
