package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AbjadHebrew: ImageVector
    get() {
        if (_AbjadHebrew != null) {
            return _AbjadHebrew!!
        }
        _AbjadHebrew = ImageVector.Builder(
            name = "AbjadHebrew",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.9f, 4f)
                lineTo(9f, 10.03f)
                curveTo(7.58f, 10.17f, 6.36f, 11.18f, 6f, 12.59f)
                lineTo(4f, 20f)
                horizontalLineTo(6.07f)
                lineTo(7.92f, 13.11f)
                curveTo(8.09f, 12.46f, 8.69f, 12f, 9.36f, 12f)
                horizontalLineTo(10.69f)
                lineTo(17.47f, 20f)
                horizontalLineTo(20.1f)
                lineTo(15f, 13.97f)
                curveTo(16.42f, 13.83f, 17.64f, 12.82f, 18f, 11.41f)
                lineTo(20f, 4f)
                horizontalLineTo(17.93f)
                lineTo(16.08f, 10.89f)
                curveTo(15.91f, 11.54f, 15.31f, 12f, 14.64f, 12f)
                horizontalLineTo(13.31f)
                lineTo(6.53f, 4f)
                close()
            }
        }.build()

        return _AbjadHebrew!!
    }

@Suppress("ObjectPropertyName")
private var _AbjadHebrew: ImageVector? = null
