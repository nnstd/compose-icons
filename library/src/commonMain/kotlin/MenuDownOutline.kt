package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MenuDownOutline: ImageVector
    get() {
        if (_MenuDownOutline != null) {
            return _MenuDownOutline!!
        }
        _MenuDownOutline = ImageVector.Builder(
            name = "MenuDownOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 9f)
                verticalLineTo(10.5f)
                lineTo(12f, 16.5f)
                lineTo(6f, 10.5f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                moveTo(12f, 13.67f)
                lineTo(14.67f, 11f)
                horizontalLineTo(9.33f)
                lineTo(12f, 13.67f)
                close()
            }
        }.build()

        return _MenuDownOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MenuDownOutline: ImageVector? = null
