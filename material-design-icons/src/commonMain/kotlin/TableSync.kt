package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableSync: ImageVector
    get() {
        if (_TableSync != null) {
            return _TableSync!!
        }
        _TableSync = ImageVector.Builder(
            name = "TableSync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 12f)
                verticalLineTo(13.5f)
                curveTo(21.21f, 13.5f, 23f, 15.29f, 23f, 17.5f)
                curveTo(23f, 18.32f, 22.76f, 19.08f, 22.33f, 19.71f)
                lineTo(21.24f, 18.62f)
                curveTo(21.41f, 18.28f, 21.5f, 17.9f, 21.5f, 17.5f)
                curveTo(21.5f, 16.12f, 20.38f, 15f, 19f, 15f)
                verticalLineTo(16.5f)
                lineTo(16.75f, 14.25f)
                lineTo(19f, 12f)
                moveTo(19f, 23f)
                verticalLineTo(21.5f)
                curveTo(16.79f, 21.5f, 15f, 19.71f, 15f, 17.5f)
                curveTo(15f, 16.68f, 15.25f, 15.92f, 15.67f, 15.29f)
                lineTo(16.76f, 16.38f)
                curveTo(16.59f, 16.72f, 16.5f, 17.1f, 16.5f, 17.5f)
                curveTo(16.5f, 18.88f, 17.62f, 20f, 19f, 20f)
                verticalLineTo(18.5f)
                lineTo(21.25f, 20.75f)
                lineTo(19f, 23f)
                moveTo(4f, 3f)
                horizontalLineTo(18f)
                curveTo(19.11f, 3f, 20f, 3.9f, 20f, 5f)
                verticalLineTo(11f)
                lineTo(19.5f, 11f)
                curveTo(17.66f, 11f, 16f, 11.77f, 14.81f, 13f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                lineTo(13f, 17.5f)
                curveTo(13f, 18f, 13.06f, 18.5f, 13.17f, 19f)
                horizontalLineTo(4f)
                curveTo(2.9f, 19f, 2f, 18.11f, 2f, 17f)
                verticalLineTo(5f)
                curveTo(2f, 3.9f, 2.9f, 3f, 4f, 3f)
                moveTo(4f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                moveTo(12f, 7f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                moveTo(4f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _TableSync!!
    }

@Suppress("ObjectPropertyName")
private var _TableSync: ImageVector? = null
