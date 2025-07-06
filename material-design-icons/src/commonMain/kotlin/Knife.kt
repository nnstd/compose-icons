package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Knife: ImageVector
    get() {
        if (_Knife != null) {
            return _Knife!!
        }
        _Knife = ImageVector.Builder(
            name = "Knife",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.62f, 2f)
                curveTo(23.97f, 7.61f, 12.47f, 20.15f, 12.47f, 20.15f)
                lineTo(9.6f, 17.28f)
                lineTo(4.91f, 22f)
                lineTo(2.77f, 19.86f)
                lineTo(20.62f, 2f)
                close()
            }
        }.build()

        return _Knife!!
    }

@Suppress("ObjectPropertyName")
private var _Knife: ImageVector? = null
