package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ProgressClose: ImageVector
    get() {
        if (_ProgressClose != null) {
            return _ProgressClose!!
        }
        _ProgressClose = ImageVector.Builder(
            name = "ProgressClose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2.03f)
                verticalLineTo(4.05f)
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
                moveTo(14.59f, 8f)
                lineTo(12f, 10.59f)
                lineTo(9.41f, 8f)
                lineTo(8f, 9.41f)
                lineTo(10.59f, 12f)
                lineTo(8f, 14.59f)
                lineTo(9.41f, 16f)
                lineTo(12f, 13.41f)
                lineTo(14.59f, 16f)
                lineTo(16f, 14.59f)
                lineTo(13.41f, 12f)
                lineTo(16f, 9.41f)
                lineTo(14.59f, 8f)
                close()
            }
        }.build()

        return _ProgressClose!!
    }

@Suppress("ObjectPropertyName")
private var _ProgressClose: ImageVector? = null
