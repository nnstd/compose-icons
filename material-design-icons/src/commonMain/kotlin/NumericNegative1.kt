package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NumericNegative1: ImageVector
    get() {
        if (_NumericNegative1 != null) {
            return _NumericNegative1!!
        }
        _NumericNegative1 = ImageVector.Builder(
            name = "NumericNegative1",
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
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _NumericNegative1!!
    }

@Suppress("ObjectPropertyName")
private var _NumericNegative1: ImageVector? = null
