package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardTab: ImageVector
    get() {
        if (_KeyboardTab != null) {
            return _KeyboardTab!!
        }
        _KeyboardTab = ImageVector.Builder(
            name = "KeyboardTab",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 18f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                moveTo(11.59f, 7.41f)
                lineTo(15.17f, 11f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                horizontalLineTo(15.17f)
                lineTo(11.59f, 16.58f)
                lineTo(13f, 18f)
                lineTo(19f, 12f)
                lineTo(13f, 6f)
                lineTo(11.59f, 7.41f)
                close()
            }
        }.build()

        return _KeyboardTab!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardTab: ImageVector? = null
