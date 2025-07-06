package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Beer: ImageVector
    get() {
        if (_Beer != null) {
            return _Beer!!
        }
        _Beer = ImageVector.Builder(
            name = "Beer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                horizontalLineTo(19f)
                lineTo(17f, 22f)
                horizontalLineTo(6f)
                lineTo(4f, 2f)
                moveTo(6.2f, 4f)
                lineTo(7.8f, 20f)
                horizontalLineTo(8.8f)
                lineTo(7.43f, 6.34f)
                curveTo(8.5f, 6f, 9.89f, 5.89f, 11f, 7f)
                curveTo(12.56f, 8.56f, 15.33f, 7.69f, 16.5f, 7.23f)
                lineTo(16.8f, 4f)
                horizontalLineTo(6.2f)
                close()
            }
        }.build()

        return _Beer!!
    }

@Suppress("ObjectPropertyName")
private var _Beer: ImageVector? = null
