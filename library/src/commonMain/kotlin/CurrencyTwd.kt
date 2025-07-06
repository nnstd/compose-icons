package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyTwd: ImageVector
    get() {
        if (_CurrencyTwd != null) {
            return _CurrencyTwd!!
        }
        _CurrencyTwd = ImageVector.Builder(
            name = "CurrencyTwd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 19f)
                verticalLineTo(13f)
                horizontalLineTo(10.35f)
                lineTo(5.73f, 21f)
                lineTo(4f, 20f)
                lineTo(8.04f, 13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _CurrencyTwd!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyTwd: ImageVector? = null
