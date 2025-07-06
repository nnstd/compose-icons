package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Screwdriver: ImageVector
    get() {
        if (_Screwdriver != null) {
            return _Screwdriver!!
        }
        _Screwdriver = ImageVector.Builder(
            name = "Screwdriver",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 1.83f)
                curveTo(17.5f, 1.83f, 17f, 2f, 16.59f, 2.41f)
                curveTo(13.72f, 5.28f, 8f, 11f, 8f, 11f)
                lineTo(9.5f, 12.5f)
                lineTo(6f, 16f)
                horizontalLineTo(4f)
                lineTo(2f, 20f)
                lineTo(4f, 22f)
                lineTo(8f, 20f)
                verticalLineTo(18f)
                lineTo(11.5f, 14.5f)
                lineTo(13f, 16f)
                curveTo(13f, 16f, 18.72f, 10.28f, 21.59f, 7.41f)
                curveTo(22.21f, 6.5f, 22.37f, 5.37f, 21.59f, 4.59f)
                lineTo(19.41f, 2.41f)
                curveTo(19f, 2f, 18.5f, 1.83f, 18f, 1.83f)
                moveTo(18f, 4f)
                lineTo(20f, 6f)
                lineTo(13f, 13f)
                lineTo(11f, 11f)
                lineTo(18f, 4f)
                close()
            }
        }.build()

        return _Screwdriver!!
    }

@Suppress("ObjectPropertyName")
private var _Screwdriver: ImageVector? = null
