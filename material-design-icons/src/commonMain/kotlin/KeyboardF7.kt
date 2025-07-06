package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardF7: ImageVector
    get() {
        if (_KeyboardF7 != null) {
            return _KeyboardF7!!
        }
        _KeyboardF7 = ImageVector.Builder(
            name = "KeyboardF7",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                moveTo(15f, 17f)
                horizontalLineTo(13f)
                lineTo(17f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                lineTo(15f, 17f)
                close()
            }
        }.build()

        return _KeyboardF7!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardF7: ImageVector? = null
