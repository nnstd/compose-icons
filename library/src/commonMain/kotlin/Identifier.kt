package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Identifier: ImageVector
    get() {
        if (_Identifier != null) {
            return _Identifier!!
        }
        _Identifier = ImageVector.Builder(
            name = "Identifier",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                moveTo(16f, 7f)
                curveTo(17.11f, 7f, 18f, 7.9f, 18f, 9f)
                verticalLineTo(15f)
                curveTo(18f, 16.11f, 17.11f, 17f, 16f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                moveTo(16f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Identifier!!
    }

@Suppress("ObjectPropertyName")
private var _Identifier: ImageVector? = null
