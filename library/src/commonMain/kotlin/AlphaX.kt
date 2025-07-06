package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaX: ImageVector
    get() {
        if (_AlphaX != null) {
            return _AlphaX!!
        }
        _AlphaX = ImageVector.Builder(
            name = "AlphaX",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                lineTo(11f, 12f)
                lineTo(9f, 17f)
                horizontalLineTo(11f)
                lineTo(12f, 14.5f)
                lineTo(13f, 17f)
                horizontalLineTo(15f)
                lineTo(13f, 12f)
                lineTo(15f, 7f)
                horizontalLineTo(13f)
                lineTo(12f, 9.5f)
                lineTo(11f, 7f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _AlphaX!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaX: ImageVector? = null
