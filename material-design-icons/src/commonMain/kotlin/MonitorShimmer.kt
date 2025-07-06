package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorShimmer: ImageVector
    get() {
        if (_MonitorShimmer != null) {
            return _MonitorShimmer!!
        }
        _MonitorShimmer = ImageVector.Builder(
            name = "MonitorShimmer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(21f)
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                curveTo(1.89f, 2f, 1f, 2.89f, 1f, 4f)
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
                curveTo(23f, 2.89f, 22.1f, 2f, 21f, 2f)
                moveTo(15f, 5.5f)
                lineTo(14.38f, 6.87f)
                lineTo(13f, 7.5f)
                lineTo(14.38f, 8.13f)
                lineTo(15f, 9.5f)
                lineTo(15.63f, 8.13f)
                lineTo(17f, 7.5f)
                lineTo(15.63f, 6.87f)
                lineTo(15f, 5.5f)
                moveTo(10.5f, 7.5f)
                lineTo(9.41f, 9.91f)
                lineTo(7f, 11f)
                lineTo(9.41f, 12.09f)
                lineTo(10.5f, 14.5f)
                lineTo(11.6f, 12.09f)
                lineTo(14f, 11f)
                lineTo(11.6f, 9.91f)
                lineTo(10.5f, 7.5f)
            }
        }.build()

        return _MonitorShimmer!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorShimmer: ImageVector? = null
