package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaY: ImageVector
    get() {
        if (_AlphaY != null) {
            return _AlphaY!!
        }
        _AlphaY = ImageVector.Builder(
            name = "AlphaY",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                lineTo(11f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                lineTo(15f, 7f)
                horizontalLineTo(13f)
                lineTo(12f, 10f)
                lineTo(11f, 7f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _AlphaY!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaY: ImageVector? = null
