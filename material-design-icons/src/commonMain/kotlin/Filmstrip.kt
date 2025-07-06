package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Filmstrip: ImageVector
    get() {
        if (_Filmstrip != null) {
            return _Filmstrip!!
        }
        _Filmstrip = ImageVector.Builder(
            name = "Filmstrip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                moveTo(18f, 13f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                moveTo(18f, 17f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                moveTo(8f, 9f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                moveTo(8f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                moveTo(8f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                moveTo(18f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _Filmstrip!!
    }

@Suppress("ObjectPropertyName")
private var _Filmstrip: ImageVector? = null
