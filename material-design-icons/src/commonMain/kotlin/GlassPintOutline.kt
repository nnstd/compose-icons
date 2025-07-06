package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlassPintOutline: ImageVector
    get() {
        if (_GlassPintOutline != null) {
            return _GlassPintOutline!!
        }
        _GlassPintOutline = ImageVector.Builder(
            name = "GlassPintOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                lineTo(6f, 22f)
                horizontalLineTo(17f)
                lineTo(19f, 2f)
                horizontalLineTo(4f)
                moveTo(6.2f, 4f)
                horizontalLineTo(16.8f)
                lineTo(15.2f, 20f)
                horizontalLineTo(7.8f)
                lineTo(6.2f, 4f)
                close()
            }
        }.build()

        return _GlassPintOutline!!
    }

@Suppress("ObjectPropertyName")
private var _GlassPintOutline: ImageVector? = null
