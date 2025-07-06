package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric7: ImageVector
    get() {
        if (_Numeric7 != null) {
            return _Numeric7!!
        }
        _Numeric7 = ImageVector.Builder(
            name = "Numeric7",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 17f)
                lineTo(15f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                lineTo(9f, 17f)
            }
        }.build()

        return _Numeric7!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric7: ImageVector? = null
