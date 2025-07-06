package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NumericPositive1: ImageVector
    get() {
        if (_NumericPositive1 != null) {
            return _NumericPositive1!!
        }
        _NumericPositive1 = ImageVector.Builder(
            name = "NumericPositive1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                moveTo(11f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _NumericPositive1!!
    }

@Suppress("ObjectPropertyName")
private var _NumericPositive1: ImageVector? = null
