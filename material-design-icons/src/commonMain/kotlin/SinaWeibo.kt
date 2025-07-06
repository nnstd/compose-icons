package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SinaWeibo: ImageVector
    get() {
        if (_SinaWeibo != null) {
            return _SinaWeibo!!
        }
        _SinaWeibo = ImageVector.Builder(
            name = "SinaWeibo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.82f, 13.87f)
                curveTo(10.89f, 13.87f, 11.77f, 14.74f, 11.77f, 15.82f)
                arcTo(1.95f, 1.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.82f, 17.77f)
                curveTo(8.74f, 17.77f, 7.87f, 16.89f, 7.87f, 15.82f)
                curveTo(7.87f, 14.74f, 8.74f, 13.87f, 9.82f, 13.87f)
                moveTo(14.5f, 3.34f)
                lineTo(15.18f, 3.31f)
                curveTo(18.94f, 3.31f, 22f, 6.37f, 22f, 10.13f)
                lineTo(21.95f, 10.95f)
                lineTo(20.76f, 10.58f)
                lineTo(20.78f, 10.13f)
                curveTo(20.78f, 7.04f, 18.27f, 4.53f, 15.18f, 4.53f)
                lineTo(14.83f, 4.54f)
                lineTo(14.5f, 3.34f)
                moveTo(15.32f, 6.23f)
                curveTo(17.38f, 6.3f, 19.05f, 8f, 19.08f, 10.06f)
                lineTo(17.84f, 9.68f)
                curveTo(17.65f, 8.56f, 16.78f, 7.68f, 15.67f, 7.5f)
                lineTo(15.32f, 6.23f)
                moveTo(2f, 15.41f)
                curveTo(1.97f, 14.8f, 2.07f, 12.64f, 4.95f, 9.97f)
                curveTo(8.35f, 6.81f, 9.82f, 7.05f, 9.82f, 7.05f)
                curveTo(9.82f, 7.05f, 13f, 6.75f, 11.06f, 10.46f)
                horizontalLineTo(11.13f)
                curveTo(11.6f, 9.96f, 12.62f, 9.21f, 14.69f, 9f)
                curveTo(16.77f, 8.79f, 16.77f, 10.5f, 16.5f, 11.7f)
                curveTo(18.38f, 12.64f, 19.56f, 14.03f, 19.56f, 15.58f)
                curveTo(19.56f, 18.4f, 15.63f, 20.69f, 10.78f, 20.69f)
                horizontalLineTo(10.65f)
                lineTo(10.5f, 20.69f)
                curveTo(7f, 20.69f, 4f, 19.42f, 2.71f, 17.59f)
                curveTo(2.25f, 16.97f, 2f, 16.29f, 2f, 15.58f)
                verticalLineTo(15.41f)
                moveTo(9.82f, 11.92f)
                curveTo(6.59f, 11.92f, 3.97f, 13.67f, 3.97f, 15.82f)
                curveTo(3.97f, 17.97f, 6.59f, 19.72f, 9.82f, 19.72f)
                curveTo(13.05f, 19.72f, 15.67f, 17.97f, 15.67f, 15.82f)
                curveTo(15.67f, 13.67f, 13.05f, 11.92f, 9.82f, 11.92f)
                close()
            }
        }.build()

        return _SinaWeibo!!
    }

@Suppress("ObjectPropertyName")
private var _SinaWeibo: ImageVector? = null
