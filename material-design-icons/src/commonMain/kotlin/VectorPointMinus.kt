package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VectorPointMinus: ImageVector
    get() {
        if (_VectorPointMinus != null) {
            return _VectorPointMinus!!
        }
        _VectorPointMinus = ImageVector.Builder(
            name = "VectorPointMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                moveTo(11f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                moveTo(15f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _VectorPointMinus!!
    }

@Suppress("ObjectPropertyName")
private var _VectorPointMinus: ImageVector? = null
