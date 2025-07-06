package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadSync: ImageVector
    get() {
        if (_HeadSync != null) {
            return _HeadSync!!
        }
        _HeadSync = ImageVector.Builder(
            name = "HeadSync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(9.23f, 3f, 6.19f, 5.95f, 6f, 9.66f)
                lineTo(4.08f, 12.19f)
                curveTo(3.84f, 12.5f, 4.08f, 13f, 4.5f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                curveTo(6f, 17.11f, 6.89f, 18f, 8f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(16.31f)
                curveTo(18.37f, 15.19f, 20f, 12.8f, 20f, 10f)
                curveTo(20f, 6.14f, 16.88f, 3f, 13f, 3f)
                moveTo(13f, 15f)
                verticalLineTo(13.5f)
                curveTo(10.79f, 13.5f, 9f, 11.71f, 9f, 9.5f)
                curveTo(9f, 8.68f, 9.25f, 7.92f, 9.67f, 7.29f)
                lineTo(10.76f, 8.38f)
                curveTo(10.59f, 8.72f, 10.5f, 9.1f, 10.5f, 9.5f)
                curveTo(10.5f, 10.88f, 11.62f, 12f, 13f, 12f)
                verticalLineTo(10.5f)
                lineTo(15.25f, 12.75f)
                lineTo(13f, 15f)
                moveTo(16.33f, 11.71f)
                lineTo(15.24f, 10.62f)
                curveTo(15.41f, 10.28f, 15.5f, 9.9f, 15.5f, 9.5f)
                curveTo(15.5f, 8.12f, 14.38f, 7f, 13f, 7f)
                verticalLineTo(8.5f)
                lineTo(10.75f, 6.25f)
                lineTo(13f, 4f)
                verticalLineTo(5.5f)
                curveTo(15.21f, 5.5f, 17f, 7.29f, 17f, 9.5f)
                curveTo(17f, 10.32f, 16.75f, 11.08f, 16.33f, 11.71f)
                close()
            }
        }.build()

        return _HeadSync!!
    }

@Suppress("ObjectPropertyName")
private var _HeadSync: ImageVector? = null
