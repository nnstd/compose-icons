package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleCloud: ImageVector
    get() {
        if (_GoogleCloud != null) {
            return _GoogleCloud!!
        }
        _GoogleCloud = ImageVector.Builder(
            name = "GoogleCloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 14.75f)
                curveTo(23f, 18.2f, 20.2f, 21f, 16.75f, 21f)
                horizontalLineTo(7.25f)
                curveTo(3.8f, 21f, 1f, 18.2f, 1f, 14.75f)
                curveTo(1f, 12.61f, 2.08f, 10.72f, 3.71f, 9.6f)
                curveTo(4.58f, 5.82f, 7.96f, 3f, 12f, 3f)
                curveTo(16.04f, 3f, 19.42f, 5.82f, 20.29f, 9.6f)
                curveTo(21.93f, 10.72f, 23f, 12.61f, 23f, 14.75f)
                moveTo(16.63f, 17f)
                curveTo(17.94f, 17f, 19f, 15.94f, 19f, 14.63f)
                curveTo(19f, 13.35f, 18f, 12.3f, 16.72f, 12.25f)
                lineTo(16.75f, 11.75f)
                curveTo(16.75f, 9.13f, 14.62f, 7f, 12f, 7f)
                curveTo(10.58f, 7f, 9.3f, 7.62f, 8.43f, 8.61f)
                curveTo(9.93f, 8.9f, 11.23f, 9.72f, 12.14f, 10.86f)
                lineTo(9.5f, 13.5f)
                curveTo(9.08f, 12.77f, 8.29f, 12.25f, 7.38f, 12.25f)
                curveTo(6.06f, 12.25f, 5f, 13.31f, 5f, 14.63f)
                curveTo(5f, 15.9f, 6f, 16.93f, 7.25f, 17f)
                verticalLineTo(17f)
                horizontalLineTo(16.63f)
                close()
            }
        }.build()

        return _GoogleCloud!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleCloud: ImageVector? = null
