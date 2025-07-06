package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pail: ImageVector
    get() {
        if (_Pail != null) {
            return _Pail!!
        }
        _Pail = ImageVector.Builder(
            name = "Pail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 7.63f)
                curveTo(11.97f, 7.35f, 12.58f, 7.5f, 12.86f, 8f)
                curveTo(13.14f, 8.47f, 12.97f, 9.09f, 12.5f, 9.36f)
                lineTo(4.27f, 14.11f)
                curveTo(3.79f, 14.39f, 3.18f, 14.23f, 2.9f, 13.75f)
                curveTo(2.62f, 13.27f, 2.79f, 12.66f, 3.27f, 12.38f)
                lineTo(11.5f, 7.63f)
                moveTo(7f, 21f)
                lineTo(5.79f, 14.97f)
                lineTo(13.21f, 10.69f)
                curveTo(14f, 10.26f, 14.5f, 9.44f, 14.5f, 8.5f)
                curveTo(14.5f, 7.12f, 13.38f, 6f, 12f, 6f)
                curveTo(11.53f, 6f, 11.09f, 6.13f, 10.71f, 6.36f)
                lineTo(4.76f, 9.79f)
                lineTo(4f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                lineTo(17f, 21f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _Pail!!
    }

@Suppress("ObjectPropertyName")
private var _Pail: ImageVector? = null
