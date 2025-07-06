package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Snowmobile: ImageVector
    get() {
        if (_Snowmobile != null) {
            return _Snowmobile!!
        }
        _Snowmobile = ImageVector.Builder(
            name = "Snowmobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.34f, 17.93f)
                lineTo(18.4f, 16f)
                curveTo(19.5f, 15.91f, 22.66f, 15.53f, 22.97f, 13.36f)
                curveTo(23f, 13.12f, 22.92f, 12.89f, 22.78f, 12.7f)
                curveTo(22.12f, 11.82f, 19.88f, 9.07f, 15f, 5f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                lineTo(16f, 9f)
                lineTo(12f, 11f)
                lineTo(3f, 10f)
                lineTo(1f, 13f)
                lineTo(5.58f, 14.38f)
                lineTo(2.58f, 16.09f)
                curveTo(2.22f, 16.26f, 1f, 16.89f, 1f, 18.05f)
                curveTo(1f, 18.4f, 1f, 18.89f, 1.33f, 19.32f)
                curveTo(1.83f, 20f, 2.71f, 20f, 3f, 20f)
                horizontalLineTo(9f)
                curveTo(10.26f, 20f, 12.53f, 19.13f, 12.93f, 16f)
                horizontalLineTo(15.59f)
                lineTo(17.59f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                curveTo(21.65f, 20f, 23f, 18.65f, 23f, 17f)
                horizontalLineTo(21f)
                curveTo(21f, 17.43f, 20.73f, 17.79f, 20.34f, 17.93f)
                moveTo(9f, 18f)
                horizontalLineTo(3.25f)
                curveTo(3.33f, 17.95f, 3.41f, 17.91f, 3.5f, 17.87f)
                lineTo(8.22f, 15.17f)
                lineTo(10.92f, 16f)
                curveTo(10.58f, 17.84f, 9.28f, 18f, 9f, 18f)
                close()
            }
        }.build()

        return _Snowmobile!!
    }

@Suppress("ObjectPropertyName")
private var _Snowmobile: ImageVector? = null
