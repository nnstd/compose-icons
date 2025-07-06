package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrentDc: ImageVector
    get() {
        if (_CurrentDc != null) {
            return _CurrentDc!!
        }
        _CurrentDc = ImageVector.Builder(
            name = "CurrentDc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                moveTo(2f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                moveTo(9f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                moveTo(17f, 13f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _CurrentDc!!
    }

@Suppress("ObjectPropertyName")
private var _CurrentDc: ImageVector? = null
