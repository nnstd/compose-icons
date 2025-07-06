package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlassFragile: ImageVector
    get() {
        if (_GlassFragile != null) {
            return _GlassFragile!!
        }
        _GlassFragile = ImageVector.Builder(
            name = "GlassFragile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(13.97f)
                curveTo(8.19f, 13.7f, 6f, 11.34f, 6f, 8.46f)
                curveTo(6f, 8.15f, 6.03f, 7.85f, 6.08f, 7.55f)
                lineTo(7f, 2f)
                horizontalLineTo(13.54f)
                lineTo(12.33f, 4.41f)
                lineTo(11.79f, 5.5f)
                horizontalLineTo(13.79f)
                lineTo(12.33f, 8.41f)
                lineTo(11.79f, 9.5f)
                horizontalLineTo(14f)
                lineTo(13f, 12.75f)
                lineTo(15.67f, 9.09f)
                lineTo(16.46f, 8f)
                horizontalLineTo(14.21f)
                lineTo(15.67f, 5.09f)
                lineTo(16.21f, 4f)
                horizontalLineTo(14.21f)
                lineTo(15.21f, 2f)
                horizontalLineTo(17f)
                lineTo(17.93f, 7.55f)
                curveTo(18f, 7.85f, 18f, 8.15f, 18f, 8.46f)
                curveTo(18f, 11.34f, 15.81f, 13.7f, 13f, 13.97f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _GlassFragile!!
    }

@Suppress("ObjectPropertyName")
private var _GlassFragile: ImageVector? = null
