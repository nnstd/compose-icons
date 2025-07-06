package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Shuriken: ImageVector
    get() {
        if (_Shuriken != null) {
            return _Shuriken!!
        }
        _Shuriken = ImageVector.Builder(
            name = "Shuriken",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 9.5f)
                lineTo(12f, 2f)
                lineTo(9.5f, 9.5f)
                lineTo(2f, 12f)
                lineTo(9.5f, 14.5f)
                lineTo(12f, 22f)
                lineTo(14.5f, 14.5f)
                lineTo(22f, 12f)
                lineTo(14.5f, 9.5f)
                moveTo(12f, 13.7f)
                curveTo(11.1f, 13.7f, 10.3f, 13f, 10.3f, 12f)
                curveTo(10.3f, 11.1f, 11f, 10.3f, 12f, 10.3f)
                curveTo(12.9f, 10.3f, 13.7f, 11f, 13.7f, 12f)
                curveTo(13.7f, 12.9f, 12.9f, 13.7f, 12f, 13.7f)
                close()
            }
        }.build()

        return _Shuriken!!
    }

@Suppress("ObjectPropertyName")
private var _Shuriken: ImageVector? = null
