package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Eject: ImageVector
    get() {
        if (_Eject != null) {
            return _Eject!!
        }
        _Eject = ImageVector.Builder(
            name = "Eject",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                lineTo(5.33f, 15f)
                horizontalLineTo(18.67f)
                moveTo(5f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Eject!!
    }

@Suppress("ObjectPropertyName")
private var _Eject: ImageVector? = null
