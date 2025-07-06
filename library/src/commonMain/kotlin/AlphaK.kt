package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaK: ImageVector
    get() {
        if (_AlphaK != null) {
            return _AlphaK!!
        }
        _AlphaK = ImageVector.Builder(
            name = "AlphaK",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(13.67f)
                lineTo(13f, 17f)
                horizontalLineTo(15f)
                lineTo(12f, 12f)
                lineTo(15f, 7f)
                horizontalLineTo(13f)
                lineTo(11f, 10.33f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _AlphaK!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaK: ImageVector? = null
