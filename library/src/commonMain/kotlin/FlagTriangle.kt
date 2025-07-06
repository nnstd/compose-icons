package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagTriangle: ImageVector
    get() {
        if (_FlagTriangle != null) {
            return _FlagTriangle!!
        }
        _FlagTriangle = ImageVector.Builder(
            name = "FlagTriangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                moveTo(19f, 9f)
                lineTo(11f, 14.6f)
                verticalLineTo(3.4f)
                lineTo(19f, 9f)
                close()
            }
        }.build()

        return _FlagTriangle!!
    }

@Suppress("ObjectPropertyName")
private var _FlagTriangle: ImageVector? = null
