package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlassStange: ImageVector
    get() {
        if (_GlassStange != null) {
            return _GlassStange!!
        }
        _GlassStange = ImageVector.Builder(
            name = "GlassStange",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                moveTo(10f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _GlassStange!!
    }

@Suppress("ObjectPropertyName")
private var _GlassStange: ImageVector? = null
