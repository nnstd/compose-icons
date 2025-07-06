package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChartLineVariant: ImageVector
    get() {
        if (_ChartLineVariant != null) {
            return _ChartLineVariant!!
        }
        _ChartLineVariant = ImageVector.Builder(
            name = "ChartLineVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 18.5f)
                lineTo(9.5f, 12.5f)
                lineTo(13.5f, 16.5f)
                lineTo(22f, 6.92f)
                lineTo(20.59f, 5.5f)
                lineTo(13.5f, 13.5f)
                lineTo(9.5f, 9.5f)
                lineTo(2f, 17f)
                lineTo(3.5f, 18.5f)
                close()
            }
        }.build()

        return _ChartLineVariant!!
    }

@Suppress("ObjectPropertyName")
private var _ChartLineVariant: ImageVector? = null
