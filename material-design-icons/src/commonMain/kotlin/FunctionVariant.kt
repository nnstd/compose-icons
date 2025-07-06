package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FunctionVariant: ImageVector
    get() {
        if (_FunctionVariant != null) {
            return _FunctionVariant!!
        }
        _FunctionVariant = ImageVector.Builder(
            name = "FunctionVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.42f, 5.29f)
                curveTo(11.32f, 5.19f, 10.35f, 6f, 10.25f, 7.11f)
                lineTo(10f, 10f)
                horizontalLineTo(12.82f)
                verticalLineTo(12f)
                horizontalLineTo(9.82f)
                lineTo(9.38f, 17.07f)
                curveTo(9.18f, 19.27f, 7.24f, 20.9f, 5.04f, 20.7f)
                curveTo(3.79f, 20.59f, 2.66f, 19.9f, 2f, 18.83f)
                lineTo(3.5f, 17.33f)
                curveTo(3.83f, 18.38f, 4.96f, 18.97f, 6f, 18.63f)
                curveTo(6.78f, 18.39f, 7.33f, 17.7f, 7.4f, 16.89f)
                lineTo(7.82f, 12f)
                horizontalLineTo(4.82f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                lineTo(8.27f, 6.93f)
                curveTo(8.46f, 4.73f, 10.39f, 3.1f, 12.6f, 3.28f)
                curveTo(13.86f, 3.39f, 15f, 4.09f, 15.66f, 5.17f)
                lineTo(14.16f, 6.67f)
                curveTo(13.91f, 5.9f, 13.23f, 5.36f, 12.42f, 5.29f)
                moveTo(22f, 13.65f)
                lineTo(20.59f, 12.24f)
                lineTo(17.76f, 15.07f)
                lineTo(14.93f, 12.24f)
                lineTo(13.5f, 13.65f)
                lineTo(16.35f, 16.5f)
                lineTo(13.5f, 19.31f)
                lineTo(14.93f, 20.72f)
                lineTo(17.76f, 17.89f)
                lineTo(20.59f, 20.72f)
                lineTo(22f, 19.31f)
                lineTo(19.17f, 16.5f)
                lineTo(22f, 13.65f)
                close()
            }
        }.build()

        return _FunctionVariant!!
    }

@Suppress("ObjectPropertyName")
private var _FunctionVariant: ImageVector? = null
