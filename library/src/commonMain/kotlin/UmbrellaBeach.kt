package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UmbrellaBeach: ImageVector
    get() {
        if (_UmbrellaBeach != null) {
            return _UmbrellaBeach!!
        }
        _UmbrellaBeach = ImageVector.Builder(
            name = "UmbrellaBeach",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.13f, 14.56f)
                lineTo(14.56f, 13.13f)
                lineTo(21f, 19.57f)
                lineTo(19.57f, 21f)
                lineTo(13.13f, 14.56f)
                moveTo(17.42f, 8.83f)
                lineTo(20.28f, 5.97f)
                curveTo(16.33f, 2f, 9.93f, 2f, 6f, 5.95f)
                curveTo(9.91f, 4.65f, 14.29f, 5.7f, 17.42f, 8.83f)
                moveTo(5.95f, 6f)
                curveTo(2f, 9.93f, 2f, 16.33f, 5.97f, 20.28f)
                lineTo(8.83f, 17.42f)
                curveTo(5.7f, 14.29f, 4.65f, 9.91f, 5.95f, 6f)
                moveTo(5.97f, 5.96f)
                lineTo(5.96f, 5.97f)
                curveTo(5.58f, 9f, 7.13f, 12.85f, 10.26f, 16f)
                lineTo(16f, 10.26f)
                curveTo(12.86f, 7.13f, 9f, 5.58f, 5.97f, 5.96f)
                close()
            }
        }.build()

        return _UmbrellaBeach!!
    }

@Suppress("ObjectPropertyName")
private var _UmbrellaBeach: ImageVector? = null
