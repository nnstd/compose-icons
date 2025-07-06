package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MenuUpOutline: ImageVector
    get() {
        if (_MenuUpOutline != null) {
            return _MenuUpOutline!!
        }
        _MenuUpOutline = ImageVector.Builder(
            name = "MenuUpOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 16f)
                verticalLineTo(14.5f)
                lineTo(12f, 8.5f)
                lineTo(6f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                moveTo(12f, 11.33f)
                lineTo(14.67f, 14f)
                horizontalLineTo(9.33f)
                lineTo(12f, 11.33f)
                close()
            }
        }.build()

        return _MenuUpOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MenuUpOutline: ImageVector? = null
