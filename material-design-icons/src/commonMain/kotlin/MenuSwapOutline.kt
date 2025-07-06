package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MenuSwapOutline: ImageVector
    get() {
        if (_MenuSwapOutline != null) {
            return _MenuSwapOutline!!
        }
        _MenuSwapOutline = ImageVector.Builder(
            name = "MenuSwapOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3.5f)
                lineTo(6f, 9.5f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(9.5f)
                lineTo(12f, 3.5f)
                moveTo(12f, 6.33f)
                lineTo(14.67f, 9f)
                horizontalLineTo(9.33f)
                lineTo(12f, 6.33f)
                moveTo(6f, 13f)
                verticalLineTo(14.5f)
                lineTo(12f, 20.5f)
                lineTo(18f, 14.5f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                moveTo(9.33f, 15f)
                horizontalLineTo(14.67f)
                lineTo(12f, 17.67f)
                lineTo(9.33f, 15f)
                close()
            }
        }.build()

        return _MenuSwapOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MenuSwapOutline: ImageVector? = null
