package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TunnelOutline: ImageVector
    get() {
        if (_TunnelOutline != null) {
            return _TunnelOutline!!
        }
        _TunnelOutline = ImageVector.Builder(
            name = "TunnelOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                moveTo(15.47f, 7.11f)
                curveTo(14.75f, 6.6f, 13.91f, 6.24f, 13f, 6.09f)
                verticalLineTo(4.07f)
                curveTo(14.46f, 4.25f, 15.79f, 4.83f, 16.9f, 5.69f)
                lineTo(15.47f, 7.11f)
                moveTo(8.53f, 7.11f)
                lineTo(7.1f, 5.69f)
                curveTo(8.21f, 4.83f, 9.54f, 4.25f, 11f, 4.07f)
                verticalLineTo(6.09f)
                curveTo(10.09f, 6.24f, 9.25f, 6.6f, 8.53f, 7.11f)
                moveTo(5.69f, 7.1f)
                lineTo(7.11f, 8.53f)
                curveTo(6.6f, 9.25f, 6.24f, 10.09f, 6.09f, 11f)
                horizontalLineTo(4.07f)
                curveTo(4.25f, 9.54f, 4.83f, 8.21f, 5.69f, 7.1f)
                moveTo(6f, 13f)
                verticalLineTo(15.5f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                moveTo(4f, 20f)
                verticalLineTo(17.5f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                moveTo(16f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                curveTo(8f, 9.79f, 9.79f, 8f, 12f, 8f)
                curveTo(14.21f, 8f, 16f, 9.79f, 16f, 12f)
                verticalLineTo(20f)
                moveTo(16.89f, 8.53f)
                lineTo(18.31f, 7.1f)
                curveTo(19.17f, 8.21f, 19.75f, 9.54f, 19.93f, 11f)
                horizontalLineTo(17.91f)
                curveTo(17.76f, 10.09f, 17.4f, 9.25f, 16.89f, 8.53f)
                moveTo(18f, 13f)
                horizontalLineTo(20f)
                verticalLineTo(15.5f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                moveTo(18f, 20f)
                verticalLineTo(17.5f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _TunnelOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TunnelOutline: ImageVector? = null
