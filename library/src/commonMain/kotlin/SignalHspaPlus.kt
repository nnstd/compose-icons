package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignalHspaPlus: ImageVector
    get() {
        if (_SignalHspaPlus != null) {
            return _SignalHspaPlus!!
        }
        _SignalHspaPlus = ImageVector.Builder(
            name = "SignalHspaPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                moveTo(5f, 10.5f)
                horizontalLineTo(8f)
                verticalLineTo(4.5f)
                horizontalLineTo(11f)
                verticalLineTo(19.5f)
                horizontalLineTo(8f)
                verticalLineTo(13.5f)
                horizontalLineTo(5f)
                verticalLineTo(19.5f)
                horizontalLineTo(2f)
                verticalLineTo(4.5f)
                horizontalLineTo(5f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()

        return _SignalHspaPlus!!
    }

@Suppress("ObjectPropertyName")
private var _SignalHspaPlus: ImageVector? = null
