package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardTabReverse: ImageVector
    get() {
        if (_KeyboardTabReverse != null) {
            return _KeyboardTabReverse!!
        }
        _KeyboardTabReverse = ImageVector.Builder(
            name = "KeyboardTabReverse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                moveTo(11f, 6f)
                lineTo(5f, 12f)
                lineTo(11f, 18f)
                lineTo(12.41f, 16.58f)
                lineTo(8.83f, 13f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                horizontalLineTo(8.83f)
                lineTo(12.41f, 7.41f)
                lineTo(11f, 6f)
                close()
            }
        }.build()

        return _KeyboardTabReverse!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardTabReverse: ImageVector? = null
