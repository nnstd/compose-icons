package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MenuRightOutline: ImageVector
    get() {
        if (_MenuRightOutline != null) {
            return _MenuRightOutline!!
        }
        _MenuRightOutline = ImageVector.Builder(
            name = "MenuRightOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 6f)
                horizontalLineTo(10.5f)
                lineTo(16.5f, 12f)
                lineTo(10.5f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                moveTo(13.67f, 12f)
                lineTo(11f, 9.33f)
                verticalLineTo(14.67f)
                lineTo(13.67f, 12f)
                close()
            }
        }.build()

        return _MenuRightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MenuRightOutline: ImageVector? = null
