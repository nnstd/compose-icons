package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Webpack: ImageVector
    get() {
        if (_Webpack != null) {
            return _Webpack!!
        }
        _Webpack = ImageVector.Builder(
            name = "Webpack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.45f, 17.39f)
                lineTo(12.36f, 21.97f)
                verticalLineTo(18.4f)
                lineTo(17.4f, 15.63f)
                lineTo(20.45f, 17.39f)
                moveTo(21f, 16.89f)
                verticalLineTo(7.31f)
                lineTo(18.04f, 9f)
                verticalLineTo(15.18f)
                lineTo(21f, 16.89f)
                moveTo(3.55f, 17.39f)
                lineTo(11.64f, 21.96f)
                verticalLineTo(18.4f)
                lineTo(6.6f, 15.63f)
                lineTo(3.55f, 17.39f)
                moveTo(3f, 16.89f)
                verticalLineTo(7.31f)
                lineTo(5.96f, 9f)
                verticalLineTo(15.18f)
                lineTo(3f, 16.89f)
                moveTo(3.35f, 6.69f)
                lineTo(11.64f, 2f)
                verticalLineTo(5.45f)
                lineTo(6.33f, 8.37f)
                lineTo(6.28f, 8.39f)
                lineTo(3.35f, 6.69f)
                moveTo(20.65f, 6.69f)
                lineTo(12.36f, 2f)
                verticalLineTo(5.45f)
                lineTo(17.67f, 8.38f)
                lineTo(17.71f, 8.4f)
                lineTo(20.65f, 6.69f)
                moveTo(11.64f, 17.59f)
                lineTo(6.67f, 14.85f)
                verticalLineTo(9.44f)
                lineTo(11.64f, 12.31f)
                verticalLineTo(17.59f)
                moveTo(12.36f, 17.59f)
                lineTo(17.33f, 14.86f)
                verticalLineTo(9.44f)
                lineTo(12.36f, 12.31f)
                verticalLineTo(17.59f)
                moveTo(7f, 8.81f)
                lineTo(12f, 6.06f)
                lineTo(17f, 8.81f)
                lineTo(12f, 11.69f)
                lineTo(7f, 8.81f)
                close()
            }
        }.build()

        return _Webpack!!
    }

@Suppress("ObjectPropertyName")
private var _Webpack: ImageVector? = null
