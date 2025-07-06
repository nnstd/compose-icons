package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CallMade: ImageVector
    get() {
        if (_CallMade != null) {
            return _CallMade!!
        }
        _CallMade = ImageVector.Builder(
            name = "CallMade",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(15.59f)
                lineTo(4f, 18.59f)
                lineTo(5.41f, 20f)
                lineTo(17f, 8.41f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
            }
        }.build()

        return _CallMade!!
    }

@Suppress("ObjectPropertyName")
private var _CallMade: ImageVector? = null
