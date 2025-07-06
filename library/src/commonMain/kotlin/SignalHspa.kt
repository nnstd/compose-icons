package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignalHspa: ImageVector
    get() {
        if (_SignalHspa != null) {
            return _SignalHspa!!
        }
        _SignalHspa = ImageVector.Builder(
            name = "SignalHspa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 10.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()

        return _SignalHspa!!
    }

@Suppress("ObjectPropertyName")
private var _SignalHspa: ImageVector? = null
