package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencySign: ImageVector
    get() {
        if (_CurrencySign != null) {
            return _CurrencySign!!
        }
        _CurrencySign = ImageVector.Builder(
            name = "CurrencySign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.41f, 3f)
                lineTo(3f, 4.41f)
                lineTo(5.69f, 7.1f)
                curveTo(4.63f, 8.46f, 4f, 10.15f, 4f, 12f)
                curveTo(4f, 13.85f, 4.63f, 15.55f, 5.69f, 16.9f)
                lineTo(3f, 19.59f)
                lineTo(4.41f, 21f)
                lineTo(7.1f, 18.31f)
                curveTo(8.46f, 19.37f, 10.15f, 20f, 12f, 20f)
                curveTo(13.85f, 20f, 15.55f, 19.37f, 16.9f, 18.31f)
                lineTo(19.59f, 21f)
                lineTo(21f, 19.59f)
                lineTo(18.31f, 16.9f)
                curveTo(19.37f, 15.54f, 20f, 13.85f, 20f, 12f)
                curveTo(20f, 10.15f, 19.37f, 8.45f, 18.31f, 7.1f)
                lineTo(21f, 4.41f)
                lineTo(19.59f, 3f)
                lineTo(16.9f, 5.69f)
                curveTo(15.54f, 4.63f, 13.85f, 4f, 12f, 4f)
                curveTo(10.15f, 4f, 8.45f, 4.63f, 7.1f, 5.69f)
                lineTo(4.41f, 3f)
                moveTo(12f, 6f)
                curveTo(15.31f, 6f, 18f, 8.69f, 18f, 12f)
                curveTo(18f, 15.31f, 15.31f, 18f, 12f, 18f)
                curveTo(8.69f, 18f, 6f, 15.31f, 6f, 12f)
                curveTo(6f, 8.69f, 8.69f, 6f, 12f, 6f)
                close()
            }
        }.build()

        return _CurrencySign!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencySign: ImageVector? = null
