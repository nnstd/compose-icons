package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Lamp: ImageVector
    get() {
        if (_Lamp != null) {
            return _Lamp!!
        }
        _Lamp = ImageVector.Builder(
            name = "Lamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2f)
                horizontalLineTo(16f)
                lineTo(20f, 14f)
                horizontalLineTo(4f)
                lineTo(8f, 2f)
                moveTo(11f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Lamp!!
    }

@Suppress("ObjectPropertyName")
private var _Lamp: ImageVector? = null
