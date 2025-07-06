package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadCheckOutline: ImageVector
    get() {
        if (_HeadCheckOutline != null) {
            return _HeadCheckOutline!!
        }
        _HeadCheckOutline = ImageVector.Builder(
            name = "HeadCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(16.88f, 3f, 20f, 6.14f, 20f, 10f)
                curveTo(20f, 12.8f, 18.37f, 15.19f, 16f, 16.31f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                curveTo(6.89f, 18f, 6f, 17.11f, 6f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(4.5f)
                curveTo(4.08f, 13f, 3.84f, 12.5f, 4.08f, 12.19f)
                lineTo(6f, 9.66f)
                curveTo(6.19f, 5.95f, 9.23f, 3f, 13f, 3f)
                moveTo(13f, 1f)
                curveTo(8.42f, 1f, 4.61f, 4.43f, 4.06f, 8.91f)
                lineTo(2.5f, 11f)
                curveTo(1.92f, 11.72f, 1.82f, 12.72f, 2.24f, 13.59f)
                curveTo(2.6f, 14.31f, 3.24f, 14.8f, 4f, 14.95f)
                verticalLineTo(16f)
                curveTo(4f, 17.86f, 5.28f, 19.43f, 7f, 19.87f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(17.47f)
                curveTo(20.5f, 15.83f, 22f, 13.06f, 22f, 10f)
                curveTo(22f, 5.04f, 17.96f, 1f, 13f, 1f)
                moveTo(12.47f, 13f)
                lineTo(9f, 9.5f)
                lineTo(10.4f, 8.09f)
                lineTo(12.47f, 10.17f)
                lineTo(16.6f, 6f)
                lineTo(18f, 7.41f)
                lineTo(12.47f, 13f)
                close()
            }
        }.build()

        return _HeadCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeadCheckOutline: ImageVector? = null
