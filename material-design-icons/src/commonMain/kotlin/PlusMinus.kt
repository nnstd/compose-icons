package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlusMinus: ImageVector
    get() {
        if (_PlusMinus != null) {
            return _PlusMinus!!
        }
        _PlusMinus = ImageVector.Builder(
            name = "PlusMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 4f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                moveTo(6f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _PlusMinus!!
    }

@Suppress("ObjectPropertyName")
private var _PlusMinus: ImageVector? = null
