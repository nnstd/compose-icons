package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableHeart: ImageVector
    get() {
        if (_TableHeart != null) {
            return _TableHeart!!
        }
        _TableHeart = ImageVector.Builder(
            name = "TableHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                horizontalLineTo(18f)
                curveTo(19.11f, 3f, 20f, 3.9f, 20f, 5f)
                verticalLineTo(12.08f)
                curveTo(18.45f, 11.82f, 16.92f, 12.18f, 15.68f, 13f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(13.08f)
                curveTo(12.97f, 17.68f, 12.97f, 18.35f, 13.08f, 19f)
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
                moveTo(19f, 22.3f)
                lineTo(18.4f, 21.8f)
                curveTo(16.4f, 19.9f, 15f, 18.7f, 15f, 17.2f)
                curveTo(15f, 16f, 16f, 15f, 17.2f, 15f)
                curveTo(17.9f, 15f, 18.6f, 15.3f, 19f, 15.8f)
                curveTo(19.4f, 15.3f, 20.1f, 15f, 20.8f, 15f)
                curveTo(22f, 15f, 23f, 15.9f, 23f, 17.2f)
                curveTo(23f, 18.7f, 21.6f, 19.9f, 19.6f, 21.8f)
                lineTo(19f, 22.3f)
            }
        }.build()

        return _TableHeart!!
    }

@Suppress("ObjectPropertyName")
private var _TableHeart: ImageVector? = null
