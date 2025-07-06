package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaZ: ImageVector
    get() {
        if (_AlphaZ != null) {
            return _AlphaZ!!
        }
        _AlphaZ = ImageVector.Builder(
            name = "AlphaZ",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                lineTo(9f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                lineTo(15f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _AlphaZ!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaZ: ImageVector? = null
