package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaH: ImageVector
    get() {
        if (_AlphaH != null) {
            return _AlphaH!!
        }
        _AlphaH = ImageVector.Builder(
            name = "AlphaH",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _AlphaH!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaH: ImageVector? = null
