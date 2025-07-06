package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardBackspace: ImageVector
    get() {
        if (_KeyboardBackspace != null) {
            return _KeyboardBackspace!!
        }
        _KeyboardBackspace = ImageVector.Builder(
            name = "KeyboardBackspace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                horizontalLineTo(6.83f)
                lineTo(10.41f, 7.41f)
                lineTo(9f, 6f)
                lineTo(3f, 12f)
                lineTo(9f, 18f)
                lineTo(10.41f, 16.58f)
                lineTo(6.83f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _KeyboardBackspace!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardBackspace: ImageVector? = null
