package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VanishQuarter: ImageVector
    get() {
        if (_VanishQuarter != null) {
            return _VanishQuarter!!
        }
        _VanishQuarter = ImageVector.Builder(
            name = "VanishQuarter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                moveTo(4.9f, 6.3f)
                lineTo(6.3f, 4.9f)
                lineTo(9.1f, 7.7f)
                lineTo(7.8f, 9.2f)
                lineTo(4.9f, 6.3f)
                moveTo(8f, 13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
            }
        }.build()

        return _VanishQuarter!!
    }

@Suppress("ObjectPropertyName")
private var _VanishQuarter: ImageVector? = null
