package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MenuLeftOutline: ImageVector
    get() {
        if (_MenuLeftOutline != null) {
            return _MenuLeftOutline!!
        }
        _MenuLeftOutline = ImageVector.Builder(
            name = "MenuLeftOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 18f)
                horizontalLineTo(13.5f)
                lineTo(7.5f, 12f)
                lineTo(13.5f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                moveTo(10.33f, 12f)
                lineTo(13f, 14.67f)
                verticalLineTo(9.33f)
                lineTo(10.33f, 12f)
                close()
            }
        }.build()

        return _MenuLeftOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MenuLeftOutline: ImageVector? = null
