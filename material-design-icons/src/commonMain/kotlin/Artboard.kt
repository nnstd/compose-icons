package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Artboard: ImageVector
    get() {
        if (_Artboard != null) {
            return _Artboard!!
        }
        _Artboard = ImageVector.Builder(
            name = "Artboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                moveTo(19f, 3f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                moveTo(7f, 3f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                moveTo(23f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(23f)
                verticalLineTo(7f)
                moveTo(19f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                moveTo(4f, 7f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                moveTo(23f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                moveTo(4f, 15f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                moveTo(19f, 18f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                moveTo(7f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _Artboard!!
    }

@Suppress("ObjectPropertyName")
private var _Artboard: ImageVector? = null
