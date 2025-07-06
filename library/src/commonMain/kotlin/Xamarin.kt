package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Xamarin: ImageVector
    get() {
        if (_Xamarin != null) {
            return _Xamarin!!
        }
        _Xamarin = ImageVector.Builder(
            name = "Xamarin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.75f, 11.07f)
                curveTo(22.91f, 11.35f, 23f, 11.67f, 23f, 12f)
                curveTo(23f, 12.33f, 22.91f, 12.65f, 22.75f, 12.93f)
                lineTo(18.08f, 21f)
                curveTo(17.72f, 21.62f, 17.06f, 22f, 16.35f, 22f)
                horizontalLineTo(7.65f)
                curveTo(6.94f, 22f, 6.28f, 21.62f, 5.92f, 21f)
                lineTo(1.25f, 12.93f)
                curveTo(1.09f, 12.65f, 1f, 12.33f, 1f, 12f)
                curveTo(1f, 11.67f, 1.09f, 11.35f, 1.25f, 11.07f)
                lineTo(5.92f, 3f)
                curveTo(6.28f, 2.38f, 6.94f, 2f, 7.65f, 2f)
                horizontalLineTo(16.35f)
                curveTo(17.06f, 2f, 17.72f, 2.38f, 18.08f, 3f)
                lineTo(22.75f, 11.07f)
                moveTo(12f, 12f)
                verticalLineTo(11.9f)
                lineTo(9.42f, 7.1f)
                lineTo(9.25f, 7f)
                horizontalLineTo(7.66f)
                lineTo(7.5f, 7.1f)
                verticalLineTo(7.3f)
                lineTo(10f, 12f)
                lineTo(7.5f, 16.7f)
                verticalLineTo(16.9f)
                lineTo(7.66f, 17f)
                horizontalLineTo(9.25f)
                lineTo(9.42f, 16.9f)
                lineTo(12f, 12.1f)
                verticalLineTo(12f)
                lineTo(12.03f, 12.1f)
                lineTo(14.58f, 16.9f)
                lineTo(14.75f, 17f)
                horizontalLineTo(16.34f)
                lineTo(16.5f, 16.9f)
                verticalLineTo(16.7f)
                lineTo(14f, 12f)
                lineTo(16.5f, 7.3f)
                verticalLineTo(7.1f)
                lineTo(16.34f, 7f)
                horizontalLineTo(14.75f)
                lineTo(14.58f, 7.1f)
                lineTo(12.03f, 11.9f)
                lineTo(12f, 12f)
                close()
            }
        }.build()

        return _Xamarin!!
    }

@Suppress("ObjectPropertyName")
private var _Xamarin: ImageVector? = null
