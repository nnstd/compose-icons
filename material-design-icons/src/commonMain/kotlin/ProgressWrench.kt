package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ProgressWrench: ImageVector
    get() {
        if (_ProgressWrench != null) {
            return _ProgressWrench!!
        }
        _ProgressWrench = ImageVector.Builder(
            name = "ProgressWrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2.03f)
                verticalLineTo(2.05f)
                lineTo(13f, 4.05f)
                curveTo(17.39f, 4.59f, 20.5f, 8.58f, 19.96f, 12.97f)
                curveTo(19.5f, 16.61f, 16.64f, 19.5f, 13f, 19.93f)
                verticalLineTo(21.93f)
                curveTo(18.5f, 21.38f, 22.5f, 16.5f, 21.95f, 11f)
                curveTo(21.5f, 6.25f, 17.73f, 2.5f, 13f, 2.03f)
                moveTo(11f, 2.06f)
                curveTo(9.05f, 2.25f, 7.19f, 3f, 5.67f, 4.26f)
                lineTo(7.1f, 5.74f)
                curveTo(8.22f, 4.84f, 9.57f, 4.26f, 11f, 4.06f)
                verticalLineTo(2.06f)
                moveTo(4.26f, 5.67f)
                curveTo(3f, 7.19f, 2.25f, 9.04f, 2.05f, 11f)
                horizontalLineTo(4.05f)
                curveTo(4.24f, 9.58f, 4.8f, 8.23f, 5.69f, 7.1f)
                lineTo(4.26f, 5.67f)
                moveTo(2.06f, 13f)
                curveTo(2.26f, 14.96f, 3.03f, 16.81f, 4.27f, 18.33f)
                lineTo(5.69f, 16.9f)
                curveTo(4.81f, 15.77f, 4.24f, 14.42f, 4.06f, 13f)
                horizontalLineTo(2.06f)
                moveTo(7.1f, 18.37f)
                lineTo(5.67f, 19.74f)
                curveTo(7.18f, 21f, 9.04f, 21.79f, 11f, 22f)
                verticalLineTo(20f)
                curveTo(9.58f, 19.82f, 8.23f, 19.25f, 7.1f, 18.37f)
                moveTo(16.82f, 15.19f)
                lineTo(12.71f, 11.08f)
                curveTo(13.12f, 10.04f, 12.89f, 8.82f, 12.03f, 7.97f)
                curveTo(11.13f, 7.06f, 9.78f, 6.88f, 8.69f, 7.38f)
                lineTo(10.63f, 9.32f)
                lineTo(9.28f, 10.68f)
                lineTo(7.29f, 8.73f)
                curveTo(6.75f, 9.82f, 7f, 11.17f, 7.88f, 12.08f)
                curveTo(8.74f, 12.94f, 9.96f, 13.16f, 11f, 12.76f)
                lineTo(15.11f, 16.86f)
                curveTo(15.29f, 17.05f, 15.56f, 17.05f, 15.74f, 16.86f)
                lineTo(16.78f, 15.83f)
                curveTo(17f, 15.65f, 17f, 15.33f, 16.82f, 15.19f)
                close()
            }
        }.build()

        return _ProgressWrench!!
    }

@Suppress("ObjectPropertyName")
private var _ProgressWrench: ImageVector? = null
