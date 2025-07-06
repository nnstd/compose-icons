package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pot: ImageVector
    get() {
        if (_Pot != null) {
            return _Pot!!
        }
        _Pot = ImageVector.Builder(
            name = "Pot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                curveTo(19f, 20.1f, 18.1f, 21f, 17f, 21f)
                horizontalLineTo(7f)
                curveTo(5.9f, 21f, 5f, 20.1f, 5f, 19f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _Pot!!
    }

@Suppress("ObjectPropertyName")
private var _Pot: ImageVector? = null
