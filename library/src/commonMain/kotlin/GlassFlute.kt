package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlassFlute: ImageVector
    get() {
        if (_GlassFlute != null) {
            return _GlassFlute!!
        }
        _GlassFlute = ImageVector.Builder(
            name = "GlassFlute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2f)
                horizontalLineTo(16f)
                curveTo(15.67f, 5f, 15.33f, 8f, 14.75f, 9.83f)
                curveTo(14.17f, 11.67f, 13.33f, 12.33f, 12.92f, 14.08f)
                curveTo(12.5f, 15.83f, 12.5f, 18.67f, 13.08f, 20f)
                curveTo(13.67f, 21.33f, 14.83f, 21.17f, 15.42f, 21.25f)
                curveTo(16f, 21.33f, 16f, 21.67f, 16f, 22f)
                horizontalLineTo(8f)
                curveTo(8f, 21.67f, 8f, 21.33f, 8.58f, 21.25f)
                curveTo(9.17f, 21.17f, 10.33f, 21.33f, 10.92f, 20f)
                curveTo(11.5f, 18.67f, 11.5f, 15.83f, 11.08f, 14.08f)
                curveTo(10.67f, 12.33f, 9.83f, 11.67f, 9.25f, 9.83f)
                curveTo(8.67f, 8f, 8.33f, 5f, 8f, 2f)
                moveTo(10f, 4f)
                curveTo(10.07f, 5.03f, 10.15f, 6.07f, 10.24f, 7f)
                horizontalLineTo(13.76f)
                curveTo(13.85f, 6.07f, 13.93f, 5.03f, 14f, 4f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _GlassFlute!!
    }

@Suppress("ObjectPropertyName")
private var _GlassFlute: ImageVector? = null
