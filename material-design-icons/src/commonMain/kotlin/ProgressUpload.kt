package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ProgressUpload: ImageVector
    get() {
        if (_ProgressUpload != null) {
            return _ProgressUpload!!
        }
        _ProgressUpload = ImageVector.Builder(
            name = "ProgressUpload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 2.03f)
                curveTo(17.73f, 2.5f, 21.5f, 6.25f, 21.95f, 11f)
                curveTo(22.5f, 16.5f, 18.5f, 21.38f, 13f, 21.93f)
                verticalLineTo(19.93f)
                curveTo(16.64f, 19.5f, 19.5f, 16.61f, 19.96f, 12.97f)
                curveTo(20.5f, 8.58f, 17.39f, 4.59f, 13f, 4.05f)
                verticalLineTo(2.05f)
                lineTo(13f, 2.03f)
                moveTo(11f, 2.06f)
                verticalLineTo(4.06f)
                curveTo(9.57f, 4.26f, 8.22f, 4.84f, 7.1f, 5.74f)
                lineTo(5.67f, 4.26f)
                curveTo(7.19f, 3f, 9.05f, 2.25f, 11f, 2.06f)
                moveTo(4.26f, 5.67f)
                lineTo(5.69f, 7.1f)
                curveTo(4.8f, 8.23f, 4.24f, 9.58f, 4.05f, 11f)
                horizontalLineTo(2.05f)
                curveTo(2.25f, 9.04f, 3f, 7.19f, 4.26f, 5.67f)
                moveTo(2.06f, 13f)
                horizontalLineTo(4.06f)
                curveTo(4.24f, 14.42f, 4.81f, 15.77f, 5.69f, 16.9f)
                lineTo(4.27f, 18.33f)
                curveTo(3.03f, 16.81f, 2.26f, 14.96f, 2.06f, 13f)
                moveTo(7.1f, 18.37f)
                curveTo(8.23f, 19.25f, 9.58f, 19.82f, 11f, 20f)
                verticalLineTo(22f)
                curveTo(9.04f, 21.79f, 7.18f, 21f, 5.67f, 19.74f)
                lineTo(7.1f, 18.37f)
                moveTo(12f, 7.5f)
                lineTo(7.5f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(16.5f)
                lineTo(12f, 7.5f)
                close()
            }
        }.build()

        return _ProgressUpload!!
    }

@Suppress("ObjectPropertyName")
private var _ProgressUpload: ImageVector? = null
