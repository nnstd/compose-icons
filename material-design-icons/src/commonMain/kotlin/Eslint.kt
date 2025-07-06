package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Eslint: ImageVector
    get() {
        if (_Eslint != null) {
            return _Eslint!!
        }
        _Eslint = ImageVector.Builder(
            name = "Eslint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.95f, 9.55f)
                lineTo(11.84f, 7.3f)
                curveTo(11.94f, 7.25f, 12.06f, 7.25f, 12.16f, 7.3f)
                lineTo(16.05f, 9.55f)
                curveTo(16.15f, 9.61f, 16.21f, 9.71f, 16.21f, 9.82f)
                verticalLineTo(14.32f)
                curveTo(16.21f, 14.43f, 16.15f, 14.53f, 16.05f, 14.59f)
                lineTo(12.16f, 16.84f)
                curveTo(12.06f, 16.89f, 11.94f, 16.89f, 11.84f, 16.84f)
                lineTo(7.95f, 14.59f)
                curveTo(7.85f, 14.53f, 7.79f, 14.43f, 7.79f, 14.32f)
                verticalLineTo(9.82f)
                curveTo(7.79f, 9.71f, 7.85f, 9.61f, 7.95f, 9.55f)
                moveTo(22.12f, 11.6f)
                curveTo(22.29f, 11.89f, 22.29f, 12.23f, 22.12f, 12.53f)
                lineTo(17.47f, 20.56f)
                curveTo(17.3f, 20.86f, 17f, 21f, 16.65f, 21f)
                horizontalLineTo(7.35f)
                curveTo(7f, 21f, 6.7f, 20.85f, 6.53f, 20.56f)
                lineTo(1.88f, 12.53f)
                curveTo(1.71f, 12.24f, 1.71f, 11.87f, 1.88f, 11.58f)
                lineTo(6.53f, 3.5f)
                curveTo(6.7f, 3.22f, 7f, 3f, 7.35f, 3f)
                horizontalLineTo(16.65f)
                curveTo(17f, 3f, 17.3f, 3.22f, 17.47f, 3.5f)
                lineTo(22.12f, 11.6f)
                moveTo(18.27f, 15.5f)
                verticalLineTo(8.65f)
                curveTo(18.27f, 8.53f, 18.2f, 8.42f, 18.09f, 8.36f)
                lineTo(12.16f, 4.95f)
                curveTo(12.06f, 4.89f, 11.93f, 4.89f, 11.83f, 4.95f)
                lineTo(5.91f, 8.36f)
                curveTo(5.8f, 8.42f, 5.73f, 8.53f, 5.73f, 8.65f)
                verticalLineTo(15.5f)
                curveTo(5.73f, 15.61f, 5.8f, 15.72f, 5.91f, 15.78f)
                lineTo(11.84f, 19.19f)
                curveTo(11.94f, 19.25f, 12.07f, 19.25f, 12.17f, 19.19f)
                lineTo(18.09f, 15.78f)
                curveTo(18.2f, 15.72f, 18.27f, 15.61f, 18.27f, 15.5f)
                close()
            }
        }.build()

        return _Eslint!!
    }

@Suppress("ObjectPropertyName")
private var _Eslint: ImageVector? = null
