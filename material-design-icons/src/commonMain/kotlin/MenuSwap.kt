package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MenuSwap: ImageVector
    get() {
        if (_MenuSwap != null) {
            return _MenuSwap!!
        }
        _MenuSwap = ImageVector.Builder(
            name = "MenuSwap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                lineTo(7f, 11f)
                horizontalLineTo(17f)
                lineTo(12f, 6f)
                moveTo(7f, 13f)
                lineTo(12f, 18f)
                lineTo(17f, 13f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _MenuSwap!!
    }

@Suppress("ObjectPropertyName")
private var _MenuSwap: ImageVector? = null
