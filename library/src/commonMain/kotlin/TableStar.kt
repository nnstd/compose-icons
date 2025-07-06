package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableStar: ImageVector
    get() {
        if (_TableStar != null) {
            return _TableStar!!
        }
        _TableStar = ImageVector.Builder(
            name = "TableStar",
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
                moveTo(16.5f, 21.6f)
                lineTo(17.2f, 18.8f)
                lineTo(15f, 16.9f)
                lineTo(17.9f, 16.7f)
                lineTo(19f, 14f)
                lineTo(20.1f, 16.6f)
                lineTo(23f, 16.8f)
                lineTo(20.8f, 18.7f)
                lineTo(21.5f, 21.5f)
                lineTo(19f, 20.1f)
                lineTo(16.5f, 21.6f)
                close()
            }
        }.build()

        return _TableStar!!
    }

@Suppress("ObjectPropertyName")
private var _TableStar: ImageVector? = null
