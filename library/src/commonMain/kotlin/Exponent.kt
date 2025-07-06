package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Exponent: ImageVector
    get() {
        if (_Exponent != null) {
            return _Exponent!!
        }
        _Exponent = ImageVector.Builder(
            name = "Exponent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.38f, 3f)
                lineTo(17.77f, 8.75f)
                curveTo(17.55f, 9.68f, 17.27f, 10.32f, 17f, 10.7f)
                curveTo(16.67f, 11.18f, 16.44f, 11.25f, 16.19f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(16.94f, 12.75f, 17.74f, 12.35f, 18.24f, 11.56f)
                curveTo(19.87f, 8.94f, 22f, 3f, 22f, 3f)
                horizontalLineTo(20.38f)
                lineTo(18.69f, 7.05f)
                lineTo(17f, 3f)
                horizontalLineTo(15.38f)
                moveTo(3.42f, 8.59f)
                lineTo(2f, 10f)
                lineTo(6.79f, 14.79f)
                lineTo(2f, 19.59f)
                lineTo(3.41f, 21f)
                lineTo(8.21f, 16.21f)
                lineTo(13f, 21f)
                lineTo(14.41f, 19.59f)
                lineTo(9.62f, 14.79f)
                lineTo(14.41f, 10f)
                lineTo(13f, 8.59f)
                lineTo(8.21f, 13.38f)
                lineTo(3.41f, 8.59f)
                horizontalLineTo(3.42f)
                close()
            }
        }.build()

        return _Exponent!!
    }

@Suppress("ObjectPropertyName")
private var _Exponent: ImageVector? = null
