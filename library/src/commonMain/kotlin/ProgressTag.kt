package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ProgressTag: ImageVector
    get() {
        if (_ProgressTag != null) {
            return _ProgressTag!!
        }
        _ProgressTag = ImageVector.Builder(
            name = "ProgressTag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4f)
                verticalLineTo(2f)
                curveTo(17.66f, 2.5f, 21.33f, 6.19f, 21.85f, 10.85f)
                curveTo(22.45f, 16.34f, 18.5f, 21.28f, 13f, 21.88f)
                verticalLineTo(19.88f)
                curveTo(16.64f, 19.43f, 19.5f, 16.56f, 19.96f, 12.92f)
                curveTo(20.5f, 8.53f, 17.39f, 4.54f, 13f, 4f)
                moveTo(5.67f, 4.2f)
                curveTo(7.19f, 2.95f, 9.04f, 2.18f, 11f, 2f)
                verticalLineTo(4.06f)
                curveTo(9.57f, 4.26f, 8.22f, 4.84f, 7.1f, 5.74f)
                lineTo(5.67f, 4.2f)
                moveTo(2.05f, 11f)
                curveTo(2.24f, 9.04f, 3f, 7.19f, 4.26f, 5.67f)
                lineTo(5.69f, 7.1f)
                curveTo(4.8f, 8.23f, 4.24f, 9.58f, 4.05f, 11f)
                horizontalLineTo(2.05f)
                moveTo(4.27f, 18.33f)
                curveTo(3.03f, 16.81f, 2.26f, 14.96f, 2.06f, 13f)
                horizontalLineTo(4.06f)
                curveTo(4.24f, 14.42f, 4.81f, 15.77f, 5.69f, 16.9f)
                lineTo(4.27f, 18.33f)
                moveTo(5.67f, 19.74f)
                lineTo(7.06f, 18.37f)
                horizontalLineTo(7.1f)
                curveTo(8.23f, 19.25f, 9.58f, 19.82f, 11f, 20f)
                verticalLineTo(22f)
                curveTo(9.04f, 21.79f, 7.18f, 21f, 5.67f, 19.74f)
                moveTo(11.6f, 8f)
                curveTo(11.8f, 8f, 12f, 8.1f, 12.2f, 8.2f)
                lineTo(15.8f, 11.8f)
                curveTo(15.9f, 12f, 16f, 12.2f, 16f, 12.4f)
                curveTo(16f, 12.7f, 15.9f, 12.9f, 15.8f, 13f)
                lineTo(13f, 15.8f)
                curveTo(12.8f, 15.9f, 12.6f, 16f, 12.4f, 16f)
                curveTo(12.1f, 16f, 11.9f, 15.9f, 11.8f, 15.8f)
                lineTo(8.2f, 12.2f)
                curveTo(8.1f, 12f, 8f, 11.8f, 8f, 11.6f)
                verticalLineTo(8.8f)
                curveTo(8f, 8.4f, 8.4f, 8f, 8.8f, 8f)
                horizontalLineTo(11.6f)
                moveTo(8.8f, 9.4f)
                curveTo(8.8f, 9.7f, 9.1f, 10f, 9.4f, 10f)
                curveTo(9.7f, 10f, 10f, 9.7f, 10f, 9.4f)
                curveTo(10f, 9.1f, 9.7f, 8.8f, 9.4f, 8.8f)
                curveTo(9.1f, 8.8f, 8.8f, 9.1f, 8.8f, 9.4f)
                close()
            }
        }.build()

        return _ProgressTag!!
    }

@Suppress("ObjectPropertyName")
private var _ProgressTag: ImageVector? = null
